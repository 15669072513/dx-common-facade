package com.dx.facade.payment.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;


@Data
@Builder
@ApiModel(value = "会员或代理提款参数", description = "会员或代理提款参数")
public class WithDrawOrderDtoV2 implements Serializable {

	@ApiModelProperty(value = "商户id", hidden = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;

	@ApiModelProperty(value = "商户名称", hidden = true)
	private String merchantName;

	@ApiModelProperty(value = "用户类型(0=会员 1=代理),模拟接口为必填参数,APP接口不用传.", example = "1")
	@Min(value = 0, message = "用户类型最小值只能是0")
	@Max(value = 1, message = "用户类型最大值只能是1")
	private Integer userType;

	@ApiModelProperty(value = "用户id(会员或代理id)", hidden = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long userId;

	@ApiModelProperty(value = "用户或会员账号", hidden = true)
	private String userName;

	@NotNull(message = "提款金额不能为空")
	@ApiModelProperty(value = "提款金额", required = true)
	private BigDecimal orderAmount;

	@ApiModelProperty(value = "币种")
	private String currency;

	@NotNull(message = "提款方式不能为空")
	@ApiModelProperty(value = "提款方式(1=人民币取款 2=USDT取款)", required = true,example = "1")
	@Min(value = 1, message = "提款方式最小值只能是1")
	@Max(value = 2, message = "提款方式最大值只能是2")
	private Integer withdrawType;

	@ApiModelProperty(value = "客户ip", hidden = true)
	private String customerIp;

	@NotNull(message = "客户设备类型不能为空")
	@Range(min = 1, max = 5, message = "客户设备类型错误,1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP")
	@ApiModelProperty(value = "终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP）", required = true)
	private Integer deviceType;

	@NotBlank(message = "客户设备号不能为空")
	@ApiModelProperty(value = "客户设备号", required = true)
	private String deviceNo;

	@ApiModelProperty(value = "支付密码,代理佣金提款时为必填参数")
	private String payPassword;

}
