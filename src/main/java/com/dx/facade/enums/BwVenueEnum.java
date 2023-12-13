package com.dx.facade.enums;

import java.util.Arrays;

/**
 * 场馆枚举(这个不是最终版,接入的场馆会越来越多)
 * 本枚举跟B端SDK中的com.dx.constant.GameTypeConstant类,保持一致,但场馆数量比后者少
 */
public enum BwVenueEnum {
    //捕鱼类
    DZ("DZ", "DX德州", BwVenueTypeEnum.DZ_CARD),
    BY("by", "PM捕鱼", BwVenueTypeEnum.BY),
    AGBY("agby", "AG捕鱼", BwVenueTypeEnum.BY),

    //彩票类
    CP("cp", "PM彩票", BwVenueTypeEnum.CP),

    //电竞类
    DJ("dj", "PM电竞", BwVenueTypeEnum.DJ),
    IMONE_DJ("imone-dj", "IMONE电竞", BwVenueTypeEnum.DJ),

    //电子(老虎机)类
    DY("dy", "PM电子", BwVenueTypeEnum.DY),
    PG("pg", "PG电子", BwVenueTypeEnum.DY),
    CQ9("cq9", "CQ9电子", BwVenueTypeEnum.DY),
    FC("fc", "FC电子", BwVenueTypeEnum.DY),
    EVO("evo", "EVOPLAY电子", BwVenueTypeEnum.DY),
    JDB_LHJ("jdb-lhj", "JDB电子", BwVenueTypeEnum.DY),
    EVOLUTION("evolution", "EVOLUTION电子", BwVenueTypeEnum.DY),
    MG("mg", "MG电子", BwVenueTypeEnum.DY),

    //棋牌类
    BYQP("byqp", "博雅棋牌", BwVenueTypeEnum.QP),

    //体育类
    TY("ty", "PM体育", BwVenueTypeEnum.TY),
    IMONE_SB("imone-sb", "IMONE体育", BwVenueTypeEnum.TY),
    SBTY("sbty", "沙巴体育", BwVenueTypeEnum.TY),

    //真人类
    ZR("zr", "PM真人", BwVenueTypeEnum.ZR),
    EBET("ebet", "EBET真人", BwVenueTypeEnum.ZR),
    AGZR("agzr", "AG真人", BwVenueTypeEnum.ZR),
    EVO_ZR("evo-zr", "EVOLUTION真人", BwVenueTypeEnum.ZR),
    WGB("wgb", "WGB斗鸡", BwVenueTypeEnum.ZR),

    //区块链类
    HASH("hash", "OB哈希", BwVenueTypeEnum.QKL);

    private String code;
    private String description;

    private BwVenueTypeEnum venueTypeEnum;

    BwVenueEnum(String code, String description, BwVenueTypeEnum venueTypeEnum) {
        this.code = code;
        this.description = description;
        this.venueTypeEnum = venueTypeEnum;
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

    public BwVenueTypeEnum getVenueTypeEnum() {
        return venueTypeEnum;
    }

    public void setVenueTypeEnum(BwVenueTypeEnum venueTypeEnum) {
        this.venueTypeEnum = venueTypeEnum;
    }

    public static BwVenueEnum getByCode(String code) {
        return Arrays.stream(values()).filter(item -> item.code.equals(code)).findAny().orElse(null);
    }

    /**
     * 根据code获取description,如果code不存在则直接返回code
     */
    public static String getDescByCode(String code) {
        BwVenueEnum bwVenueEnum = getByCode(code);
        return bwVenueEnum == null ? code : bwVenueEnum.getDescription();
    }
}
