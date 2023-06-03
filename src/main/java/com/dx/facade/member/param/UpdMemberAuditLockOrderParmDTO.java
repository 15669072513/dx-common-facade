package com.dx.facade.member.param;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
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
 * 会员审核锁单、解单请求参数DTO
 * 
 * @author Administrator
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdMemberAuditLockOrderParmDTO implements BaseParmDTO,Serializable {

  
	private static final long serialVersionUID = -5037266958087567843L;

	/** 账号类型 （0-会员 1-代理） */
	@ApiModelProperty(value = "账号类型 （0-会员 1-代理）", hidden = true)
    private Integer userType;

	/** 审核单ID */
    @ApiModelProperty(value = "审核单ID(18)", required = true,example = "1454654635464")
    @NotNull(message = "审核单ID不能为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    /** 商户id */
    @ApiModelProperty(value = "商户ID(18)", required = true)
    private Long merchantId;

    /** 锁单状态 0：解锁，1：锁单 */
    @ApiModelProperty(value = "锁单状态 0：解锁，1：锁单", required = true)
    @NotNull(message = "锁单状态不能为空")
    @Range(min = 0, max = 1, message = "锁单状态:只能输入 0 或者 1")
    private Integer lockStatus;

    /** 锁单人id */
    @ApiModelProperty(value ="锁单人id", hidden = true)
    private Long lockAccountId;

    /** 锁单人 */
    @ApiModelProperty(value = "锁单人", hidden = true)
    private String operator;

    @Override
    public void check() {
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(lockStatus, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("lockStatus"));
        Assert.notNull(lockAccountId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("lockAccountId"));
        Assert.hasLength(operator, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("operator"));
    }
}
