package com.dx.facade.member.param;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.constant.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

/**
 * @author Nichols
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberSaveReqDTO {

    @ApiModelProperty(value = "商户ID")
    @NotNull(message = "商户ID不能为空")
    private Long merchantId;

    @ApiModelProperty(value = "商户名称")
//    @NotNull(message = "商户名称不能为空")
    private String merchantName;

    @ApiModelProperty(value = "账号类型（1-正式，2-商务，3-置换 4-试玩）",required = true, example = "4")
    @NotNull(message = "账号类型 不能为空")
    @Min(value = 1,message = "账号类型只能输入1-4的数字")
    @Max(value = 4,message = "账号类型只能输入1-4的数字")
    private Integer accountType;

    @ApiModelProperty(value = "用户名",required = true,example = "qingfeng002")
    @NotBlank(message = "用户名不能为空")
    @Pattern(regexp = Constants.REG_4_11, message = "账号 4-11位，最少1个字母+数字组合，首位字母")
    @JsonProperty("username")
    private String userName;

    @ApiModelProperty(value = "密码",required = true,example = "0659C7992E268962384EB17FAFE88364")
    @NotBlank
    private String password;

    @ApiModelProperty(value = "真实姓名",example = "风清扬")
    @Length(min = 1, max = 64, message = "真实姓名长度(1-64)")
    private String realName;

    @ApiModelProperty(value = "区号",example = "+86")
    private String areaCode;

    @ApiModelProperty(value = "手机号码",example = "13543212345")
    private String mobile;

    @ApiModelProperty(value = "上级代理名称",example = "qwer00005")
    @NotBlank(message = "上级代理名称不能为空")
    private String parentProxyName;
	
    @ApiModelProperty(value="vip等级id",example = "1")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long vipId;
	
    @ApiModelProperty(value="vip等级序号",example = "1")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer vipLevel;

    @ApiModelProperty(value="邮箱",example = "qingfeng002@gmaili.com")
    private String email;

    @ApiModelProperty(value="性别 0-女，1-男",example = "1")
    private Integer gender;

    @ApiModelProperty(value="申请信息",example = "测试会员添加001")
    private String applyInfo;

    @ApiModelProperty(value = "用户", hidden = true)
    private String currentUser;

    @ApiModelProperty(value = "注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP 6-后台）", hidden = true)
    private Integer registerDeviceType;

    @ApiModelProperty(value = "注册IP", hidden = true)
    private String ip;

}
