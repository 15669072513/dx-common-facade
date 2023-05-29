package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *  审核 新增代理审核记录 入参
 *
 * @author fitz
 * @version 1.0.0
 * @date 2022/10/05
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthProxyAuditRecordReqDTO {
	
	@ApiModelProperty(value = "id(18)", required = true, example = "1407556484174188546")
	@NotNull(message = "审核单ID 不能为空")
	private Long id;
	
	@ApiModelProperty(value = "审核状态(2=审核通过 3=审核拒绝)", required = true, example = "1")
	@Min(value = 2, message = "审核状态最小不能小于2")
	@Max(value = 3, message = "审核状态最大不能大于3")
	@NotNull(message = "审核状态 不能为空")
	private Integer auditStatus;
	
	@ApiModelProperty(value = "备注", example = "审核通过...")
	private String remark;
	
	@ApiModelProperty(value = "审核人", hidden = true)
	private String auditName;
	
}
