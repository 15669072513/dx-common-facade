package com.dx.facade.game.req;

import com.dx.enums.ChipScoreEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author admin
 */
@Data
public class UpScoreReq{
    @ApiModelProperty("tableId")
    private Long tableId;
    @ApiModelProperty("tableName")
    private String tableName;
    @ApiModelProperty("玩家id")
    private Long userId;
    @ApiModelProperty("金额")
    private BigDecimal amount;

    /**
     * 账号名
     */
    private String userName;

    /**
     * 钱包类型
     */
    private Integer walletType;
    /**
     * 俱乐部
     */
    private Long clubId;

    /**
     * 商户ID
     */
    private Long merchantId;

    /**
     * 商户名称
     */
    private String merchantName;

    /**
     * 昵称
     */
    private String nickName;
    /**
     * 币种 USDT
     */
    private String currency;
    /**
     * 事件ID
     */
    private String eventId;

    /**
     * 事件Time
     */
    private Long eventTime;
}
