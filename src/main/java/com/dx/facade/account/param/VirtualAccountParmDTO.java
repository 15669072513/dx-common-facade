package com.dx.facade.account.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class VirtualAccountParmDTO implements Serializable {

    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID",hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    /**
     * 商户ID
     */
    @ApiModelProperty(value = "商户编号")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;
    /**
     * 会员ID
     */
    @ApiModelProperty(value = "会员ID", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @NotNull(message = "会员ID 不能为空")
    private Long userId;

    @ApiModelProperty(value = "会员名称", required = true)
    @NotNull(message = "会员名称不能为空")
    private String userName;
    
    @ApiModelProperty(value = "用户类型", required = true)
    private Integer userType;
    /**
     * 虚拟币账户地址
     */
    @ApiModelProperty(value = "虚拟币账户地址")
    private String virtualAddress;
    /**
     * 虚拟币种类
     */
    @ApiModelProperty(value = "虚拟币种类")
    private String virtualKind;
    /**
     * 虚拟币协议
     */
    @ApiModelProperty(value = "虚拟币协议")
    private String virtualProtocol;


    @ApiModelProperty(value = "真实名称")
    private String realName;

    @ApiModelProperty(value = "币种")
    private String currency;

    @ApiModelProperty(value = "别名")
    private String anotherName;

    @ApiModelProperty(value = "黑名单状态（0-禁用中 1-启用中）", hidden = true)
    private Integer blacklistStatus;

    @ApiModelProperty(value = "绑定状态（0-待绑定 1-绑定中）", hidden = true)
    private Integer bindStatus;

    @ApiModelProperty(value = "绑定账号次数", hidden = true)
    private Integer bindNum;

    @ApiModelProperty(value = "当前绑定会员账号", hidden = true)
    private String bindUserName;


    /**
     * 0-禁用，1-可用
     */
    @ApiModelProperty(value = "0-禁用，1-可用")
    private Integer status;

    @ApiModelProperty(value = "vip等级id")
    private Long vipId;
    @ApiModelProperty(value = "vip等级序号")
    private String vipLevel;

    /**
     * 签名
     */
    @ApiModelProperty(value = "签名")
    private String sign;

    @ApiModelProperty(value = "创建时间")
    private String createAt;

    @ApiModelProperty(value = "绑定时间,修改时间")
    private String updatedAt;

    @ApiModelProperty(value = "创建人")
    private String createdBy;

    @ApiModelProperty(value = "修改人")
    private String updatedBy;
    
    @ApiModelProperty(value = "最后提款时间")
    private LocalDateTime lastWithdrawalTime;
    
    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "ip")
    private String ip;

    private static final long serialVersionUID = 1L;

}
