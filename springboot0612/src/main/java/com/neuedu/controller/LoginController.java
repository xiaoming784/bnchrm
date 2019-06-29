package com.neuedu.controller;

import com.neuedu.pojo.Result;
import com.neuedu.pojo.User;
import com.neuedu.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Resource
    LoginService loginService;
    @PostMapping("/list")
   // public List<User> getUser(User user){
    public Result login(User user) {
        List<User> userList = loginService.getUser(user);
        System.out.println("===================="+userList.size());
        //if (!Objects.equals("admin", user.getUsername()) || !Objects.equals("123456", user.getPassword())) {
        if (userList.size() == 0){
            String message = "账号密码错误";
            System.out.println("test");
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
}
