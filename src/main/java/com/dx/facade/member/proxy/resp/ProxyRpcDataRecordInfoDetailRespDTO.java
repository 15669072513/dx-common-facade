package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 代理账户修改审核详情 返回参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/05/14
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "com-ob-proxy-resp-ProxyRpcDataRecordInfoRespDTO", description = "代理账户修改审核详情")
public class ProxyRpcDataRecordInfoDetailRespDTO implements Serializable {
    
    private static final long serialVersionUID = 431792588172339468L;
    /****************************************代理注册信息***********************************************/
    @ApiModelProperty(value = "注册时间")
    private String createDt;
    
    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private String accountType;
    
    @ApiModelProperty(value = "最后登陆时间")
    private String lastLoginTime;
    
    @ApiModelProperty(value = "注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP）")
    private String deviceType;
    
    /*************************************代理账号信息*************************************************/
    @ApiModelProperty(value = "代理账号")
    private String userName;

	@ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
	private Integer loginLockStatus;

	@ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
	private Integer accountLockStatus;
    
    @ApiModelProperty(value = "风控等级")
    private String windControlName;
    
    @ApiModelProperty(value = "代理标签")
    private String labelName;
    
    @ApiModelProperty(value = "备注信息")
    private String remark;
    /**************************************申请信息***************************************************/

    @ApiModelProperty(value = "申请人")
    private String applyName;
    
    @ApiModelProperty(value = "申请时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime applyTime;
    
    @ApiModelProperty(value = "审核类型")
    private String applyType;
    
    @ApiModelProperty(value = "审核原因")
    private String applyInfo;
    
    @ApiModelProperty(value = "修改前")
    private String beforeModify;
    
    @ApiModelProperty(value = "修改后")
    private String afterModify;
    /************************************审核信息*******************************************************/
    @ApiModelProperty(value = "一审人")
    private String auditName;
    
    @ApiModelProperty(value = "一审时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime auditTime;
    
    @ApiModelProperty(value = "一审备注")
    private String auditRemark;

    @ApiModelProperty(value = "私庄模式,1:吃单模式 2:坐庄模式")
    private Integer bankerMode;

    @ApiModelProperty(value = "注册站点,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty(value = "代理层级")
    private Integer proxyLevel;

    @ApiModelProperty(value = "代理层级名称")
    private String proxyLevelName;

    @ApiModelProperty(value = "代理信息：直接上级")
    private String parentProxyName;
}
