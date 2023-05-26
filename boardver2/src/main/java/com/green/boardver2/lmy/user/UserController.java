package com.green.boardver2.lmy.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("lmyUserController")
@RequestMapping("/lmy/user")
public class UserController {

    @PostMapping
    public int postUser(){
        return 0;
    }
}
