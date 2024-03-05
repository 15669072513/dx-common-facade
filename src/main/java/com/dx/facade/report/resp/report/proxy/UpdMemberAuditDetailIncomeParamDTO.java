package com.dx.facade.report.resp.report.proxy;

import com.dx.facade.member.exception.ErrorCode;
import com.dx.facade.member.param.BaseParmDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

import javax.validation.constraints.NotNull;

@Data
public class UpdMemberAuditDetailIncomeParamDTO implements BaseParmDTO{

    @ApiModelProperty(value = "审核单ID(18)", required = true,example = "1454654635464")
    @NotNull(message = "id不能为空")
    private String id;

    @Override
    public void check() {
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
    }
}
