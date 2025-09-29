package com.mtsaurus0710.tradinglab.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public record UpbitMinuteCandleDto(
        @JsonProperty("market") String market,
        @JsonProperty("candle_date_time_utc") LocalDateTime candleDateTimeUtc,
        @JsonProperty("candle_date_time_kst") LocalDateTime candleDateTimeKst,
        @JsonProperty("opening_price") Double openingPrice,
        @JsonProperty("high_price") Double highPrice,
        @JsonProperty("low_price") Double lowPrice,
        @JsonProperty("trade_price") Double tradePrice,
        @JsonProperty("time_stamp") Long timeStamp,
        @JsonProperty("candle_acc_trade_price") Double candleAccTradePrice,
        @JsonProperty("candle_acc_trade_volume") Double candleAccTradeVolume,
        @JsonProperty("unit") int unit
        ) {
}
