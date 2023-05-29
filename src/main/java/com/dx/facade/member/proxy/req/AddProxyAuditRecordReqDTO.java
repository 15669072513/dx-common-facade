package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 新增代理审核记录 入参
 *
 * @author fitz
 * @version 1.0.0
 * @date 2022/10/05
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddProxyAuditRecordReqDTO {
	
	@ApiModelProperty("商户层级路径")
	private String merchantPath;
	
	@ApiModelProperty(value = "申请时间开始，格式：yyyy-MM-dd HH:mm:ss")
	private String applyTimeStart;
	
	@ApiModelProperty(value = "申请时间结束，格式：yyyy-MM-dd HH:mm:ss")
	private String applyTimeEnd;
	
	@ApiModelProperty(value = "审核完成时间开始，格式：yyyy-MM-dd HH:mm:ss")
	private String auditTimeStart;
	
	@ApiModelProperty(value = "审核完成时间结束，格式：yyyy-MM-dd HH:mm:ss")
	private String auditTimeEnd;
	
	@ApiModelProperty(value = "申请人")
	private String applyName;
	
	@ApiModelProperty(value = "审核人")
	private String auditName;
	
	@ApiModelProperty(value = "代理账号")
	private String userName;
	
	@ApiModelProperty(value = "审核单号")
	private String auditNum;
	
	@ApiModelProperty(value = "账号类型（1-正式，2-测试，3-合作）")
	private Integer accountType;
	
	@ApiModelProperty(value = "审核状态（0-待处理 1-处理中，2-审核通过，3-审核拒绝）")
	private Integer auditStatus;
	
	@ApiModelProperty(value = "审核状态（0-待处理 1-处理中，2-审核通过，3-审核拒绝）")
	private List<Integer> auditStatusList;
	
	@ApiModelProperty(value = "锁单状态（0-未锁定 1-已锁定）")
	private Integer lockOrder;
	
	@ApiModelProperty(value = "所属商户")
	private Long merchantId;
	
	@ApiModelProperty(value = "排序字段[申请时间:applyTime,一审时间:auditTime]", hidden = true)
	private String orderProperties;
	
	@ApiModelProperty(value = "排序类型[升序：asc,降序：desc]", hidden = true)
	private String orderType;
}
