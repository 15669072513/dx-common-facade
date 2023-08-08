package com.dx.facade.payment.enums;

import com.dx.enums.ConstantEnums;
import com.dx.exception.BizException;
import com.dx.facade.common.OrderNoUtils;

import java.util.Objects;

public class Payment {

    /**
     * 订单业务类型
     */
    public enum OrderBizType {
        存款(1, "存款"),
        取款(2, "取款"),
        人工加额存款(3, "人工加额存款"),
        人工减额提款(4, "人工减额提款"),
        佣金充值(6, "佣金充值"),
        额度充值(7, "额度充值"),
        代客充值(8, "代客充值"),
        ;
        private Integer code;
        private String desc;

        OrderBizType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static OrderBizType getType(Integer code) throws BizException {
            for (OrderBizType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个OrderBizType");
        }
    }

    /**
     * 订单存款状态
     */
    public enum OrderDepositStatus {
        待付款(1, "待处理"),
        已取消(2, "已关闭"),
        成功(3, "成功"),
        失败(4, "失败"),
        ;
        private Integer code;
        private String desc;

        OrderDepositStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static OrderDepositStatus getType(Integer code) throws BizException {
            for (OrderDepositStatus depositStatus : values()) {
                if (depositStatus.code.equals(code)) {
                    return depositStatus;
                }
            }
            throw new BizException("没有这个OrderDepositStatus");
        }
    }

    //0/1/2/3，分别代表：支持充提、只有充值、只有提款、没有充提（用于查看和确认订单）
    public enum OrderDepositModel {
        ONLY_ALL(0, "支持充提"),
        ONLY_PUT(1, "只有充值"),
        ONLY_GET(2, "只有提款"),
        NOT_ALL(3, "没有充提(用于查看和确认订单)"),
        ;
        private Integer code;
        private String desc;

        OrderDepositModel(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }
    }

    //本地type: 1-"PC" 2-"IOS_APP" 3-"IOS_H5" 4-"Android_H5" 5-"Android_APP" 6-"后台" 9-"未知"
    //第三方type:1-PC  2-原生iOS 3-ios内嵌webview网页 4-ios浏览器网页 5-原生Android 6-Android内嵌webview网页 7-Android 浏览器网页 9-未知
    public enum OrderDepositClientType {
        PC(1, 1),
        IOS_APP(2, 2),
        IOS_H5(3, 3),
        Android_H5(4, 6),
        Android_APP(5, 5),
//        BC(6, 1),
        UNKNOWN(9, 9),
        ;
        private Integer clientType;
        private Integer TyPayClientType;

        OrderDepositClientType(Integer clientType, Integer TyPayClientType) {
            this.clientType = clientType;
            this.TyPayClientType = TyPayClientType;
        }

        public Integer clientType() {
            return clientType;
        }

        public Integer TyPayClientType() {
            return TyPayClientType;
        }

        public static Integer getTyPayType(Integer clientType) throws BizException {
            for (OrderDepositClientType depositStatus : values()) {
                if (depositStatus.clientType.equals(clientType)) {
                    return depositStatus.TyPayClientType;
                }
            }
            throw new BizException("没有这个OrderDepositClientType");
        }
    }

    /**
     * 订单取款状态
     */
    public enum OrderWithdrawStatus {
        待一审(1, "待一审", 0),
        一审审核(2, "一审审核", 0),
        待二审(3, "待二审", 0),
        二审审核(4, "二审审核", 0),
        待三审(5, "待三审", 0),
        三审审核(6, "三审审核", 0),
        待出款(7, "待出款", 0),
        一审拒绝(8, "一审拒绝", 2),
        二审拒绝(9, "二审拒绝", 2),
        三审拒绝(10, "三审拒绝", 2),
        已出款(11, "出款成功", 1),
        出款取消(12, "出款取消", 2),
        出款拒绝(13, "出款失败", 2),
        ;
        private Integer code;
        private String desc;
        public Integer clientCode;

