package com.suno.toy.service;

import com.suno.toy.model.ExchangeRate;
import com.suno.toy.model.ExchangeReq;

import java.util.List;

public interface ExchangeService {
    List<ExchangeRate> getExchangeRateList(ExchangeReq exchangeReq);
}
