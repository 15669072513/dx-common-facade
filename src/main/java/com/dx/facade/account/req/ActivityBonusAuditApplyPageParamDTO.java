package com.dx.facade.account.req;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author grayson
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityBonusAuditApplyPageParamDTO implements BaseParmDTO {

    @ApiModelProperty(value = "id", example = "41546541654164")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户id", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<Long> merchantIds;

    @ApiModelProperty(value = "账号", example = "abc123456")
    private String userName;

    @ApiModelProperty(value="红利金额-最小值",example = "10")
    private BigDecimal bounsAmountMin;

    @ApiModelProperty(value="红利金额-最大值",example = "1000")
    private BigDecimal bounsAmountMax;

    @ApiModelProperty(value = "订单号", example = "4544654647")
    private String eventId;

    @ApiModelProperty(value = "申请时间-开始", required = true, example = "2021-06-16 00:00:00")
    private LocalDateTime eventTimeStart;

    @ApiModelProperty(value = "申请时间-截止", required = true, example = "2021-06-16 23:59:59")
    private LocalDateTime eventTimeEnd;

    @ApiModelProperty(value = "订单状态：1-待一审，2-一审审核，3-待二审，4-二审审核，5-一审拒绝，6-二审拒绝，7-审核通过", example = "1")
    private List<Integer> orderStatusList;

    @ApiModelProperty(value = "订单状态：1-待一审，2-一审审核，3-待二审，4-二审审核，5-一审拒绝，6-二审拒绝，7-审核通过", example = "1")
    private String orderStatus;

    @ApiModelProperty(value = "审核员")
    private String lockAccount;

    @ApiModelProperty(value="锁单状态(0=未锁单 1=锁单中)",example = "1")
    private Integer lockStatus;

    @ApiModelProperty(value = "排序方式(1)：desc-降序 asc-升序",example = "asc")
    private String orderType;

    @ApiModelProperty(value="锁单状态是否排最前",example = "true")
    private Boolean lockIsFirst = true;

    @Override
    public void check() {

    }
}
