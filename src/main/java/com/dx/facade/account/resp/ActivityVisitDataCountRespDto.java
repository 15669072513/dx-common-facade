package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.dx.facade.account.param.DataCountDto;

/**
 * 访问统计数据-统计 请求参数
 *
 * @author fitz
 * @version 1.0.0
 * @date 2022/02/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActivityVisitDataCountRespDto {
	
    @ApiModelProperty(value = "按终端分布")
    private List<DataCountDto> deviceTypeGroup;
    
    @ApiModelProperty(value = "用户类型分布 countType = 0 访客, 1 用户")
    private List<DataCountDto> userTypeGroup;
    
    @ApiModelProperty(value = "活动访问去重人数，按会员VIP等级分布")
    private List<DataCountDto> vipGroup;
	
}
