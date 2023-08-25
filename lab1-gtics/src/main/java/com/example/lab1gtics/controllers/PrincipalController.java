package com.example.lab1gtics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrincipalController {

    @RequestMapping(value = "/principal",method = RequestMethod.GET)
    public String paginaPrincipal(){
        return "narvar";
    }
}
