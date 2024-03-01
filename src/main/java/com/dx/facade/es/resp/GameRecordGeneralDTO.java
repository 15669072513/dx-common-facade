package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Data
@ToString
public class GameRecordGeneralDTO {

    //时间 ： createAtString，
    // 注单ID： id，
    // 游戏： venueTypeName，
    // 投注内容：  gameTypeName，
    // 注单状态：obBetStatus，
    // 投注：betAmount，
    // 有效投注额： validBetAmount，
    // 输赢：netAmount，
    // 抽水贡献：pumpContribution

    @ApiModelProperty("带场馆code拼接的注单id(如OBTY_8923472)")
    private String id;
    @ApiModelProperty("注单id")
    private String generatedId;
    @ApiModelProperty("场馆类型名称(如真人,体育,区块链)")
    private String venueTypeName;
    @ApiModelProperty("场馆类型code(如zr,ty,qkl)")
    private String venueTypeCode;
    @ApiModelProperty("场馆code(如agzr,imsb,cp,dj,cq9)")
    private String venueCode;
    @ApiModelProperty("场馆名称(如ob真人,ag捕鱼)")
    private String venueName;
    @ApiModelProperty("游戏ID")
    private String gameTypeId;
    @ApiModelProperty("游戏名称,真人类：玩法名称/棋牌、电游、捕鱼类：游戏名称/体育、电竞类：比赛类型/彩票类：彩种名称")
    private String gameTypeName;
    @ApiModelProperty("注单状态 0-未结算 1-已结算")
    private String obBetStatus;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;
    @ApiModelProperty("有效投注金额")
    private BigDecimal validBetAmount;
    @ApiModelProperty("会员输赢")
    private BigDecimal netAmount;
    @ApiModelProperty("派彩金额")
    private BigDecimal payAmount;
    @ApiModelProperty("返水金额")
    private BigDecimal rebateAmount;
    @ApiModelProperty("注单子类型:枚举GameRecordTypeEnum")
    private Integer betType;
    @ApiModelProperty("注单类型:枚举GameRecordTypeEnum")
    private Integer parentBetType;
    @ApiModelProperty("抽水贡献")
    private BigDecimal pumpContribution;

    @ApiModelProperty("投注时间(yyyy-MM-dd HH:mm:ss)")
    private String createAtString;
    @ApiModelProperty("结算时间(yyyy-MM-dd HH:mm:ss)")
    private String netAtString;
    @ApiModelProperty("投注时间")
    private Long createAt;
    @ApiModelProperty("结算时间")
    private Long netAt;

    @ApiModelProperty("投注内容(由现有字段生成的字段,为app和管理后台展示用)")
    private String betContent;
    @ApiModelProperty("赔率：真人、彩票")
    private String oddsValue;

    /**
     * ·公共字段定义
     * 1. 场馆名称venueTypeName
     * 2. 玩法名称gameTypeName
     * 3. 投注状态obBetStatus
     * 4. 结算状态与输赢状态 netAmount
     * 5. 投注金额（有效投注金额） betAmount validBetAmount
     * 6. 输赢金额 netAmount
     * 7. 注单号码
     * 8. 投注时间 createAtString
     * 9. 比赛类型（体育场馆与电竞场馆使用，分为“单式”和“串关”，若串关的话，再显示出来几串几）betContent
     */

    /**
     * 德州
     * a. 注单类型 game_type
     * b. 注单子类型
     * c. 牌桌号（可复制） table_id
     * b. 牌桌名称 table_name
     * e. 手牌号（可复制） hand_id hand_code
     * f. 抽水贡献(若数据为0，则直接显示该项，下面内容上移）
     */

    /**
     * 体育注单详情
     * a. 赛事（取自中控后台，赛事详情-名称）
     * b. 结算时间
     * c. 对阵双方（取自中控后台，赛事详情-球队）
     * d. 项目类型（足球、篮球、网球等，需根据赛事详情分类）
     * e. 投注盘口（取自中控后台，盘口详情）
     * f. 投注内容（取自中控后台，盘口详情-投注内容）
     */

    /**
     * 电竞注单详情：
     * a. 赛事（取自中控后台，赛事详情-名称）
     * b. 结算时间
     * c. 对阵双方（取自中控后台，赛事详情-球队）
     * d. 项目类型（取自中控后台，比赛类型）
     * e. 投注盘口（取自中控后台，盘口详情）
     * f. 投注内容（取自中控后台，盘口详情-投注内容）
     */
    // 电竞类，体育类
    @ApiModelProperty("注单详情")
    private List<GameRecordDjAndTyDetailDto> betDetails;
    @ApiModelProperty("串关值：例如3串1")
    private String seriesName;
    @ApiModelProperty("单关或串关值：例如3串1")
    private String seriesValue;
    @ApiModelProperty(value = "体育、电竞注单详情", hidden = true)
    private String details;
    @ApiModelProperty("俱乐部id")
    private String clubId;
    @ApiModelProperty("手牌编码")
    private String handCode;
    @ApiModelProperty("牌桌名称")
    private String tableName;

    /**
     * 真人注单详情：
     * a. 游戏牌桌
     * b. 投注玩法
     * c. 局结果
     * d. 玩法赔率
     */
    // 真人类
    @ApiModelProperty("游戏桌台号")
    private String tableCode;
    @ApiModelProperty("局结果")
    private String judgeResult;
    @ApiModelProperty("局号")
    private String roundNo;
    @ApiModelProperty("投注项名称,注意LIST中也有此字段")
    private String playOptionName;
    /**
     * 彩票注单详情：
     * a. 模式
     * b. 投注内容
     * c. 判奖结果
     * d. 赔率
     */
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

    /**
     * 棋牌注单详情：
     * a. 牌局ID
     * b. 房间（类型）
     */
    // 棋牌类、电游类、捕鱼类
    @ApiModelProperty("房间类型")
    private String platformName;
    @ApiModelProperty("牌局Id")
    private String roundId;
    @ApiModelProperty("房间类型(1:初级,2:中级)")
    private Integer roomType;
    @ApiModelProperty("游戏房间")
    private String gameRoom;

    @ApiModelProperty("重算次数")
    private Integer obSettleCount;
    @ApiModelProperty(value = "注单id(重算注单用)")
    private String betOrderId;

    //德州
    @ApiModelProperty(value = "牌桌id")
    private String tableId;
    @ApiModelProperty(value = "大盲")
    private String bbBlindScore;
    @ApiModelProperty(value = "小盲")
    private String sbBlindScore;

}
