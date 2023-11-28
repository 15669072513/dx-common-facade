package com.dx.facade.enums;

import com.dx.enums.I18nEnum;

public enum MemberI18nCodeEnum implements I18nEnum {

    SERVER_ERROR(1001),
    会员不存在(300033), // 会员不存在(300033, "会员不存在"),
    其他未知异常(99999), // 其他未知异常(99999, "其他系统错误"),
    SECOND_BEHAVIOR_FAIL(3074), // SECOND_BEHAVIOR_FAIL(3074, "二次行为验证失败"),
    QUERY_FAIL(200001), // QUERY_FAIL(200001, "查询失败！"),
    USER_NOT_EXISTS(10004), // USER_NOT_EXISTS(10004, "用户不存在"),
    REGISTER_FAIL(300003), // REGISTER_FAIL(300003, "注册失败！"),
    ADD_MEMBER_AUDIT_ERROR(3100016), // ADD_MEMBER_AUDIT_ERROR(3100016, "添加会员和会员审核记录失败"),
    ADD_CONTRACT_ERROR(310031), // ADD_CONTRACT_ERROR(310031, "代理新增契约异常"),
    CONTRACT_ALREADY_EXISTS(310062), // CONTRACT_ALREADY_EXISTS(310062, "已存在待签约或已签约的契约,不能新增"),
    ACCOUNT_LOCK(10024), // ACCOUNT_LOCK(10024,"充提功能已锁定，请联系客服处理。"),
    GET_PROXY_COMMISSION_LIST_ERROR(310023), // GET_PROXY_COMMISSION_LIST_ERROR(310023, "获取代理佣金列表信息异常"),
    GET_PROXY_GRADE_LIST_ERROR(310024), // GET_PROXY_GRADE_LIST_ERROR(310024, "获取代理等级列表信息异常"),
    ACCOUNT_NUMBER_NOT_SUB(800003), // ACCOUNT_NUMBER_NOT_SUB(800003, "输入账号不是您的下级"),
    PROXY_PAYMENT_PARAM_ERROR(310033), // PROXY_PAYMENT_PARAM_ERROR(310033, "代理支付入参校验异常"),
    PROXY_COMMISSION_RECORD_NOT_FOUND(310037), // PROXY_COMMISSION_RECORD_NOT_FOUND(310037, "代理佣金记录未找到"),
    PROXY_COMMISSIOON_INVALID_AMOUNT(310068), // PROXY_COMMISSIOON_INVALID_AMOUNT(310068,"转入佣金不能超出未收金额"),
    更新代理QQ和flygram失败(300078), // 更新代理QQ和flygram失败(300078, "更新代理QQ和flygram失败"),
    ACCOUNT_DOES_NOT_EXIST(310058), // ACCOUNT_DOES_NOT_EXIST(310058, "账号不存在"),
    PROXY_NOT_EXISTS(10018), // PROXY_NOT_EXISTS(10018, "代理不存在"),
    MERCHANT_NOT_EXISTS(180012),
    NO_MEMBER_INFO(0), // NO_MEMBER_INFO(0, "没有相关会员信息"),
    GET_MERCHANT_GAME_RATE_ERROR(310025), // GET_MERCHANT_GAME_RATE_ERROR(310025, "获取场馆费率信息异常"),
    CONTRACT_REFRESH_PAGE(310072), // CONTRACT_REFRESH_PAGE(310072, "不是最新的契约，请重新刷新页面"),
    TARE_CONTRACT_ERROR(310032), // TARE_CONTRACT_ERROR(310032, "契约不存在或者已经删除"),
    ACCOUNT_NUMBER_NOT(800006), // ACCOUNT_NUMBER_NOT(800006, "无法跨级新增契约"),
    AGENT_GET_ALL_CONTRACTS(800004), // AGENT_GET_ALL_CONTRACTS(800004, "该代理已获得全部契约"),
    代理不存在(300041), // 代理不存在(300041, "代理不存在"),
    PROXY_NOT_EXIST(310002), // PROXY_NOT_EXIST(310002, "代理不存在"),
    分页查询推广域名管理异常(42083), // 分页查询推广域名管理异常(42083,"分页查询推广域名管理异常"),
    推广域名管理id不存在(42079), // 推广域名管理id不存在(42079, "推广域名管理id不存在"),
    MEMBER_EXIST_PARENT(100043), // MEMBER_EXIST_PARENT(100043, "该会员已有上级"),
    会员溢出申请中(310018), // 会员溢出申请中(310018, "该会员已申请会员溢出，请勿重复提交"),
    OVER_FLOW_RECORD_NO_DATA(310073), // OVER_FLOW_RECORD_NO_DATA(310073, "未找到%s的溢出申请"),
    USER_NAME_NOT_EXIST(300006), // USER_NAME_NOT_EXIST(300006, "用户不存在！"),
    PHONE_REPEAT_ERROR(100014), // PHONE_REPEAT_ERROR(100014,"手机号已注册会员"),
    邮箱已被绑定(300089), // 邮箱已被绑定(300089, "邮箱已被绑定"),
    DATA_NOT_EXISTS(200006), // DATA_NOT_EXISTS(200006, "无相关数据"),
    EXPORT_LIMITED(200027), // DATA_NOT_EXISTS(200027, "当前数据超过10000条上限，无法导出"),
    OPERATION_TYPE_ERROR(18004), // OPERATION_TYPE_ERROR(18004, "游戏操作类型错误参数（0,1）"),
    GAME_ID_NOT_NULL(18003), // GAME_ID_NOT_NULL(18003, "游戏id不能为空"),
    MEMBER_ID_NOT_NULL(10002), // MEMBER_ID_NOT_NULL(10002, "会员ID不能为空"),
    游戏未收藏(18013), // 游戏未收藏(18013, "游戏未收藏"),
    游戏已收藏(18013), // 游戏已收藏(18013, "游戏已收藏，不能再次收藏"),
    收藏已达上限(18017), // 收藏已达上限(18017, "收藏已达上限"),
    游戏已禁用(0), // 游戏已禁用(0, "游戏已禁用"),
    ASSORT_ID_NOT_NULL(18004), // ASSORT_ID_NOT_NULL(18004, "游戏类型id不能为空"),
    游戏分类ID不存在(18015), // 游戏分类ID不存在(18015, "游戏分类ID不存在"),
    OLD_PASSWORD_ERROR(300011), // OLD_PASSWORD_ERROR(300011, "原密码错误"),
    LOGIN_PWD_SET_ERROR(300092), // LOGIN_PWD_SET_ERROR(300092, "请输入8-12位，字母+数字组合的密码"),
    OLD_NEW_PASSWORD_ERROR(300012), // OLD_NEW_PASSWORD_ERROR(300012, "新旧密码不能一致，请重新输入"),
    UPDATE_PASSWORD_FAIL(300005), // UPDATE_PASSWORD_FAIL(300005, "修改密码失败！"),
    UPDATE_LOCK_STATUS_FAIL(300018), //UPDATE_LOCK_STATUS_FAIL(300018, "修改登录、开局、俱乐部管理权限失败！"),
    ACCOUNT_LOCRED(0), // ACCOUNT_LOCRED(0,"该功能已停用，请联系客服"),
	PROXY_PATH_ERROR(310079), // 层级路径信息缺失
    // 包网
    BLACKLISTED_LOGIN_IP(-10001), // 登录失败，请联系客服！
    BLACKLISTED_REGISTER_IP(-10002), // 注册失败，请联系客服！
    BLACKLISTED_LOGIN_DEVICENO(-10003), // 登录失败，请联系客服！
    BLACKLISTED_REGISTER_DEVICENO(-10004), // 注册失败，请联系客服！
    IS_DISABLE(10012), // 账号已被锁定登录，请联系客服
    USER_ERROR(10002), // 您输入的用户名和密码有误

