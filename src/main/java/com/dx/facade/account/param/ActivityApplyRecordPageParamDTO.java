package com.dx.facade.account.param;

import com.dx.facade.account.exception.ErrorCode;
import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.enums.ActivityEnums;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.Assert;

import java.time.LocalDateTime;

/**
 * @author grayson
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityApplyRecordPageParamDTO implements BaseParmDTO {

    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "活动ID")
    private Long activityId;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "上级代理名称")
    private String parentProxyName;

    @ApiModelProperty(value = "申请时间-开始", required = true, example = "2021-06-16 00:00:00")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAtStart;

    @ApiModelProperty(value = "申请时间-截止", required = true, example = "2021-06-16 23:59:59")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAtEnd;

    @ApiModelProperty(value = "排序方式(1)：desc-降序 asc-升序",example = "asc")
    private String orderType;

    @ApiModelProperty(value = "活动类型")
    private ActivityEnums.ActivityType activityType;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(activityId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("activityId"));
    }
}
