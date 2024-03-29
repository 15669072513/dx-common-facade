package com.dx.facade.member.param;

import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 会员审核请求DTO
 * 
 * @author bicycle
 *
 */
@Data
public class UpdClubAuditParamDTO implements BaseParmDTO{

    /** 审核单ID */
    @ApiModelProperty(value = "审核单ID(18)", required = true,example = "1454654635464")
    private Long id;

    /** 审核结果(1=通过 2=拒绝) */
    @ApiModelProperty(value = "审核结果(1=通过 2=拒绝)")
    private Integer auditStatus;

    /** 锁单人id */
    @ApiModelProperty(value ="锁单人id", hidden = true)
    private Long lockAccountId;

    /** 审核人 */
    @ApiModelProperty(value = "审核人")
    private String operator;

    /** 备注 */
    @ApiModelProperty(value = "备注")
    private String remark;

    @Override
    public void check() {
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
        Assert.notNull(auditStatus, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("auditStatus"));
        Assert.notNull(lockAccountId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("lockAccountId"));
        Assert.notNull(operator, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("operator"));
        Assert.notNull(remark, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("remark"));
    }
}
