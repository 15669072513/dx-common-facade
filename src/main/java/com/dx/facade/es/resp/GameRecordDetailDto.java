 package com.dx.facade.es.resp;

 import java.math.BigDecimal;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

 /**
  * 注单详情
  * 
  * @author karthus
  * @date 2022/12/14
  */
 @Data
 public class GameRecordDetailDto {

     @ApiModelProperty("会员id")
     private Long memberId;
     @ApiModelProperty("会员id")
     private Long userId;

     @ApiModelProperty("账号类型, 使用AccountTypeEnum枚举")
     private Integer accountType;

     @ApiModelProperty("会员账号")
     private String userName;

     @ApiModelProperty("上级代理名称")
     private String parentProxyName;

     @ApiModelProperty("总代名称")
     private String topProxyName;

     @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
     private Integer loginLockStatus;

     @ApiModelProperty("充提锁定状态 0-未锁定 1-充提锁定")
     private Integer paymentLockStatus;

     @ApiModelProperty("游戏锁定状态 0-未锁定 1-游戏锁定")
     private Integer gameLockStatus;

     @ApiModelProperty("vip等级")
     private Integer vipLevel;

     @ApiModelProperty("游戏账号")
     private String playerName;

     @ApiModelProperty("该类游戏总输赢")
     private BigDecimal netAmountSum;

     @ApiModelProperty("注单状态 0-未结算 1-已结算")
     private String obBetStatus;

     @ApiModelProperty("投注额")
     private BigDecimal betAmount = BigDecimal.ZERO;

     @ApiModelProperty(value = "有效投注额")
     private BigDecimal validBetAmount = BigDecimal.ZERO;

     @ApiModelProperty("输赢金额")
     private BigDecimal netAmount = BigDecimal.ZERO;

     @ApiModelProperty("派彩金额")
     private BigDecimal payAmount = BigDecimal.ZERO;

     @ApiModelProperty("带场馆code拼接的注单id(如OBTY_8923472)")
     private String id;

     @ApiModelProperty("注单id")
     private String generatedId;

     @ApiModelProperty("游戏平台")
     private String venueName;
     
     @ApiModelProperty("场馆code")
     private String venueCode;

     @ApiModelProperty("场馆类型code")
     private String venueTypeCode;

     @ApiModelProperty("投注时间")
     private Long createAt;

     @ApiModelProperty("投注时间(yyyy-MM-dd HH:mm:ss")
     private String createAtString;

     @ApiModelProperty("结算时间")
     private Long netAt;
     @ApiModelProperty("结算时间")
     private Long handEndDate;

     @ApiModelProperty("结算时间(yyyy-MM-dd HH:mm:ss")
     private String netAtString;

     @ApiModelProperty("同步时间(yyyy-MM-dd HH:mm:ss)")
     private String obCreatedAt;

     @ApiModelProperty("真人类：玩法名称/棋牌、电游、捕鱼类：游戏名称/体育、电竞类：比赛类型/彩票类：彩种名称")
     private String gameTypeName;

     @ApiModelProperty("投注ip")
     private String loginIp;

     @ApiModelProperty("投注终端")
     private Integer obDeviceType;

     @ApiModelProperty("投注内容")
     private String betContent;

     @ApiModelProperty("赔率：真人、彩票")
     private String oddsValue;

     // 真人类
     @ApiModelProperty("游戏桌台号")
     private String tableCode;

     @ApiModelProperty("局结果")
     private String judgeResult;

     @ApiModelProperty("局号")
     private String roundNo;

     // 棋牌类、电游类、捕鱼类
     @ApiModelProperty("房间类型")
     private String platformName;

     @ApiModelProperty("牌局Id")
     private String roundId;

     // 彩票类
     @ApiModelProperty("模式：单位元")
     private BigDecimal betModel;

     @ApiModelProperty("期号")
     private String ticketPlanNo;
     
     @ApiModelProperty("玩法名称")
     private String playName;
     
     @ApiModelProperty("倍数")
     private Integer betMultiple;

     @ApiModelProperty("注数")
     private Integer betCount;

     @ApiModelProperty("判奖内容")
     private String judgeResultCn;

     @ApiModelProperty("彩票状态：0：未结算 1:已中奖 4：未中奖 15：撤销/区块链状态：-2：无效投资，-1：未开奖，0：输，1：退款，2：中奖")
     private Integer betStatus;

     // 区块链
     @ApiModelProperty("投注玩法")
     private String playOptionName;

     @ApiModelProperty("开奖区块")
     private String blockHash;

     @ApiModelProperty("开奖哈希")
     private String hashBankerResult;

     // 电竞类，体育类
     @ApiModelProperty("注单详情")
     private List<GameRecordDjAndTyDetailDto> betDetails;

     @ApiModelProperty("串关值：例如3串1")
     private String seriesName;

     @ApiModelProperty(value = "体育、电竞注单详情", hidden = true)
     private String details;

     @ApiModelProperty("俱乐部id")
     private String clubId;

     @ApiModelProperty("手牌编码")
     private String handCode;

     @ApiModelProperty("牌桌名称")
     private String tableName;

     //德州明细增加 抽水贡献 注单类型
     /**
      * 注单类型 1 俱乐部游戏 2保险
      */
     @ApiModelProperty("注单子类型:1俱乐部游戏;2保险")
     private Integer betType;
     @ApiModelProperty("注单类型:101俱乐部服务费;102保险;103增值")
     private Integer parentBetType;

     /**
      * 抽水贡献
      */
     @ApiModelProperty("抽水贡献")
     private BigDecimal pumpContribution;

     @ApiModelProperty(value = "重算次数")
     private Integer obSettleCount;
}
