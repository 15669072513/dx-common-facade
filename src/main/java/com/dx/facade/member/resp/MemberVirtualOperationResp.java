package com.dx.facade.member.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberVirtualOperationResp {

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @ApiModelProperty("商户id")
    @TableField("merchant_id")
    private Long merchantId;

    @ApiModelProperty("虚拟币账户地址")
    @TableField("virtual_address")
    private String virtualAddress;

    @ApiModelProperty("虚拟币种类")
    @TableField("virtual_kind")
    private String virtualKind;

    @ApiModelProperty("虚拟币协议")
    @TableField("virtual_protocol")
    private String virtualProtocol;

    @ApiModelProperty("绑定会员id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("绑定会员账号")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty("绑定会员上级代理id")
    @TableField("parent_proxy_id")
    private Long parentProxyId;

    @ApiModelProperty("绑定会员上级代理账号")
    @TableField("parent_proxy_name")
    private String parentProxyName;

    @ApiModelProperty("账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    @TableField("account_type")
    private Integer accountType;

    @ApiModelProperty("风控层级id")
    @TableField("wind_control_id")
    private Long windControlId;

    @ApiModelProperty("风控层级名称")
    @TableField("wind_control_name")
    private String windControlName;

    @ApiModelProperty("操作类型（0-解绑 1-绑定 2-下架 3-启用 4-禁用）")
    @TableField("operate_type")
    private Integer operateType;

    @ApiModelProperty("操作人")
    @TableField("operator")
    private String operator;

    @ApiModelProperty("创建时间")
    @TableField("create_dt")
    private LocalDateTime createDt;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;


}
