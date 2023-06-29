package com.dx.facade.merchant.excle;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.dx.annotation.I18nField;
import com.dx.aop.I18nConverter;
import com.dx.facade.constant.ExcelHeadI18nKey;
import com.dx.facade.enums.ProxyEnums;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyRebateRecordListEasyExcel {

    @ExcelProperty(value = "订单号", index = 0)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_订单号)
    private String orderNo;

    @ExcelProperty(value = "返点周期", index = 1)
    @I18nField(headI18nKey = ExcelHeadI18nKey.REPORT_返点周期)
    private String cycleDate;

    //客户端状态（0已发放/1-已取消/2-无佣金）
    @ExcelProperty(value="客户端状态", index = 2,converter = I18nConverter.class)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_客户端状态, i18nEnumClass = ProxyEnums.ProxyWaterRebateStatus.class)
    private Integer clientStatus;

    @ExcelProperty(value="代理账号", index = 3)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_代理账号)
    private String proxyAccount;

    @ExcelProperty(value="所属商户", index = 4)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_所属商户)
    private String merchantName;


//    //（1-试玩，2-商务，3-正式，4-测试，5-置换）
//    @ExcelProperty(value="代理类型", index = 4)
//    private String accountType;
//
    @ExcelProperty(value="代理层级", index = 5)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_代理层级)
    private String proxyLevelId;
//
    @ExcelProperty(value = "直属上级", index = 6)
    @I18nField(headI18nKey = ExcelHeadI18nKey.REPORT_直属上级)
    private String parentProxyAccount;

    /**（1正常，2登录锁定，3充提锁定）*/
    @ExcelProperty(value="账号状态", index = 7,converter = I18nConverter.class)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_账号状态)
    private String accountStatus;

    @ExcelProperty(value = "风控层级", index = 8)
    @I18nField(headI18nKey = ExcelHeadI18nKey.REPORT_风控层级)
    private String windControlName;

    @ExcelProperty(value="个人返点", index = 9)
    @I18nField(headI18nKey = ExcelHeadI18nKey.REPORT_个人返点)
    private String personRebateAmount;

    @ExcelProperty(value="下级返点", index = 10)
    @I18nField(headI18nKey = ExcelHeadI18nKey.REPORT_下级返点)
    private String childRebateAmount;

    @ExcelProperty(value="团队返点", index = 11)
    @I18nField(headI18nKey = ExcelHeadI18nKey.REPORT_团队返点)
    private String rebateAmount;

    @ExcelProperty(value = "团队流水", index = 12)
    @I18nField(headI18nKey = ExcelHeadI18nKey.REPORT_团队流水)
    private String totalRealBetAmount;

//    @ExcelProperty(value = "流水纠正", index = 13)
//    private String totalAdjustBetAmount;
//
//    @ExcelProperty(value = "实际流水", index = 14)
//    private String totalRealBetAmount;


    @ExcelIgnore
    private BigDecimal rebateRate;

    @ExcelProperty(value = "返点比例", index = 13)
    @I18nField(headI18nKey = ExcelHeadI18nKey.REPORT_返点比例)
    private String rebateRatePercentStr;

    public  String getRebateRatePercentStr() {
        if(Objects.isNull(rebateRate)){
            return "";
        }
        return rebateRate.multiply(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP) + "%";
    }


//    @ExcelProperty(value = "活跃人数", index = 16)
//    private Integer activeNum;
//
//    @ExcelProperty(value = "有效活跃人数", index = 17)
//    private Integer effecactiveActiveNumNew;
//
//    @ExcelProperty(value = "契约规则", index = 18)
//    private String contract;

    @ExcelProperty(value = "发放时间", index = 14)
    @I18nField(headI18nKey = ExcelHeadI18nKey.REPORT_发放时间)
    private String payoutTime;

    @ExcelProperty(value = "领取时间", index = 15)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_领取时间)
    private String reciveDate;

    @ExcelProperty(value = "备注", index = 16 ,converter = I18nConverter.class)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_备注)
    private String note;

}
