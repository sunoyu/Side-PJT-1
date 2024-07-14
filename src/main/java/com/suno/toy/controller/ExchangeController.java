package com.suno.toy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExchangeController {
    @GetMapping("/currency-rate")
    public ResponseEntity<Map<String, String>> getCurrency(){
        System.out.println("Call /currency-rate");

        return null;
    }
}
