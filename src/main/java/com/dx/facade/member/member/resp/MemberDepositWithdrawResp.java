package com.dx.facade.member.member.resp;

import com.dx.facade.member.resp.MemberInfoRespDTO;
import com.dx.util.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.math.BigDecimal;
import java.util.Objects;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "会员存取款记录返回对象", description = "会员存取款记录返回对象")
public class MemberDepositWithdrawResp {

    @ApiModelProperty(value = "时间")
    private String eventTime;
    @ApiModelProperty(value = "订单号")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    @ApiModelProperty(value = "会员id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;
    @ApiModelProperty(value = "支付方式")
    private String thirdPaymentType;
    @ApiModelProperty(value = "支付币种")
    private String currency;
    @ApiModelProperty(value = "订单存款金额")
    private BigDecimal orderAmount;
    @ApiModelProperty(value = "实际支付金额")
    private BigDecimal realAmount;
    @ApiModelProperty(value = "存款优惠")
    private BigDecimal discountAmount;
    @ApiModelProperty(value = "存款状态(0=待付款,1=待确认,2=处理中,3=成功,4=失败,5=已取消)，取款状态(0=处理中,1=成功,2=失败)")
    private Integer orderStatus;
    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "取款金额")
    private BigDecimal withdrawAmount;
    @ApiModelProperty(value = "手续费")
    private BigDecimal fee;


}
