package com.mtsaurus0710.tradinglab.entity.candles;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "candles_min_60")
@SuperBuilder
@NoArgsConstructor
public class CandleMin60 extends BaseCandle {
}
