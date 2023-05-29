package com.dx.facade.member.param;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

@Data
public class UpdMemberAuditParamDTO implements BaseParmDTO{

    @ApiModelProperty(value = "账号类型 （0-会员 1-代理）", hidden = true)
    private Integer userType;

    @ApiModelProperty(value = "审核单ID(18)", required = true,example = "1454654635464")
    private Long id;

    @ApiModelProperty(value = "审核结果(1=通过 2=拒绝)")
    private Integer auditStatus;

    @ApiModelProperty(value ="锁单人id", hidden = true)
    private Long lockAccountId;

    @ApiModelProperty(value = "审核人")
    private String operator;

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
