package com.dx.facade.game.service;

import com.dx.entity.CommonResp;

import java.math.BigDecimal;

public interface DownScoreRpc {
    CommonResp<Void> downScore(Long tableId, Long userId,BigDecimal amount);
}
