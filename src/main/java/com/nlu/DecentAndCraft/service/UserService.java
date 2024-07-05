package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.dto.request.AddressAddRequest;
import com.nlu.DecentAndCraft.dto.request.UserLoginRequest;
import com.nlu.DecentAndCraft.dto.request.UserRegisterRequest;
import com.nlu.DecentAndCraft.exception.UserNotFoundException;
import com.nlu.DecentAndCraft.mapper.AddressMapper;
import com.nlu.DecentAndCraft.mapper.UserMapper;
import com.nlu.DecentAndCraft.model.Address;
import com.nlu.DecentAndCraft.model.User;
import com.nlu.DecentAndCraft.model.status.UserStatus;
import com.nlu.DecentAndCraft.repository.UserRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {
    UserRepository userRepository;
    UserMapper userMapper = UserMapper.INSTANCE;
    AddressMapper addressMapper = AddressMapper.INSTANCE;

    public User register(UserRegisterRequest user) {
        if (userRepository.existsByEmail(user.email()))
            throw new RuntimeException("Email already in use");
        User registeredUser = userMapper.toUser(user);
        registeredUser.setStatus(UserStatus.HOAT_DONG);
        return userRepository.save(registeredUser);
    }

    public User findByEmail(String email) {
        return userRepository.findUserByEmail(email).orElseThrow();
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long userId) {
        return userRepository.findById(userId).orElseThrow();
    }

    public User login(UserLoginRequest userLoginRequest) {
        return userRepository
                .findUserByEmailAndPassword(
                        userLoginRequest.email(),
                        userLoginRequest.password())
                .orElseThrow(() -> new RuntimeException("Invalid email or password"));
    }

    public Address saveAddress(Long userId, AddressAddRequest request) {
        var user = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        var userAddress = user.getAddressList();
        var address = addressMapper.toAddress(request);
        address.setDefault(true);
        userAddress.add(address);
        user.setAddressList(userAddress);
        userRepository.save(user);
        return address;
    }
}


