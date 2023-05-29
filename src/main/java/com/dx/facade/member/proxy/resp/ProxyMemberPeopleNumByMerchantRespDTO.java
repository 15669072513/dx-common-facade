package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 商户下会员、代理人数统计
 *
 * @author fitz
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyMemberPeopleNumByMerchantRespDTO implements Serializable {
	
	@ApiModelProperty("商户id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
	@ApiModelProperty(value = "会员人数")
	private Long memberNum;
	
	@ApiModelProperty(value = "代理人数")
	private Long proxyNum;
	
}