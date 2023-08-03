package com.dx.facade.member.param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 返点比例DTO父类
 * </p>
 *
 * @author bicycle
 * @since 2023-7-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "RebateRateDTO父类", description = "返点比例DTO父类")
public class BaseRebateRateParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("商户Id")
    @NotNull(message = "商户Id不能为空")
    private Long merchantId;
    
    @ApiModelProperty("用户类型 0：会员 1：代理")
    @NotNull(message = "用户类型不能为空")
    private Integer userType;
    
    @ApiModelProperty("用户Id")
    @NotNull(message = "用户id不能为空")
    private Long userId;

    @ApiModelProperty("用户名称")
    private String userName;
    
    @ApiModelProperty("上级代理Id")
    @NotNull(message = "上级代理id不能为空")
    private Long parentProxyId;

    @ApiModelProperty("上级代理名称")
    private String parentProxyName;
    
    @ApiModelProperty("德州返点比例")
    @NotNull(message = "德州返点比例不能为空")
    private BigDecimal texasRebate;
    
    @ApiModelProperty("真人返点比例")
    @NotNull(message = "真人返点比例不能为空")
    private BigDecimal actualPersonRebate;
    
    @ApiModelProperty("体育返点比例")
    @NotNull(message = "体育返点比例不能为空")
    private BigDecimal sportsRebate;
    
    @ApiModelProperty("彩票返点比例")
    @NotNull(message = "彩票返点比例不能为空")
    private BigDecimal lotteryTicketRebate;
    
    @ApiModelProperty("棋牌返点比例")
    @NotNull(message = "棋牌返点比例不能为空")
    private BigDecimal chessRebate;
    
    @ApiModelProperty("电竞返点比例")
    @NotNull(message = "电竞返点比例不能为空")
    private BigDecimal esportsRebate;
    
    @ApiModelProperty("状态:0-未设置 1-已生效 2-已失效 3-平台调整")
    private Integer status;

}