    MEMBER_TOP_IMG_NAME(300094),//姓名和头像不可都为空
    MEMBER_EMAIL_PHONE(300095),//手机号码和邮箱不可都为空
    MEMBER_PHONE_NULL(300096),//会员手机号码不能为空
    AREA_NOT_NULL(300096),//请选择区号
    MEMBER_EMAIL_NULL(300097),//会员邮箱不能为空
    MEMBER_USERNAME_PHONE(300098),//账号和手机号码不匹配
    MEMBER_USERNAME_EMAIL(300099),//账号和邮箱不匹配
    MEMBER_PHONE_NOT_CONFIRM(300100),//会员手机号码不存在
    USER_NAME_EMAIL_PHONE_ERROR(100065),//,"用户名手机号码或邮箱不匹配"
    MEMBER_LABEL_CONFIRM(310076),//, "此标签已存在"
    MEMBER_USER_NAME_CONFIRM(310077),//, "用户名不存在"
    MEMBER_LABEL_NAME_SIMPLE(310080),//, "同商户标签名称不能重复"
    VERIFICATION_FAILED(100011),//, "验证码错误，请检查后输入！"
    APP_UPDATE_PWD_ERROR(100061),//,"当前密码不对"
    PASSWORD_CONSISTENCY_ERROR(100013),//两次密码不一致
    INPUT_PHONE_ERROR(100062),//,"手机号码填写有误"
    INPUT_EMAIL_ERROR(100063),//,"邮箱填写有误"
    THIS_EMAIL_BIND(100064),//,"邮箱已被其他账号绑定"
    MERCHANT_INFO_ERROR(310075),//, "商户信息异常"
    DATA_PRIMARY_KEY_IS_NULL(100004),//, "数据主键id不能为空"
    DATA_DOES_NOT_EXIST(310050),//, "数据不存在或者已经删除"

