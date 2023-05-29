package com.dx.facade.auth.domain.enums;

/**
 * code对应信息枚举
 *
 * @author deft
 */
public enum CodeMsgEnum {

    /**
     * Code对应的枚举
     */
    DISABLE(0, "0"),
    SUCCESS(200, "SUCCESS"),
    NO_MEMBER_INFO(0, "没有相关会员信息"),
    缺少参数(1000, "缺少参数"),
    分页参数不能为空(1001, "分页参数不能为空"),
    报表月份错误(42078, "报表月份错误"),
    暂无数据(92222, "暂无数据"),
    参数不能为空(93333, "参数不能为空"),
    排序异常(91111, "排序参数需同时传值或同时置空!"),
    对象拷贝(94444, "对象拷贝"),
    参数错误(95555, "参数错误"),
    系统错误(96666, "系统错误"),
    逻辑业务异常(97777, "逻辑业务异常"),
    微服务没有找到(98888, "无法正常提供服务"),
    其他未知异常(99999, "其他系统错误"),

    //用户权限相关
    MANAGER_NOT_EXIST(10001, "后台系统不支持"),
    USER_ERROR(10002, "账号或密码不正确"),
    JWT_ERROR(10003, "无效token"),
    PERMISSION_ERROR(10004, "无效权限"),
    USER_EXIST(10005, "该账号已存在"),
    ROLE_EXIST(10006, "角色已存在"),
    OPERATE_ERROR(10007, "非法操作"),
    KAPTCHA_ERROR(10008, "验证码错误"),
    GOOGLE_AUTH_ERROR(10023, "验证码错误"),
    DELETE_FAIL(10009, "删除角色失败"),
    NO_AUTH(10010, "无权限"),
    MULTI_USER(10011, "用户名和用户密码存在多个账户,请联系系统管理员"),
    IS_DISABLE(10012, "账号已停用，请联系管理员确认"),
    IP_ERROR(10013, "您的ip访问受限制，请联系管理员"),
    NICK_NAME_EXIST(10014, "该姓名已存在"),
    PARENT_AGENT_DISABLE(10015, "商户账号被停用，无法登陆"),
    DELETE_ROLE_ERROR(10016, "该角色已关联账号，无法删除"),
    LOGIN_NUM_THREE_ERROR(10017, "连续3次密码错误，10分钟内5次密码错误该账号将强制禁止登录1小时"),
    LOGIN_NUM_FIVE_ERROR(10018, "连续5次密码错误，当前账号1小时内禁止登录"),
    LOGIN_NUM_LOCK_ERROR(10019, "该账号已被禁止登录1小时，请[minute]分钟后再登录"),
    NOT_UNIQUE_ERROR(10020, "查询到的内容不唯一"),
    PARA_INVALID(10021, "参数无效"),
    FAIL(10022, "系统处理失败"),
    LOGIN_PWD_ERROR(10023, "请输入正确的登录密码"),
    USER_NOT_EXISTS(10024, "用户不存在"),
    RESET_PASSWORD(10025,"密码机制已发生变化，需要重新修正密码值。"),
    PUT_TOKEN_FAIL(10026,"登录异常"),
    USER_NOT_DELETE(10027, "账号状态开启中，不能删除"),
    EXCEL_EXPORT_MAX(10028, "导出数据超出最大行限制范围"),
    COMMISSION_STATUS_ERROR(10029, "请检查总代审核状态"),

    PROXY_NOT_EXISTS(10030, "代理不存在"),

    //以下是权限字典相关的内容
    ADD_PERMISSION_ERROR(20001,"添加权限失败。"),
    PERMISSION_EXIST(20002,"已存在相同ID的权限"),
    SAVE_FAIL(200003, "保存失败！"),
    ROXY_NOT_EXISTS(20005, "代理不存在"),
    DATA_NOT_EXISTS(20006, "无相关数据"),

