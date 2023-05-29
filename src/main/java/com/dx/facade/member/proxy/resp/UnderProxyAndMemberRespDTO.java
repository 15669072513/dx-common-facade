package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * 下级代理以及下级会员信息 返回参数
 *
 * @author fitz
 * @version 1.0.0
 * @date 2022/10/16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UnderProxyAndMemberRespDTO {
	
	@ApiModelProperty(value = "上级代理id集合")
	private List<Long> parentProxyIds;
	
	@ApiModelProperty("下级会员账号集合 包括转代前会员数据")
	private List<String> userNames;
	
}
