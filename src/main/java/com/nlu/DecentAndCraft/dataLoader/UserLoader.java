package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.dto.request.UserRegisterRequest;
import com.nlu.DecentAndCraft.service.UserService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class UserLoader implements CommandLineRunner {
    UserService userService;
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
        userService.register(u1);
        userService.register(u2);
        userService.register(u3);
        userService.register(u4);
    }
}
