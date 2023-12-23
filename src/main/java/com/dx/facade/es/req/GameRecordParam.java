package com.dx.facade.es.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.List;

import com.dx.facade.common.PageRequest;

@Data
@EqualsAndHashCode(callSuper = true)
public class GameRecordParam extends PageRequest {
    @ApiModelProperty(value = "商户Id")
    private Long merchantId;

    @ApiModelProperty(value = "由merchantId算出的merchantIds集合,不需客户端传", hidden = true)
    private List<Long> merchantIds;

    @ApiModelProperty(value = "下注时间-开始 格式：yyyy-MM-dd HH:mm:ss")
    private String createAtStart;

    @ApiModelProperty(value = "下注时间-截止 格式：yyyy-MM-dd HH:mm:ss")
    private String createAtEnd;

    @ApiModelProperty(value = "结算时间-开始 格式：yyyy-MM-dd HH:mm:ss")
    private String netAtStart;

    @ApiModelProperty(value = "结算时间-截止 格式：yyyy-MM-dd HH:mm:ss")
    private String netAtEnd;

    @ApiModelProperty(value = "注单状态 0-未结算 1已结算 2-不结算")
    private Integer obBetStatus;

    @ApiModelProperty(value = "场馆类型code,见BwVenueTypeEnum")
    private String venueTypeCode;

    @ApiModelProperty(value = "场馆code,见BwVenueEnum")
    private List<String> venueCodeList;

    @ApiModelProperty(value = "游戏名称(现阶段只对电游场馆起作用)")
    private String gameTypeName;

    @ApiModelProperty(value = "带场馆code拼接的注单id(如OBTY_8923472)")
    private String id;

    @ApiModelProperty(value = "注单号")
    private String generatedId;

    @ApiModelProperty(value = "会员账号")
    private String memberName;

    @ApiModelProperty(value = "游戏账号")
    private String playerName;

    @ApiModelProperty(value = "上级代理")
    private String parentProxyName;

    @ApiModelProperty(value = "总代账号")
    private String topProxyName;

    @ApiModelProperty(value = "设备类型 PC，IOS_APP，IOS_H5，Android_H5，Android_APP，IOS， Android，H5")
    private List<Integer> obDeviceType;

    @ApiModelProperty(value = "投注ip")
    private String loginIp;

    @ApiModelProperty(value = "vip等级序号-最小值")
    private Integer vipLevelMin;

    @ApiModelProperty(value = "vip等级序号-最大值")
    private Integer vipLevelMax;

    @ApiModelProperty(value = "投注金额-最小值")
    private BigDecimal betAmountMin;

    @ApiModelProperty(value = "投注金额-最大值")
    private BigDecimal betAmountMax;

    @ApiModelProperty(value = "会员输赢-最小值")
    private BigDecimal netAmountMin;

    @ApiModelProperty(value = "会员输赢-最大值")
    private BigDecimal netAmountMax;

    @ApiModelProperty(value = "重算次数")
    private Integer obSettleCount;

}

