package com.dx.facade.game.dto;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 游戏余额返回对象
 *
 * @author dereck
 * @version 1.0.0
 * @date 2022/09/23 15:55
 */
@Data
public class GameBalanceDto {

    /**
     * 游戏ID
     */
    private String gameId;


    /**
     * 游戏代码
     */
    private String gameCode;

    /**
     * 游戏名称
     */
    private String gameName;
    
    /**
     * 游戏名称越南文
     */
    private String gameNameVnd;

    /**
     * 游戏名称泰文
     */
    private String gameNameThb;
    /**
     * 游戏名称英文
     */
    private String gameNameEn;

    /**
     * 游戏名称
     */
    private String playName;

    /**
     * 游戏余额
     */
    private BigDecimal balance;
    
    /**
     * 钱包状态
     */
    private Integer status;

    /**
     * 场馆名称
     */
    @ApiModelProperty("场馆名称")
    private String venueName;

    @ApiModelProperty("场馆英文名")
    private String venueEnName;

    @ApiModelProperty("场馆泰文名")
    private String venueThName;

    @ApiModelProperty("场馆越南名")
    private String venueVnName;
}
