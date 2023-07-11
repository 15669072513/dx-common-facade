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

    @ExcelProperty(value = "手牌号", index = 0)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌号)
    private String handCode;

    @ExcelProperty(value = "手牌ID", index = 1)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌ID)
    private Long handId;

    @ExcelProperty(value = "开始时间", index = 2)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌开始时间)
    @ColumnWidth(18)
    private String handBeginTime;

    @ExcelProperty(value = "结束时间", index = 3)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手牌结束时间)
    @ColumnWidth(18)
    private String handEndTime;

    @ExcelProperty(value = "荷官位", index = 4)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_荷官位)
    private Integer villageSeat;

    @ExcelProperty(value = "小盲位", index = 5)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_小盲位)
    private Integer sbSeat;

    @ExcelProperty(value = "大盲位", index = 6)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_大盲位)
    private Integer bbSeat;

    @ExcelProperty(value = "有效底池", index = 7)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_有效底池)
    private BigDecimal validPot;

    @ExcelProperty(value = "牌桌抽水", index = 8)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_打牌抽水)
    private BigDecimal pumpingAmount;

    @ExcelProperty(value = "桌牌", index = 9)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_公牌信息)
    private String publicCards;




}
