package com.dx.facade.texas.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.dx.annotation.I18nField;
import com.dx.facade.constant.ExcelHeadI18nKey;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

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
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private String handCode;

    @ExcelProperty(value = "牌桌ID", index = 1)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private String tableCode;

    @ApiModelProperty(value = "牌桌类型 2001:德州局 2002:短牌局")
    @ExcelProperty(value = "游戏名称", index = 2)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private Long tableType;

    @ExcelProperty(value = "俱乐部ID", index = 3)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private Long clubId;

    @ExcelProperty(value = "手牌号", index = 4)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private Long handId;

    @ExcelProperty(value = "轮次", index = 5)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private Integer roundCode;

    @ExcelProperty(value = "会员账号", index = 6)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private String userName;

    @ExcelProperty(value = "保险注单号", index = 7)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private Long insuredOrderId;

    @ApiModelProperty(value = "购买类型 0放弃购买 1主动购买 2强制购买")
    @ExcelProperty(value = "购买类型", index = 8)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private Integer buyType;

    @ExcelProperty(value = "俱乐部游戏注单号", index = 9)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private Long orderId;

    @ExcelProperty(value = "底池", index = 10)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private BigDecimal potAmount;

    @ApiModelProperty(value = "投注金额")
    @ExcelProperty(value = "本底池游戏投注额", index = 11)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private BigDecimal betAmount;

    @ExcelProperty(value = "保险投注额", index = 12)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private BigDecimal insuredAmount;

    @ApiModelProperty(value = "保险输赢")
    @ExcelProperty(value = "会员输赢", index = 13)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private BigDecimal insuredNetAmount;

    @ApiModelProperty(value = "爆牌")
    @ExcelProperty(value = "爆牌", index = 14)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private BigDecimal insuredNetAmount2;

    @ApiModelProperty(value = "手牌")
    @ExcelProperty(value = "手牌", index = 15)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private String handCards;

    @ApiModelProperty(value = "公牌")
    @ExcelProperty(value = "公牌", index = 16)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private String publicCards;

}
