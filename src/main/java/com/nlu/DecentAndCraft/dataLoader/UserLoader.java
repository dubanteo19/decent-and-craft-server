package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.dto.request.AddressAddRequest;
import com.nlu.DecentAndCraft.dto.request.UserRegisterRequest;
import com.nlu.DecentAndCraft.mapper.AddressMapper;
import com.nlu.DecentAndCraft.repository.UserRepository;
import com.nlu.DecentAndCraft.service.UserService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

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
<<<<<<< HEAD
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
=======
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
        a1.setUser(user);
        a2.setUser(user);
        user.setAddressList(List.of(a1, a2));
        userRepository.save(user);
        loadAddress();
    }

    private void loadAddress() {
>>>>>>> 5c6129e9c8189f1d694a32949b711eb267269fbf
    }
}
