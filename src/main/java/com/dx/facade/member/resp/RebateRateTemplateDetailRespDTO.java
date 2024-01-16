package com.dx.facade.member.resp;

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
 * 返点比例模板明细响应DTO
 * </p>
 *
 * @author bicycle
 * @since 2024-1-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "RebateRateTemplateDetailRespDTO对象", description = "返点比例模板明细响应DTO")
public class RebateRateTemplateDetailRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    

    @ApiModelProperty("ID")
    private Long id;
    
    @ApiModelProperty("模板Id")
    private Long templateId;
    
    @ApiModelProperty("比率等级")
    private Integer level;
    
    @ApiModelProperty("模板名称")
    private String templateName;
    
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
    
    @ApiModelProperty("创建人")
    @TableField("created_by")
    private String createdBy;

    @ApiModelProperty("创建时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty("最后操作人")
    @TableField("updated_by")
    private String updatedBy;

    @ApiModelProperty("最后操作时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;

}
