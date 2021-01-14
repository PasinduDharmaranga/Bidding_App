package com.bidding.controller;

import com.bidding.model.User;
import com.bidding.service.IBidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private IBidService userService;

    @GetMapping("/")
    public String findItems(Model model) {

        List users = (List<User>) userService.findAll();
        users.forEach(System.out::println);
        model.addAttribute("users", users);

        return "users";
    }
}

