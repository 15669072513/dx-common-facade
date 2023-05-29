package com.dx.facade.account.req;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.dx.annotation.I18nField;
import com.dx.facade.constant.ExcelHeadI18nKey;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 批量发放红利 返回参数封装
 *
 * @version 1.0.0
 * @date 2022/1/7
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityBonusReleaseEasyExcelTHB {

    @ExcelProperty(value = "会员账号", index = 0)
    @ColumnWidth(15)
    @ApiModelProperty(value = "会员账号")
    @NotBlank(message = "[会员账号]不能为空")
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_会员账号)
    private String username;

    @ExcelProperty(value = "红利金额（฿）", index = 1)
    @ColumnWidth(13)
    @ApiModelProperty(value = "红利金额（฿）")
    @NotBlank(message = "[红利金额]不能为空")
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_红利金额_THB)
    private BigDecimal bonusAmount;
    
}
