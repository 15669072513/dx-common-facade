package com.dx.facade.game.resp;

import com.dx.facade.game.resp.gamedetail.GameOrderRecordDetail;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ApiModel("战绩详情信息")
public class RecordDetailList implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 牌桌id
     */
    @ApiModelProperty("牌桌id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long tableId;

    @ApiModelProperty("创建者")
    private String creator;

    /**
     * 玩家id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("玩家id")
    private Long userId;
    /**
     * 头像
     */
    @ApiModelProperty("头像")
    private String userHearUrl;

    /**
     * 玩家昵称
     */
    @ApiModelProperty("玩家昵称")
    private String nickName;
    /**
     * 牌桌时间
     */
    @ApiModelProperty("牌桌时间")
    private Long tableTime;
    /**
     * 时长
     */
    @ApiModelProperty("时长 单位毫秒")
    private Long ms;

    /**
     * 牌桌名称
     */
    @ApiModelProperty("牌桌名称")
    private String tableName;

    /**
     * 牌桌手数
     */
    @ApiModelProperty("牌桌手数")
    private int handCount;
    /**
     * 牌桌流水
     */
    @ApiModelProperty("牌桌流水")
    private BigDecimal betChipSum;
    /**
     * 牌桌带入
     */
    @ApiModelProperty("牌桌带入")
    private BigDecimal bringChipSum;
    /**
     * 最大底池
     */
    @ApiModelProperty("最大底池")
    private BigDecimal maxEffectivePool;
    @ApiModelProperty("盈亏筹码")
    private BigDecimal netAmount;
    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore;
    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore;

    public static RecordDetailList covert(GameOrderRecordDetail.GameOrderRecord resp) {
        if (resp == null) {
            return null;
        }
        RecordDetailList result = new RecordDetailList();
        result.setUserId(resp.getUserId());
        result.setBringChipSum(resp.getBringChipSum());
        result.setNetAmount(resp.getNetAmountSum());
        return result;
    }

    public static RecordDetailList covertSummary(GameOrderRecordDetail.GameOrderRecordSummary resp) {
        if (resp == null) {
            return null;
        }
        RecordDetailList result = new RecordDetailList();
        result.setTableId(resp.getTableId());
        result.setUserId(resp.getUserId());
        result.setTableTime(resp.getTableBeginDate());
        result.setMs(resp.getDuration());
        result.setTableName(resp.getTableName());
        if (resp.getHandCount() != null) {
            result.setHandCount(resp.getHandCount().intValue());
        }
        result.setBringChipSum(resp.getBringChipSum());
        result.setBetChipSum(resp.getBetAmountSum());
        result.setMaxEffectivePool(resp.getMaxPot());
        result.setSbBlindScore(resp.getSbBlindScore());
        result.setBbBlindScore(resp.getBbBlindScore());
        return result;
    }
}
