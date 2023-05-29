package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.dx.facade.member.resp.ProxyInfoRespDTO;

/**
 * @Description: 总代代理线层级上限调整 接收消息对象
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MqMaxLevelsEditReqDto {

	@ApiModelProperty(value = "代理列表")
	private List<ProxyInfoRespDTO> proxyList;
	
	@ApiModelProperty("提交审核备注(100)")
	private String remark;
	
	@ApiModelProperty("商户ID")
	private Long merchantId;
	
	@ApiModelProperty("当前操作人")
	private String currentUserName;
	
	@ApiModelProperty("代理线层级上限(2) 变更后")
	private Integer maxLevels;
	
}