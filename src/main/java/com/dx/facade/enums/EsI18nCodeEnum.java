package com.dx.facade.enums;

import com.dx.enums.I18nEnum;

/**
 * es-server 国际化错误码枚举
 */
public enum EsI18nCodeEnum implements I18nEnum {
    ES查询全游戏注单异常(19009), // ES查询全游戏注单异常(19009, "ES查询全游戏注单异常")
    我的注单状态维度查询失败(19062), // 我的注单状态维度查询失败(19062, "我的注单状态维度查询失败"),
    商户ID不能为空(19007), // 商户ID不能为空(19007, "商户ID不能为空"),
    账号Id不能为空(19038), // 账号Id不能为空(19038, "账号Id不能为空"),
    注单状态不能为空(19052), // 注单状态不能为空(19052, "注单状态不能为空"),
    注单状态参数错误(19061), // 注单状态参数错误(19061, "注单状态 只能为0或者1的数字"),
    账号不存在(19049), // 账号不存在(19049, "账号不存在"),
    已结算注单时间不能为空(19063), // 已结算注单时间不能为空(19063, "已结算注单时间不能为空"),
    场馆code不能为空(19066), // 场馆code不能为空(19066, "场馆code不能为空"),
    FIRST_DEPOSIT_TIME_NULL(19067), // FIRST_DEPOSIT_TIME_NULL(19067, "会员首存时间 不存在"),
    SELECT_MEMBER_ACCOUNT_CHANGE_CLIENT_ERROR(19116), // SELECT_MEMBER_ACCOUNT_CHANGE_CLIENT_ERROR(19116, "查询会员额度记录异常，请联系管理员！"),
    ACCOUNT_CHANGE_FOR_APP_PAGE_ERROR(19111), // ACCOUNT_CHANGE_FOR_APP_PAGE_ERROR(19111, "APP账变记录查询异常"),
    ES代理详情查询失败(19023), // ES代理详情查询失败(19023, "ES代理详情查询失败"),
    UNDER_MEMBER_LIST_ERROR(19084), // UNDER_MEMBER_LIST_ERROR(19084, "查询下级会员列表异常"),
    ES会员列表查询异常(19001), // ES会员列表查询异常(19001, "ES会员列表查询异常"),
    ES代理列表查询异常(19020), // ES代理列表查询异常(19020, "ES代理列表查询异常"),
    QQ和flygram不能同时为空(19056), // QQ和flygram不能同时为空(19056, "QQ和flygram 至少填一项"),
    SELECT_PROXY_ACCOUNT_CHANGE_CLIENT_ERROR(19117), // SELECT_PROXY_ACCOUNT_CHANGE_CLIENT_ERROR(19117, "查询代理额度记录异常，请联系管理员！"),
    会员ID不能为空(19011), // 会员ID不能为空(19011, "会员ID不能为空"),
    ES查询排序参数需同时为空或同时传值(19003), // ES查询排序参数需同时为空或同时传值(19003, "ES查询排序参数需同时为空或同时传值"),
    ES获取会员最近一次投注时间异常(19005), // ES获取会员最近一次投注时间异常(19005, "ES获取会员最近一次投注时间异常"),
    下级优惠活动记录ES查询失败(500), // 下级优惠活动记录ES查询失败(500,"下级优惠活动记录ES查询失败")
    INVITATION_CODE_NOT_NULL(19089), // INVITATION_CODE_NOT_NULL(19089, "合营代码不能为空"),
    ES代理账号不能为空(19017), // ES代理账号不能为空(19017, "ES代理账号或代理id不能为空"),
    PROXY_WITHDRAW_RECORD_APP_ERROR(19092), // PROXY_WITHDRAW_RECORD_APP_ERROR(19092, "代理取款记录APP端分页查询异常"),
    PROXY_DEPOSIT_RECORD_APP_ERROR(19090), // PROXY_DEPOSIT_RECORD_APP_ERROR(19090, "代理充值记录APP端分页查询异常"),
    操作时间不能为空(19035), // 操作时间不能为空(19035, "时间不能为空"),
    代理ID不能为空(19026), // 代理ID不能为空(19026, "代理ID不能为空"),
    投注时间不能为空(19059), // 投注时间不能为空(19059, "投注时间不能为空"),
    上次提款时间格式不正确(19044), // 上次提款时间格式不正确(19044, "时间格式,请输入13位时间戳"),
    开始时间不能大于结束时间(2007), // 开始时间不能大于结束时间(2007, "开始时间不能大于结束时间"),
    父级代理ID不能为空(19051), // 父级代理ID不能为空(19051, "父级代理ID不能为空"),
    下级会员人数聚合异常(19060), // 下级会员人数聚合异常(19060, "下级会员人数聚合异常"),
    SELECT_SUB_MEMBER_ACCOUNT_CHANGE_ERROR(19115), // SELECT_SUB_MEMBER_ACCOUNT_CHANGE_ERROR(19115, "查询下级会员账变记录异常，请联系管理员！"),
    业务类型不能为空(19042), // 业务类型不能为空(19042, "业务类型不能为空"),
    上次提款时间不能为空(19043), // 上次提款时间不能为空(19043, "上次提款时间不能为空"),
    获取上次提款到现在的存款总额异常(19045), // 获取上次提款到现在的存款总额异常(19045, "获取上次提款到现在的存款总额异常"),
    会员本次提款流水金额信息异常(19058), // 会员本次提款流水金额信息异常(19058, "会员本次提款流水金额信息异常"),
    SELECT_MEMBER_ACCOUNT_CHANGE_ERROR(19113), // SELECT_MEMBER_ACCOUNT_CHANGE_ERROR(19113, "查询会员账变记录异常，请联系管理员！"),
    投注时间区间不能为空(19010), // 投注时间区间不能为空(19010, "投注时间区间不能为空"),
    LATELY_THREE_DAY_THREE_GAME_ERROR(19069), // LATELY_THREE_DAY_THREE_GAME_ERROR(19069, "会员最近三天投注最多的三款游戏查询 异常"),
    游戏搜索历史异常(19012), // 游戏搜索历史异常(19012, "游戏搜索历史异常"),
    ;

    private int code;

    EsI18nCodeEnum(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
