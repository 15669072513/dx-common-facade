package com.dx.facade.account.req;

import com.dx.facade.common.PageRequest;
import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.List;

/**
 * 人工减额记录 分页查询参数封装
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArtificialAccountSubRecordPageParmDTO extends PageRequest implements BaseParmDTO {

	@ApiModelProperty(value = "商户id", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private List<Long> merchantIdLs;

	@ApiModelProperty(value = "用户类型(0=会员 1=代理)",required = true, example = "1")
	private Integer userType;

	@ApiModelProperty(value = "订单号", example = "r41546541654164")
	private String eventId;
	
	@ApiModelProperty(value = "会员账号", example = "abc123467")
	private String userName;

	@ApiModelProperty(value = "调整类型：1=人工充值  2=存款优惠  3=其他", example = "1")
	private Integer adjustType;

	@ApiModelProperty(value = "钱包类型，详见walletType字典", example = "6")
	private Integer walletType;

	@ApiModelProperty(value = "调整金额-最小值", example = "10")
	private BigDecimal adjustAmountMin;
	
	@ApiModelProperty(value = "调整金额-最大值", example = "200")
	private BigDecimal adjustAmountMax;

	@ApiModelProperty(value = "账号状态(1=正常,2=登录锁定,3=游戏锁定,4=充提锁定), EnumAccountStatusType枚举")
	private Integer accountStatusType;

	@ApiModelProperty(value = "操作时间-开始", required = true, example = "2021-06-01 00:00:00")
	private String eventTimeStart;
	
	@ApiModelProperty(value = "操作时间-截止", required = true, example = "2021-06-18 00:00:00")
	private String eventTimeEnd;

	@ApiModelProperty(value = "排序 1=申请时间",example = "1")
	private Integer orderKey;

	@ApiModelProperty(value = "排序方式(1)：desc-降序 asc-升序", example = "asc")
	private String orderType;


	private Long userId;

	@Override
	public void check() {
		Assert.hasLength(eventTimeStart, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventTimeStart"));
		Assert.hasLength(eventTimeEnd, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventTimeEnd"));
	}
}