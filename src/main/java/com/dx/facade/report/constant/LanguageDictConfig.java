package com.dx.facade.report.constant;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.dx.facade.enums.BwLanguageEnum;

/**
 * 多语言字典配置类
 */
public class LanguageDictConfig {

    private static final String FIRST_DEPOSIT_CODE = "1";
    private static final String PURE_DISPLAY_CODE = "2";
    private static final String VIP_UPGRADE_BONUS_CODE = "3";
    private static final String VIP_BIRTHDAY_BONUS_CODE = "4";
    private static final String VIP_MONTHLY_BONUS_CODE = "5";
    private static final String VIP_PROMOTION_OFFER_CODE = "6";
    private static final String DEPOSIT_OFFER_CODE = "7";
    /**
     * 多语言字典K枚举
     */
    public enum DictKeyEnum {
        VENUE_TYPE_NAME("场馆类型名称"),
        VENUE_NAME_CODE("场馆名称-K为code"),
        VENUE_NAME_ID("场馆名称-K为id"),
        ACTIVITY_NAME("活动名称"),
        GAME_TYPE_ID("游戏名称(key=venuecode,gametypeid)"),
        VENUE_TYPE_ID("游戏名称(key=venueid,gametypeid)")
        ;

        public final String desc;

        DictKeyEnum(String desc) {
            this.desc = desc;
        }
    }

    public enum LanguageDictEnum {
        //会员优惠报表-优惠项目
        FIRST_DEPOSIT_ZH(BwLanguageEnum.ZH, DictKeyEnum.ACTIVITY_NAME,FIRST_DEPOSIT_CODE,"首存活动"),
        FIRST_DEPOSIT_EN(BwLanguageEnum.EN, DictKeyEnum.ACTIVITY_NAME,FIRST_DEPOSIT_CODE,"First deposit activity"),
        FIRST_DEPOSIT_VN(BwLanguageEnum.VN, DictKeyEnum.ACTIVITY_NAME,FIRST_DEPOSIT_CODE,"Hoạt động gửi tiền lần đầu"),
        FIRST_DEPOSIT_TH(BwLanguageEnum.TH, DictKeyEnum.ACTIVITY_NAME,FIRST_DEPOSIT_CODE,"กิจกรรมการฝากเงินครั้งแรก"),

        PURE_DISPLAY_PAGE_ZH(BwLanguageEnum.ZH, DictKeyEnum.ACTIVITY_NAME,PURE_DISPLAY_CODE,"纯展示页活动"),
        PURE_DISPLAY_PAGE_EN(BwLanguageEnum.EN, DictKeyEnum.ACTIVITY_NAME,PURE_DISPLAY_CODE,"Pure display page activity"),
        PURE_DISPLAY_PAGE_VN(BwLanguageEnum.VN, DictKeyEnum.ACTIVITY_NAME,PURE_DISPLAY_CODE,"Hoạt động của trang hiển thị thuần túy"),
        PURE_DISPLAY_PAGE_TH(BwLanguageEnum.TH, DictKeyEnum.ACTIVITY_NAME,PURE_DISPLAY_CODE,"กิจกรรมหน้าจอแสดงผลล้วน"),

        VIP_UPGRADE_BONUS_ZH(BwLanguageEnum.ZH, DictKeyEnum.ACTIVITY_NAME,VIP_UPGRADE_BONUS_CODE,"VIP升级礼金"),
        VIP_UPGRADE_BONUS_EN(BwLanguageEnum.EN, DictKeyEnum.ACTIVITY_NAME,VIP_UPGRADE_BONUS_CODE,"VIP upgrade bonus"),
        VIP_UPGRADE_BONUS_VN(BwLanguageEnum.VN, DictKeyEnum.ACTIVITY_NAME,VIP_UPGRADE_BONUS_CODE,"tiền thưởng nâng cấp VIP"),
        VIP_UPGRADE_BONUS_TH(BwLanguageEnum.TH, DictKeyEnum.ACTIVITY_NAME,VIP_UPGRADE_BONUS_CODE,"โบนัสอัพเกรดวีไอพี"),

