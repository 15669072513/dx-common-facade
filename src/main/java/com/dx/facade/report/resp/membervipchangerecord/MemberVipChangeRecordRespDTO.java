package com.dx.facade.report.resp.membervipchangerecord;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description:
 * @Author: focus
 * @Date 2022/02/09
 */
@Data
public class MemberVipChangeRecordRespDTO {

    
    /**
     * 会员id
     */
    @ApiModelProperty(value = "会员id")
    private Long userId;
    
    /**
     * 会员账号
     */
    @ApiModelProperty(value = "会员账号")
    private String userName;
    
    /**
     * 账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）
     */
    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;
    
    /**
     * 账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）
     */
    @ApiModelProperty(value = "账号类型中文")
    private String accountTypeZn;
    
    /**
     * 标签名称
     */
    @ApiModelProperty(value = "标签名称")
    private String labelName;
    
    /**
     * 风控层级id
     */
    @ApiModelProperty(value = "风控层级id")
    private Long windControlId;
    
    /**
     * 风控层级名称
     */
    @ApiModelProperty(value = "风控层级名称")
    private String windControlName;

	@ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
	private Integer loginLockStatus;

	@ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
	private Integer accountLockStatus;

	@ApiModelProperty(value = "游戏锁定状态 0-未锁定 1-游戏锁定")
	private Integer gameLockStatus;
    
    /**
     * 账号状态（1正常，2登录锁定，3游戏锁定，4充提锁定）
     */
    @ApiModelProperty(value = "账号状态中文")
    private String accountStatusZn;
    
    /**
     * 变更类型（0-升级，1-降级）
     */
    @ApiModelProperty(value = "变更类型（0-升级，1-降级）")
    private Integer changeType;
    
    /**
     * 变更前等级
     */
    @ApiModelProperty(value = "变更前等级")
    private String beforeGrade;
    
    /**
     * 变更后等级
     */
    @ApiModelProperty(value = "变更后等级")
    private String afterGrade;
    
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private String createdAt;
    
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private String createdBy;
    
    private static final long serialVersionUID = 1L;
}
