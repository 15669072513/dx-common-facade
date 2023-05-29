package com.dx.facade.payment.enums;

import org.checkerframework.checker.units.qual.A;

import java.util.Objects;

/**
 * @author agan
 */
public class PaymentEnums {

    public PaymentEnums() {
    }

    public static enum EnumWithdrawType {
        银行卡(1, "银行卡"),
        虚拟币(2, "虚拟币"),
        人工下分(3, "人工下分");

        public Integer code;
        public String desc;

        private EnumWithdrawType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            PaymentEnums.EnumWithdrawType payType = getType(code);
            return Objects.nonNull(payType) ? payType.desc : "";
        }

        public static PaymentEnums.EnumWithdrawType getType(Integer code) {
            PaymentEnums.EnumWithdrawType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                PaymentEnums.EnumWithdrawType payType = var1[var3];
                if (payType.code.equals(code)) {
                    return payType;
                }
            }

            return null;
        }
    }

    public static enum EnumPaymentDepositType {
        QQH5(512, "QQH5"),
        QQ扫码(511, "QQ扫码"),
        USDT扫码(2110, "USDT扫码"),
        三方大额充值(2030, "三方大额充值"),
        三方支付宝转卡(2020, "三方支付宝转卡"),
        三方银行卡转帐(2010, "三方银行卡转帐"),
        云闪付(710, "云闪付"),
        云闪付转银行卡(113, "云闪付转银行卡"),
        京东扫码(610, "京东扫码"),
        微信H5(313, "微信H5"),
        微信扫码(312, "微信扫码"),
        微信转卡(115, "微信转卡"),
        快捷支付(212, "快捷支付"),
        支付宝H5(410, "支付宝H5"),
        支付宝H5转银行卡(114, "支付宝H5转银行卡"),
        支付宝扫码(411, "支付宝扫码"),
        支付宝转银行卡(110, "支付宝转银行卡"),
        极速微信(911, "极速微信"),
        极速支付宝(910, "极速支付宝"),
        网银支付(214, "网银支付"),
        网银转公账号(11, "网银转公账号"),
        虚拟币充值(2120, "虚拟币充值"),
        银联代付(200, "银联代付"),
        银联扫码(213, "银联扫码"),
        银行卡大额充值(112, "银行卡大额充值"),
        银行卡转账(1, "银行卡转账"),
        人工上分(5000, "人工上分"),
        他人代存(5001, "他人代存"),
        极速支付(912, "极速支付"),
        币汇虚拟币(2140, "币汇虚拟币");

        public Integer code;
        public String desc;

        private EnumPaymentDepositType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static String getDesc(Integer code) {
            PaymentEnums.EnumPaymentDepositType accountChangeType = getType(code);
            return Objects.nonNull(accountChangeType) ? accountChangeType.desc : "";
        }

        public static PaymentEnums.EnumPaymentDepositType getType(Integer code) {
            PaymentEnums.EnumPaymentDepositType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                PaymentEnums.EnumPaymentDepositType accountChangeType = var1[var3];
                if (accountChangeType.code.equals(code)) {
                    return accountChangeType;
                }
            }

            return null;
        }
    }

    /**
     * 越南银行卡对应的大枚举, 枚举提供给前端使用
     */
    public enum VNDPayBankEnum {
        IBK("IBK", "NGAN HANG CONG NGHIEP HAN QUOC (IBK)", "VND"),
        ACB("ACB", "NGAN HANG TMCP A CHAU (ACB)", "VND"),
        VRB("VRB", "NGAN HANG LIEN DOANH VIET - NGA (VRB)", "VND"),
        AGRIBANK("AGRIBANK", "NGAN HANG NN VA PTNT VIETNAM (AGRIBANK)", "VND"),
        ABB("ACB", " NGAN HANG TMCP AN BINH (ABBANK)ABB", "VND"),
        BVB("BVB", "NGAN HANG TMCP BAO VIET (BVB)", "VND"),
        VIETINBANK("VIETINBANK", "NGAN HANG TMCP CONG THUONG VIET NAM (VIETINBANK)", "VND"),
        PVCOMBANK("PVCOMBANK", "NGAN HANG TMCP DAI CHUNG VIET NAM (PVCOMBANK)", "VND"),
        OCEANBANK("OCEANBANK", "NGAN HANG TMCP DAI DUONG (OCEANBANK)", "VND"),
        GPB("GPB", "NGAN HANG TMCP DAU KHI TOAN CAU (GPB)", "VND"),
        OTHERS("OTHERS", "OTHERS", "VND"),
        ;
        public String code;
        public String bankName;
        public String currency;

        VNDPayBankEnum(String code, String bankName, String currency) {
            this.code = code;
            this.bankName = bankName;
            this.currency = currency;
        }

        public static String getDesc(String code) {
            PaymentEnums.VNDPayBankEnum vnPayBankEnum = getType(code);
            return Objects.nonNull(vnPayBankEnum) ? vnPayBankEnum.bankName : "";
        }

        public static PaymentEnums.VNDPayBankEnum getType(String code) {
            PaymentEnums.VNDPayBankEnum[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                PaymentEnums.VNDPayBankEnum vnPayBankEnum = var1[var3];
                if (vnPayBankEnum.code.equals(code)) {
                    return vnPayBankEnum;
                }
            }

            return null;
        }
    }

    /**
     * 越南银行卡对应的大枚举, 枚举提供给后端对接使用
     */
    public enum ThirdVNPayBankEnum {
        IBK("IBK", "970455", "NGAN HANG CONG NGHIEP HAN QUOC (IBK)"),
        ACB("ACB", "118", "NGAN HANG TMCP A CHAU (ACB)"),
        VRB("VRB", "970421", "NGAN HANG LIEN DOANH VIET - NGA (VRB)"),
        AGRIBANK("AGRIBANK", "131", "NGAN HANG NN VA PTNT VIETNAM (AGRIBANK)"),
        ABB("ACB", "137", "NGAN HANG TMCP AN BINH (ABBANK)ABB"),
        BVB("BVB", "150","NGAN HANG TMCP BAO VIET (BVB)"),
        VIETINBANK("VIETINBANK", "139", "NGAN HANG TMCP CONG THUONG VIET NAM (VIETINBANK)"),
        PVCOMBANK("PVCOMBANK", "134", "NGAN HANG TMCP DAI CHUNG VIET NAM (PVCOMBANK)"),
        OCEANBANK("OCEANBANK", "970414", "NGAN HANG TMCP DAI DUONG (OCEANBANK)"),
        GPB("GPB", "970408", "NGAN HANG TMCP DAU KHI TOAN CAU (GPB)"),
        OTHERS("OTHERS", "10000", "VND"),
        ;
        public String code;
        public String bankCode;
        public String bankName;

        ThirdVNPayBankEnum(String code, String bankCode, String bankName) {
            this.code = code;
            this.bankCode = bankCode;
            this.bankName = bankName;
        }

        public static String getDesc(String code) {
            PaymentEnums.ThirdVNPayBankEnum thirdVNPayBankEnum = getType(code);
            return Objects.nonNull(thirdVNPayBankEnum) ? thirdVNPayBankEnum.bankName : "";
        }

        public static PaymentEnums.ThirdVNPayBankEnum getType(String code) {
            PaymentEnums.ThirdVNPayBankEnum[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                PaymentEnums.ThirdVNPayBankEnum thirdVNPayBankEnum = var1[var3];
                if (thirdVNPayBankEnum.code.equals(code)) {
                    return thirdVNPayBankEnum;
                }
            }

            return null;
        }

        public static String getBankName(String bankName) {
            PaymentEnums.ThirdVNPayBankEnum vnPayBankEnum = getBankNameType(bankName);
            return Objects.nonNull(vnPayBankEnum) ? vnPayBankEnum.bankName : "";
        }

        public static PaymentEnums.ThirdVNPayBankEnum getBankNameType(String code) {
            PaymentEnums.ThirdVNPayBankEnum[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                PaymentEnums.ThirdVNPayBankEnum thirdVNPayBankEnum = var1[var3];
                if (thirdVNPayBankEnum.bankName.equals(code)) {
                    return thirdVNPayBankEnum;
                }
            }

            return null;
        }

    }
}
