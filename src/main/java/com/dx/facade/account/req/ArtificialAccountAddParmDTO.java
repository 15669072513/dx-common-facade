package com.dx.facade.account.req;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

/**
 * 功能描述: 人工加额申请表 审核参数封装
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArtificialAccountAddParmDTO implements BaseParmDTO {
    @ApiModelProperty(value = "审核订单ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "用户类型(0=会员 1=代理)")
    private Integer userType;

    @ApiModelProperty("订单状态，1=待一审,2=一审审核,3=待二审,4=二审审核,5=一审拒绝,6=二审拒绝,7=审核通过")
    private Integer orderStatus;

    @ApiModelProperty(value = "审核结果(1=通过 2=拒绝)")
    private Integer auditStatus;

    @ApiModelProperty("锁单人id")
    private Long lockAccountId;

    @ApiModelProperty(value = "审核人")
    private String operator;

    @ApiModelProperty(value = "备注")
    private String remark;

    @Override
    public void check() {
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
        Assert.notNull(userType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userType"));
        Assert.notNull(orderStatus, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("orderStatus"));
        Assert.notNull(auditStatus, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("auditStatus"));
        Assert.notNull(lockAccountId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("lockAccountId"));
        Assert.hasLength(operator, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("operator"));
        Assert.hasLength(remark, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("remark"));

    }
}
