package com.dx.facade.report.resp.report;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * 会员列表》会员统计》全量统计
 */
@ApiModel(description = "会员统计全量统计对象")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DwdMemberStaticInfoResp extends DwdMemberStaticInfoSummaryResp{

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "商户ID")
    private Long merchantId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "会员ID")
    private Long playerId;

    @ApiModelProperty("会员账号")
    private String playerName;
    @ApiModelProperty("会员姓名")
    private String realName;

    @ApiModelProperty("账号类型（1-正式，2-商务，3-置换）")
    private Integer accountType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "上级代理ID")
    private Long parentProxyId;
    @ApiModelProperty("上级代理账号")
    private String parentProxyName;
    @ApiModelProperty("总代账号")
    private String topProxyName;
    @ApiModelProperty("主商户")
    private String topMerchantName;
    @ApiModelProperty("所属商户")
    private String merchantName;
    @ApiModelProperty("VIP等级")
    private Integer vipLevel;
    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;
    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
    private Integer accountLockStatus;
    @ApiModelProperty(value = "游戏锁定状态 0-未锁定 1-游戏锁定")
    private Integer gameLockStatus;
    @ApiModelProperty("注册时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime registerAt;
    @ApiModelProperty("币种")
    private String currency;

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
    @ApiModelProperty("昵称")
    private String nickName;

}
