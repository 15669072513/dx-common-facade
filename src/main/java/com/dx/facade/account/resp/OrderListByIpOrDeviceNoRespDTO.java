package com.dx.facade.account.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OrderListByIpOrDeviceNoRespDTO {

    @ApiModelProperty("会员&代理账号")
    private String userName;
    @ApiModelProperty("充值金额")
    private BigDecimal depositAmount;
    @ApiModelProperty("提款金额")
    private BigDecimal withdrawAmount;
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    @ApiModelProperty("注册时间")
    private LocalDateTime createDt;
    @ApiModelProperty("注册ip")
    private String registerIp;
    @ApiModelProperty("注册终端设备号")
    private String deviceNo;

}
