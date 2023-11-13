package com.dx.facade.account.param;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class ProxyWithdrawalRecordParam extends PageRequest {

    @ApiModelProperty(value = "取款订单号")
    private String eventId;

    @ApiModelProperty(value = "取款记录的方式(1=银行卡取款 2=虚拟币取款)")
    private Integer withdrawType;

    @ApiModelProperty(value = "取款时间-开始",required = true,example = "2021-10-06 00:00:00")
    @NotNull(message = "取款时间-开始不能为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAtStart;

    @ApiModelProperty(value = "取款时间-截止",required = true,example = "2021-10-07 23:59:59")
    @NotNull(message = "取款时间-截止不能为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAtEnd;

    @ApiModelProperty(value = "订单状态，取款：0.处理中 1.成功 2.失败")
    private Integer clientStatus;

}
