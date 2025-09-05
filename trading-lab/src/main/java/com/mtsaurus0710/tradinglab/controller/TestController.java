package com.mtsaurus0710.tradinglab.controller;

import com.mtsaurus0710.tradinglab.client.UpbitApiClient;
import com.mtsaurus0710.tradinglab.dto.UpbitDayCandleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final UpbitApiClient upbitApiClient;

    @GetMapping("/test/upbit")
    public List<UpbitDayCandleDto> testUpbitApi() {
        return upbitApiClient.getDayCandles("KRW-BTC", 3);
    }
}
