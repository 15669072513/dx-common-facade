package com.dx.facade.game.resp;

import com.alibaba.excel.annotation.ExcelProperty;
import com.dx.annotation.I18nField;
import com.dx.facade.constant.ExcelHeadI18nKey;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 盈亏表结果对象
 */
@Data
public class ProfitAndLossStatementResp  implements Serializable {

    @ExcelProperty(value = "项目", index = 0)
    @I18nField(headI18nKey = ExcelHeadI18nKey.PROFIT_项目)
    @ApiModelProperty("项目")
    private String itemName;

    @ExcelProperty(value = "投注人数", index = 1)
    @I18nField(headI18nKey = ExcelHeadI18nKey.PROFIT_投注人数)
    @ApiModelProperty("投注人数")
    private Long betNumber;

    @ExcelProperty(value = "注单量", index = 2)
    @I18nField(headI18nKey = ExcelHeadI18nKey.PROFIT_注单量)
    @ApiModelProperty("注单量")
    private Long placeOrderQuantity;

    @ExcelProperty(value = "投注金额", index = 3)
    @I18nField(headI18nKey = ExcelHeadI18nKey.PROFIT_投注金额)
    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;

    @ExcelProperty(value = "有效投注", index = 4)
    @I18nField(headI18nKey = ExcelHeadI18nKey.PROFIT_有效投注)
    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;

    @ExcelProperty(value = "盈亏", index = 5)
    @I18nField(headI18nKey = ExcelHeadI18nKey.PROFIT_盈亏)
    @ApiModelProperty("盈亏")
    private BigDecimal netAmount;
}
