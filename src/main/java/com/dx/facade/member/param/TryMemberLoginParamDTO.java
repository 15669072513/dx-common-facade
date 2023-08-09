package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "试玩账号登录对象loginParam", description = "试玩账号登录对象loginParam")
public class TryMemberLoginParamDTO implements BaseParmDTO, Serializable {

    private static final long serialVersionUID = -5276753294444979337L;

    @ApiModelProperty(value = "客户端类型")
    @NotNull(message = "客户端类型不能为空")
    private Integer clientType;

    @ApiModelProperty(value = "登录ip")
    private String ip;

    @ApiModelProperty(value = "终端设备号（6-100）")
    @Length(min=6,max = 100,message = "终端设备号长度范围6-100")
    private String deviceNo;

    @ApiModelProperty(value = "登录网址 (128)")
    @Length(max = 128,message = "登录网址最大长度128")
    private String loginUrl;

    @ApiModelProperty(value = "app类型")
    private String appType;

    @ApiModelProperty(value = "app版本")
    private String appVersion;

    @ApiModelProperty(value = "设备版本")
    private String deviceVersion;
    
    /** 是否允许多端登录 1：允许 0：不允许 */
    @ApiModelProperty(value = "是否允许多端登录 1：允许 0：不允许")
    private Integer isMultiple;

    @Override
    public void check() {
        Assert.notNull(clientType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("clientType"));
        Assert.notNull(ip, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("ip"));
    }
}
