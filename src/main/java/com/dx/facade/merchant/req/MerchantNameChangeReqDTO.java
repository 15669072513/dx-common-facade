package com.dx.facade.merchant.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 商户场馆费率配置 返回参数
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/1
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MerchantNameChangeReqDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * 商户ID
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	/**
	 * 商户名称
	 */
	private String merchantName;
	
}