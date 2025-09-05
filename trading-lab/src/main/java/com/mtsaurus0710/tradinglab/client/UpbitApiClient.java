package com.mtsaurus0710.tradinglab.client;

import com.mtsaurus0710.tradinglab.dto.UpbitDayCandleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "upbit-api", url = "https://api.upbit.com/v1")
public interface UpbitApiClient {

    @GetMapping("/candles/days")
    List<UpbitDayCandleDto> getDayCandles(
            @RequestParam("market") String market,
            @RequestParam("count") int count
    );
}
