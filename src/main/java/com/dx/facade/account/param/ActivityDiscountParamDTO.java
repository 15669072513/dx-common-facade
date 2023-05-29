package com.dx.facade.account.param;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "活动记录查询参数", description = "活动记录查询参数")
public class ActivityDiscountParamDTO {

    @ApiModelProperty("所属商户，支持多个")
    private List<Long> merchantIds;

    @ApiModelProperty("订单生成时间开始")
    private LocalDateTime eventTimeStart;

    @ApiModelProperty("订单生成时间结束")
    private LocalDateTime eventTimeEnd;

    @ApiModelProperty("领取时间开始")
    private LocalDateTime receiveTimeStart;

    @ApiModelProperty("领取时间结束")
    private LocalDateTime receiveTimeEnd;

    @ApiModelProperty("订单号")
    private String eventId;

    @ApiModelProperty("领取方式")
    private Integer receiveType;

    @ApiModelProperty("领取状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("活动类型")
    private Integer activityType;

    @ApiModelProperty("活动id")
    private Long activityId;

    @ApiModelProperty("会员账号")
    private String userName;

    @ApiModelProperty(
            value = "排序列名，receiveTime",
            example = "receiveTime"
    )
    private String orderKey;
    @ApiModelProperty(
            value = "排序方式(1)：desc-降序 asc-升序",
            example = "asc"
    )
    private String sortType;


}