        OrderWithdrawStatus(Integer code, String desc, Integer clientCode) {
            this.code = code;
            this.desc = desc;
            this.clientCode = clientCode;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public Integer clientCode() {
            return clientCode;
        }

        public static OrderWithdrawStatus getType(Integer code) throws BizException {
            for (OrderWithdrawStatus withdrawStatus : values()) {
                if (withdrawStatus.code.equals(code)) {
                    return withdrawStatus;
                }
            }
            throw new BizException("没有这个OrderWithdrawStatus");
        }

        public static String getDescByCode(Integer code) {
            for (OrderWithdrawStatus withdrawStatus : values()) {
                if (withdrawStatus.code.equals(code)) {
                    return withdrawStatus.desc;
                }
            }
            return null;
        }
    }

    /**
     * 订单存款客户端状态
     */
    public enum OrderDepositAppStatus {
        待处理(1, "待处理"),
        已取消(2, "已取消"),
        成功(3, "成功")
        ;
        private Integer code;
        private String desc;

        OrderDepositAppStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static OrderDepositAppStatus getType(Integer code) throws BizException {
            for (OrderDepositAppStatus depositAppStatus : values()) {
                if (depositAppStatus.code.equals(code)) {
                    return depositAppStatus;
                }
            }
            throw new BizException("没有这个OrderDepositAppStatus");
        }

        public static OrderDepositAppStatus getAppStatusByOrderCode (OrderDepositStatus orderDepositStatus) {
            switch (orderDepositStatus) {
                case 待付款:
                    return OrderDepositAppStatus.待处理;
                case 成功:
                    return OrderDepositAppStatus.成功;
                default:
                    return OrderDepositAppStatus.已取消;
            }
        }
    }

    /**
     * 订单取款客户端状态
     */
    public enum OrderWithdrawAppStatus {
        处理中(0, "处理中"),
        成功(1, "审核通过"),
        失败(2, "审核拒绝")
        ;
        private Integer code;
        private String desc;

        OrderWithdrawAppStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static OrderWithdrawAppStatus getType(Integer code) throws BizException {
            for (OrderWithdrawAppStatus depositAppStatus : values()) {
                if (depositAppStatus.code.equals(code)) {
                    return depositAppStatus;
                }
            }
            throw new BizException("没有这个OrderWithdrawAppStatus");
        }

        public static String getDescByCode(Integer code){
            for (OrderWithdrawAppStatus depositAppStatus : values()) {
                if (depositAppStatus.code.equals(code)) {
                    return depositAppStatus.desc;
                }
            }
            return null;
        }

        public static OrderWithdrawAppStatus getAppStatusByOrderCode (OrderWithdrawStatus orderWithdrawStatus) {
        	/*待一审(1, "待一审", 0),
        一审审核(2, "一审审核", 0),
        待二审(3, "待二审", 0),
        二审审核(4, "二审审核", 0),
        待三审(5, "待三审", 0),
        三审审核(6, "三审审核", 0),
        待出款(7, "待出款", 0),
        一审拒绝(8, "一审拒绝", 2),
        二审拒绝(9, "二审拒绝", 2),
        三审拒绝(10, "三审拒绝", 2),
        已出款(11, "出款成功", 1),
        出款取消(12, "出款取消", 2),
        出款拒绝(13, "出款失败", 2),*/
            switch (orderWithdrawStatus) {
                case 一审拒绝:
                case 二审拒绝:
                case 三审拒绝:
                case 出款拒绝:
                case 出款取消:
                    return OrderWithdrawAppStatus.失败;
                case 已出款:
                    return OrderWithdrawAppStatus.成功;
                default:
                    return OrderWithdrawAppStatus.处理中;
            }

        }
    }

    /**
     * 订单取款三方消息状态
     */
    public enum WithdrawThirdMessageStatus {
        处理中(1, "获取中"),
        失败(2, "已超时");
        private Integer code;
        private String desc;

        WithdrawThirdMessageStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static WithdrawThirdMessageStatus getType(Integer code) throws BizException {
            for (WithdrawThirdMessageStatus massageStatus : values()) {
                if (massageStatus.code.equals(code)) {
                    return massageStatus;
                }
            }
            throw new BizException("没有这个WithdrawThirdMessageStatus");
        }
    }

    /**
     * 会员人工加额调整类型
     */
    public enum MemberAdjustType {
        会员存款后台(1, "会员存款(后台)"),
        会员提款后台(2, "会员提款(后台)"),
        会员活动(3, "会员活动"),
        会员返水(4, "会员返水"),
        会员VIP福利(5, "会员福利"),
        其他调整(6, "其他调整"),
        存款优惠(7,"存款优惠")
        ;
        private Integer code;
        private String desc;

