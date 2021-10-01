package com.yoshikawa.VenturaRh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetodosController {

    @GetMapping(path = "/get")
    public String get(){
        return "Requisição Get";

    }

    @PostMapping(path = "/home")
    public String post(){
        return "Requisição post";

    }
    public String put(){
        return "Requisição put";

    }
    public String patch(){
        return "Requisição patch";

    }
    public String delete(){
        return "Requisição delete";

    }
}
