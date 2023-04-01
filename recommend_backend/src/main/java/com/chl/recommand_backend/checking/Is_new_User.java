package com.chl.recommand_backend.checking;

import com.chl.recommand_backend.Interface.UsrRepository;
import com.chl.recommand_backend.sql.userdb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Is_new_User {
    @Autowired
    private UsrRepository repo;

    public userdb addinfo(String name,String major){
        userdb NewUser = new userdb();
        NewUser.setFull_Name(name);
        NewUser.setMajor(major);
       return NewUser;
    }

    public userdb check(String email) {
        userdb user = repo.findByEmail(email);
        return user;
    }
    public userdb addemail(String email){
        userdb Useremail = new userdb();
        Useremail.setFull_Name(email);
        repo.save(Useremail);
        return (Useremail);
    }


    }






