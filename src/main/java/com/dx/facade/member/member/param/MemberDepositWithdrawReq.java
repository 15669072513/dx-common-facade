package com.dx.facade.member.member.param;

import com.dx.facade.common.PageRequest;
import com.dx.facade.member.member.common.ProxyPaymentTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "会员存取款记录查询请求对象", description = "会员存取款记录查询请求对象")
public class MemberDepositWithdrawReq  extends PageRequest {

    @ApiModelProperty(value = "商户id", required = true)
    private Long merchantId;
    @ApiModelProperty(value = "存取类型，1存款，2取款", position = 1)
    private Integer type;
    @ApiModelProperty(value = "状态(0=待付款,1=待确认,2=处理中,3=成功,4=失败,5=已取消)", position = -1)
    private Integer status;
    @ApiModelProperty(value = "开始日期",required = true, position = 2)
    private LocalDateTime startDate;
    @ApiModelProperty(value = "结束日期",required = true, position = 3)
    private LocalDateTime endDate;

}