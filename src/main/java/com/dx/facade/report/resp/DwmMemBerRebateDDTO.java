package com.dx.facade.report.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class DwmMemBerRebateDDTO {


    @ApiModelProperty(value="所属商户名称")
    private String topMerchantName;

    @ApiModelProperty(value="商户名称")
    private String merchantName;

    @ApiModelProperty(value="商户ID")
    private Long merchantId;

    @ApiModelProperty(value="会员ID")
    private Long memberId;

    @ApiModelProperty(value="代理ID")
    private Long parentProxyId;

    @ApiModelProperty(value="会员账号")
    private String userName;



    @ApiModelProperty(value="会员昵称")
    private String nick_name;

    @ApiModelProperty(value="订单号")
    private String orderNo;

    @ApiModelProperty(value="日期")
    private Integer reportDate;


    @ApiModelProperty(value="发放时间")
    private LocalDateTime payoutTime;

    @ApiModelProperty(value="创建时间")
    private LocalDateTime createdAt;


    @ApiModelProperty(value="返点金额")
    private BigDecimal rebateAmount;



}
