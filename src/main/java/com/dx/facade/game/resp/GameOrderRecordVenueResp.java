package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 注单查询结果对象
 */
@Data
public class GameOrderRecordVenueResp implements Serializable {

   @ApiModelProperty("场馆类型")
    private Integer venueType;

    @ApiModelProperty("场馆名称")
    private String venueName;

    @ApiModelProperty("游戏名称")
    private String gameName;

    @ApiModelProperty("会员账号")
    private String userName;

    @ApiModelProperty("游戏账号")
    private String ganmeAccount;

    @ApiModelProperty("账号类型")
    private Integer accountType;

    @ApiModelProperty("所属商户")
    private Long merchantId;

    @ApiModelProperty("上级代理")
    private String proxyName;

    @ApiModelProperty("总代账号")
    private String topProxyName;

    @ApiModelProperty("投注金额")
    private BigDecimal betChip;

    @ApiModelProperty("有效金额")
    private BigDecimal netChip;

    @ApiModelProperty("注单状态")
    private Integer status;

    @ApiModelProperty("投注时间")
    private LocalDateTime handBeginDate;

    @ApiModelProperty("结算时间")
    private LocalDateTime handEndDate;

    @ApiModelProperty("投注详情")
    private String betDetail;

    @ApiModelProperty("投注ip")
    private String ipAddr;

    @ApiModelProperty("终端类型")
    private Integer deviceType;
}
