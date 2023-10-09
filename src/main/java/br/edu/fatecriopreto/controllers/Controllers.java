package br.edu.fatecriopreto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Controllers {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
