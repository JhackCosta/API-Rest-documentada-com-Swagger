package br.com.estudo.swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Welcome to my first page";
    }

}
