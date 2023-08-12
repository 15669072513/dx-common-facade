package com.dx.facade.member.exception;

public enum ErrorCode {

    MEMBER_SERVICE("10002"),
    MISSING_PARAM_EXCEPTION("缺少参数"),
    PARAM_EXCEPTION("参数错误"),
    CHECK_PARAM_EXCEPTION("检查参数异常"),

    ORDER_NOT_EXISTS("订单不存在"),
    REMARK_CAN_NOT_NULL("审核备注不能为空"),
    ORDER_NOT_LOCK("审核未锁定"),
    ORDER_REVIEWED_SUCCESSFULLY("该订单已审核成功"),
    FIRST_SECOND_REVIEWERS_CANNOT_SAME("一审和二审审核人不能是同一个人"),
    LOCKERS_REVIEWERS_DIFFERENT("锁单人和审核人不是同一个人"),
    ORDER_COMPLETED("该订单已经完成,不能再进行锁单操作"),
    ORDER_NOT_ME_LOCK("只能修改自己锁定的订单"),
    ORDER_LOCKED("该订单已经锁定"),
    ORDER_UNLOCKED("该订单已经解锁"),
    该订单已审核成功("该订单已审核成功"),
    锁单人和审核人不是同一个人("锁单人和审核人不是同一个人"),
    MEMBER_ID("会员ID不存在"),
    MEMBER_PASSWORD("会员密码错误"),
    AUDIT_FAIL("审核失败"),
    ONLY_LOCK_ONE_ORDER("你有锁定的订单未处理，锁单失败"),
    MANUAL_TRANSFER_ERRPR("转账失败"),
    ;

    String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }

    public String messageAfter(String message) {
        return this.message.concat("[").concat(message).concat("]");
    }
}