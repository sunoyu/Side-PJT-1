package com.suno.toy.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.suno.toy.model.ExchangeRate;
import com.suno.toy.model.ExchangeReq;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class ExchangeServiceImpl implements ExchangeService{
//(요청) https://www.koreaexim.go.kr/site/program/financial/exchangeJSON?authkey=AUTHKEY1234567890&searchdate=20180102&data=AP01

    @Value("${exchange.api.key}")
    private String apiKey;
    @Override
    public List<ExchangeRate> getExchangeRateList(ExchangeReq exchangeReq) {
        String url = "https://www.koreaexim.go.kr/site/program/financial/exchangeJSON"
                + "?authKey=" + apiKey
                + "&searchdate=" + exchangeReq.getSearchdate()
                + "&data=" + exchangeReq.getData();

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            ExchangeRate[] exchangeRates = objectMapper.readValue(response, ExchangeRate[].class);
            return Arrays.asList(exchangeRates);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
