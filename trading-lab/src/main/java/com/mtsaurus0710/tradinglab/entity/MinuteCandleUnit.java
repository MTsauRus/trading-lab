package com.mtsaurus0710.tradinglab.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MinuteCandleUnit {
    MIN_1(1),
    MIN_3(3),
    MIN_5(5),
    MIN_10(10),
    MIN_15(15),
    MIN_30(30),
    MIN_60(60),
    MIN_240(240);

    private final int unit;
}
