package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.dto.request.AddressAddRequest;
import com.nlu.DecentAndCraft.dto.request.UserRegisterRequest;
import com.nlu.DecentAndCraft.mapper.AddressMapper;
import com.nlu.DecentAndCraft.repository.UserRepository;
import com.nlu.DecentAndCraft.service.UserService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(4)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserLoader implements CommandLineRunner {
    UserService userService;
    AddressMapper addressMapper = AddressMapper.INSTANCE;
    UserRepository repository;
    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        var u1 =
                new UserRegisterRequest("minh@gmail.com", "123456", "Du Thanh Minh");
        var u2 =
                new UserRegisterRequest("ngan@gmail.com", "123456", "Nguyen Thi Chuc Ngan");
        var u3 =
                new UserRegisterRequest("quynh@gmail.com", "123456", "Lieu Thi Diem Quynh");
        var u4 =
                new UserRegisterRequest("dubanteo@gmail.com", "123456", "Du Ban Teo");
        var addressDto1 = new AddressAddRequest(false, "BTVT", "Dat Dat", "Phuoc Hai",
                "Khu pho Hai An", "Du Ban Teo", "0925721472");
        var addressDto2 = new AddressAddRequest(true, "Tien Giang", "Dat Dat", "Phuoc Hai",
                "Khu pho Hai An", "Le Anh Teo", "0925721472");
        var user = userService.register(u1);
        userService.register(u2);
        userService.register(u3);
        userService.register(u4);
        var a1 = addressMapper.toAddress(addressDto1);
        var a2 = addressMapper.toAddress(addressDto2);
        user.setAddressList(List.of(a1, a2));
        userRepository.save(user);
        loadAddress();
    }

    private void loadAddress() {
    }
}
