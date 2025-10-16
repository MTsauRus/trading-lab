package com.mtsaurus0710.tradinglab.repository.candles;

import com.mtsaurus0710.tradinglab.entity.candles.BaseCandle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean // 공통 템플릿이므로 빈에 등록하지 않음
public interface BaseCandleRepository<T extends BaseCandle> extends JpaRepository<T,Long> {
    // BaseCandleRepository는 BaseCandle의 자식이어야
}
// 현재 entity 다 만들고 repsitory 만드는 중~ 제네릭이 이해가 안되는 중