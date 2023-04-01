package com.chl.recommand_backend.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class content_page {
        @GetMapping("/class")
        public String index_page(){
            return("recommend");
        }
    }


