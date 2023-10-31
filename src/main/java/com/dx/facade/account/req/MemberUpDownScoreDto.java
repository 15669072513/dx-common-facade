package com.dx.facade.account.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class MemberUpDownScoreDto {

	/**
	 * 商户id
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;

	/**
	 * *代理id
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long proxyId;

	/**
	 * 会员id
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long userId;

	/**
	 * 下级会员账号
	 */
	private String userName;

	/**
	 * 操作金额
	 */
	private BigDecimal amount;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 支付密码
	 */
	private String payPassword;

	/**
	 * 钱包类型 1现金钱包，2信用钱包
	 */
	private Integer walletType;


}
