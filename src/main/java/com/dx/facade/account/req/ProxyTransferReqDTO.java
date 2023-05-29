package com.dx.facade.account.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * <p>
 * 代理转账DTO
 * </p>
 *
 * @author grayson
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyTransferReqDTO {

	/**
	 * 商户id
	 */
	private Long merchantId;
	/**
	 * 代理id
	 */
	private Long outProxyId;
	/**
	 * 转账业务类型,1额度转账、2佣金转账
	 */
	private Integer accountType;
	/**
	 * 下级代理Id
	 */
	private Long inProxyId;
	/**
	 * 转账金额
	 */
	private BigDecimal amount;

	/**
	 * 备注
	 */
	private String remark;

}
