package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class MemberVenueTypeNetRespDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商户id")
    private Long memberId;

    @ApiModelProperty(value = "会员账号")
    private String memberName;

    @ApiModelProperty(value = "场馆类型类型(如ty,dj,zr)(见BwVenueTypeEnum)")
    private String venueType;

    @ApiModelProperty(value = "场馆类型名称(如体育,真人,区块链)(见BwVenueTypeEnum)")
    private String venueTypeName;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    @ApiModelProperty(value = "上级代理账号")
    private String parentProxyName;

    @ApiModelProperty(value = "总代账号")
    private String topProxyName;

    @ApiModelProperty(value = "注单数")
    private Long betCount;

    @ApiModelProperty(value = "投注额")
    private BigDecimal betAmount;

    @ApiModelProperty(value = "有效投注额")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value = "输赢金额")
    private BigDecimal netAmount;

    @ApiModelProperty(value = "币种")
    private String currency;
}
