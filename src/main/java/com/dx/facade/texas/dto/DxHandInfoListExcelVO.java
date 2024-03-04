package com.dx.facade.texas.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.dx.annotation.I18nField;
import com.dx.aop.I18nConverter;
import com.dx.facade.constant.ExcelHeadI18nKey;
import com.dx.facade.enums.GameConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author broadway
 * @since 2023-06-06
 */
@Data
public class DxHandInfoListExcelVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ExcelProperty(value = "手牌ID", index = 0)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌ID)
    private String handCode;

    @ApiModelProperty("0 进行中 1已结束")
    @ExcelProperty(value = "状态", index = 1, converter = I18nConverter.class)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_状态, i18nEnumClass = GameConstant.GameHandStatus.class, i18nEnumMethod = "desc")
    private String handStatusStr;

    @ExcelProperty(value = "牌桌ID", index = 2)
    @I18nField(headI18nKey = ExcelHeadI18nKey.TABLE_ID)
    private String tableCode;

    @ExcelProperty(value = "牌桌名称", index = 3)
    @I18nField(headI18nKey = ExcelHeadI18nKey.TABLE_NAME)
    private String tableName;

    @ExcelProperty(value = "游戏名称", index = 4)
    @I18nField(headI18nKey = ExcelHeadI18nKey.REPORT_游戏名称)
    private String gameName;

    @ExcelProperty(value = "盲注", index = 5)
    @I18nField(headI18nKey = ExcelHeadI18nKey.REPORT_盲注)
    private String blindInjection;

    @ExcelProperty(value = "俱乐部ID", index = 6)
    @I18nField(headI18nKey = ExcelHeadI18nKey.CLUB_ID)
    private Long clubId;

    @ExcelProperty(value = "手牌开始时间", index = 7)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌开始时间)
    @ColumnWidth(18)
    private String handBeginTime;

    @ExcelProperty(value = "手牌结束时间", index = 8)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌结束时间)
    @ColumnWidth(18)
    private String handEndTime;

    @ExcelProperty(value = "手牌号", index = 9)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private Integer handNum;

    @ExcelProperty(value = "期初金额汇总", index = 10)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_期初金额汇总)
    private BigDecimal beforeChip;

    @ExcelProperty(value = "中途带入金额汇总", index = 11)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_中途带入金额汇总)
    private BigDecimal bringMidwayChip;

    @ExcelProperty(value = "期末余额汇总", index = 12)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_期末余额汇总)
    private BigDecimal afterChip;

    @ExcelProperty(value = "有效底池", index = 13)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_有效底池)
    private BigDecimal validPot;

    @ExcelProperty(value = "手牌服务费", index = 14)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌服务费)
    private BigDecimal pumpingAmount;

    @ExcelProperty(value = "保险盈亏", index = 15)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_保险盈亏)
    private BigDecimal insuredNetAmount;

    @ExcelProperty(value = "手牌盈亏", index = 16)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌盈亏)
    private BigDecimal handNetAmount;

    @ExcelProperty(value = "公牌信息", index = 17)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_公牌信息)
    private String publicCards;

    @ExcelProperty(value = "会员账号", index = 17)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_会员账号)
    private String userNames;
}
