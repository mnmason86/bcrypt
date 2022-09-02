package com.mnmason6.bcrypt.controllers;

import com.mnmason6.bcrypt.models.Eweser;
import com.mnmason6.bcrypt.repositories.EweserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @Autowired
    EweserRepository eweserRepository;
    @GetMapping("/{username}")
    public String getHome(@PathVariable String username, Model m){
        Eweser eweser = eweserRepository.findByUsername(username);
        m.addAttribute("username", username.toLowerCase());
        return "index";
    }

}
