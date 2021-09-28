package com.example.MySpringWebApp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class HelloController {

    @GetMapping({"/","/hello"})
    public String hello(@RequestParam(name = "name", required = false, defaultValue = "SpringBootWebApp") String name,Model model) {
        model.addAttribute("name", name);
        log.info("Invoking greeting method={}", name);
        return "hello";
    }
}
