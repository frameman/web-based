package com.chl.recommand_backend.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testing_page{
    @RequestMapping("/helloe")
    public String index_page(){
        return("ok");
    }
}