    DIFFERENT_IP(42110), // 登录IP不是常用IP，需要手机号码验证
    OLD_PAYMENT_PASSWORD_ERROR(10023), //密码错误 您还有%s次机会（请输入正确的密码、连续输入错误将会被锁定）
    ACCOUNT_NUMBER_NOT_DIRECT_SUB(800004), // ACCOUNT_NUMBER_NOT_DIRECT_SUB(800004, "输入账号不是您的直属下级"),

    // 包网后台
    时间格式错误(42052), // 时间格式错误(42052, "请正确输入时间格式：yyyy-MM-dd HH:mm:ss"),
    结束时间必须要大于开始时间(42073), // "结束时间必须要大于开始时间"
    基本信息信息编辑异常(300027), // "基本信息信息编辑异常"
    CONTENT_MUST_COMPLETE(300020), // "请内容填写完整"
    PLEASE_SELECT_ACCOUNT_STATUS(300020), // "请选择账号状态"
    PLEASE_SELECT_WIND_CONTROL_LEVEL(300020), // "请选择风控层级"
    PLEASE_SELECT_MEMBER_LABEL(300020), // 请选择会员标签
    PLEASE_SELECT_DATE_OF_BIRTH(300020), // 请选择出生日期
    PLEASE_SELECT_GENDERL(300020), // 请选择性别
    PLEASE_SELECT_CREDIT_LEVEL(300020), // 请选择信用等级
    与当前信息一致修改无效(300048), // "编辑信息与当前一致,修改无效!"
    更新会员信息异常(300017), //  "%s更新会员信息异常"),
    新增资料修改审核记录异常(300016), //  "%s新增资料修改审核记录异常",
    INFO_AUTH_ING(300088), // "请处理完该账号变更审核后再提交"
    请勿重复提交(300063), // "请勿重复提交"
    排序异常(91111), // "排序参数需同时传值或同时置空!"
    只有审核状态为0(500), // 只有审核状态为0-待处理和1-处理中的订单才可以被锁单和解锁操作
    MERCHANT_ADD_RECORD_LOCK_UN_PROCESS(310078), // "你有锁定的订单未处理，锁单失败"
    订单已锁定(500) , // 订单已锁定，不允许再次锁单
    订单已经处于解锁状态(500), // 订单已经处于解锁状态，不需要再次解锁
    订单被锁定后只能是锁定账号解锁(500), // 订单被锁定后只能是锁定账号解锁
    会员转代订单不存在(500), // 会员转代订单不存在
    PROXY_AUDIT_RECORD_ID_NOT_EXIST(100060), // "代理审核单不存在"
    该单已锁定(300069), //  "该单已锁定"
    ORDER_COMPLETED(500), // "该订单已经完成,不能再进行锁单操作"
    ORDER_NOT_LOCK(500), // "审核未锁定"
    ORDER_NOT_ME_LOCK(500), // "只能修改自己锁定的订单"
    ORDER_LOCKED(500), // "该订单已经锁定"
    ONLY_LOCK_ONE_ORDER(500), // "你有锁定的订单未处理，锁单失败"
    该订单已审核成功(500), // 该订单已审核成功
    锁单人和审核人不是同一个人(500), // 锁单人和审核人不是同一个人
    AUDIT_FAIL(500), // "审核失败"
    更新代理信息失败(300045), // "更新代理信息失败"
    INSERT_OR_UPDATE_ERROR(310027), // "新增或更新代理信息异常"
    PROXY_ID_NOT_NULL(310026), // "代理id不能为空"
    UPDATE_PROXY_INFO_DB_AND_ES(310028), // "更新MySQL和ES代理信息异常"
    OBJQ_NEED_INVITATIONCODE(100046), // "合营码不能为空"
    验证失败(500), // 验证失败
    不支持的修改类型(500), // 不支持的修改类型
    USER_NAME_EXIST2(300013), // 该账号已存在
    AUDIT_STATUS_NOT_EXIST(300065), // 审核状态不存在
    ORDER_HAS_AUDIT(300067), // 该单已审核
    ORDER_IS_NOT_LOCKED(300068), // 该单未锁定
    非本人锁单(300071), // 非本人锁单，操作失败
    转入上级代理不存在(300053), // 转入上级代理不存在
    PROXY_SYNC_DATA_ERROR(300057), // 同步代理数据失败
    代理账号不能为空(300051), // 代理账号不能为空
    当前上级代理不存在(300052), // 当前上级代理不存在
    PROXY_TRANSFER_EXIST(300062), // 该转代会员正在处理中
    UPDATE_DATA_ERROR(310000), // 更新数据异常
    审核单已解锁状态(300070), // 审核单已解锁状态，操作失败
    REJECT_NEED_REMARK(310020), // 审核拒绝需要填写备注
    RECORD_LOCK_STATUS_EXISTS(300028), // 请先锁单
    AUDIT_STATUS_ERROR(310019), // 审核状态不正确,操作失败
    ENTRY_AUTHORITY_CLOSE(100057), // 上级代理入口权限未开启
    PROXY_LEVEL_INFO_ERROR(310055), // 上级代理层级信息缺失，不允许添加下级代理
    NOT_ALLOW_ADD_PROXY(310056), // 该上级为底层代理，无法绑定！
    MEMBER_AUDIT_RECORD_EXIST_SAME_NAME(100058), // 该账号审核中，请不要提交重复的申请
    标签不存在(330006), // 标签不存在
    ENTRY_AUTHORITY_OPEN_FORBIDDEN_EDIT(310052), // 入口权限已开启，不能编辑
    代理重置支付密码备注不能为空(300039), // 代理重置支付密码备注不能为空
    REMARK_NOT_NULL(310070), // 请填入备注信息
    PARENT_USERNAME_NOT_EXIST(310053), // 直属上级不存在
    UN_PROXY(310063), // 该上级不是有效的代理账号
    PROXY_NO_CONTRACT(310069), // 该上级无佣金或返点契约，禁止开启
    UPDATE_LOGIN_PASSWORD(333333),//当前密码为系统生成的随机密码，请重新设置
    BLACKLISTED_REGISTER_DEVICE_NO(310180), //该设备已被加入注册设备黑名单，禁止增加代理！
    CURRENT_AVATAR_CANNOT_DELETED(333334),//当前头像不可删除
    ORDER_NOT_EXISTS(333335),//订单不存在
    ;

    private int code;

    MemberI18nCodeEnum(Integer code){
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
