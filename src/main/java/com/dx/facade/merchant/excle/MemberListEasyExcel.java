package com.dx.facade.merchant.excle;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.dx.annotation.I18nField;
import com.dx.aop.I18nConverter;
import com.dx.enums.ConstantEnums;
import com.dx.facade.constant.ExcelHeadI18nKey;
import com.dx.facade.enums.AccountTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author kygo
 */
@Data
public class MemberListEasyExcel implements Serializable {

    @ExcelProperty(value = "会员账号",index = 0)
    @ColumnWidth(22)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_会员账号)
    private String userName;

    @ExcelProperty(value = "会员姓名",index = 1)
    @ColumnWidth(22)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_会员姓名)
    private String realName;

    @ExcelProperty(value = "所属商户",index = 2)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_所属商户)
    private String merchantName;

    @ExcelProperty(value = "上级代理/代理层级",index = 3)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_上级代理_代理层级)
    private String parentProxyName;

    @ExcelProperty(value = "总代账号",index = 4)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_总代账号)
    private String topProxyName;

    @ExcelProperty(value = "账号类型",index = 5, converter = I18nConverter.class)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_账号类型, i18nEnumClass = AccountTypeEnum.class, i18nEnumMethod = "desc")
    private String accountType;

    @ExcelProperty(value = "手机号码",index = 6)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_手机号码)
    private String mobile;

    @ExcelProperty(value = "会员标签",index = 7)
    @ColumnWidth(20)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_会员标签)
    private String labelName;
	
	@ExcelProperty(value = "风控层级",index = 8)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_风控层级)
	private String windControlName;
	
	@ExcelProperty(value = "账号状态",index = 9, converter = I18nConverter.class)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_账号状态)
	private String accountStatus;
	
	@ExcelProperty(value = "VIP等级",index = 10)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_VIP等级)
	private String vipLevel;

    @ExcelProperty(value = "首存金额",index = 11)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_首存金额)
    private String firstDeposit;

    @ExcelProperty(value = "首存时间",index = 12)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_首存时间)
    private String firstDepositDatetime;

    @ExcelProperty(value = "中心钱包余额",index = 13)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_中心钱包余额)
    private String balance;

    @ExcelProperty(value = "注册终端",index = 14, converter = I18nConverter.class)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_注册终端, i18nEnumClass = ConstantEnums.EnumDeviceType.class)
    private String registerDeviceType;

    @ExcelProperty(value = "注册时间",index = 15)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_注册时间)
    private String createdAt;

    @ExcelProperty(value = "注册IP",index = 16)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_注册IP)
    private String registerIp;

    @ExcelProperty(value = "最后登录时间",index = 17)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_最后登录时间)
    private String lastLoginDatetime;

    @ExcelProperty(value = "最后登录IP",index = 18)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_最后登录IP)
    private String lastLoginIp;

    @ExcelProperty(value = "备注",index = 19)
    @ColumnWidth(20)
    @I18nField(headI18nKey = ExcelHeadI18nKey.FUNDS_备注)
    private String remark;
}
