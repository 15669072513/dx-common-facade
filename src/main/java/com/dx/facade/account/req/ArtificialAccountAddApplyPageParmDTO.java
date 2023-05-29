package com.dx.facade.account.req;


import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 会员人工加额记录表 分页查询参数封装
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArtificialAccountAddApplyPageParmDTO implements BaseParmDTO, Serializable {

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "商户id", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private List<Long> merchantIdLs;

	@ApiModelProperty(value = "用户类型(0=会员 1=代理)",required = true, example = "1")
	private Integer userType;

	@ApiModelProperty(value = "账号", example = "abc123456")
	private String userName;

	@ApiModelProperty(value="调整类型（会员）：CbdEnums.CbdMemberAdjustType",example = "1")
	private Integer adjustType;
	
	@ApiModelProperty(value="调整金额-最小值",example = "10")
	private BigDecimal adjustAmountMin;
	
	@ApiModelProperty(value="调整金额-最大值",example = "1000")
	private BigDecimal adjustAmountMax;
	
	@ApiModelProperty(value = "订单号", example = "4544654647")
	private String eventId;
	
	@ApiModelProperty(value = "申请时间-开始", required = true, example = "2021-06-16 00:00:00")
	private String eventTimeStart;
	
	@ApiModelProperty(value = "申请时间-截止", required = true, example = "2021-06-16 23:59:59")
	private String eventTimeEnd;

	@ApiModelProperty("订单状态(3=审核拒绝,4=审核通过 默认为全部)")
	private List<Integer> orderStatusLs;

	@ApiModelProperty(value = "申情人")
	private String operator;

	@ApiModelProperty(value = "审核人/锁单人")
	private String lockAccount;

	@ApiModelProperty(value = "锁单状态")
	private Integer lockStatus;

	@ApiModelProperty(value = "排序列:1-申请时间")
	private Integer orderKey;
	
	@ApiModelProperty(value = "排序方式(1)：desc-降序 asc-升序",example = "asc")
	private String orderType;

	@ApiModelProperty(value="锁单状态是否排最前",example = "true")
	private Boolean lockIsFirst = true;


	private Long userId;

	@Override
	public void check() {
		Assert.notNull(userType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userType"));
	}
}