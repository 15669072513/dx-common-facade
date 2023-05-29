package com.dx.facade.account.exception;

public enum ErrorCode {

    MISSING_PARAM_EXCEPTION("缺少参数"),
    PARAM_EXCEPTION("参数错误"),
    CHECK_PARAM_EXCEPTION("检查参数异常"),

    REMARK_CAN_NOT_NULL("审核备注不能为空"),
    ORDER_NOT_LOCK("审核未锁定"),
    ORDER_REVIEWED_SUCCESSFULLY("该订单已审核成功"),
    FIRST_SECOND_REVIEWERS_CANNOT_SAME("一审和二审审核人不能是同一个人"),
    LOCKERS_REVIEWERS_DIFFERENT("锁单人和审核人不是同一个人"),
    ORDER_COMPLETED("该订单已经完成,不能再进行锁单操作"),
    SERVER_ERROR("服务器异常"),
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