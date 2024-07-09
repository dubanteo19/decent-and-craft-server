package com.nlu.DecentAndCraft.controller;

import com.nlu.DecentAndCraft.dto.request.*;
import com.nlu.DecentAndCraft.model.Address;
import com.nlu.DecentAndCraft.model.Order;
import com.nlu.DecentAndCraft.model.User;
import com.nlu.DecentAndCraft.service.UserService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.findById(userId));
    }

    @PutMapping("/{userId}")
    public ResponseEntity<User> updateUserInfo(@PathVariable Long userId, @RequestBody UserUpdateInfoRequest userUpdateInfoRequest) {
        return ResponseEntity.ok(userService.updateUserInfoById(userId, userUpdateInfoRequest));
    }

    @PutMapping("/{userId}/change-password")
    public ResponseEntity<User> changePassword(@PathVariable Long userId, @RequestBody ChangePasswordRequest request) {
        return ResponseEntity.ok(userService.changePassword(userId, request));
    }

    @PostMapping("/{userId}/address")
    public ResponseEntity<Address> saveAddress(@PathVariable Long userId,
                                               @RequestBody AddressAddRequest request) {
        return ResponseEntity.ok(userService.saveAddress(userId, request));
    }

    @PutMapping("/{userId}/address/{addressId}")
    public ResponseEntity<Address> updateAddress(@PathVariable Long addressId, @PathVariable Long userId,
                                                 @RequestBody AddressAddRequest request) {
        return ResponseEntity.ok(userService.updateAddress(addressId,userId, request));
    }

    @GetMapping("/{userId}/address")
    public ResponseEntity<List<Address>> getAddressList(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.getAddressList(userId));
    }
<<<<<<< HEAD
    @CrossOrigin(origins = "http://localhost:5173")
=======

    @GetMapping("/{userId}/orders")
    public ResponseEntity<List<Order>> getOrderList(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.getOrderList(userId));
    }

>>>>>>> 5c6129e9c8189f1d694a32949b711eb267269fbf
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody UserRegisterRequest userRegisterRequest) {
        return ResponseEntity.ok(userService.register(userRegisterRequest));

    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody UserLoginRequest userLoginRequest) {
        return ResponseEntity.ok(userService.login(userLoginRequest));

    }
}
