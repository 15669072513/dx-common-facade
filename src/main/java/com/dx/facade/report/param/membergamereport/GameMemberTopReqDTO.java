package com.dx.facade.report.param.membergamereport;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 场馆会员详情-top3 请求参数封装
 *
 * @author focus
 * @version 1.0.0
 * @date 2022/02/08
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "com-ob-facade-report-param-membergamereport-GameMemberTopParam", description = "场馆会员详情-top3 GameMemberTopParam")
public class GameMemberTopReqDTO {

    @ApiModelProperty(value = "会员(代理)ID(20)", required = true, example = "6020229")
    @NotNull(message = "会员(代理)id不能为空")
    private Long playId;
    
    @ApiModelProperty(value = "排序列(1)：1-输赢  2-投注", required = true,example = "1")
    @NotNull(message = "排序列不能为空")
    @Min(value = 1,message = "排序列 只能是1、2")
    @Max(value = 2,message = "排序列 只能是1、2")
    private Integer orderKey;

    @NotNull(message = "商户ID不能为空")
    private Long merchantId;
    
}
