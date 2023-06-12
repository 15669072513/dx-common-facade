package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 新增俱乐部请求DTO
 * 
 * @author bicycle
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClubSaveReqDTO {

	/** 商户ID */
    @ApiModelProperty("商户ID")
    private Long merchantId;

    /** 代理Id */
    @ApiModelProperty("代理Id")
    private Long proxyId;

    /** 代理名称 */
    @ApiModelProperty("代理名称")
    private String proxyName;
    
    /** 俱乐部名称 */
    @ApiModelProperty("俱乐部名称")
    private String clubName;
        
    /** icon地址 */
    @ApiModelProperty("icon地址")
    private String iconUrl;
    
    /** 简介 */
    @ApiModelProperty("简介")
    private String introduction;
    
    /** 当前用户 */
    @ApiModelProperty("当前用户")
    private String currentUser;
    
    /** 申请信息 */
    @ApiModelProperty("申请信息")
    private String applyInfo;

}
