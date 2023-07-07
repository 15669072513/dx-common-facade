package com.dx.facade.member.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author grayson
 * @Description: 代理树形信息 返回对象封装
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyTreeRespDTO {
    
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
	
	@ApiModelProperty(value = "直属下级代理人数")
	private Integer directlyUnderProxyNum = 0;
	
	@ApiModelProperty(value = "下级代理人数")
	private Integer underProxyNum = 1;
	
	@ApiModelProperty(value = "代理层级路径")
	private String proxyPath;
	
	@ApiModelProperty(value = "代理等级")
	private Integer proxyLevel;
	
    @ApiModelProperty("代理层级名称")
    private String proxyLevelName;
	
	public List<ProxyTreeRespDTO> childList;
	private boolean hasParent;
	private boolean hasChild;
	
	private synchronized void initChildren() {
		if (this.childList == null) {
			this.childList = Lists.newArrayList();
		}
	}
	
	public void addChild(ProxyTreeRespDTO proxyTreeRespDTO) {
		initChildren();
		this.childList.add(proxyTreeRespDTO);
	}
}
