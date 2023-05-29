package com.dx.facade.account.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.util.Assert;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 功能描述: 人工加额申请表 锁单,解锁参数封装
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArtificialAccountAddLockOrderParmDTO implements BaseParmDTO,Serializable {

    @ApiModelProperty(value = "审核单ID(18)", required = true,example = "1454654635464")
    @NotNull(message = "审核单ID不能为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户ID(18)", hidden = true)
    private Long merchantId;

    @ApiModelProperty(value = "锁单状态 0：解锁，1：锁单", required = true)
    @NotNull(message = "锁单状态不能为空")
    @Range(min = 0, max = 1, message = "锁单状态:只能输入 0 或者 1")
    private Integer lockStatus;

    @ApiModelProperty(value = "锁单人", hidden = true)
    private String operator;

    @ApiModelProperty("锁单人id")
    private Long lockAccountId;

    @Override
    public void check() {
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(lockStatus, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("lockStatus"));
        Assert.notNull(lockAccountId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("lockAccountId"));
        Assert.hasLength(operator, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("operator"));
    }
}
