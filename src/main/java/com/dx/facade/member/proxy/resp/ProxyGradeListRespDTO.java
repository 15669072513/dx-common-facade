package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 代理等级列表信息 返回前端对象
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/01
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyGradeListRespDTO {

    @ApiModelProperty(value = "排序")
    private Integer displayOrder;
	
    @ApiModelProperty(value = "代理等级名称")
    private String proxyGradeName;

    @ApiModelProperty(value = "本月活跃人数")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long monthActiveNum;
    
    @ApiModelProperty(value = "本月新增活跃人数")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long monthNewNum;
	
	@ApiModelProperty(value = "额外赠佣比例%")
	private BigDecimal additionalCommission;
	
	@ApiModelProperty(value = "赠佣上限")
	private BigDecimal additionalCommissionLimit;
	
	@ApiModelProperty(value = "赠送彩金")
	private BigDecimal giveJackpot;
}
