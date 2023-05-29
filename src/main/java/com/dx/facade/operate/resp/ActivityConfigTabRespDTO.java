package com.dx.facade.operate.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author: AC
 * @Description: TODO
 * @Date: 2022/09/29 14:10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityConfigTabRespDTO {

    @ApiModelProperty("主键ID")
    private Long id;

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("活动类型[1:优惠,2:VIP,3:赞助]")
    private Integer activityType;

    @ApiModelProperty("活动页签名称-中文")
    private String activityNameCn;

    @ApiModelProperty("活动页签名称-英文")
    private String activityNameEn;

    @ApiModelProperty("活动页签名称-越南")
    private String activityNameVn;

    @ApiModelProperty("活动页签名称-泰语")
    private String activityNameTh;

    @ApiModelProperty("活动类型排序 1-3")
    private Integer activitySort;

    @ApiModelProperty("状态(0--关闭 1--开启)")
    private Integer activityStatus;

    @ApiModelProperty("备注")
    private String remark;

}
