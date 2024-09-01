package com.example.mobileshop.controller.base;

import com.example.mobileshop.domain.entity.User;
import com.example.mobileshop.security.CustomUserDetails;
import com.example.mobileshop.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public abstract class BaseController {

    @Autowired
    private UserService userService;

    @ModelAttribute(name = "currentUser")
    public User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof CustomUserDetails) {
            CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
            return userService.findById(userDetails.getId());
        }
        return null;
    }
}
