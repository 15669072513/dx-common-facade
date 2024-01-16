package com.dx.facade.member.param;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.dx.facade.constant.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 新增会员请求DTO
 * 
 * @author Nichols
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberSaveReqDTO {

	/** 商户ID */
    @ApiModelProperty(value = "商户ID")
    @NotNull(message = "商户ID不能为空")
    private Long merchantId;

    /** 商户名称 */
    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    /** 账号类型（1-正式，2-商务，3-置换 4-试玩） */
    @ApiModelProperty(value = "账号类型（1-正式，2-商务，3-置换 4-试玩）",required = true, example = "4")
    @NotNull(message = "账号类型 不能为空")
    @Min(value = 1,message = "账号类型只能输入1-4的数字")
    @Max(value = 4,message = "账号类型只能输入1-4的数字")
    private Integer accountType;

    /** 用户名 */
    @ApiModelProperty(value = "用户名",required = true,example = "qingfeng002")
    @NotBlank(message = "用户名不能为空")
    @Pattern(regexp = Constants.REG_4_11, message = Constants.USER_NAME_ERROR_MSG)
    @JsonProperty("username")
    private String userName;

    /** 密码 */
    @ApiModelProperty(value = "密码",required = true,example = "0659C7992E268962384EB17FAFE88364")
    @NotBlank
    private String password;

    /** 真实姓名 */
    @ApiModelProperty(value = "真实姓名",example = "风清扬")
    @Length(min = 1, max = 64, message = "真实姓名长度(1-64)")
    private String realName;

    /** 区号 */
    @ApiModelProperty(value = "区号",example = "+86")
    private String areaCode;

    /** 手机号 */
    @ApiModelProperty(value = "手机号码",example = "13543212345")
    private String mobile;

    /** 上级代理名称 */
    @ApiModelProperty(value = "上级代理名称",example = "qwer00005")
    @NotBlank(message = "上级代理名称不能为空")
    private String parentProxyName;
	
    /** vip等级id */
    @ApiModelProperty(value="vip等级id",example = "1")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long vipId;
	
    /** vip等级序号 */
    @ApiModelProperty(value="vip等级序号",example = "1")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer vipLevel;

    /** 邮箱 */
    @ApiModelProperty(value="邮箱",example = "qingfeng002@gmaili.com")
    private String email;

    /** 性别 */
    @ApiModelProperty(value="性别 0-女，1-男",example = "1")
    private Integer gender;

    /** 申请信息 */
    @ApiModelProperty(value="申请信息",example = "测试会员添加001")
    private String applyInfo;

    /** 用户 */
    @ApiModelProperty(value = "用户", hidden = true)
    private String currentUser;

    /** 注册终端类型 */
    @ApiModelProperty(value = "注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP 6-后台）", hidden = true)
    private Integer registerDeviceType;
    
    /** 昵称 */
    @ApiModelProperty(value="昵称")
    private String nickName;
    
    /** 俱乐部Id */
    @ApiModelProperty("俱乐部Id")
    private Long clubId;

    /** 俱乐部名称 */
    @ApiModelProperty("俱乐部名称")
    private String clubName;

    @ApiModelProperty(value = "注册IP", hidden = true)
    private String registerIp;

    @ApiModelProperty(value = "注册设备号", hidden = true)
    private String registerDeviceNo;

    @ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
    @NotBlank(message = "业务模式不能为空")
    private Integer commissionModel;
}
