package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

/**
 * 锁定&解锁新增代理审核记录 入参
 *
 * @author fitz
 * @version 1.0.0
 * @date 2022/10/05
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LockProxyAuditRecordReqDTO {
	
	@ApiModelProperty(value = "审核单ID(18)", required = true)
	@NotNull(message = "审核单ID不能为空")
	private Long id;
	
	@ApiModelProperty(value = "锁单状态 0：解锁，1：锁单", required = true)
	@NotNull(message = "锁单状态不能为空")
	@Range(min = 0, max = 1, message = "锁单状态:只能输入 0 或者 1")
	private Integer lockStatus;
	
	@ApiModelProperty(value = "锁单人", hidden = true)
	private String lockName;
	
	@ApiModelProperty(value = "锁单人ID", hidden = true)
	private Long lockId;
	
}
