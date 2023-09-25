package com.dx.facade.game.dto;
import lombok.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 保险记录表
 * </p>
 *
 * @author streak
 * @since 2023-09-22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InsuranceInfoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键(雪花算法生成)
     */
    private Long id;

    /**
     * 牌桌id
     */
    private Long tableId;

    /**
     * 牌桌编码
     */
    private String tableCode;


    /**
     * 牌桌名称
     */
    private String tableName;

    /**
     * 牌桌类型 2001:德州局 2002:短牌局
     */
    private Long tableType;

    /**
     * 俱乐部id
     */
    private Long clubId;

    /**
     * 俱乐部名称
     */
    private String clubName;

    /**
     * 手表号
     */
    private Long handId;

    /**
     * 手牌编码
     */
    private String handCode;

    /**
     * 局次
     */
    private Long roundNo;

    /**
     * 消息事件id
     */
    private String eventId;

    /**
     * 游戏类型注单id（关联注单表bw_game_record_dx主键id）
     */
    private Long orderId;

    /**
     * 保险类型注单id（关联注单表bw_game_record_dx主键id，保险注单类型id可以为空，没有购买就为空）
     */
    private Long insuredOrderId;

    /**
     * 购买类型 0放弃购买 1主动购买 2强制购买
     */
    private Integer buyType;

    /**
     * 手牌圈层
     */
    private Integer roundCode;

    /**
     * 玩家ID
     */
    private Long userId;

    /**
     * 玩家账号
     */
    private String userName;

    /**
     * 玩家昵称
     */
    private String nickName;

    /**
     * 最大投保额
     */
    private BigDecimal maxInsuredAmount;

    /**
     * 最小投保额
     */
    private BigDecimal minInsuredAmount;

    /**
     * 投注金额
     */
    private BigDecimal betAmount;

    /**
     * 投保赔付额
     */
    private BigDecimal insuredRewards;

    /**
     * 保险投注额
     */
    private BigDecimal insuredAmount;

    /**
     * 保险输赢
     */
    private BigDecimal insuredNetAmount;

    /**
     * 参与保险的底池
     */
    private BigDecimal potAmount;

    /**
     * 池子编号
     */
    private String potNo;

    /**
     * 公牌
     */
    private String publicCards;

    /**
     * 手牌
     */
    private String handCards;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 修改时间
     */
    private Long updateTime;

    /**
     * 修改人
     */
    private String updateBy;


    /**
     * 保险购买详情明细
     */
    private List<InsuranceBuyDetailDto> detailList;


}

