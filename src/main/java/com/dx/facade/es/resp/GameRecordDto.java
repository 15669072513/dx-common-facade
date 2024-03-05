package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class GameRecordDto {
    @ApiModelProperty("带场馆code拼接的注单id(如OBTY_8923472)")
    private String id;

    @ApiModelProperty("注单id")
    private String generatedId;

    @ApiModelProperty("场馆类型code(如zr,ty,qkl)")
    private String venueTypeCode;

    @ApiModelProperty("场馆code(如agzr,imsb,cp,dj,cq9)")
    private String venueCode;

    @ApiModelProperty("游戏ID")
    private String gameTypeId;

    @ApiModelProperty("游戏名称")
    private String gameTypeName;

    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理名称")
    private String parentProxyName;

    @ApiModelProperty("总代id")
    private Long topProxyId;

    @ApiModelProperty("总代名称")
    private String topProxyName;

    @ApiModelProperty("会员账号")
    private String memberName;

    @ApiModelProperty("游戏账号")
    private String playerName;

    @ApiModelProperty("账号类型(1-试玩，2-商务，3-正式，4-测试，5-置换)")
    private Integer accountType;

    @ApiModelProperty("ob设备类型(1-PC;2-IOS_APP;3-IOS_H5;4-Android_H5;5-Android_APP)")
    private Integer obDeviceType;

    @ApiModelProperty("vip等级")
    private Integer vipLevel;

    @ApiModelProperty("返水比例")
    private BigDecimal vipRebateRate;

    @ApiModelProperty("返水金额")
    private BigDecimal rebateAmount;

    @ApiModelProperty("投注ip")
    private String loginIp;

    @ApiModelProperty("包网商户的id")
    private Long merchantId;

    @ApiModelProperty("包网商户的名字")
    private String merchantName;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注金额")
    private BigDecimal validBetAmount;

    @ApiModelProperty("会员输赢")
    private BigDecimal netAmount;

    @ApiModelProperty("派彩金额")
    private BigDecimal payAmount;

    @ApiModelProperty("ob注单状态")
    private Integer obBetStatus;

    @ApiModelProperty("投注时间")
    private Long createAt;

    @ApiModelProperty("结算时间")
    private Long netAt;

    @ApiModelProperty("赛事名称")
    private String matchInfo;

    @ApiModelProperty("赛事ID")
    private String matchId;

    @ApiModelProperty("投注内容(由现有字段生成的字段,为app和管理后台展示用)")
    private String betContent;

    @ApiModelProperty("币种")
    private String memberCurrency;

    //------------上述为索引中的字段,下面为额外添加的字段------------

    @ApiModelProperty("投注时间(yyyy-MM-dd HH:mm:ss)")
    private String createAtString;

    @ApiModelProperty("结算时间(yyyy-MM-dd HH:mm:ss)")
    private String netAtString;

    @ApiModelProperty("场馆类型名称(如真人,体育,区块链)")
    private String venueTypeName;

    @ApiModelProperty("场馆名称(如ob真人,ag捕鱼)")
    private String venueName;

    /**
     * 注单类型 1 俱乐部游戏 2保险
     */
    @ApiModelProperty("注单类型:1俱乐部游戏;2保险")
    private Integer betType;
    @ApiModelProperty("注单类型:枚举GameRecordTypeEnum")
    private Integer parentBetType;

    /**
     * 抽水贡献
     */
    @ApiModelProperty("抽水贡献")
    private BigDecimal pumpContribution;

    @ApiModelProperty(value = "重算次数")
    private Integer obSettleCount;

    @ApiModelProperty(value = "注单id")
    private String betOrderId;

    @ApiModelProperty("业务模式:1-现金模式，2-信用模式")
    private Integer businessModel;

    @ApiModelProperty(hidden = true)
    private Long memberId;

    //德州
    @ApiModelProperty("局号")
    private String roundNo;
    @ApiModelProperty(value = "牌桌id")
    private String tableId;
    @ApiModelProperty(value = "大盲")
    private String bbBlindScore;
    @ApiModelProperty(value = "小盲")
    private String sbBlindScore;

    @ApiModelProperty(value = "IP归属地")
    private String ipAttribution;

    @ApiModelProperty("抽水金额")
    private BigDecimal pumpingAmount;

}
