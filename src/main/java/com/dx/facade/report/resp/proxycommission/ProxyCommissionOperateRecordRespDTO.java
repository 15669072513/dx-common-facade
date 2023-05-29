package com.dx.facade.report.resp.proxycommission;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author agan
 * 佣金管理操作记录
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyCommissionOperateRecordRespDTO {

    /**
     * 佣金月份
     */
    @ApiModelProperty(value = "佣金月份")
    @DateTimeFormat(pattern = "yyyy-MM")
    @JsonFormat(pattern = "yyyy-MM", timezone = "GMT+8")
    private Date commissionDate;

    /**
     * 币种
     */
    @ApiModelProperty(value = "币种")
    private String  currency;

    /**
     * 商户名称
     */
    @ApiModelProperty("商户名称")
    private String merchantName;

    /**
     * 付款-用户ID
     */
    @ApiModelProperty(value = "付款-用户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long outUserId;

    /**
     * 付款-用户账号
     */
    @ApiModelProperty(value = "付款-用户账号")
    private String outUserName;

    /**
     * 收款-用户ID
     */
    @ApiModelProperty(value = "收款-用户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long inUserId;

    /**
     * 收款-用户账号
     */
    @ApiModelProperty(value = "收款-用户账号")
    private String inUserName;

    /**
     * 收到佣金
     */
    @ApiModelProperty(value = "收到佣金")
    private BigDecimal receiveCommission;

    /**
     * 佣金管理操作记录类型(1=代发佣金,2=取消佣金)
     */
    @ApiModelProperty(value = "佣金管理操作记录类型(1=代发佣金,2=取消佣金)")
    private Integer operateType;

    /**
     * 操作人ID
     */
    @ApiModelProperty(value = "操作人ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long operateId;

    /**
     * 操作人账号
     */
    @ApiModelProperty(value = "操作人账号")
    private String operateName;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", hidden = true)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createdAt;

    /**
     * 操作备注
     */
    @ApiModelProperty(value = "操作备注")
    private String auditDesc;


}
