package com.example.htmlweb;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class DemoController {

    @GetMapping("/v1/user")
    public BaseResult<List<User>> getUsers(String roleName) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setAddress("changsha" + i);
            user.setAge(i + "");
            user.setDate(new Date());
            users.add(user);
        }
        BaseResult baseResult = new BaseResult(30000, "失败",users);
        return baseResult;
    }

    @PostMapping("/v1/user")
    public String addUser(@RequestBody User user) {

        return "Success";
    }

    @PostMapping("/v1/user/update")
    public String updateUser(@RequestBody User user) {

        return "Success";
    }

    @DeleteMapping("/v1/user")
    public String deleteUser(@RequestBody User user) {

        return "Success";
    }
}
