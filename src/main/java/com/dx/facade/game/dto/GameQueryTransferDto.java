package com.dx.facade.game.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 查询转账结果参数
 * 备注：对单一的transferNo进行查询
 * @author dereck
 * @version 1.0.0
 * @date 2022/09/22 17:52
 */
@Data
public class GameQueryTransferDto extends GameDto {


    /**
     * 交易单号
     */
    private String transferNo;

    /**
     * 场馆ID
     */
    private Long gameId;

    private LocalDateTime occurDt;

    public GameQueryTransferDto() {}

}
