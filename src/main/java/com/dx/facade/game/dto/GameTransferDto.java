package com.dx.facade.game.dto;

import com.dx.facade.enums.BwCurrencyEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author dereck
 * @since 2022-10-11
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "BwGameTransferPO对象", description = "")
public class GameTransferDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("转账单号")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String orderId;

    @ApiModelProperty("统一商户编号")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("会员ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long memberId;

    @ApiModelProperty("会员账号")
    private String memberName;

    @ApiModelProperty("风控层级id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long windControlId;

    @ApiModelProperty("风控层级名称")
    private String windControlName;

    @ApiModelProperty("转账金额")
    private BigDecimal amount;

    @ApiModelProperty("币种")
    private String currencyType;

    @ApiModelProperty("转账币种")
    private BwCurrencyEnum bwCurrencyEnum = BwCurrencyEnum.CNY;

    @ApiModelProperty("转账类型 1-转入；2-转出")
    private Integer transferType;

    @ApiModelProperty("转出钱包 中心钱包用center ")
    private String fromWallet;

    @ApiModelProperty("转入钱包 中心钱包用center")
    private String toWallet;

    @ApiModelProperty("转账状态 0：初始 1: 成功 2：失败")
    private Integer transferStatus;

    @ApiModelProperty("场馆单号")
    private String transferNo;

    @ApiModelProperty("账变时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime occurDt;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createDt;

    private String result;

    private String executor;

    @ApiModelProperty("发起方式 0自动 1会员手动")
    private Integer executeType;

    @ApiModelProperty("耗时时间")
    private Long timeCost;

    @ApiModelProperty("游戏code zr cp")
    private String gameCode;

    @ApiModelProperty("场馆code cp9")
    private String venueCode;

    private String userName;

    private String realName;


    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    public String getFromWallet() {
        if (1 == transferType) {
            return "center";
        } else {
            return venueCode;
        }
    }

    public String getToWallet() {
        if (1 == transferType) {
            return venueCode;
        } else {
            return "center";
        }
    }
}
