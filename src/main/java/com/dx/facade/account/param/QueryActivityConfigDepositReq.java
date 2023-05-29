package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

/**
 * <p>
 * 查询充值优惠配置 入参
 * </p>
 * @author agan
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QueryActivityConfigDepositReq implements BaseParmDTO {

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "支付方式")
    private Integer payType;

    @ApiModelProperty(value = "通道名称")
    private String payChannelName;

    @ApiModelProperty(value = "开始时间")
    private String startTime;

    @ApiModelProperty(value = "终止时间")
    private String endTime;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
    }
}
