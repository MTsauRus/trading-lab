package com.mtsaurus0710.tradinglab.entity.candles;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public abstract class BaseCandle {

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

    @Column(nullable = false)
    private Long timestamp;

    @Column(nullable = false)
    private Double candleAccTradePrice;

    @Column(nullable = false)
    private Double candleAccTradeVolume;


}
