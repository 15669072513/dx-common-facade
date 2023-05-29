package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


/**
 * 代理佣金列表信息
 *
 * @author fitz
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyCommissionListRespDTO {
	
    @ApiModelProperty(value = "返佣等级")
    private String rebateLevel;

    @ApiModelProperty(value = "公司本月总输赢（最小）")
    private BigDecimal totalMinNetAmount;
    
    @ApiModelProperty(value = "公司本月总输赢（最大）")
    private BigDecimal totalMaxNetAmount;

    @ApiModelProperty(value = "本月活跃人数")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long monthActiveNum;

    @ApiModelProperty(value = "佣金比例")
    private BigDecimal commissionRate;

}
