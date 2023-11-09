package com.dx.facade.texas.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class HandEndDto {
    /**
     * 牌桌主键
     */
    private Long tableId;
    /**
     * 手牌ID
     */
    private Long handId;
    /**
     * 牌局结束时间
     */
    private Long handEndTime;
    //用户ID集合
    private List<Long> userIdList;
}
