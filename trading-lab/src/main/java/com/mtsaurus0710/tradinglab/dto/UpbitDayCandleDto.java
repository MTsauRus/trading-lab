package com.mtsaurus0710.tradinglab.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public class UpbitDayCandleDto {
    @JsonProperty("candle_date_time_kst")
    private LocalDateTime candleDateTimeKst;

    @JsonProperty("opening_price")
    private Double openingPrice;

    @JsonProperty("high_price")
    private Double highPrice;

    @JsonProperty("low_price")
    private Double lowPrice;

    @JsonProperty("change_price")
    private Double changePrice;

    @JsonProperty("change_rate")
    private Double changeRate;
}