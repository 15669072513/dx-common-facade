package com.dx.facade.report.util;

import com.dx.enums.I18nEnum;
import com.dx.facade.constant.Constants;
import com.dx.facade.constant.ExcelHeadI18nKey;
import com.dx.facade.enums.ConstantEnums;
import com.dx.facade.enums.ReportI18CodeEnum;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReportI18nContentUtil {

    public static String  getSystemAudit(){
        return getByI18Key(ReportI18CodeEnum.系统审核);
    }
    public static String  getUpLevelReward(){
        return getByI18Key(ReportI18CodeEnum.升级礼金);
    }
    public static String  getBirthdayReward(){
        return getByI18Key(ReportI18CodeEnum.生日礼金);
    }
    public static String  getUpMonthReward(){
        return getByI18Key(ReportI18CodeEnum.上半月红包);
    }
    public static String  getDownMonthReward(){
        return getByI18Key(ReportI18CodeEnum.下半月红包);
    }
    public static String  getGameRebateReward(){
        return getByI18Key(ReportI18CodeEnum.游戏返水);
    }
    public static String getAuditOne(){
        return getByI18Key(ReportI18CodeEnum.一审);
    }
    public static String getAuditTwo(){
        return getByI18Key(ReportI18CodeEnum.二审);
    }

    public static String getDateTo(){
        return getByI18Key(ReportI18CodeEnum.至);
    }

    public static String getAuditDesc(String auditOne, String auditTwo){
        StringBuilder noteBuilder = new StringBuilder();
        if(StringUtils.isBlank(auditOne)) {
            auditOne = "";
        }
        noteBuilder.append(ReportI18nContentUtil.getAuditOne()).append(":").append(auditOne);
        if(StringUtils.isBlank(auditTwo)) {
            auditTwo = "";
        }
        noteBuilder.append((char)10).append(ReportI18nContentUtil.getAuditTwo()).append(":").append(auditTwo);
        return noteBuilder.toString();
    }

    public static String getAccountStatus( Integer accountLockStatus, Integer loginLockStatus,Integer gameLockStatus){
        List<String > resultList = new ArrayList<>();
        if(Objects.equals(accountLockStatus, Constants.ONE)){
            resultList.add(getByI18Key(ConstantEnums.EnumAccountStatusType.充提锁定));
        }
        if(Objects.equals(loginLockStatus, Constants.ONE)){
            resultList.add(getByI18Key(ConstantEnums.EnumAccountStatusType.登录锁定));
        }
        if(Objects.equals(gameLockStatus, Constants.ONE)){
            resultList.add(getByI18Key(ConstantEnums.EnumAccountStatusType.游戏锁定));
        }
        if(!CollectionUtils.isEmpty(resultList)){
            return resultList.stream().collect(Collectors.joining(","));
        }
        return getByI18Key(ConstantEnums.EnumAccountStatusType.正常);
    }

    public static String  getPlatInCommission(Integer commissionMonth){
        return getByI18Key(ReportI18CodeEnum.平台转入_平台转入) + "-"  + commissionMonth  + getByI18Key(ReportI18CodeEnum.平台转入_期佣金);
    }

    public static String  getUpLevelInCommission(Integer commissionMonth){
        return getByI18Key(ReportI18CodeEnum.上级转入_上级转入) + "-" + commissionMonth + getByI18Key(ReportI18CodeEnum.上级转入_期佣金);
    }

    public static String  getOutDownLevelCommission(String proxyName, Integer commissionMonth){
        return getByI18Key(ReportI18CodeEnum.转给下级_转给) + proxyName + "-" + commissionMonth + getByI18Key(ReportI18CodeEnum.转给下级_期佣金);
    }

    private static String  getByI18Key(Enum<?> i18nEnum){
        String i18nKey = i18nEnum.getClass().getSimpleName()+"."+i18nEnum.name();
        return "${"+i18nKey+"}";
    }
}
