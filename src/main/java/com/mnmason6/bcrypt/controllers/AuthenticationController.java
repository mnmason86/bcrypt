package com.mnmason6.bcrypt.controllers;

import com.mnmason6.bcrypt.models.Eweser;
import com.mnmason6.bcrypt.repositories.EweserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AuthenticationController {

    @Autowired
    EweserRepository eweserRepository;

    @GetMapping("/login")
    public String getLoginPage(){
        return "/login.html";
    }

    @GetMapping("/signup")
    public String getSignupPage(){
        return "/signup.html";
    }

    @PostMapping("/login")
    public RedirectView logInUser(String username, String password){
        Eweser userFromDb = eweserRepository.findByUsername(username);
        if((userFromDb == null) || (!BCrypt.checkpw(password,
                userFromDb.getPassword()))){
            return new RedirectView("/login");
        }
        return new RedirectView("/");

//        if (userFromDb.getPassword().equals(password)){
//            return new RedirectView("/");
//        } else {
//            return new RedirectView("/login");
//        }
    }

    @PostMapping("/signup")
    public RedirectView signUpUser(String username, String password){
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        Eweser newEweser = new Eweser(username, hashedPassword);
        eweserRepository.save(newEweser);
        return new RedirectView("/login");
    }
}
