package com.dx.facade.member.param;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.util.Assert;

import com.dx.facade.constant.Constants;
import com.dx.facade.member.enums.ThirdPlatform;
import com.dx.facade.member.exception.ErrorCode;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author grayson
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterParamDTO implements BaseParmDTO{
    private static final long serialVersionUID = -5178166342303014994L;

    @ApiModelProperty(value = "商户ID", required = true)
    private Long merchantId;

    @ApiModelProperty(value = "会员账号", required = true)
    @NotBlank(message = "用户名不能为空")
    @Pattern(regexp = Constants.REG_4_11, message = Constants.USER_NAME_ERROR_MSG)
    private String userName;

    @ApiModelProperty(value = "登录密码 明文密码做一次MD5大写", required = true)
    @NotBlank(message = "密码不能为空")
    @Length(min = 32, max = 32, message = "密码长度错误")
    private String password;

    @ApiModelProperty(value = "客户端类型")
    private Integer clientType;

    @ApiModelProperty(value = "注册ip")
    @ToString.Exclude
    private String ip;

    @ApiModelProperty(value = "终端设备号")
    private String deviceNo;

    @ApiModelProperty(value = "注册reference(网址) (200)")
    private String registerReference;

    @ApiModelProperty(value = "合营代码")
    private String invitationCode;

    @ApiModelProperty(value="好友邀请码-活动邀请")
    private String friendInvitationCode;

    @ApiModelProperty(value = "app类型")
    private String appType;

    @ApiModelProperty(value = "app版本")
    private String appVersion;

    @ApiModelProperty(value = "设备版本")
    private String deviceVersion;

    @ApiModelProperty("三方平台")
    private ThirdPlatform thirdPlatform;

    @ApiModelProperty("三方平台唯一标识")
    private String thirdPlatformId;
    
    @ApiModelProperty("俱乐部Id")
    private Long clubId;
    
    @ApiModelProperty("俱乐部名称")
    private String clubName;
    
    @ApiModelProperty("昵称")
    private String nickName;
    
    @ApiModelProperty("是否支持多端登录")
    private Integer isMultiple;

    @ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
    private Integer businessModel;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userName"));
        Assert.notNull(password, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("password"));
        Assert.notNull(clientType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("clientType"));
        Assert.notNull(ip, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("ip"));
    }
}
