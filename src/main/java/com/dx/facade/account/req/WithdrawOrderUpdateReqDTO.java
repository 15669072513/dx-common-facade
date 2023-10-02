package com.dx.facade.account.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 提现订单更新REQ DTO
 * orbit
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawOrderUpdateReqDTO implements Serializable {

    @ApiModelProperty("主键ID")
    private Long id;

    @ApiModelProperty("我方订单号")
    @TableField("event_id")
    private String eventId;

    @ApiModelProperty("实际到账金额")
    private BigDecimal realAmount;


    @ApiModelProperty("订单状态")
    @TableField("order_status")
    private Integer orderStatus;

    @ApiModelProperty("到账时间")
    @TableField("pay_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime payTime;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("一审审核人")
    @TableField("audit1_operator")
    private String audit1Operator;
    @ApiModelProperty("一审审核人ID")
    private Long audit1AccountId;

    @ApiModelProperty("一审审核结果(1=通过 2=拒绝)")
    @TableField("audit1_result")
    private Integer audit1Result;

    @ApiModelProperty("一审审核时间")
    @TableField("audit1_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime audit1Time;

    @ApiModelProperty("一审审核备注")
    @TableField("audit1_desc")
    private String audit1Desc;

    @ApiModelProperty("一审客户端备注")
    @TableField("client_audit1_desc")
    private String clientAudit1Desc;

    @ApiModelProperty("一审审核时长，秒，锁单到审核完毕的耗时")
    @TableField("audit1_cost")
    private Integer audit1Cost;

    @ApiModelProperty("二审审核人")
    @TableField("audit2_operator")
    private String audit2Operator;
    @ApiModelProperty("二审审核人ID")
    private Long audit2AccountId;

    @ApiModelProperty("二审审核结果(1=通过 2=拒绝)")
    @TableField("audit2_result")
    private Integer audit2Result;

    @ApiModelProperty("二审审核时间")
    @TableField("audit2_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime audit2Time;

    @ApiModelProperty("二审审核备注")
    @TableField("audit2_desc")
    private String audit2Desc;

    @ApiModelProperty("二审客户端备注")
    @TableField("audit2_client_desc")
    private String audit2ClientDesc;

    @ApiModelProperty("二审审核时长，秒，锁单到审核完毕的耗时")
    @TableField("audit2_cost")
    private Integer audit2Cost;

    @ApiModelProperty("三审审核人")
    @TableField("audit3_operator")
    private String audit3Operator;
    @ApiModelProperty("三审审核人ID")
    private Long audit3AccountId;

    @ApiModelProperty("三审审核结果(1=通过 2=拒绝)")
    @TableField("audit3_result")
    private Integer audit3Result;

    @ApiModelProperty("三审审核时间")
    @TableField("audit3_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime audit3Time;

    @ApiModelProperty("三审审核备注")
    @TableField("audit3_desc")
    private String audit3Desc;

    @ApiModelProperty("三审客户端备注")
    @TableField("audit3_client_desc")
    private String audit3ClientDesc;

    @ApiModelProperty("三审审核时长，秒，锁单到审核完毕的耗时")
    @TableField("audit3_cost")
    private Integer audit3Cost;

    @ApiModelProperty("确认/取消出款人")
    private String confirmOperator;

    @ApiModelProperty("确认/取消出款结果(1=确认出款 2=取消出款)")
    private Integer confirmResult;

    @ApiModelProperty("确认/取消出款时间")
    private LocalDateTime confirmTime;

    @ApiModelProperty("确认/取消出款备注")
    private String confirmDesc;

    @ApiModelProperty("确认/取消出款客户端备注")
    private String confirmClientDesc;

    @ApiModelProperty("确认/取消出款操作人id")
    private Long confirmAccountId;
}