        MemberAdjustType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static MemberAdjustType getType(Integer code) throws BizException {
            for (MemberAdjustType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个MemberAdjustType");
        }
    }

    /**
     * 代理人工调整类型(加额/减额)
     */
    public enum ProxyAdjustType {
        代理存款后台(1, "代理存款(后台)"),
        代理提款后台(2, "代理提款(后台)"),
        代理佣金(3, "佣金"),
        代理返点(4, "返点"),
        代理活动(5, "代理活动"),
        其它调整(6, "其他调整"),
        加保证金(7, "加保证金"),
        保证金贷款(8, "保证金贷款"),
        扣保证金(9, "扣保证金"),
        保证金还款(10, "保证金还款"),
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

        public static ProxyAdjustType getType(Integer code) throws BizException {
            for (ProxyAdjustType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个ProxyAdjustType");
        }
    }

    /**
     * jav人工加减额调整类型
     */
    public enum JavMemberAdjustType {
        MANUAL_RECHARGE(1, "人工充值"),
        DEPOSIT_AWARD(2, "存款优惠"),
        OTHER(3, "其他")
        ;
        private Integer code;
        private String desc;

        JavMemberAdjustType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static JavMemberAdjustType getType(Integer code) throws BizException {
            for (JavMemberAdjustType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个JavMemberAdjustType");
        }
    }

    /**
     * 充值方式
     */
    public enum RechargeModeEnum {
        银行卡转卡(1, "银行卡转卡"),
        支付宝转卡(2, "支付宝转卡"),
        云闪付转卡(3, "云闪付转卡")
        ;
        private Integer code;
        private String desc;

        RechargeModeEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static RechargeModeEnum getType(Integer code) throws BizException {
            for (RechargeModeEnum enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个RechargeModeEnum");
        }
    }

    /**
     * 人工加额审核状态枚举
     */
    public enum AddAdjustAuditStatus {
        待一审(1, "待一审"),
        一审审核(2, "一审审核"),
        待二审(3, "待二审"),
        二审审核(4, "二审审核"),
        一审拒绝(5, "一审拒绝"),
        二审拒绝(6, "二审拒绝"),
        审核通过(7, "审核通过"),
        ;
        private Integer code;
        private String desc;

        AddAdjustAuditStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static AddAdjustAuditStatus getType(Integer code) throws BizException {
            for (AddAdjustAuditStatus enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个AddAdjustAuditStatus");
        }
    }

    /**
     * JAV人工加额审核状态枚举
     */
    public enum JavAddAdjustAuditStatus {
        待审核(1, "待审核"),
        审核中(2, "审核中"),
        审核拒绝(3, "审核拒绝"),
        审核通过(4, "审核通过"),
        ;
        private Integer code;
        private String desc;

        JavAddAdjustAuditStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static JavAddAdjustAuditStatus getType(Integer code) throws BizException {
            for (JavAddAdjustAuditStatus enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个JavAddAdjustAuditStatus");
        }
    }

    public enum DepositBizType {
        会员存款(1, "会员存款"),
        佣金存款(6, "佣金存款"),
        额度存款(7, "额度存款"),
        ;
        private Integer code;
        private String desc;