        VIP_BIRTHDAY_BONUS_ZH(BwLanguageEnum.ZH, DictKeyEnum.ACTIVITY_NAME,VIP_BIRTHDAY_BONUS_CODE,"VIP生日礼金"),
        VIP_BIRTHDAY_BONUS_EN(BwLanguageEnum.EN, DictKeyEnum.ACTIVITY_NAME,VIP_BIRTHDAY_BONUS_CODE,"VIP birthday bonus"),
        VIP_BIRTHDAY_BONUS_VN(BwLanguageEnum.VN, DictKeyEnum.ACTIVITY_NAME,VIP_BIRTHDAY_BONUS_CODE,"tiền thưởng sinh nhật VIP"),
        VIP_BIRTHDAY_BONUS_TH(BwLanguageEnum.TH, DictKeyEnum.ACTIVITY_NAME,VIP_BIRTHDAY_BONUS_CODE,"โบนัสวันเกิดวีไอพี"),

        VIP_MONTHLY_BONUS_ZH(BwLanguageEnum.ZH, DictKeyEnum.ACTIVITY_NAME,VIP_MONTHLY_BONUS_CODE,"VIP每月红包"),
        VIP_MONTHLY_BONUS_EN(BwLanguageEnum.EN, DictKeyEnum.ACTIVITY_NAME,VIP_MONTHLY_BONUS_CODE,"VIP Monthly Bonus"),
        VIP_MONTHLY_BONUS_VN(BwLanguageEnum.VN, DictKeyEnum.ACTIVITY_NAME,VIP_MONTHLY_BONUS_CODE,"Tiền thưởng VIP hàng tháng"),
        VIP_MONTHLY_BONUS_TH(BwLanguageEnum.TH, DictKeyEnum.ACTIVITY_NAME,VIP_MONTHLY_BONUS_CODE,"โบนัสวีไอพีรายเดือน"),

        VIP_PROMOTION_OFFER_ZH(BwLanguageEnum.ZH, DictKeyEnum.ACTIVITY_NAME,VIP_PROMOTION_OFFER_CODE,"VIP晋级优惠"),
        VIP_PROMOTION_OFFER_EN(BwLanguageEnum.EN, DictKeyEnum.ACTIVITY_NAME,VIP_PROMOTION_OFFER_CODE,"VIP promotion offer"),
        VIP_PROMOTION_OFFER_VN(BwLanguageEnum.VN, DictKeyEnum.ACTIVITY_NAME,VIP_PROMOTION_OFFER_CODE,"Ưu đãi VIP"),
        VIP_PROMOTION_OFFER_TH(BwLanguageEnum.TH, DictKeyEnum.ACTIVITY_NAME,VIP_PROMOTION_OFFER_CODE,"ข้อเสนอโปรโมชั่นวีไอพี"),

        DEPOSIT_OFFER_ZH(BwLanguageEnum.ZH, DictKeyEnum.ACTIVITY_NAME,DEPOSIT_OFFER_CODE,"存款优惠"),
        DEPOSIT_OFFER_EN(BwLanguageEnum.EN, DictKeyEnum.ACTIVITY_NAME,DEPOSIT_OFFER_CODE,"Deposit Offer"),
        DEPOSIT_OFFER_VN(BwLanguageEnum.VN, DictKeyEnum.ACTIVITY_NAME,DEPOSIT_OFFER_CODE,"Ưu đãi gửi tiền"),
        DEPOSIT_OFFER_TH(BwLanguageEnum.TH, DictKeyEnum.ACTIVITY_NAME,DEPOSIT_OFFER_CODE,"ข้อเสนอเงินฝาก"),
        ;
        public final BwLanguageEnum  language;
        public final DictKeyEnum dictKeyEnum;
        public final String code;
        public final String name;
        LanguageDictEnum(BwLanguageEnum  language,DictKeyEnum dictKeyEnum, String code, String name) {
            this.language = language;
            this.dictKeyEnum = dictKeyEnum;
            this.code = code;
            this.name = name;
        }

        public static List<LanguageDictEnum> getAllDictEnum(BwLanguageEnum language){
            return Arrays.stream(LanguageDictEnum.values()).filter(o -> o.language == language).collect(Collectors.toList());
        }

        public static List<LanguageDictEnum> getSingDictEnum(BwLanguageEnum language, DictKeyEnum dictKeyEnum){
            return Arrays.stream(LanguageDictEnum.values())
                    .filter(o -> o.language == language && o.dictKeyEnum == dictKeyEnum)
                    .collect(Collectors.toList());
        }
    }

}
