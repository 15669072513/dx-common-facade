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
 * 俱乐部审核锁单、解单请求参数DTO
 * 
 * @author Administrator
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdClubAuditLockOrderAndAuditParmDTO implements BaseParmDTO,Serializable {

  
	private static final long serialVersionUID = -5037266958087567843L;


	/** 审核单ID */
    @ApiModelProperty(value = "审核单ID(18)", required = true,example = "1454654635464")
    @NotNull(message = "审核单ID不能为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    /** 商户id */
    @ApiModelProperty(value = "商户ID(18)", required = true)
    private Long merchantId;

    /** 锁单人id */
    @ApiModelProperty(value ="锁单人id", hidden = true)
    private Long lockAccountId;

    /** 锁单人或者是审核人 */
    @ApiModelProperty(value = "锁单人或者是审核人", hidden = true)
    private String operator;
    
    /** 审核结果(1=通过 2=拒绝) */
    @ApiModelProperty(value = "审核结果(1=通过 2=拒绝)")
    @NotNull(message = "审核结果不能为空")
    @Range(min = 1, max = 2, message = "审核结果:只能输入 1 或者 2")
    private Integer auditStatus;

    /** 备注 */
    @ApiModelProperty(value = "备注")
    private String remark;

    @Override
    public void check() {
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(lockAccountId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("lockAccountId"));
        Assert.hasLength(operator, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("operator"));
        Assert.notNull(auditStatus, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("auditStatus"));
    }
}
