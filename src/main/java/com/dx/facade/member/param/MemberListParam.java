package com.dx.facade.member.param;

import com.dx.facade.common.PageRequest;
import com.dx.facade.constant.DXManagerConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class MemberListParam extends PageRequest implements Serializable {

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value="时间类型，0-注册时间, 1-首存时间时间，2-最后登陆时间")
    private Integer timeType;

    @ApiModelProperty(value="开始时间")
    @NotBlank(message = "开始时间不能为空")
    @Pattern(regexp = DXManagerConstant.REG_YYYY_MM_DD_HH_MM_SS, message = "时间格式不正确 示例：2021-06-14 00:00:00")
    private String timeStart;

    @ApiModelProperty(value="结束时间")
    @NotBlank(message = "结束时间不能为空")
    @Pattern(regexp = DXManagerConstant.REG_YYYY_MM_DD_HH_MM_SS, message = "时间格式不正确 示例：2021-06-14 00:00:00")
    private String timeEnd;

    @ApiModelProperty(value="账号类型，0-会员账号, 1-会员姓名,2-上级代理, 3-总代账号")
    private Integer userNameType;

    @ApiModelProperty("账号")
    private String userName;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty(value = "账号状态 accountStatusType枚举")
    private Integer accountStatus;

    @ApiModelProperty("vip等级")
    private Integer vipLevel;

    @ApiModelProperty(value = "风控层级id")
    private Long windControlId;

    @ApiModelProperty(value = "注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP 6-后台）")
    private Integer registerDeviceType;

    @ApiModelProperty(value = "首存金额-最小值")
    private BigDecimal firstDepositMin;

    @ApiModelProperty(value = "首存金额-最大值")
    private BigDecimal firstDepositMax;

    @ApiModelProperty(value = "会员币种")
    private String currency;

    @ApiModelProperty(value="IP类型，0-注册IP, 1-最后登录IP")
    private Integer ipType;

    @ApiModelProperty(value = "注册IP")
    private String ip;
}
