package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

/**
 * @author agan
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyTransferRecordAuditDTO {

    /**
     * 审核id
     * */
    @ApiModelProperty(value = "审核id",required = true,example = "23423432")
    private Long id;

    /**
     * 会员账号
     */
    @ApiModelProperty(value = "会员账号",example = "fab")
    private String userName;

    /**
     * 会员id
     */
    @ApiModelProperty(value = "会员id",example = "32432")
    private Long userId;

    /**
     * 账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）
     */
    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）",example = "32432")
    private Integer accountType;


    /**
     * 商户id
     */
    @ApiModelProperty(value = "商户id",example = "2432432")
    private Long merchantId;

    /**
     * 当前上级代理账号
     */
    @ApiModelProperty(value = "当前上级代理账号",example = "fab")
    private String currentProxyName;

    /**
     * 当前上级代理id
     */
    @ApiModelProperty(value = "当前上级代理id",example = "324324")
    private Long currentProxyId;


    /**
     * 转入上级代理id
     */
    @ApiModelProperty(value = "转入上级代理id",example = "3243242")
    private Long transferProxyId;

    /**
     * 转入上级代理账号
     */
    @ApiModelProperty(value = "转入上级代理账号",example = "fab")
    private String transferProxyName;

    /**
     * 申请人
     */
    @ApiModelProperty(value = "申请人",example = "fab")
    private String applyName;

    /**
     * 申请信息
     */
    @ApiModelProperty(value = "申请信息",example = "fab")
    private String applyInfo;


    /**
     * 一审人
     * */
    @ApiModelProperty(value = "一审人",example = "fab")
    private String auditName;

    /**
     * 审核备注
     * */
    @ApiModelProperty(value = "审核备注",example = "fab")
    @Size(max = 50)
    private String auditRemark;

    /**
     * 申请时间
     * */
    @ApiModelProperty(value = "申请时间",example = "2021-12-13 01-12-12")
    private String applyTime;

    /**
     *审核状态
     * */
    @ApiModelProperty(value = "审核状态",required = true,example = "2")
    private Integer auditStatus;
}
