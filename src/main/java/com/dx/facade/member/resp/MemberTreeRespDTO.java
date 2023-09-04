package com.dx.facade.member.resp;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author grayson
 * @Description: 会员树形信息 返回对象封装
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberTreeRespDTO {
    
    @ApiModelProperty(value = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    
    @ApiModelProperty(value = "代理账号")
    private String userName;
	
	@ApiModelProperty(value = "商户id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;

	@ApiModelProperty(value = "上级代理id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long parentProxyId;
	
	@ApiModelProperty(value = "上级代理账号")
	private String parentProxyName;
}
