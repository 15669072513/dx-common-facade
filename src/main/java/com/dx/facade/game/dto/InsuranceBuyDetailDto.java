package com.dx.facade.game.dto;

import lombok.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 保险购买详情表
 * </p>
 *
 * @author streak
 * @since 2023-09-22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InsuranceBuyDetailDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键(雪花算法生成)
     */
    private Long id;

    /**
     * 保险id(关联保险记录表dx_insurance_info主键id)
     */
    private Long insuredId;

    /**
     * 玩家id
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
     * 消息事件id
     */
    private String eventId;

    /**
     * 事件时间
     */
    private String eventTime;

    /**
     * 手牌
     */
    private String handCards;

    /**
     * 分组编号
     */
    private Integer groupNo;

    /**
     * 投保赔付额
     */
    private BigDecimal insuredRewards;

    /**
     * 保险投注额
     */
    private BigDecimal insuredAmount;

    /**
     * 赔率
     */
    private BigDecimal odds;

    /**
     * 已购买outs
     */
    private String buyOuts;

    /**
     * 所有outs
     */
    private String allOuts;

    /**
     * 是否投保人 0否  1是
     */
    private Integer isInsured;

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

}
