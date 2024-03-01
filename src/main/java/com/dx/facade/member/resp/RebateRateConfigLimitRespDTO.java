package com.dx.facade.member.resp;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 返点比例配置父响应DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-7-22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ZhanchengRateConfig响应DTO对象", description = "返点比例配置响应DTO")
public class RebateRateConfigLimitRespDTO extends BaseRebateRateConfigRespDTO {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("德州保险占成比例")
    private BigDecimal texasInsuranceZhancheng;
    
    @ApiModelProperty("真人占成比例")
    private BigDecimal actualPersonZhancheng;
    
    @ApiModelProperty("体育占成比例")
    private BigDecimal sportsZhancheng;
    
    @ApiModelProperty("彩票占成比例")
    private BigDecimal lotteryTicketZhancheng;
    
    @ApiModelProperty("棋牌占成比例")
    private BigDecimal chessZhancheng;
    
    @ApiModelProperty("电竞占成比例")
    private BigDecimal esportsZhancheng;
    
}
