package com.dx.facade.member.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author grayson
 * @Description: 代理会员树形信息 返回对象封装
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyAndMemberTreeRespDTO {
    
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
    
    /** 注册开始时间 */
    @ApiModelProperty("注册开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String createdAtStart;
    
    /** 注册结束时间 */
    @ApiModelProperty("注册结束时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String createdAtEnd;
    
    public List<MemberTreeRespDTO> childMemberList;
	
	public List<ProxyAndMemberTreeRespDTO> childList;
	
	private boolean hasParent;
	
	private boolean hasChild;
	
	private synchronized void initChildren() {
		if (this.childList == null) {
			this.childList = Lists.newArrayList();
		}
	}
	
	private synchronized void initChildrenMember() {
		if (this.childMemberList == null) {
			this.childMemberList = Lists.newArrayList();
		}
	}
	
	public void addChild(ProxyAndMemberTreeRespDTO proxyTreeRespDTO) {
		initChildren();
		this.childList.add(proxyTreeRespDTO);
	}
	
	public void addChildMember(MemberTreeRespDTO memberTreeRespDTO) {
		initChildrenMember();
		this.childMemberList.add(memberTreeRespDTO);
	}
}
