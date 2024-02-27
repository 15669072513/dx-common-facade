package com.dx.facade.account.enums;

import com.dx.exception.BizException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AcctPayment {

    public enum CurrencyType {
        CNY("CNY", "人民币", "¥"),
        VND("VND", "越南盾", "₫"),
        THB("THB", "泰铢", "฿"),
        USDT("USDT", "USDT", "$");

        private String code;
        private String desc;
        private String symbol;

        CurrencyType(String code, String desc, String symbol) {
            this.code = code;
            this.desc = desc;
            this.symbol = symbol;
        }

        public String code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public String symbol() {
            return symbol;
        }

        public static CurrencyType getType(String str) {
            for(CurrencyType currency : values()) {
                if (currency.code.equals(str) || currency.symbol.equals(str) || currency.desc.equals(str)) {
                    return currency;
                }
            }
            return null;
        }
    }

    public enum MerchantType {
        充值商户(1, "充值商户"),
        提款商户(2,"提款商户"),
        ;

        private Integer code;
        private String desc;

        MerchantType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static MerchantType getType(Integer code) {
            for (MerchantType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            return null;
        }
    }

    public enum DepositType {
        银行卡(1, "银行卡"),
        信用卡(2, "信用卡"),
        虚拟币(3, "虚拟币"),
        支付宝(4, "支付宝"),
        微信(5, "微信"),
        其他(6, "其他"),
        ;

        private Integer code;
        private String desc;

        DepositType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public String getDesc() {
            return desc;
        }

        public static DepositType getType(Integer code) {
            for (DepositType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            return null;
        }

        public static List<DepositChannelType> getChannelType(Integer code) {
            List<DepositChannelType> result = new ArrayList();
            for (DepositType type : values()) {
                if (type.code.equals(code)) {
                    for(DepositChannelType channelType : DepositChannelType.values()){
                        if(type.equals(channelType.depositType)){
                            result.add(channelType);
                        }
                    }
                    break;
                }
            }
            return result;
        }
    }

    public enum DepositChannelType{
        银行卡转卡(1, "银行卡转卡", DepositType.银行卡),
        信用卡充值(2, "信用卡充值", DepositType.信用卡),
        虚拟币充值(3, "虚拟币充值", DepositType.虚拟币),
        支付宝转卡(4, "支付宝转卡", DepositType.支付宝),
        支付宝扫码(5, "支付宝扫码", DepositType.支付宝),
        微信转卡(6, "微信转卡", DepositType.微信),
        微信扫码(7, "微信扫码", DepositType.微信),
        云闪付(8, "云闪付", DepositType.其他),
        京东支付(9, "京东支付", DepositType.其他),
        vietinbankipay(10, "vietinbankipay", DepositType.其他),
        vietcombank(11, "vietcombank", DepositType.其他),
        techcombank(12, "techcombank", DepositType.其他),
        zalo(13, "zalo", DepositType.其他),
        momo(14, "momo", DepositType.其他),
        pvbank(15, "pvbank", DepositType.其他),
        tpbank(16, "tpbank", DepositType.其他),
        depositcard(17, "depositcard", DepositType.其他),
        vpbank(18, "vpbank", DepositType.其他),
        vibbank(19, "vibbank", DepositType.其他),
        mbbank(20, "mbbank", DepositType.其他),
        vtpay(21, "vtpay", DepositType.其他),
        acbbank(22, "acbbank", DepositType.其他),
        bidv(23, "bidv", DepositType.其他),
        BIDV直连(24, "BIDV", DepositType.银行卡),
        VTB直连(25, "VTB", DepositType.银行卡),
        MB直连(26, "MB", DepositType.银行卡),
        ACB直连(27, "ACB", DepositType.银行卡),
        VCB直连(28, "VCB", DepositType.银行卡),
        SuperQuickCode(31, "极速快扫", DepositType.其他),
        ViettelPay(32, "ViettelPay", DepositType.其他),
        ;

        private Integer code;
        private String desc;
        private DepositType depositType;

        DepositChannelType(Integer code, String desc, DepositType depositType) {
            this.code = code;
            this.desc = desc;
            this.depositType = depositType;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public DepositType type() {
            return depositType;
        }

        public static DepositChannelType getType(Integer code) {
            for (DepositChannelType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            return null;
        }

        public static List<DepositChannelType> getType(DepositType depositType) {
            List<DepositChannelType> depositChannelTypeList = new ArrayList();
            for (DepositChannelType enums : values()) {
                if (enums.depositType.equals(depositType)) {
                    depositChannelTypeList.add(enums);
                }
            }
            return depositChannelTypeList;
        }
    }

    public enum WithdrawType {
        银行卡(1, "银行卡"),
        虚拟币(2, "虚拟币"),
        线下交易(3, "线下交易"),
        其他(0, "其他"),
        ;

        private Integer code;
        private String desc;

        WithdrawType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public String getDesc() {
            return desc;
        }

        public static WithdrawType getType(Integer code) {
            for (WithdrawType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            return null;
        }
    }

    public enum ChannelStatus{
        停用(0, "停用"),
        启用(1, "启用"),
        ;

        private Integer code;
        private String desc;

        ChannelStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static ChannelStatus getType(Integer code) {
            for (ChannelStatus enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            return null;
        }
    }

    public enum VirtualRateBizType{
        MEMBER_DEPOSIT(1, "会员存款"),
        MEMBER_WITHDRAW(2, "会员取款"),
        PROXY_DEPOSIT(3, "代理存款"),
        PROXY_WITHDRAW(4, "代理取款");
        ;

        private Integer code;
        private String desc;

        VirtualRateBizType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public String getDesc() {
            return desc;
        }

        public static VirtualRateBizType getType(Integer code) {
            for (VirtualRateBizType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            return null;
        }
    }

    /**
     * 虚拟币 汇率调整方式
     */
    public enum VirtualRateAdjustType {
        百分比调整(1, "百分比调整"),
        固定值调整(2,"固定值调整")
        ;
        private Integer code;
        private String desc;

        VirtualRateAdjustType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static VirtualRateAdjustType getType(Integer code) {
            for (VirtualRateAdjustType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            return null;
        }
    }

    /**
     * 福利类型
     *
     */
    public enum WelfareTypeEnum {
        会员vip奖励(1,"会员vip奖励");
        private Integer  code;

        private String desc;

        WelfareTypeEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static WelfareTypeEnum getType(Integer code) throws BizException {
            for (WelfareTypeEnum enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个WelfareTypeEnum");
        }
    }

    /**
     * 奖励类型
     */
    public enum AwardTypeEnum {

        升级礼金 (1,"升级礼金"),
        生日礼金 (2,"生日礼金"),
        上半月红包(3,"上半月红包"),
        下半月红包(4,"下半月红包");

        private Integer  code;

        private String desc;

        AwardTypeEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static AwardTypeEnum getType(Integer code) throws BizException {
            for (AwardTypeEnum enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个AwardTypeEnum");
        }

    }

    /**
     * 会员人工加减额
     */
    public static enum MemberAdjustType {
        会员存款后台(1, "会员存款(后台)"),
        会员取款后台(2, "会员取款(后台)"),
        会员活动(3, "会员活动"),
        会员返水(4, "会员返水"),
        会员VIP福利(5, "会员福利"),
        其他调整(6, "其他调整"),
        存款优惠(7,"存款优惠"),
        会员返水增加调整(8,"会员返水增加调整"),
        会员返水扣除调整(9,"会员返水扣除调整"),

        俱乐部返水增加调整(10,"俱乐部返水增加调整"),
        俱乐部返水扣除调整(11,"俱乐部返水扣除调整"),
        保险返水增加调整(12,"保险返水增加调整"),
        保险返水扣除调整(13,"保险返水扣除调整"),
        其他返水增加调整(14,"其他返水增加调整"),
        其他返水扣除调整(15,"其他返水扣除调整"),
        违规扣款(16,"违规扣款"),
        财务调整(17,"财务调整"),
        运营调整(18,"运营调整"),

        三方掉单补分(19, "三方掉单补分"),
        线下结算上分(20, "线下结算上分"),

        ;

        private Integer code;
        private String desc;

        private MemberAdjustType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static AcctPayment.MemberAdjustType getType(Integer code) throws BizException {
            AcctPayment.MemberAdjustType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                AcctPayment.MemberAdjustType enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("没有这个MemberAdjustType");
        }
    }

    public static enum AddAdjustAuditStatus {
        待一审(1, "待一审"),
        一审审核(2, "一审审核"),
        待二审(3, "待二审"),
        二审审核(4, "二审审核"),
        一审拒绝(5, "一审拒绝"),
        二审拒绝(6, "二审拒绝"),
        审核通过(7, "审核通过");

        private Integer code;
        private String desc;

        private AddAdjustAuditStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static AcctPayment.AddAdjustAuditStatus getType(Integer code) throws BizException {
            AcctPayment.AddAdjustAuditStatus[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                AcctPayment.AddAdjustAuditStatus enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("没有这个AddAdjustAuditStatus");
        }
    }


    /**
     * 代理人工调整类型(加额/减额)
     */
    public enum ProxyAdjustType {
        代理存款后台(1, "代理存款(后台)"),
        代理提款后台(2, "代理取款(后台)"),
        代理佣金(3, "佣金"),
        代理返点(4, "返点"),
        代理活动(5, "代理活动"),
        其他调整(6, "其他调整"),
        //新增 现金钱包
        官方给代理充值上分(7, "官方给代理充值上分"),
        官方给代理提现下分(8, "官方给代理提现下分"),
        返点增加调整(9, "返点增加调整"),
        返点扣除调整(10, "返点扣除调整"),

        返佣增加调整(11, "返佣增加调整"),
        返佣扣除调整(12, "返佣扣除调整"),
        
        俱乐部返点增加调整(13, "俱乐部返点增加调整"),
        俱乐部返点扣除调整(14, "俱乐部返点扣除调整"),
        保险返点增加调整(15, "保险返点增加调整"),
        保险返点扣除调整(16, "保险返点扣除调整"),
        其他返点增加调整(17, "其他返点增加调整"),
        其他返点扣除调整(18, "其他返点扣除调整"),

        //信用钱包
        官方给代理授信上分(19, "官方给代理授信上分"),
        官方给代理授信下分(20, "官方给代理授信下分"),
        官方帮代理信用还款(21, "官方帮代理信用还款"),
        代理占成亏损分摊(22, "代理占成亏损分摊"),
        三方掉单补分(23, "三方掉单补分"),
        线下结算上分(24, "线下结算上分"),
        违规扣款(25,"违规扣款"),
        财务调整(26,"财务调整"),
        运营调整(27,"运营调整"),
        收入加额调整(28,"收入加额调整"),
        收入扣除调整(29,"收入扣除调整"),

        ;
        private Integer code;
        private String desc;

        ProxyAdjustType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public String getDesc() {
            return desc;
        }

        public static ProxyAdjustType getType(Integer code) throws BizException {
            for (ProxyAdjustType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个ProxyAdjustType");
        }
    }

    public static enum EnumBlackStatusType {
        启用中(1, "启用中"),
        禁用中(0, "禁用中"),
        ;

        public Integer code;
        public String desc;

        private EnumBlackStatusType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            AcctPayment.EnumBlackStatusType blackStatusType = getType(code);
            return Objects.nonNull(blackStatusType) ? blackStatusType.desc : "";
        }

        public static AcctPayment.EnumBlackStatusType getType(Integer code) {
            AcctPayment.EnumBlackStatusType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                AcctPayment.EnumBlackStatusType blackStatusType = var1[var3];
                if (blackStatusType.code.equals(code)) {
                    return blackStatusType;
                }
            }

            return null;
        }
    }

    /**
     * 虚拟币种类
     */
    public static enum EnumVirtualType {
        BTC("BTC", "BTC"),
        USDT("USDT", "USDT");

        public String code;
        public String desc;

        private EnumVirtualType(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(String code) {
            AcctPayment.EnumVirtualType virtualType = getType(code);
            return Objects.nonNull(virtualType) ? virtualType.desc : "";
        }

        public static AcctPayment.EnumVirtualType getType(String code) {
            AcctPayment.EnumVirtualType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                AcctPayment.EnumVirtualType virtualType = var1[var3];
                if (virtualType.code.equals(code)) {
                    return virtualType;
                }
            }

            return null;
        }
    }

    /**
     * 虚拟币种, 0,1 对应的虚拟币种 1.omni，2.erc20, 3.trc20
     */
    public static enum VirtualProtocolTypeEnum {
        OMNI(1, "OMNI"),
        ERC20(2, "ERC20"),
        TRC20(3, "TRC20");

        private Integer code;
        private String desc;

        VirtualProtocolTypeEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static VirtualProtocolTypeEnum getType(Integer code) throws BizException {
            for (VirtualProtocolTypeEnum enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            return null;
        }
    }

}
