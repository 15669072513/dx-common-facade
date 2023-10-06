package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyStatusResp {

    @ApiModelProperty(value = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty("商户名称")
    private String merchantName;

    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理名称")
    private String parentProxyName;

    @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus = 0;

    @ApiModelProperty("充提锁定状态 0-未锁定 1-充提锁定")
    private Integer paymentLockStatus = 0;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("注册时间")
    private LocalDateTime createdAt;

}
