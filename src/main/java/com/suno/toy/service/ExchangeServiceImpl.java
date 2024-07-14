package com.suno.toy.service;

import com.suno.toy.model.ExchangeRate;
import com.suno.toy.model.ExchangeReq;
import lombok.Value;
import org.springframework.stereotype.Service;

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


        return null;
    }
}
