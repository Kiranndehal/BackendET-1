package com.upgrad.backendet.controller;

import com.upgrad.backendet.model.User;
import com.upgrad.backendet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class EditController {
    @Autowired
    private UserService userService;
    @RequestMapping(method = RequestMethod.PUT,value = "edituser")
    private String updateData(@RequestParam(name="userId") Integer userId,User updatedUser){
        updatedUser.setId(userId);
        userService.updateData(updatedUser);
        return "/userdata";
    }
}
