package com.dx.facade.account.singleWallet;

public enum SingleWalletReturnType {

//    0：成功， 1：失败， 2：订单不存在， 3：相关业务已处理 4：余额不足，只有投注才有，且余额不足时所有订单都应为4。
    success(0, "成功"),
    fail(1, "失败"),
    not_found(2, "订单不存在"),
    repeat_success(3, "相关业务已处理"),
    insufficient_balance(4, "余额不足");

    private int code;

    private String desc;

    SingleWalletReturnType(int code, String desc){
        this.code = code;
        this.desc = desc;
    }
}
