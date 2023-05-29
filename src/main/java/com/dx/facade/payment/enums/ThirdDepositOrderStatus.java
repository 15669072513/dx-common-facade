package com.dx.facade.payment.enums;

public enum ThirdDepositOrderStatus {

    success(0, "成功"),
    fail(1, "失败"),
    unknown(2, "未知"),
    ;

    public Integer code;
    public String desc;

    ThirdDepositOrderStatus(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
	public Integer code() {
		return code;
	}
	
	public String desc() {
		return desc;
	}
	
    public static String getDesc(Integer code) {
        for (ThirdDepositOrderStatus status : ThirdDepositOrderStatus.values()){
            if (status.code.intValue() == code.intValue()){
                return status.desc;
            }
        }
        return null;
    }

}
