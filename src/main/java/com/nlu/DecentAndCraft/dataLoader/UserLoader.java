package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.dto.request.UserRegisterRequest;
import com.nlu.DecentAndCraft.service.UserService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class UserLoader implements CommandLineRunner {
    UserService userService;
    @Override
    public void run(String... args) throws Exception {
        var u1 = new UserRegisterRequest("minh.nguyen@gmail.com", "123456", "Nguyễn Văn Minh");
        var u2 = new UserRegisterRequest("ngan.le@gmail.com", "123456", "Lê Thị Ngân");
        var u3 = new UserRegisterRequest("quynh.tran@gmail.com", "123456", "Trần Thị Quỳnh");
        var u4 = new UserRegisterRequest("teo.du@gmail.com", "123456", "Dư Bản Tèo");
        var u5 = new UserRegisterRequest("thao.pham@gmail.com", "123456", "Phạm Thị Thảo");
        var u6 = new UserRegisterRequest("hieu.vo@gmail.com", "123456", "Võ Minh Hiếu");
        var u7 = new UserRegisterRequest("hanh.nguyen@gmail.com", "123456", "Nguyễn Thị Hạnh");
        var u8 = new UserRegisterRequest("tuan.le@gmail.com", "123456", "Lê Văn Tuấn");
        var u9 = new UserRegisterRequest("hoa.tran@gmail.com", "123456", "Trần Thị Hoa");
        var u10 = new UserRegisterRequest("nam.nguyen@gmail.com", "123456", "Nguyễn Văn Nam");
        var u11 = new UserRegisterRequest("lan.pham@gmail.com", "123456", "Phạm Thị Lan");
        var u12 = new UserRegisterRequest("thanh.vo@gmail.com", "123456", "Võ Thanh Thanh");
        var u13 = new UserRegisterRequest("quang.nguyen@gmail.com", "123456", "Nguyễn Văn Quang");
        var u14 = new UserRegisterRequest("mai.le@gmail.com", "123456", "Lê Thị Mai");
        var u15 = new UserRegisterRequest("trung.tran@gmail.com", "123456", "Trần Văn Trung");
        var u16 = new UserRegisterRequest("an.nguyen@gmail.com", "123456", "Nguyễn Thị An");
        var u17 = new UserRegisterRequest("linh.pham@gmail.com", "123456", "Phạm Thị Linh");
        var u18 = new UserRegisterRequest("tien.le@gmail.com", "123456", "Lê Văn Tiến");
        var u19 = new UserRegisterRequest("hoa.vo@gmail.com", "123456", "Võ Thị Hoa");
        var u20 = new UserRegisterRequest("long.nguyen@gmail.com", "123456", "Nguyễn Văn Long");
        List<UserRegisterRequest> users = List.of(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10,
                u11, u12, u13, u14, u15, u16, u17, u18, u19, u20);
        users.forEach(userService::register);
        // Đăng ký từng user
//        userService.register(u3);
//        userService.register(u2);
//        userService.register(u1);
//        userService.register(u4);
//        userService.register(u5);
//        userService.register(u6);
//        userService.register(u7);
//        userService.register(u8);
//        userService.register(u9);
//        userService.register(u10);
        // userService.register(u11);
        // userService.register(u12);
        // userService.register(u13);
        // userService.register(u14);
        // userService.register(u15);
        // userService.register(u16);
        // userService.register(u17);
        // userService.register(u18);
        // userService.register(u19);
        // userService.register(u20);
    }
}
