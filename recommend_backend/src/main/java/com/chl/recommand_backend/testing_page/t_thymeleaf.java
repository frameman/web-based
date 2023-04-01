package com.chl.recommand_backend.testing_page;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.model.IModel;

import java.util.Collections;

@RestController
public class t_thymeleaf {
@RequestMapping("/hello")
public String Hello(Model model){
    model.addAttribute("hello","Hello World");
    return "hello_world";
}
}
