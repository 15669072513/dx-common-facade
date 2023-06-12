package com.dx.facade.member.param;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.util.Assert;

import com.baomidou.mybatisplus.annotation.TableId;
import com.dx.facade.member.exception.ErrorCode;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 新增代理俱乐部请求参数DTO
 * 
 * @author Administrator
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "新增代理俱乐部请求Param", description = "新增代理俱乐部请求Param")
public class AddProxyClubParamDTO implements BaseParmDTO, Serializable {

    private static final long serialVersionUID = -5276753294444979337L;

    /** 商户Id */
    @ApiModelProperty("商户Id")
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
    
    /** 管理员Id */
    @ApiModelProperty("管理员Id")
    private Long administratorId;
    
    /** 管理员名称 */
    @ApiModelProperty("管理员名称")
    private String administratorName;
    
    /** 人员上线 */
    @ApiModelProperty("人员上线")
    private Integer upperLimit;
    
    /** 会员人数 */
    @ApiModelProperty("会员人数")
    private Integer membership;
    
    @ApiModelProperty("同时开牌桌上限")
    private Integer cardTableLimit;
    
    @ApiModelProperty("单牌桌旁观人数上限")
    private Integer lookOnLimit;
    
    /** icon地址 */
    @ApiModelProperty("icon地址")
    private String iconUrl;
    
    /** 状态 */
    @ApiModelProperty("状态")
    private Integer status;
    
    /** 简介 */
    @ApiModelProperty("简介")
    private String introduction;

    /** 创建人 */
    @ApiModelProperty("创建人")
    private String createdBy;

    /** 创建时间 */
    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    
    @Override
    public void check() {
        Assert.notNull(proxyId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(clubName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userName"));
    }
}
