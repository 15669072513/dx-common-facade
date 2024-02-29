package com.dx.facade.game.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author admin
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
    @ApiModelProperty("牌桌code")
    private String tableCode;
    /**
     * 设备类型 EnumDeviceType
     */
    @ApiModelProperty("设备类型")
    private Integer obDeviceType;

    @ApiModelProperty("上分类型（1：自动；2：手动）")
    private Integer upScoreType = 1;

    /**
     * 用户ip
     */
    @ApiModelProperty("用户ip")
    private String ip;
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
    /**
     * 手牌code
     */
    private String handCode;
}
