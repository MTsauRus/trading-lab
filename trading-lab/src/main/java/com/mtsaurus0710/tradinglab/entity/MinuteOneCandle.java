package com.mtsaurus0710.tradinglab.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // JPA
@Entity
@Table(name = "minute_one_candle", indexes = {
        @Index(name = "idx_market_timestamp", columnList = "market, timestamp")
})
public class MinuteOneCandle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String market;

    @Column(nullable = false)
    private LocalDateTime candleDateTimeKst;

    @Column(nullable = false)
    private Double openingPrice;

    @Column(nullable = false)
    private Double highPrice;

    @Column(nullable = false)
    private Double lowPrice;

    @Column(nullable = false)
    private Double tradePrice;

    @Column(nullable = false, unique = true)
    private Long timestamp;

    @Column(nullable = false)
    private Double candleAccTradePrice;

    @Column(nullable = false)
    private Double candleAccTradeVolume;

    @Builder
    public MinuteOneCandle(
            String market,
            LocalDateTime candleDateTimeKst,
            Double openingPrice,
            Double highPrice,
            Double lowPrice,
            Double tradePrice,
            Long timestamp,
            Double candleAccTradePrice,
            Double candleAccTradeVolume
    ) {
        this.market = market;
        this.candleDateTimeKst = candleDateTimeKst;
        this.openingPrice = openingPrice;
        this.highPrice = highPrice;
        this.lowPrice = lowPrice;
        this.tradePrice = tradePrice;
        this.timestamp = timestamp;
        this.candleAccTradePrice = candleAccTradePrice;
        this.candleAccTradeVolume = candleAccTradeVolume;
    }

}
