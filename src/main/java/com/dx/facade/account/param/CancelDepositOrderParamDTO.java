package com.dx.facade.account.param;

import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "取消订单参数", description = "取消订单参数")
public class CancelDepositOrderParamDTO {


    @ApiModelProperty("订单号")
    private String eventId;

    @ApiModelProperty("充值通道id")
    private Long channelId;


}
