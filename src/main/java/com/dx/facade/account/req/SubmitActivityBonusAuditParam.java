package com.dx.facade.account.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 提交红利发放 入参
 * </p>
 * @author admin
 * @since 2022-01-07
 */
@Data
@ApiModel(value="SubmitActivityBonusAuditParam对象", description="提交红利发放入参")
public class SubmitActivityBonusAuditParam implements Serializable {

    private static final long serialVersionUID = -6572617591713961504L;


    @ApiModelProperty("所属商户id")
    @NotNull(message = "所属商户id不能为空")
    private String merchantId;
    @ApiModelProperty("所属商户名称")
    @NotNull(message = "所属商户名称不能为空")
    private String merchantName;

    @ApiModelProperty(value = "活动ID")
    @NotNull(message = "活动ID不能为空")
    private Long activityId;

    @ApiModelProperty(value = "活动主标题")
    @NotBlank(message = "活动主标题不能为空")
    private String activityTitle;

    @ApiModelProperty(value = "活动名称")
    private String activityName;

    @ApiModelProperty(value = "操作类型 1 单会员发放 2 批量发放")
    @NotNull(message = "操作类型不能为空")
    private Integer operationType;

    @ApiModelProperty(value = "发放位置1 中心钱包 2 红利中心")
    @NotNull(message = "发放位置不能为空")
    private Integer location;

    @ApiModelProperty(value = "会员账号")
    private String userName;

    @ApiModelProperty(value = "红利金额")
    private BigDecimal bounsAmount;

    @ApiModelProperty(value = "流水倍数")
    @Min(value = 0, message = "流水倍数最小值是0")
    @Max(value = 255, message = "流水倍数最大值是255")
    private Integer billMultiple;

    @ApiModelProperty(value = "站内信通知 0 否 1 是")
    @NotNull(message = "站内信通知不能为空")
    private Integer notification;

    @ApiModelProperty(value = "备注")
    @NotBlank(message = "备注不能为空")
    @Size(max = 500, message = "备注长度必须在500字符以内")
    private String remark;

    @ApiModelProperty(value = "操作人")
    private String operator;

}
