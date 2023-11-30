package com.dx.facade.texas.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.dx.annotation.I18nField;
import com.dx.facade.constant.ExcelHeadI18nKey;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author royal
 * @since 2023-09-27
 */
@Data
public class InsuranceInfoListExcelVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ExcelProperty(value = "手牌ID", index = 0)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_手牌ID)
    private String handCode;

    @ExcelProperty(value = "牌桌ID", index = 1)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_牌桌ID)
    private String tableCode;

    @ApiModelProperty(value = "牌桌类型 2001:德州局 2002:短牌局")
    @ExcelProperty(value = "游戏名称", index = 2)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_游戏名称)
    private String gameName;

    @ExcelProperty(value = "俱乐部ID", index = 3)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_俱乐部ID)
    private String clubId;

    @ExcelProperty(value = "手牌号", index = 4)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_手牌号)
    private Long roundNo;

    @Getter
    @ExcelProperty(value = "轮次", index = 5)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_轮次)
    private String roundCode;

    @ExcelProperty(value = "会员账号", index = 6)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_会员账号)
    private String userName;

    @ExcelProperty(value = "保险注单号", index = 7)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_保险注单号)
    private String insuredOrderId;

    @ApiModelProperty(value = "购买类型 0放弃购买 1主动购买 2强制购买")
    @ExcelProperty(value = "购买类型", index = 8)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_购买类型)
    private String buyType;

    @ExcelProperty(value = "购保时间", index = 9)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_购保时间)
    private String createTime;

    @ExcelProperty(value = "俱乐部游戏注单号", index = 10)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_俱乐部游戏注单号)
    private String orderId;

    @ExcelProperty(value = "底池", index = 11)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_底池)
    private BigDecimal potAmount;

    @ExcelProperty(value = "本底池游戏投注额", index = 12)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_本底池游戏投注额)
    private BigDecimal betAmount;

    @ExcelProperty(value = "保险投注额", index = 13)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_保险投注额)
    private BigDecimal insuredAmount;

    @ApiModelProperty(value = "会员输赢")
    @ExcelProperty(value = "会员输赢", index = 14)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_会员输赢)
    private BigDecimal insuredNetAmount;

    @ApiModelProperty(value = "投保赔付额(爆牌)")
    @ExcelProperty(value = "爆牌", index = 15)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_爆牌)
    private BigDecimal insuredRewards;

    @ExcelProperty(value = "玩家手牌", index = 16)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_玩家手牌)
    private String handCards;

    @ExcelProperty(value = "公牌信息", index = 17)
    @I18nField(headI18nKey = ExcelHeadI18nKey.INSURANCE_公牌信息)
    private String publicCards;



    public void setRoundCode(int roundCode) {
        String roundCodeStr = "";
        if(roundCode == 1) {
            roundCodeStr = "Preflop轮";
        } else if(roundCode == 2) {
            roundCodeStr = "Flop轮";
        } else if(roundCode == 3) {
            roundCodeStr = "Turn轮";
        } else if(roundCode == 4) {
            roundCodeStr = "River轮";
        } else if(roundCode == 5) {
            roundCodeStr = "Showdown轮";
        }
        this.roundCode = roundCodeStr;
    }
}
