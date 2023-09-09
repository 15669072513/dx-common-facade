package com.dx.facade.enums;

import java.util.Arrays;

/**
 * 场馆类型枚举
 */
public enum BwVenueTypeEnum {
    TY("ty", "体育","体育","Sports","กีฬา","THỂ THAO"),
    ZR("zr", "真人","真人","Live","คนจริง","SÒNG BÀI"),
    DJ("dj", "电竞","电竞","E-Sports","เกม","E-Sports"),
    QP("qp", "棋牌","棋牌","Chess","หมากรุก","GAME BÀI"),
    CP("cp", "彩票","彩票","Lottery","หวย","XỔ SỐ"),
    DY("dy", "电子","电子","Slots","สล็อต","Xuất"),
    BY("by", "捕鱼","捕鱼","Fishing","ตกปลา","BẮN CÁ"),
    DZ_CARD("DZ_CARD", "德州","德州","DZ_CARD","DZ_CARD","DZ_CARD"),
    //DX("dx", "德州","德州","dx","dx","dx"),
    QKL("qkl", "区块链","区块链","Blockchain","บล็อกเชน","Chuỗi khối"); //这个顺序不可以调整,影响到管理后台下拉中的顺序,测试会提bug


    private String code;
    private String description;

    private String zhName;

    private String enName;

    private String thName;

    private String vnName;

    BwVenueTypeEnum(String code, String description, String zhName, String enName, String thName, String vnName) {
        this.code = code;
        this.description = description;
        this.zhName = zhName;
        this.enName = enName;
        this.thName = thName;
        this.vnName = vnName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getZhName() {
        return zhName;
    }

    public void setZhName(String zhName) {
        this.zhName = zhName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEhName(String enName) {
        this.enName = enName;
    }

    public String getThName() {
        return thName;
    }

    public void setThName(String thName) {
        this.thName = thName;
    }

    public String getVnName() {
        return vnName;
    }

    public void setVnName(String vnName) {
        this.vnName = vnName;
    }

    public static BwVenueTypeEnum getByCode(String code) {
        return Arrays.stream(values()).filter(item -> item.code.equals(code)).findAny().orElse(null);
    }

    /**
     * 根据code获取description,如果code不存在则直接返回code
     */
    public static String getDescByCode(String code) {
        BwVenueTypeEnum bwVenueTypeEnum = getByCode(code);
        return bwVenueTypeEnum == null ? code : bwVenueTypeEnum.getDescription();
    }
}