    USER_ID_IS_NULL(3007, "用户ID不能为空"),
    AGENT_ID_IS_NULL(3017, "未传给权限系统agent_code"),
    ORIGINAL_PASSWORD_IS_NULL(3044, "原密码不能为空"),
    ORIGINAL_PASSWORD_INVALID(3045, "原密码不正确"),
    PASSWORD_IS_NULL(3002, "密码不能为空"),
    PASSWORD_AGAIN_IS_NULL(3003, "密码确认不能为空"),
    PASSWORD_IS_INCONSISTENT(3004, "密码不一致"),
    IS_SPECIAL_CHAR(3071, "不能含有特殊字符"),
    NIKE_NAME_IS_NULL(3016, "用户名不能为空"),
    USER_NOT_YOUR_SUB(30001, "输入账号不是您的下级"),
    SEND_COMMISSION_ERROR(310061, "代发佣金失败"),
    PROXY_COMMISSION_RECORD_NOT_FOUND(310037, "代理佣金记录未找到"),
    PROXY_REBATE_RECORD_NOT_FOUND(310034, "代理返点记录未找到"),
    AUDIT_SAME_OPERATOR(310060, "一审二审不能为同一人"),
    RROXY_REBATE_TAKED(310061, "返点已领取"),

    审核状态异常(300069, "审核状态不正确,操作失败"),
    审核单已解锁状态(300070, "审核单已解锁状态，操作失败"),
    非本人锁单(300071, "非本人锁单，操作失败"),
    审核失败(300080, "订单审核失败"),
    佣金记录不存在(300081, "佣金记录不存在"),
    会员返水查询异常(300082, "会员返水查询异常"),
    转账时间不能为空(300083, "转账时间不能为空"),
    代理转账记录查询异常(300084, "代理转账记录查询异常"),
    佣金加减不能调整佣金为负数(300085,"佣金加减不能调整佣金为负数"),
    应付佣金应大于待付佣金总额(300086,"应付佣金应大于待付佣金总额"),
    坐庄结算记录不存在(300087,"坐庄(预)结算记录不存在"),

    PIG_SIZE_IN_5M(50004,"仅支持png，jpg,图片尺寸，图片大小不超过5M"),
    PIC_TYPE_PNG_JPG(50003,"只能支持JPE，JPEG，PNG格式图片"),

    数据不存在或已删除(8011,"数据不存在或已删除"),
    OPERATION_EXCEL_NULL(8021,"没有导入文件"),
    OPERATION_EXCEL_READ_ERROR(8022,"读取Excel异常"),
    OPERATION_EXCEL_ERROR(8020,"文件不是xlsx文档 或 大小超过5M"),
    DOMAIN_NAME_ALREADY_EXISTS(800005, "该域名已存在"),


    DATA_PRIMARY_KEY_IS_NULL(100004, "数据主键id不能为空"),
    该商户不存在(180012, "该商户不存在"),
    该商户已配置(180013, "该商户已配置"),
    该场馆已配置(180014, "该场馆已配置"),
    该商户配置不存在(180015, "该商户配置不存在"),
    代理图片管理id不存在(180014, "代理图片管理id不存在"),
    初代账号与你所设置的商户不符(180015, "初代账号与你所设置的商户不符"),
    初代账号不是总代(180016, "初代账号不是总代"),
    编辑的信息前后一致修改失败(180017, "编辑的信息前后一致,修改失败"),
    推广域名管理id不存在(180017, "推广域名管理id不存在"),
    ACCOUNT_DOES_NOT_EXIST(310058, "账号不存在"),
    ACCOUNT_NUMBER_NOT_SUB(800003, "输入账号不是您的下级"),
    CONTRACT_ALREADY_EXISTS(310062, "已存在待签约或已签约的契约,不能新增"),
    ACCOUNT_NUMBER_NOT(800006, "无法跨级新增契约"),
    AGENT_GET_ALL_CONTRACTS(800004, "该代理已获得全部契约"),
    ;


    private int code;

    private String msg;

    CodeMsgEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int get() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static CodeMsgEnum get(int code) {
        for (CodeMsgEnum codeMsg : CodeMsgEnum.values()) {
            if (codeMsg.get() == code) {
                return codeMsg;
            }
        }
        return SUCCESS;
    }
}
