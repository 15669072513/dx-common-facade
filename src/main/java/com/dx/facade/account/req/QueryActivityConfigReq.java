package com.dx.facade.account.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * <p>
 * 查询活动配置 入参
 * </p>
 * @author agan
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QueryActivityConfigReq {

    @ApiModelProperty(value = "活动ID")
    private Long id;

    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "集合商户")
    private List<Long> merchantIds;

    @ApiModelProperty(value = "活动名称")
    private String name;

    @ApiModelProperty(value = "活动主标题")
    private String title;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "活动页签ID")
    private Long tagId;

    @ApiModelProperty(value = "活动模板 1-首存活动 3-纯展示页活动")
    private Integer activityType;

    @ApiModelProperty(value = "展示设备 1-PC 2-IOS_APP 3-IOS_H5 4-Android_H5 5-Android_APP")
    private String deviceType;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换） 多种用,分隔")
    private String accountType;

    @ApiModelProperty(value = "活动状态 0-新创建 1-未展示 2-未开始 3-进行中 4-已过期 5-已结束 6-已停用")
    private Integer activityStatus;

    @ApiModelProperty(value = "活动状态 状态 0-停用, 1-启用")
    private Integer status;

    @ApiModelProperty(value = "活动类型(1=普通活动,2=VIP活动)")
    private Integer activityGradeType;

    @ApiModelProperty(value = "时间选项类型 1 展示时间 2 活动时间 3 最后操作时间")
    private Integer timeOptionType;

    @ApiModelProperty(value = "开始时间")
    private String startTime;

    @ApiModelProperty(value = "终止时间")
    private String endTime;

    @ApiModelProperty(value = "创建人")
    private String createdOperator;

    @ApiModelProperty(value = "排序列: 1-展示时间, 2-活动时间, 3-最后操作时间(更新时间), 4-创建时间", example = "1")
    private Integer orderKey;

    @ApiModelProperty(value = "排序方式：升序：asc/降序：desc", example = "desc")
    private String orderType = "DESC";

    @ApiModelProperty(value = "当前的语言,中文，越南文")
    private String lang;
}
