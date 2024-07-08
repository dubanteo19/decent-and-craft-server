package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.dto.request.*;
import com.nlu.DecentAndCraft.exception.AddressNotFoundException;
import com.nlu.DecentAndCraft.exception.UserNotFoundException;
import com.nlu.DecentAndCraft.mapper.AddressMapper;
import com.nlu.DecentAndCraft.mapper.UserMapper;
import com.nlu.DecentAndCraft.model.Address;
import com.nlu.DecentAndCraft.model.Order;
import com.nlu.DecentAndCraft.model.User;
import com.nlu.DecentAndCraft.model.status.UserStatus;
import com.nlu.DecentAndCraft.repository.AddressRepository;
import com.nlu.DecentAndCraft.repository.UserRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {
    UserRepository userRepository;
    UserMapper userMapper = UserMapper.INSTANCE;
    AddressMapper addressMapper = AddressMapper.INSTANCE;
    AddressRepository addressRepository;
    BCryptPasswordEncoder encoder;

    public User register(UserRegisterRequest user) {
        if (userRepository.existsByEmail(user.email()))
            throw new RuntimeException("Email already in use");
        User registeredUser = userMapper.toUser(user);
        registeredUser.setStatus(UserStatus.HOAT_DONG);
        registeredUser.setPassword(encoder.encode(user.password()));
        return userRepository.save(registeredUser);
    }

    public User findByEmail(String email) {
        return userRepository.findUserByEmail(email).orElseThrow(UserNotFoundException::new);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long userId) {
        return userRepository.findById(userId).orElseThrow();
    }

    public User login(UserLoginRequest userLoginRequest) {
        var user = userRepository
                .findUserByEmail(userLoginRequest.email())
                .orElseThrow(UserNotFoundException::new);
        if (!encoder.matches(userLoginRequest.password(), user.getPassword()))
            throw new RuntimeException("Incorrect password");
        return user;
    }

    public Address updateAddress(Long addressId, Long userId, AddressAddRequest request) {
        var existingAddress = addressRepository.findById(addressId).orElseThrow(AddressNotFoundException::new);
        var user = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        addressMapper.updateAddress(existingAddress, request);
        if (request.isDefault()) {
            var addressList = user.getAddressList();
            addressList.forEach(address -> address.setDefaultAddress(false));
            existingAddress.setDefaultAddress(true);
        }
        addressRepository.save(existingAddress);
        return existingAddress;
    }

    public Address saveAddress(Long userId, AddressAddRequest request) {
        var user = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        var address = addressMapper.toAddress(request);
        if (request.isDefault()) {
            var addressList = user.getAddressList();
            addressList.forEach(a -> a.setDefaultAddress(false));
            address.setDefaultAddress(true);
        }
        address.setUser(user);
        addressRepository.save(address);
        user.getAddressList().add(address);
        userRepository.save(user);
        return address;
    }

    public List<Address> getAddressList(Long userId) {
        var user = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        return user.getAddressList();
    }

    public User updateUserInfoById(Long userId, UserUpdateInfoRequest userUpdateInfoRequest) {
        var user = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        user.setPhone(userUpdateInfoRequest.phone());
        user.setFullName(userUpdateInfoRequest.fullName());
        return userRepository.save(user);
    }

    public User changePassword(Long userId, ChangePasswordRequest request) {
        var user = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        if (!encoder.matches(request.currentPassword(), user.getPassword()))
            throw new RuntimeException("Current password is incorrect");
        user.setPassword(encoder.encode(request.newPassword()));
        userRepository.save(user);
        return user;
    }

    public List<Order> getOrderList(Long userId) {
        var user = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        return user.getOrderList();
    }
}


