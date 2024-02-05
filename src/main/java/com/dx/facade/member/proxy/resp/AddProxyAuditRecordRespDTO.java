package com.dx.facade.member.proxy.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * 新增代理审核记录 返回实体类
 *
 * @author fitz
 * @version 1.0.0
 * @date 2022/10/05
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddProxyAuditRecordRespDTO {
	
	@ApiModelProperty("代理审核记录ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long id;
	
	@ApiModelProperty("代理商户ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
	@ApiModelProperty("代理id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long userId;
	
	@ApiModelProperty("代理账号")
	private String userName;
	
	@ApiModelProperty(value = "代理层级")
	private Integer proxyLevel;
	
	@ApiModelProperty("账号类型（1-正式，2-商务，3-置换）")
	private Integer accountType;
	
	@ApiModelProperty("审核单号")
	private String auditNum;
	
	@ApiModelProperty("申请人")
	private String applyName;
	
	@ApiModelProperty("申请时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime applyTime;
	
	@ApiModelProperty("申请信息")
	private String applyInfo;
	
	@ApiModelProperty("审核状态（0-待处理 1-处理中，2-审核通过，3-审核拒绝）")
	private Integer auditStatus;
	
	@ApiModelProperty("一审人")
	private String auditName;
	
	@ApiModelProperty("锁单人ID")
	private Long lockId;
	
	@ApiModelProperty("一审时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime auditTime;
	
	@ApiModelProperty("锁单时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime lockDatetime;
	
	@ApiModelProperty("锁单状态（0-未锁定 1-已锁定）")
	private Integer lockOrder;
	
	@ApiModelProperty("审核备注")
	private String auditRemark;
	
	@ApiModelProperty(value = "代理层级名称")
	private String proxyLevelName;
	
	@ApiModelProperty("直属上级")
	private String parentProxyName;
	
	@ApiModelProperty(value = "返点契约ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long rebateContractId;
	
	@ApiModelProperty(value = "佣金契约ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long commissionContractId;
	
	@ApiModelProperty(value = "代理线层级上限")
	private Integer maxLevels;
	
	@ApiModelProperty(value="返点政策类型ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long rebatePolicyTypeId;
	
	@ApiModelProperty(value="佣金政策类型ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long commissionPolicyTypeId;
	
	@ApiModelProperty(value = "佣金模式 1-返点模式 2-返佣模式", required = true)
	private Integer commissionModel;

	@ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
	private Integer businessModel;

    @ApiModelProperty("返点比率分配模式 1：自由模式 2：模板模式")
    private Integer rebateAllotMode;

}
