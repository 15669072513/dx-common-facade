package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 下级成员列表
 *
 * @author laway
 */
@Data
@Builder
public class ProxyMemberRespDTO {

    @ApiModelProperty(value = "用户ID")
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Long userId;

    @ApiModelProperty(value = "会员账号")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String userName;

    @ApiModelProperty(value = "真实姓名")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String realName;

    @ApiModelProperty(value = "注册时间")
    private String registerDate;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "存款金额")
    private BigDecimal depositAmount;

    @ApiModelProperty(value = "提款金额")
    private BigDecimal withdrawAmount;

    @ApiModelProperty(value = "总输赢")
    private BigDecimal winAmount;

    @ApiModelProperty(value = "最后登录时间")
    private String lastLoginDate;

}
