package com.chl.recommand_backend.pages;

import com.chl.recommand_backend.checking.Is_new_User;
import com.chl.recommand_backend.sql.userdb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Service
@Controller
public class account_info {
        @GetMapping("/info")
        public String info(Model model){
            userdb User_info = User.addemail(email);
            model.addAttribute("User_info",User_info); //connect the object on the html
            return("personal_info");
        }

        @PostMapping("/submit")
        public String handleSubmit(@ModelAttribute userdb User_info, Model model){
            model.addAttribute("User_info",User_info);
            String major = User_info.getMajor();
            String name = User_info.getFull_Name();
            User.addinfo(name,major);
        return("redirect:/class");

    }
@Autowired
    private Is_new_User User;

    }


