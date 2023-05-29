package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawOrderAuditParamDTO {

    @ApiModelProperty("订单id")
    private String eventId;

    @ApiModelProperty("审核结果, 1=通过 2=拒绝")
    private Integer auditResult;

    @ApiModelProperty("订单状态")
    private Integer orderStatus;

    @ApiModelProperty("审核备注")
    private String auditDesc;

    @ApiModelProperty("客户端备注")
    private String clientAuditDesc;

    @ApiModelProperty("审核人")
    private String auditOperator;

    @ApiModelProperty("审核人Id")
    private Long auditOperatorId;

    public void check(){

        Assert.notNull(eventId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventId"));

        Assert.notNull(auditResult, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("auditResult"));

        Assert.notNull(auditDesc, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("auditDesc"));

        Assert.notNull(auditOperator, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("auditOperator"));

    }
}
