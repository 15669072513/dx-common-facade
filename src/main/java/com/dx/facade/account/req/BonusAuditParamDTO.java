package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author grayson
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BonusAuditParamDTO implements BaseParmDTO {

    @ApiModelProperty(value = "商户id", required = true)
    private Long merchantId;

    @ApiModelProperty(value = "审核单ID", required = true)
    private List<Long> ids;

    @ApiModelProperty("当前订单状态，1=待一审,2=一审审核,3=待二审,4=二审审核,5=一审拒绝,6=二审拒绝,7=审核通过")
    private Integer orderStatus;

    @ApiModelProperty("审核账号")
    private String auditOperator;

    @ApiModelProperty("审核账号id")
    private Long auditOperatorId;

    @ApiModelProperty("审核结果(0=未处理 1=通过 2=拒绝)")
    private Integer auditResult;

    @ApiModelProperty("审核备注")
    @Size(max = 500, message = "审核备注不允许超过500个字符")
    private String auditDesc;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notEmpty(ids, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("ids"));
        Assert.notNull(orderStatus, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("orderStatus"));
        Assert.notNull(auditOperator, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("auditOperator"));
        Assert.notNull(auditResult, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("auditResult"));
        Assert.notNull(auditDesc, "审核备注不能为空");
    }
}
