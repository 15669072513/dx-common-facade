package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyResp {

    @ApiModelProperty(value = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "加盐")
    private String salt;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "真实姓名")
    private String realName;

    @ApiModelProperty(value = "手机号码")
    private String mobile;

    @ApiModelProperty(value = "注册手机号")
    private String registerPhone;

    @ApiModelProperty(value = "上级代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long parentProxyId;

    @ApiModelProperty(value = "上级代理账号")
    private String parentProxyName;

    @ApiModelProperty(value = "账号类型（1-正式，2-测试，3-合作）")
    private Integer accountType;

    @ApiModelProperty(value = "标签id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long labelId;

    @ApiModelProperty(value = "标签名称")
    private String labelName;

    @ApiModelProperty(value = "风控层级id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long windControlId;

    @ApiModelProperty(value = "风控层级名称")
    private String windControlName;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "性别 0-女，1-男")
    private Integer gender;

    @ApiModelProperty(value = "出生日期")
    private LocalDateTime birth;

    @ApiModelProperty(value = "qq")
    private String qq;

    @ApiModelProperty(value = "支付密码")
    private String payassword;

    @ApiModelProperty(value = "有效状态（0-有效 1-无效）")
    private Integer status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "最后登陆时间")
    private LocalDateTime lastLoginTime;

    private Integer accountStatus;

    @ApiModelProperty(value = "注册ip")
    private String registerIp;

    @ApiModelProperty(value = "ip归属地")
    private String ipAttribution;

    @ApiModelProperty(value = "注册reference(网址)")
    private String registerReference;

    @ApiModelProperty(value = "注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP 6-后台）")
    private Integer deviceType;

    @ApiModelProperty(value = "终端设备号")
    private String deviceNo;

    @ApiModelProperty(value = "合营代码")
    private String invitationCode;


    private Long validSubNum;

    private Long subNum;

    private BigDecimal totalRebate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "注册时间")
    private LocalDateTime createDt;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateDt;

    @ApiModelProperty(value = "开启免转模式 0-手动，1-免转")
    private Integer noTransfer;

}
