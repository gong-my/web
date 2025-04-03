package com.ecommerce.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecommerce.project.dto.UserDTO;
import com.ecommerce.project.service.UserService;

@Controller
public class HomeController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(Model model) {
        
        UserDTO user = new UserDTO();

        String userId = "admin";
        user.setUserId(userId);

        user = userService.selectUserId(user);


        model.addAttribute("user", user);

        return "index";
    }

}
