package com.algaworks.algafoodapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Controller
public class MeuPrimeiroController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello!";
    }
}
