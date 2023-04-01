package com.chl.recommand_backend.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class home_page {
    @GetMapping("/index")
    public String index_page(){
        return("index");
    }
}
