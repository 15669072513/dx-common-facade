package com.dx.facade.account.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author dereck
 */
@Data
public class ActivityConfigScRuleDTO {
    
    @ApiModelProperty(value = "主键")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    
    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
    
    @ApiModelProperty(value = "活动ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long activityId;
    
    @ApiModelProperty(value = "赠送形式 1-比例金额 2-固定金额")
    private Integer giveType;
    
    @ApiModelProperty(value = "活动金额")
    private BigDecimal activityAmount;
    
    @ApiModelProperty(value = "赠送比例")
    private BigDecimal validPresent;
    
    @ApiModelProperty(value = "赠送金额")
    private BigDecimal validAmount;
    
    @ApiModelProperty(value = "赠送上限")
    private BigDecimal validTopLimit;
    
    @ApiModelProperty(value = "流水要求（倍）")
    private Integer validMultiple;
    
    @ApiModelProperty(value = "排序")
    private Integer sort;
    
    @ApiModelProperty(value = "操作人")
    private String operator;
    
    @ApiModelProperty(value = "创建时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;
    
    @ApiModelProperty(value = "更新时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;
    

}
