package com.dx.facade.member.param;

import java.io.Serializable;

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
public class CheckProxyClubParamDTO implements Serializable {

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

}
