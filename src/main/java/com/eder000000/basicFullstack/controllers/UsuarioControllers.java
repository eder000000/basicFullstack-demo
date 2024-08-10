package com.eder000000.basicFullstack.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioControllers {

    @RequestMapping(value="/prueba")
    public String prueba() {
        return "HOLA MUNDO";
    }
}
