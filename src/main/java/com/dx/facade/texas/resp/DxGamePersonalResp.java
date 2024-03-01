package com.dx.facade.texas.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * <p>
 * 游戏个人信息
 * </p>
 * @author broadway
 * @since 2023-08-05
 */
@Data
public class DxGamePersonalResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键id")
    private Long id;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("牌桌类型 2001:德州局 2002:短牌局")
    private Long tableType;

    @ApiModelProperty("总手数")
    private Long handNumberTotal=0L;

    @ApiModelProperty("百手盈利")
    private BigDecimal hundredHandProfit=BigDecimal.ZERO.setScale(1);

    @ApiModelProperty("主动入池次数")
    private Long activeBringPoolNumber=0L;

    @ApiModelProperty("Walks手牌数")
    private Long walksHandNumber=0L;

    @ApiModelProperty("翻牌前加注次数")
    private Long preFlopRaiseNumber=0L;

    @ApiModelProperty("翻牌前的游戏手数")
    private Long preFlopHandNumber=0L;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("牌桌维度入池率")
    private BigDecimal tableBringPoolRate=BigDecimal.ZERO.setScale(1);

    @ApiModelProperty("备注名")
    private String userNameRemark;

    @ApiModelProperty("备注信息")
    private String userRemark;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;
}