        DepositBizType(Integer code, String desc) {
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

        public static DepositBizType getType(Integer code) throws BizException {
            for (DepositBizType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个DepositBizType");
        }
    }

    /**
     * 代理转账业务类型枚举
     */
    public enum ProxyAssistDepositBizType{
        代理代存(1, "代理代存"),
        代理转账(2,"代理转账"),
        私庄入金(3,"保证金转入"),
        私庄出金(4,"私庄出金"),
        ;
        private Integer code;
        private String desc;

        ProxyAssistDepositBizType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static ProxyAssistDepositBizType getType(Integer code) throws BizException {
            for (ProxyAssistDepositBizType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个ProxyAssistDepositBizType");
        }
    }

    /**
     * 代理代存业务类型枚举
     */
    public enum ProxyAssistDepositType{
        佣金代存(1, "佣金代存", 1),
        额度代存(2,"额度代存", 1),
        佣金转账(6, "佣金转账", 2),
        额度转账(7,"额度转账", 2),
        佣金出金私庄(8,"佣金出金私庄", 3),
        额度出金私庄(9, "额度出金私庄", 3),
        佣金收金私庄(10,"佣金收金私庄", 4),
        ;
        private Integer code;
        private String desc;
        private Integer bizTypeCode;

        ProxyAssistDepositType(Integer code, String desc, Integer bizTypeCode) {
            this.code = code;
            this.desc = desc;
            this.bizTypeCode = bizTypeCode;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public Integer bizTypeCode() {
            return bizTypeCode;
        }

        public static ProxyAssistDepositType getType(Integer code) throws BizException {
            for (ProxyAssistDepositType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个ProxyAssistDepositType");
        }
    }

    /**
     * 代理充提锁定
     * 0-未锁定 1-充提锁定
     */
    public enum ProxyAccountLockStatusEnum{
        未锁定(0, "未锁定"),
        充提锁定(1,"充提锁定")
        ;
        private Integer code;
        private String desc;

        ProxyAccountLockStatusEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static ProxyAccountLockStatusEnum getType(Integer code) throws BizException {
            for (ProxyAccountLockStatusEnum enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个ProxyAccountLockStatus");
        }
    }

    /**
     * 登陆锁定状态
     * 0-未锁定 1-登陆锁定
     */
    public enum ProxyLoginLockStatusEnum{
        未锁定(0, "未锁定"),
        登录锁定(1,"登录锁定")
        ;
        private Integer code;
        private String desc;

        ProxyLoginLockStatusEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static ProxyLoginLockStatusEnum getType(Integer code) throws BizException {
            for (ProxyLoginLockStatusEnum enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个ProxyLoginLockStatusEnum");
        }
    }

    /**
     * 虚拟币种, 0,1 对应的虚拟币种
     */
    public enum VirtualProtocolTypeEnum {
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
            throw new BizException("没有这个VirtualProtocolTypeEnum");
        }
    }

    /**
     * 代理转账业务类型枚举
     */
    public enum DepositSettingStatus {
        开启(0, "开启"),
        未开启(1,"未开启")
        ;
        private Integer code;
        private String desc;

        DepositSettingStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static DepositSettingStatus getType(Integer code) throws BizException {
            for (DepositSettingStatus enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个ProxyAssistDepositBizType");
        }
    }

    /**
     * 福利类型
     *
     */
    public enum WelfareTypeEnum {
    	会员vip奖励(1,"会员vip奖励"),
    	好友邀请(2,"好友邀请");
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
  	  下半月红包(4,"下半月红包"),
  	  邀请任务 (5,"邀请任务"),
  	  存款任务 (6,"存款任务"),
  	  投注任务(7,"投注任务");

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

    public enum EnumWithdrawBigerType {
        普通(0, "否"),
        大额(1, "是");

        public Integer code;
        public String desc;

        private EnumWithdrawBigerType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            Payment.EnumWithdrawBigerType accountType = getType(code);
            return Objects.nonNull(accountType) ? accountType.desc : "";
        }

        public static Payment.EnumWithdrawBigerType getType(Integer code) {
            Payment.EnumWithdrawBigerType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                Payment.EnumWithdrawBigerType accountType = var1[var3];
                if (accountType.code.equals(code)) {
                    return accountType;
                }
            }

            return null;
        }
    }

    /**
     * OB旗舰客户端状态枚举
     *
     * 存款客户端状态 1.待处理 2.已取消 3.成功
     *
     * thirdCode 订单状态 0=待支付 1=成功 2=失败
     *
     */
    public enum ObDepositOrderAppStatus {
        待处理(1, "待支付", 0),
        成功(3, "成功", 1),
        已取消(2, "失败", 2);
        private Integer code;
        private String desc;
        private Integer thirdCode;

        ObDepositOrderAppStatus(Integer code, String desc, Integer thirdCode) {
            this.code = code;
            this.desc = desc;
            this.thirdCode = thirdCode;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public Integer thirdCode() {
            return thirdCode;
        }

        public static ObDepositOrderAppStatus getAppStatusByThirdCode(Integer thirdCode) throws BizException {
            for (ObDepositOrderAppStatus depositAppStatus : values()) {
                if (depositAppStatus.thirdCode.equals(thirdCode)) {
                    return depositAppStatus;
                }
            }
            throw new BizException("没有这个ObDepositOrderAppStatus");
        }
    }

    /**
     * 支付厂商的枚举
     *
     */
    public enum PayMerchantTypeEnum {
//        CapitalPay(1, "CapitalPay"),
//        TianCi(2,"TianCi"),
//        vnpay(3,"vnpay"),
//        GlobalPay(4,"GlobalPay"),
//        vtpay(5,"vtpay"),
//        HonnorPay(6,"HonnorPay"),
//        大河马(7,"大河马"),
//        JustPay(8,"JustPay"),
//        天下钱包(9,"天下钱包"),
//        天下代付(10,"天下代付"),
//        DmpPay(11,"DmpPay"),
//        WPay(12,"WPay"),
//        HiPay(13,"HiPay"),
//        UBPay(14,"UBPay"),
//        Pay101(15,"101Pay"),
//        阿尔法(16,"阿尔法"),
//        Jubaotong(17,"Jubaotong"),
//        RpPay(18,"RpPay"),
//        Skypay(19,"Skypay"),
//        DiBaoPay(20,"DiBaoPay"),
//        EBPay(21,"EBPay"),
//        RcPay(22,"RcPay"),
//        DdPay(23,"DdPay"),
        默认USDT人工提款商户(24,"默认USDT人工提款商户"),
        ;
        private Integer code;
        private String desc;

        PayMerchantTypeEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static PayMerchantTypeEnum getType(Integer code) throws BizException {
            for (PayMerchantTypeEnum enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个PayModelTypeEnum");
        }
    }

    /**
     * 天下钱包的支付方式类型
     */
    public enum TywalletPayTypeEnum {
        银行卡转账(1, "银行卡转账", OrderNoUtils.OrderNoType.DEPOSIT_BANK),
        网银转公账号(11, "网银转公账号", OrderNoUtils.OrderNoType.DEPOSIT),
        支付宝转银行卡(110, "支付宝转银行卡", OrderNoUtils.OrderNoType.DEPOSIT_SPEED),
        银行卡大额充值(112, "银行卡大额充值", OrderNoUtils.OrderNoType.DEPOSIT_SPEED),
        云闪付转银行卡(113, "云闪付转银行卡", OrderNoUtils.OrderNoType.DEPOSIT_SPEED),
        支付宝H5转银行卡(114, "支付宝H5转银行卡", OrderNoUtils.OrderNoType.DEPOSIT),
        微信转卡(115, "微信转卡", OrderNoUtils.OrderNoType.DEPOSIT_SPEED),
        京东金融支付(116, "京东金融支付", OrderNoUtils.OrderNoType.DEPOSIT_SPEED),
        银联代付(200, "银联代付", OrderNoUtils.OrderNoType.DEPOSIT),
        快捷支付(212, "快捷支付", OrderNoUtils.OrderNoType.DEPOSIT),
        银联扫码(213, "银联扫码", OrderNoUtils.OrderNoType.DEPOSIT),
        网银支付(214, "网银支付", OrderNoUtils.OrderNoType.DEPOSIT),
        微信扫码(312, "微信扫码", OrderNoUtils.OrderNoType.DEPOSIT),
        微信H5(313, "微信H5", OrderNoUtils.OrderNoType.DEPOSIT),
        支付宝H5(410, "支付宝H5", OrderNoUtils.OrderNoType.DEPOSIT),
        支付宝扫码(411, "支付宝扫码", OrderNoUtils.OrderNoType.DEPOSIT),
        QQ扫码(511, "QQ扫码", OrderNoUtils.OrderNoType.DEPOSIT),
        QQH5(512, "QQH5", OrderNoUtils.OrderNoType.DEPOSIT),
        京东扫码(610, "京东扫码", OrderNoUtils.OrderNoType.DEPOSIT),
        云闪付(710, "云闪付", OrderNoUtils.OrderNoType.DEPOSIT),
        极速支付宝(910, "极速支付宝", OrderNoUtils.OrderNoType.DEPOSIT),
        极速微信(911, "极速微信", OrderNoUtils.OrderNoType.DEPOSIT),
        极速转卡(912, "极速转卡", OrderNoUtils.OrderNoType.DEPOSIT_SPEED),
        银行卡转卡非固定金额(913, "银行卡转卡非固定金额", OrderNoUtils.OrderNoType.DEPOSIT),
        抖音红包(1000, "抖音红包", OrderNoUtils.OrderNoType.DEPOSIT),
        三方银行卡转帐(2010, "三方银行卡转帐", OrderNoUtils.OrderNoType.DEPOSIT),
        三方支付宝转卡(2020, "三方支付宝转卡", OrderNoUtils.OrderNoType.DEPOSIT),
        三方大额充值(2030, "三方大额充值", OrderNoUtils.OrderNoType.DEPOSIT),
        三方银行卡转账信息(2040, "三方银行卡转账信息", OrderNoUtils.OrderNoType.DEPOSIT),
        三方云闪付转卡(2050, "三方云闪付转卡", OrderNoUtils.OrderNoType.DEPOSIT),
        小额银行卡转卡(2060, "小额银行卡转卡", OrderNoUtils.OrderNoType.DEPOSIT_BANK),

        USDT扫码(2110, "USDT扫码", OrderNoUtils.OrderNoType.DEPOSIT),
        虚拟币充值(2120, "虚拟币充值", OrderNoUtils.OrderNoType.DEPOSIT),
        转币交易(2130, "转币交易", OrderNoUtils.OrderNoType.DEPOSIT),
        币汇虚拟币(2140, "币汇虚拟币", OrderNoUtils.OrderNoType.DEPOSIT),
        易币付虚拟币(2150, "易币付虚拟币", OrderNoUtils.OrderNoType.DEPOSIT),
        直连二维码(2160, "直连二维码", OrderNoUtils.OrderNoType.DEPOSIT),
        卡密支付(2170, "卡密支付", OrderNoUtils.OrderNoType.DEPOSIT),
        数字人民币(2220, "数字人民币", OrderNoUtils.OrderNoType.DEPOSIT),

        EBPAY直连支付(2180, "EBPAY直连支付", OrderNoUtils.OrderNoType.DEPOSIT),
        EBPAY支付OTC(2181, "EBPAY支付OT", OrderNoUtils.OrderNoType.DEPOSIT),
        EBPAY支付扫码(2182, "EBPAY支付扫码", OrderNoUtils.OrderNoType.DEPOSIT),
        ;

        public Integer code;
        public String desc;
        public OrderNoUtils.OrderNoType orderNoType;

        TywalletPayTypeEnum(Integer code, String desc, OrderNoUtils.OrderNoType orderNoType) {
            this.code = code;
            this.desc = desc;
            this.orderNoType = orderNoType;
        }

        public static TywalletPayTypeEnum getCode(int code) {
            for (TywalletPayTypeEnum tyPayType : values()) {
                if (tyPayType.getCode() == code) {
                    return tyPayType;
                }
            }
            return 银行卡转账;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }

        public OrderNoUtils.OrderNoType getOrderNoType() {
            return orderNoType;
        }

    }

    public static enum EnumAccessStatusType {
        处理中(0, "处理中"),
        成功(1, "成功"),
        失败(2, "失败");

        public Integer code;
        public String desc;

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }

        private EnumAccessStatusType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            Payment.EnumAccessStatusType accessStatusType = getType(code);
            return Objects.nonNull(accessStatusType) ? accessStatusType.desc : "";
        }

        public static Payment.EnumAccessStatusType getType(Integer code) {
            Payment.EnumAccessStatusType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                Payment.EnumAccessStatusType accessStatusType = var1[var3];
                if (accessStatusType.code.equals(code)) {
                    return accessStatusType;
                }
            }

            return null;
        }
    }
    /**
     * 充值方式
     */
    public enum ThirdPayChannelEnum {
        银行卡转卡(1, "银行卡转卡"),
        网银直连(2, "网银直连"),
        扫码支付(3, "扫码支付"),
        MOMOPAY(4, "MOMOPAY"),
        ZALOPAY(5, "ZALOPAY"),
        VTPAY(6, "VTPAY"),
        USDT(7, "USDT"),
        ;
        private Integer code;
        private String desc;

        ThirdPayChannelEnum(Integer code, String desc) {
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

        public static ThirdPayChannelEnum getType(Integer code) throws BizException {
            for (ThirdPayChannelEnum enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个RechargeModeEnum");
        }
    }

}
