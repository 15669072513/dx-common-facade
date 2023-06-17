package com.dx.facade.member.param;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 代理俱乐部请求参数DTO
 * 
 * @author Administrator
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "代理俱乐部请求Param", description = "代理俱乐部请求Param")
public class QueryProxyClubParamDTO implements BaseParmDTO, Serializable {

    private static final long serialVersionUID = -5276753294444979337L;

    /** 俱乐部id */
    @ApiModelProperty("俱乐部id")
    private Long clubId;
    
    /** 商户Id */
    @ApiModelProperty("商户Id")
    private Long merchantId;
    
    /** 代理Id */
    @ApiModelProperty("代理Id")
    private Long proxyId;

    /** 代理名称 */
    @ApiModelProperty("代理名称")
    private String proxyName;
    
    /** 代理姓名 */
    @ApiModelProperty("代理姓名")
    private String proxyRealName;
    
    /** 总代名称 */
    @ApiModelProperty("总代名称")
    private String topProxyName;
    
    /** 俱乐部名称 */
    @ApiModelProperty("俱乐部名称")
    private String clubName;
    
    /** 管理员Id */
    @ApiModelProperty("管理员Id")
    private Long administratorId;
    
    /** 管理员名称 */
    @ApiModelProperty("管理员名称")
    private String administratorName;
    
    /** 状态 */
    @ApiModelProperty("状态")
    private Integer status;

    /** 创建人 */
    @ApiModelProperty("创建人")
    private String createdBy;

    /** 创建时间 */
    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    /** 最后操作人 */
    @ApiModelProperty("最后操作人")
    private String updatedBy;

    /** 最后操作时间 */
    @ApiModelProperty("最后操作时间")
    private LocalDateTime updatedAt;

	@Override
	public void check() {
	}
}
