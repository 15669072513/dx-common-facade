package com.dx.facade.account.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="ActivityConfigByTabParam对象", description="优惠配置根据页签查询-入参")
public class ActivityConfigByTabParam {

    @ApiModelProperty(value = "标签ID")
    private Long tabId;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "设备类型")
    private Integer deviceType;

    @ApiModelProperty(value = "设备类型")
    private Integer activityStatus;
}
