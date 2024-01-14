package com.dx.facade.member.param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 更新返点比例模板明细DTO
 * </p>
 *
 * @author bicycle
 * @since 2024-1-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "更新RebateRateTemplateDetailDTO对象", description = "更新返点比例模板明细DTO")
public class UpdateRebateRateTemplateDetailParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("ID")
    private Long id;
    
    @ApiModelProperty("模板Id")
    private Long templateId;
    
    @ApiModelProperty("比率等级")
    private Integer level;
    
    @ApiModelProperty("德州返点比例")
    private BigDecimal texasRebate;
    
    @ApiModelProperty("德州保险返点比例")
    private BigDecimal texasInsuranceRebate;
    
    @ApiModelProperty("真人返点比例")
    private BigDecimal actualPersonRebate;
    
    @ApiModelProperty("体育返点比例")
    private BigDecimal sportsRebate;
    
    @ApiModelProperty("彩票返点比例")
    private BigDecimal lotteryTicketRebate;
    
    @ApiModelProperty("棋牌返点比例")
    private BigDecimal chessRebate;
    
    @ApiModelProperty("电竞返点比例")
    private BigDecimal esportsRebate;

    @ApiModelProperty("最后操作人")
    @TableField("updated_by")
    private String updatedBy;

    @ApiModelProperty("最后操作时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;


}
