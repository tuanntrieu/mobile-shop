package com.example.mobileshop.controller.client;

import com.example.mobileshop.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController extends BaseController {

    @GetMapping(value = {"/","/home"})
    public String getHomePage() {
        return "/client/index";
    }
}
