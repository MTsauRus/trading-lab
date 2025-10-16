package com.mtsaurus0710.tradinglab.entity.candles;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "candles_min_5")
@SuperBuilder
@NoArgsConstructor
public class CandleMin5 extends BaseCandle {
}
