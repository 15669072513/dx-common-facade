package com.dx.facade.member.param;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 会员详情-会员信息编辑 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "com-bw-param-MemberInfoEditParam", description = "会员信息编辑 MemberInfoEditParam")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberInfoRpcEditParam implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value = "商户id")
    private Long merchantId;
    
    @ApiModelProperty(value = "会员ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value = "风控主体条件")
    private String objectInfo;

    @ApiModelProperty(value = "商户编码")
    private String merchantCode;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;
    
    @ApiModelProperty(value = "会员账号")
    private String userName;
    
    @ApiModelProperty(value = "申请人")
    private String applyName;
    
    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;
    
    @ApiModelProperty(value = "真实姓名")
    private String realName;
    
    @ApiModelProperty(value = "昵称")
    private String nickName;
    
    @ApiModelProperty(value = "手机号码")
    private String mobile;
    
    @ApiModelProperty(value = "标签id")
    private Long labelId;
    
    @ApiModelProperty(value = "标签名称")
    private String labelName;
    
    @ApiModelProperty(value = "风控层级id")
    private Long windControlId;
    
    @ApiModelProperty(value = "风控层级名称")
    private String windControlName;
    
    @ApiModelProperty(value = "邮箱")
    private String email;
    
    @ApiModelProperty(value = "信用等级")
    private Integer creditLevel;
    
    @ApiModelProperty(value = "性别（0-女，1-男）")
    private Integer gender;
    
    @ApiModelProperty(value = "生日 (20) 格式：yyyy-MM-dd")
    private String birth;
	
	@ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
	private Integer loginLockStatus;
	
	@ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
	private Integer paymentLockStatus;
	
	@ApiModelProperty(value = "游戏锁定状态 0-未锁定 1-游戏锁定")
	private Integer gameLockStatus;

    @ApiModelProperty(value = "账号状态修改前名称", hidden = true)
    private String beforeModifyName;
	
	@ApiModelProperty(value="应用终端,1:OB旗舰 2:美播真人")
	private Integer appId;
	@ApiModelProperty(value="登录站点,1:OB旗舰 2:美播真人")
	private Integer loginAppId;
    
    @ApiModelProperty(value = "账号状态 修改后内容")
    private MemberInfoRpcEditAccountStatus accountStatusAfter;
    @ApiModelProperty(value = "风控层级 修改后内容")
    private MemberInfoRpcEditWindControl windControlAfter;
    @ApiModelProperty(value = "会员标签 修改后内容")
    private MemberInfoRpcEditLabel labelAfter;
    @ApiModelProperty(value = "出生日期 修改后内容")
    private MemberInfoRpcEditBirth birthAfter;
    @ApiModelProperty(value = "手机 修改后内容")
    private MemberInfoRpcEditMobile mobileAfter;
    @ApiModelProperty(value = "姓名 修改后内容")
    private MemberInfoRpcEditRealName realNameAfter;
    @ApiModelProperty(value = "昵称 修改后内容")
    private MemberInfoRpcEditNickName nickNameAfter;
    @ApiModelProperty(value = "性别 修改后内容")
    private MemberInfoRpcEditGender genderAfter;
    @ApiModelProperty(value = "邮箱 修改后内容")
    private MemberInfoRpcEditEmail emailAfter;
	@ApiModelProperty(value = "信用等级 修改后内容")
	private MemberInfoRpcEditCreditLevel creditLevelAfter;
    @ApiModelProperty(value = "活动流水限制")
    private MemberInfoRpcEditActivityTaskLimit activityTaskLimitAfter;
	@ApiModelProperty(value = "重置密码以及备注")
	private MemberInfoRpcEditResetPwd resetPwdAfter;
    @ApiModelProperty(value = "重置支付密码以及备注")
    private MemberInfoRpcPayPasswordReqDTO payPasswordAfter;

    @ApiModelProperty(value="当前操作人")
    private String currentUserName;
    
}
