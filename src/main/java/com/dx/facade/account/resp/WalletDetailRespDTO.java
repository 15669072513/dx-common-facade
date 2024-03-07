package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.dx.annotation.I18nField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
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
@ApiModel(value = "账变记录结果详情", description = "账变记录结果详情")
public class WalletDetailRespDTO {

    @ApiModelProperty("主键ID")
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @ApiModelProperty("商户ID")
    @TableField("merchant_id")
    private Long merchantId;

    @ApiModelProperty("商户名称")
    private String merchantName;

    @ApiModelProperty("会员ID")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("用户类型（0=会员/1=代理）")
    @TableField("user_type")
    private Integer userType;

    @ApiModelProperty("vip等级")
    @TableField("vip_level")
    private Integer vipLevel;

    @ApiModelProperty("风控层级ID")
    @TableField("wind_control_id")
    private Long windControlId;

    @ApiModelProperty("风控层级名称")
    @TableField("wind_control_name")
    private String windControlName;

    @ApiModelProperty("用户名")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty("真实姓名")
    @TableField("real_name")
    private String realName;

    @ApiModelProperty("上级代理ID")
    @TableField("parent_proxy_id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理名称")
    @TableField("parent_proxy_name")
    private String parentProxyName;

    @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
    @TableField("login_lock_status")
    private Integer loginLockStatus;

    @ApiModelProperty("账号锁定状态 0-未锁定 1-充提锁定")
    @TableField("account_lock_status")
    private Integer accountLockStatus;

    @ApiModelProperty("游戏锁定状态 0-未锁定 1-游戏锁定")
    @TableField("game_lock_status")
    private Integer gameLockStatus;

    @ApiModelProperty("账户类型。枚举WalletType")
    @TableField("wallet_type")
    private Integer walletType;

    @ApiModelProperty("收支类型，TransType")
    @TableField("trans_type")
    private Integer transType;

    @ApiModelProperty("业务类型。会员枚举MemberBizType ，代理枚举ProxyBizType")
    @TableField("biz_type")
    private Integer bizType;

    @ApiModelProperty("账变类型。会员枚举MemberChangeType，代理枚举ProxyChangeType")
    @TableField("change_type")
    private Integer changeType;

    @ApiModelProperty("客户端账变类型。会员枚举MemberAppType，代理枚举ProxyAppType")
    @TableField("app_type")
    private Integer appType;

    @ApiModelProperty("币种")
    @TableField("currency")
    private String currency;

    @ApiModelProperty("账变前余额")
    @TableField("change_before")
    private BigDecimal changeBefore;

    @ApiModelProperty("账变额")
    @TableField("amount")
    private BigDecimal amount;

    @ApiModelProperty("账变后余额")
    @TableField("change_after")
    private BigDecimal changeAfter;

    @ApiModelProperty("业务事件ID")
    @TableField("event_id")
    private String eventId;

    @ApiModelProperty("业务事件时间")
    @TableField("event_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime eventTime;

    @ApiModelProperty("备注")
    @TableField("remark")
    @I18nField
    private String remark;

    @ApiModelProperty("签名")
    @TableField("sign")
    private String sign;

    @ApiModelProperty("账变时间")
    @TableField("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty("账变ID")
    @TableField("change_type_id")
    private String changeTypeID;

    @ApiModelProperty("操作人ID")
    @TableField("operator_id")
    private Long operatorId;

    @ApiModelProperty("操作人姓名")
    @TableField("operator_user")
    private String operatorUser;

    @ApiModelProperty("俱乐部ID")
    @TableField("club_id")
    private long clubId;

    @ApiModelProperty("代理层级路径")
    @TableField("proxy_path")
    private String proxyPath;

    @ApiModelProperty("牌桌ID")
    @TableField("table_id")
    private Long tableId;

    @ApiModelProperty("牌桌名称")
    @TableField("table_name")
    private String tableName;

    @ApiModelProperty("牌桌名称")
    @TableField("table_code")
    private String tableCode;

    @ApiModelProperty("场馆code,dz:德州,zr:真人,ty:体育,cp:彩票,qp:棋牌,dj:电竞")
    @TableField("venue_code")
    private String venueCode;

    @ApiModelProperty("通用扩展字段A")
    @TableField("extension_a")
    private String extensionA;

    @ApiModelProperty("场馆注单号")
    @TableField("extension_b")
    private String extensionB;

    @ApiModelProperty("通用扩展字段C")
    @TableField("extension_c")
    private BigDecimal extensionC;

    @ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
    private Integer businessModel;

    @ApiModelProperty(value = "顶级代理信息")
    private String topProxyName;


}
