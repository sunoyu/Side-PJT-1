package com.suno.toy.controller;

import com.suno.toy.model.ExchangeRate;
import com.suno.toy.model.ExchangeReq;
import com.suno.toy.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExchangeController {
    @Autowired
    private ExchangeService exchangeService;
    @GetMapping("/currency-rate")
    public List<ExchangeRate> getCurrency(ExchangeReq exchangeReq){
        System.out.println("Called /currency-rate");
        List<ExchangeRate> rateList = exchangeService.getExchangeRateList(exchangeReq);
        return rateList;
    }
}
