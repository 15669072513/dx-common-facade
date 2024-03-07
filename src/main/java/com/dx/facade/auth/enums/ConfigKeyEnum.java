package com.dx.facade.auth.enums;

import java.util.LinkedList;
import java.util.List;

/**
 * kvConfig表中key对应信息枚举
 *
 * @author July
 */
public enum ConfigKeyEnum {

    /**
     * code: kvconfig表中的字段k
     * type: "1"代表给前台用,"2"代表给后台用
     */
    //前台使用
    LOGIN_PASSWORD_WRONG_TIMES("login.password.wrong.times", "1"),
    LOGIN_UNCOMMONLY_IPADDRESS_ONOFF("login.uncommonly.ipaddress.onoff", "1"),
    GAME_COLLECT_AMOUNTLIMIT_NUMBER("game.collect.amountlimit.number", "1"),
    GAME_SEARCH_DEFAULT_TEXT("game.search.default.text", "1"),
    WALLET_DEPOSIT_ICONJUMP_URL("wallet.deposit.iconjump.url", "1"),
    MEMBER_HEADIMAGE_CHANG_RATE("member.headimage.chang.rate", "1"),
    MESSAGE_RESERVE_DAYS("message.reserve.days", "1"),
    OPERATION_BANNER_INTERVAL_TIME("operation.banner.interval.time", "1"),
    DEPOSIT_ONLINEBANK_FIXED_AMOUNT("deposit.onlinebank.fixed.amount", "1"),
    DEPOSIT_YUNSHANFU_FIXED_AMOUNT("deposit.yunshanfu.fixed.amount", "1"),
    DEPOSIT_ALIPAYTRANSFER_FIXED_AMOUNT("deposit.alipaytransfer.fixed.amount", "1"),
    DEPOSIT_ALIPAY_FIXED_AMOUNT("deposit.alipay.fixed.amount", "1"),
    TRANSFER_AGENT_ONECLICKRECYCLING_INTERVAL_TIME("transfer.agent.oneclickrecycling.interval.time", "1"),
    WALLET_TOTALAMOUNT_REFRESH_INTERVAL_TIME("wallet.totalamount.refresh.interval.time", "1"),
    TRANSFER_WALLETDETAIL_REFRESH_INTERVAL_TIME("transfer.walletdetail.refresh.interval.time", "1"),
    TRANSFER_CENTERWALLET_REFRESH_INTERVAL_TIME("transfer.centerwallet.refresh.interval.time", "1"),
    DEPOSIT_IMMEDIATELY_COUNTDOWN_TIME("deposit.immediately.countdown.time", "1"),
    MESSAGE_BONUSRECEIVE_DAYS("message.bonusreceive.days", "1"),
    MESSAGE_BONUSUNRECEIVE_DAYS("message.bonusunreceive.days", "1"),
    PAYMENT_PAYPASSWORD_WRONG_TIMES("payment.paypassword.wrong.times", "1"),
    PAYMENT_PROXY_PAYPASSWORD_WRONG_TIMES("payment.proxy.paypassword.wrong.times", "1"),
    PAYMENT_MEMBER_PAYPASSWORD_WRONG_TIMES("payment.member.paypassword.wrong.times", "1"),
    PAYMENT_PAYPASSWORD_WRONG_TIMES_MEMBER("payment.paypassword.wrong.times.member", "1"),
    OVERFLOW_DATEDIFF_DAYS("overflow.datediff.days", "1"),
    OVERFLOW_APPLY_AGAIN_ONOFF("overflow.apply.again.onoff", "1"),
    SURROGATE_AMOUNT_SINGLE_CONFIG("surrogate.amount.single.config", "1"),
    SURROGATE_BROKERAGE_SINGLE_CONFIG("surrogate.brokerage.single.config", "1"),
    TRANSFER_BROKERAGETOCENTERWALLET_CONFIG("transfer.brokeragetocenterwallet.config", "1"),
    GAME_TRY_H5_TY_URL("game.try.h5.ty.url", "1"),
    GAME_TRY_H5_QP_URL("game.try.h5.qp.url", "1"),
    GAME_TRY_H5_DJ_URL("game.try.h5.dj.url", "1"),
    GAME_TRY_H5_DJ_URL_TOKEN("game.try.h5.dj.url.token", "1"),
    LOG_LOGREPORT_URL("log.logreport.url", "1"),
    LOG_LOGREPORT_ONOFF("log.logreport.onoff", "1"),
    GAMETYPE_TY_CONFIG("gametype.ty.config", "1"),
    GAMETYPE_ZR_CONFIG("gametype.zr.config", "1"),
    GAMETYPE_DJ_CONFIG("gametype.dj.config", "1"),
    GAMETYPE_CP_CONFIG("gametype.cp.config", "1"),
    GAMETYPE_QP_CONFIG("gametype.qp.config", "1"),
    GAMETYPE_BY_CONFIG("gametype.by.config", "1"),
    GAMETYPE_DY_CONFIG("gametype.dy.config", "1"),
    GAMETYPE_PC_DY_CONFIG("gametype.pc.dy.config", "1"),
    VERIFICATION_SEND_CODE_LIMIT("verification.send.code.limit", "1"),
    VERIFICATION_SEND_CODE_IP_LIMIT("verification.send.code.ip.limit", "1"),
    VERIFICATION_CODE_ERROR_LIMIT("verification.code.error.limit", "1"),
    RESOURCE_BANNER_INTERVAL_TIME("resource.banner.interval.time", "1"),
    BANK_LIMIT_CHECK_NUM_UID("bank.limit.check.num.uid", "1"),
    BANK_LIMIT_CHECK_NUM_IP("bank.limit.check.num.ip", "1"),
    USDT_TRC20_ICON_URL("usdt.trc20.icon.url", "1"),
    USDT_ERC20_ICON_URL("usdt.erc20.icon.url", "1"),

    //后台使用
    RECHARGE_ACTIVE_CONFIG("recharge.active.config", "2"),
    RECHARGE_VALID_CONFIG("recharge.valid.config", "2"),
    RECHARGE_TYPE_CONFIG("recharge.type.config", "2"),
    RECHARGE_SIGNAL_INVALID_TIME("recharge.signal.invalid.time", "2"),
    EXPORT_WAIT_TIME("export.wait.time", "2"),
    REPORT_QUERY_WAIT_TIME("report.query.wait.time", "2"),
    SURROGATE_SETTLE_DEFAULT_CONFIG("surrogate.settle.default.config", "2"),
    SURROGATE_SETTLE_PERIOD_CONFIG("surrogate.settle.period.config", "1"),
    FUNDS_AUDIT_PAGEREFRESH_INTERVAL_CONFIG("funds.audit.pagerefresh.interval.config", "2"),
    WALLET_DISPLAY_ORDER("wallet.display.order", "2"),
    DOMAIN_TYPE("domain.type", "2"),
    BANKCODE_CONFIG("bankcode.config", "2"),
    DEPOSIT_AGENT_PENDING_TIME("deposit.agent.pending.times", "2"),
    DEPOSIT_PENDING_TIMES("deposit.pending.times", "2"),
    TRANSFER_QUOTA_AMOUNT("transfer.quota.amount", "2"),//额度转账
    TRANSFER_COMMISSION_AMOUNT("transfer.commission.amount", "2"),//佣金转账
    SURROGATE_SETTLE_NOTRECEIVE_TIMEOUTS("surrogate.settle.notreceive.timeouts", "1"),//代理返点结算后未领1取超时作废天数
    LIMIT_REGION_COUNTRY_IP("limit.region.country.ip", "1"),
    ZR_LIMIT_GAME_VENUES_IP("zr.limit.game.venues.ip", "1"),
    CP_LIMIT_GAME_VENUES_IP("cp.limit.game.venues.ip", "1"),
    TY_LIMIT_GAME_VENUES_IP("ty.limit.game.venues.ip", "1"),
    REGISTER_DEFAULT_VENTURE_CODE("register.default.venture.code ", "1"),//默认代理合营码
    DEPOSIT_DEFAULT_APPID_MODEL("deposit.default.appid.model", "1"),//存取款新增通道切换参数
    CLIENT_GEETEST_SWITCH("client.geetest.switch", "1"),//app端极验开关
    PROXY_GEETEST_SWITCH("proxy.geetest.switch", "1"),//代理后台极验开关
    MERCHANT_GEETEST_SWITCH("merchant.geetest.switch", "1"),//中控后台极验开关



    //jav项目中的字典
    JAV_FREE_VIEW_DAY_COUNT("jav.free.view.day.count", "1"),
    JAV_COUPON_WORTH_COIN("jav.coupon.worth.coin", "1"),
    JAV_VIDEO_COMPLETE_RATE("jav.video.complete.rate", "1"),
    JAV_CUSTOMER_SERVICE_CONTACT_URL("jav.customer.service.contact.url", "1"),
    COMMON_MEMBER_SERVICE_WEB("common.member.service.web", "1"),
    // 本期不做，预留下期
    COMMON_PROXY_SERVICE_WEB("common.proxy.service.web", "1"),
    JAV_INVITE_VIP_CARD_ID("jav.invite.vip.card.id", "2"),
    JAV_PAY_ORDER_NUMBER("jav.pay.order.number", "1"),
    // jav官网下载页默认视频
    JAV_DOWNLOAD_VIDEO_URL("jav.download.video.url", "1"),
    // jav官网小飞机群链接
    JAV_TELEGRAM_LINK("jav.telegram.link", "1"),
    // jav充值视频教程
    JAV_DEPOSIT_TUTORIAL_VIDEO("jav.deposit.tutorial.video", "1"),
    // jav游戏币充值视频教程
    JAV_GAME_DEPOSIT_TUTORIAL_VIDEO("jav.game.deposit.tutorial.video", "1"),

    // 短信国家类型配置
    OBQJ_ZONECODE_CELLPHONE_MSG("obqj.zonecode.cellphone.msg", "2"),
    MBZR_ZONECODE_CELLPHONE_MSG("mbzr.zonecode.cellphone.msg", "2"),
    JAV_ZONECODE_CELLPHONE_MSG("jav.zonecode.cellphone.msg", "2"),
    OBDJ_ZONECODE_CELLPHONE_MSG("obdj.zonecode.cellphone.msg", "2"),
    OBBW_ZONECODE_CELLPHONE_MSG("obbw.zonecode.cellphone.msg", "2"),


    //新代理系统2.0 新增字典
    PROXY_AMOUNT_COMMISSION_WALLET_TRANSFER_IN("proxy.amount.commission.wallet.transfer.in", "1"),
    PROXY_SAVE_SETTING_EAT_TRANSFER_ORDER_TIME("proxy.save.setting.eat.transfer.order.time", "1"),
    PROXY_OPEN_STOP_HANDICAP_TIME("proxy.open.stop.handicap.time", "1"),
    PROXY_UPCOMING_MATCH_TIME("proxy.upcoming.match.time", "1"),
    PROXY_TAKE_ORDER_FUNDS_USAGE("proxy.take.order.funds.usage", "1"),
    PROXY_BANKER_ORDER_FUNDS_USAGE("proxy.banker.order.funds.usage", "1"),
    PROXY_BANKER_SETTLE_ACCOUNTS_TIME("proxy.banker.settle.accounts.time", "1"),
    PROXY_MEMBER_RECHARGE_RATE("proxy.member.recharge.rate", "1"),
    PROXY_AGENT_RECHARGE_RATE("proxy.agent.recharge.rate", "1"),
    PROXY_MEMBER_WITHDRAW_RATE("proxy.member.withdraw.rate", "1"),
    PROXY_AGENT_WITHDRAW_RATE("proxy.agent.withdraw.rate", "1"),
    PROXY_ZR_RATE("proxy.zr.rate", "1"),
    PROXY_TY_RATE("proxy.ty.rate", "1"),
    PROXY_DJ_RATE("proxy.dj.rate", "1"),
    PROXY_QP_RATE("proxy.qp.rate", "1"),
    PROXY_DY_RATE("proxy.dy.rate", "1"),
    PROXY_CP_RATE("proxy.cp.rate", "1"),
    PROXY_BY_RATE("proxy.by.rate", "1"),

    /**
     * 返点模式下，对团队所有代理和会员生效。
     */
    TEXAS_REBATE_RATE_LIMIT("texas.rebate.rate.limit", "1"),
    TEXAS_INSURANCE_REBATE_RATE_LIMIT("texas.insurance.rebate.rate.limit", "1"),
    ACTUAL_PERSON_REBATE_RATE_LIMIT("actual.person.rebate.rate.limit", "1"),
    SPORTS_REBATE_RATE_LIMIT("sports.rebate.rate.limit", "1"),
    LOTTERY_TICKET_REBATE_RATE_LIMIT("lottery.ticket.rebate.rate.limit", "1"),
    CHESS_REBATE_RATE_LIMIT("chess.rebate.rate.limit", "1"),
    ESPORTS_REBATE_RATE_LIMIT("esports.rebate.rate.limit", "1"),

    /**
     * 返点模式  平台发放默认会员返水
     */
    PLATFORM_TEXAS_REBATE_RATE_LIMIT("platform.texas.rebate.rate.limit", "1"),
    PLATFORM_TEXAS_INSURANCE_REBATE_RATE_LIMIT("platform.texas.insurance.rebate.rate.limit", "1"),
    PLATFORM_ACTUAL_PERSON_REBATE_RATE_LIMIT("platform.actual.person.rebate.rate.limit", "1"),
    PLATFORM_SPORTS_REBATE_RATE_LIMIT("platform.sports.rebate.rate.limit", "1"),
    PLATFORM_LOTTERY_TICKET_REBATE_RATE_LIMIT("platform.lottery.ticket.rebate.rate.limit", "1"),
    PLATFORM_CHESS_REBATE_RATE_LIMIT("platform.chess.rebate.rate.limit", "1"),
    PLATFORM_ESPORTS_REBATE_RATE_LIMIT("platform.esports.rebate.rate.limit", "1"),

    /**
     * 返佣模式下，仅对团队所有会员生效,包括平台发放和代理发放  弃用
     */
    COMMISSION_TEXAS_REBATE_RATE_LIMIT("texas.club.member.rebate","1"),
    COMMISSION_ACTUAL_PERSON_REBATE_RATE_LIMIT("zr.member.rebate","1"),
    COMMISSION_SPORTS_REBATE_RATE_LIMIT("ty.member.rebate","1"),
    COMMISSION_LOTTERY_TICKET_REBATE_RATE_LIMIT("cp.member.rebate","1"),
    COMMISSION_CHESS_REBATE_RATE_LIMIT("qp.member.rebate","1"),
    COMMISSION_ESPORTS_REBATE_RATE_LIMIT("dj.member.rebate","1"),
    COMMISSION_TEXAS_INSURANCE_REBATE_RATE_LIMIT("texas.insurance.member.rebate", "1"),
    
    /** 代理团队所有场馆占成比率上限 */
    ZHANCHNEG_RATE_LIMIT("zhancheng.rate.limit","1"),


    //
    /**
     * 返佣模式下 代理返佣比例上限  弃用
     */
    TEXAS_COMMISSION_RATE_LIMIT("texas.commission.rate.limit", "1"),
    TEXAS_INSURANCE_COMMISSION_RATE_LIMIT("texas.insurance.commission.rate.limit", "1"),
    OTHER_COMMISSION_RATE_LIMIT("other.commission.rate.limit", "1"),


    ////// OB旗舰精简优化
    DEPOSIT_USDT_PROTOCOL_ADDRESS_OBDJ("deposit.usdt.protocol.address.obdj", "1"),
    DEPOSIT_USDT_PROTOCOL_ADDRESS_OBQJ("deposit.usdt.protocol.address.obqj", "1"),
    DEPOSIT_USDT_PROTOCOL_ADDRESS_MBZR("deposit.usdt.protocol.address.mbzr", "1"),
    DEPOSIT_RESOURCE_PICTURE_URL_OBDJ("deposit.resource.picture.url.obdj", "1"),
    DEPOSIT_RESOURCE_PICTURE_URL_OBQJ("deposit.resource.picture.url.obqj", "1"),
    DEPOSIT_RESOURCE_PICTURE_URL_MBZR("deposit.resource.picture.url.mbzr", "1"),
    WITHDRAW_CARD_SHOW_ONOFF("withdraw.card.show.onoff", "1"),

    // 游戏平台
    GAMEPLATFORM_OPERATE_FREE_VIEWS("gameplatform.operate.free.views", "2"),
    GAMEPLATFORM_OPERATE_MOVIE_TICKET_AMOUNT("gameplatform.operate.movie.ticket.amount", "2"),
    GAMEPLATFORM_OPERATE_COMPLETION_RATE("gameplatform.operate.completion.rate", "2"),
    GAMEPLATFORM_OPERATE_SERVICE_WEB("gameplatform.operate.service.web", "2"),
    GAMEPLATFORM_OPERATE_SHARE_CARD_ID("gameplatform.operate.share.card.id", "2"),
    GAMEPLATFORM_OPERATE_PENDING("gameplatform.operate.pending", "2"),
    GAMEPLATFORM_OPERATE_TELEGRAM_WEB("gameplatform.operate.telegram.web", "2"),
    GAMEPLATFORM_COMMON_EXPORT_WAIT_TIME("gameplatform.common.export.wait.time", "2"),

    // OB包网项目字典枚举
    DEPOSIT_AGENT_PENDING_TIMES("deposit.agent.pending.times", "1"),
    TEST_VIP_COUNTNOW_SHUTDOWNFLAG("test.vip.countnow.shutdownflag", "1"),
    REBATE_SETTLE_DEFAULT_CONFIG("rebate.settle.default.config", "1"),

    // https://confluence.bdgatewaynet.com/pages/viewpage.action?pageId=97562176
    // 试玩账号商户id~
    TRIAL_PLAY_INTERFACE_MERCHANT_ID("trial.play.interface.merchant_id", "1"),
    MEMBER_venues_NEXT_CONFIG("member.venues.next.config", "1"),
    VERIFICATION_SEND_EMAIL_LIMIT("verification.send.email.limit", "1"),
    VERIFICATION_EMAIL_ERROR_LIMIT("verification.email.error.limit", "1"),


    //系统消息code 会员
    MESSAGE_MEMBER_REGISTER("message.member.register", "1"),
    MESSAGE_MEMBER_VIP_PROMOTION("message.member.vip.promotion", "1"),
    MESSAGE_MEMBER_DEPOSIT("message.member.deposit", "1"),

    //到账通知 中文：充值上分到账通知
    MESSAGE_MEMBER_DEPOSIT_V2("message.member.deposit.v2", "1"),
    //提现通知 中文：提现成功通知
    MESSAGE_MEMBER_WITHDRAW_SUCCESS_V2("message.member.withdraw.success.v2", "1"),
    //提现通知 中文：提现失败通知
    MESSAGE_MEMBER_WITHDRAW_FAIL_V2("message.member.withdraw.fail.v2", "1"),
    // 新账单通知
    MESSAGE_MEMBER_NEW_BILL("message.member.new.bill", "1"),
    // 代理帮信用还款成功通知
    MESSAGE_MEMBER_HELP_CREDIT_PAY("message.member.help.credit.repay.v26", "1"),
    MESSAGE_MEMBER_PHONE_INFO("message.member.phone.info", "1"), // 个人资料修改通知
    MESSAGE_MEMBER_ACTIVITY_AWARD("message.member.activity.award", "1"),
    MESSAGE_MEMBER_ADD_ACTIVITY("message.member.add.activity", "1"),
    MESSAGE_MEMBER_UPGRADE_BONUS("message.member.upgrade.bonus", "1"),
    MESSAGE_MEMBER_BIRTHDAY_BONUS("message.member.birthday.bonus", "1"),
    MESSAGE_MEMBER_UP_MONTH_BONUS("message.member.up.month.bonus", "1"),
    MESSAGE_MEMBER_DOWN_MONTH_BONUS("message.member.down.month.bonus", "1"),
    MESSAGE_MEMBER_BET_BONUS("message.member.bet.bonus", "1"),
    MESSAGE_MEMBER_DEPOSIT_DISCOUNT("message.member.deposit.discount", "1"),
    MESSAGE_MEMBER_ACTIVITY_BONUS("message.member.activity.bonus", "1"),
    MESSAGE_MEMBER_DEPOSIT_BONUS("message.member.deposit.bonus", "1"),



    //v2.1存取款消息模板
    MESSAGE_MEMBER_WITHDRAW_SUCCESS_V21("message.member.withdraw.success.v21", "1"),
    MESSAGE_MEMBER_WITHDRAW_FAIL_V21("message.member.withdraw.fail.v21", "1"),
    MESSAGE_MEMBER_DEPOSIT_SUCCESS_V21("message.member.deposit.success.v21", "1"),
    MESSAGE_MEMBER_DEPOSIT_FAIL_V21("message.member.deposit.fail.v21", "1"),

    MESSAGE_PROXY_DEPOSIT_SUCCESS_V21("message.proxy.deposit.success.v21", "1"),
    MESSAGE_PROXY_DEPOSIT_FAIL_V21("message.proxy.deposit.fail.v21", "1"),
    MESSAGE_PROXY_WITHDRAW_SUCCESS_V21("message.proxy.withdraw.success.v21", "1"),
    MESSAGE_PROXY_WITHDRAW_FAIL_V21("message.proxy.withdraw.fail.v21", "1"),

    //系统消息code 代理
    MESSAGE_PROXY_JOINT_VENTURE_PARTNER("message.proxy.joint.venture.partner", "1"),//合营伙伴
    MESSAGE_PROXY_SUB_CONTRACT("message.proxy.sub.contract", "1"),
    MESSAGE_PROXY_CONTRACT_SUCCESS("message.proxy.contract.success", "1"),
    MESSAGE_PROXY_SUB_CONTRACT_ACCEPT("message.proxy.sub.contract.accept", "1"),
    MESSAGE_PROXY_ADD_MEMBER("message.proxy.add.member", "1"),//新增下级会员通知

    MESSAGE_PROXY_CONMMISSION_CONOTRACT("message.proxy.conmmission.contract", "1"), //团队返佣比例调整通知 弃用
    MESSAGE_PROXY_MY_COMMISSION_CONTRACT("message.proxy.my.commission.contract", "1"),//团队返佣比例已配置通知 弃用
    MESSAGE_PROXY_COMMISSION_BONUS("message.proxy.commission.bonus", "1"),//返佣奖励发放通知 弃用

    MESSAGE_PROXY_MY_CONTRACT("message.proxy.my.contract", "1"),//返点比例已设置
    MESSAGE_PROXY_REBATE_CONTRACT_ADJUST("message.proxy.rebate.contract.adjust", "1"),//返点比例调整
    MESSAGE_PROXY_REBATE_CONTRACT("message.proxy.rebate.contract", "1"),//返点比例失效
    MESSAGE_PROXY_REBATE_CONTRACT_ADJUST_BAR("message.proxy.rebate.contract.adjust.bar", "1"),//返点比例调整 通知栏
    MESSAGE_PROXY_REBATE_BONUS("message.proxy.rebate.bonus", "1"), // 返点奖励

    MESSAGE_PROXY_PLATFORM_GENERAL("message.proxy.platform.general", "1"),//开通总代
    MESSAGE_PROXY_PLATFORM_PROXY("message.proxy.platform.proxy", "1"),//开通代理通知

    MESSAGE_PROXY_CLUB_SUCCESS("message.proxy.club.success", "1"), // 俱乐部审核通过
    MESSAGE_PROXY_CLUB_FAIL("message.proxy.club.fail", "1"), //俱乐部审核拒绝


    //后台登录IP白名单功能开关（0=关闭  1=开启）
    LOGIN_IP_WHITELIST_SWITCH("login.ip.whitelist.switch", "2"),
    MESSAGE_PROXY_COMMISSION_CONTRACT_LOSE("message.proxy.commission.contract.lose", "1"),
    /**
     * 币种
     */
    DX_CURRENCY("dx.currency", "1"),
    /**
     * 会员默认头像
     */
    MEMBER_DEFAULT_TOP_IMAGE_URL("member.default.top.image.url", "1"),
    /**
     * 会员默认信用等级
     */
    MEMBER_DEFAULT_CREDIT_LEVEL("member.default.credit.level", "1"),
    /**
     * 代理默认信用等级
     */
    PROXY_DEFAULT_CREDIT_LEVEL("proxy.default.credit.level", "1"),
    /**
     * App会员默认头像
     */
    APP_MEMBER_DEFAULT_TOP_IMAGE_URL("app.member.default.top.image.url", "1"),
    //*****************************账单模块配置,其它模块请注意自己的位置哈*************************************
    PROXY_LOAN_BILL_PERIOD_DAYOFWEEK("proxy.loan.bill.period.dayofweek", "1"),
    PROXY_LOAN_BILL_PERIOD_HOUR("proxy.loan.bill.period.hour", "1"),
    //*****************************资金模块配置,其它模块请注意自己的位置哈*************************************
    //资资金>账单相关设置 会员单日提现申请最大次数，中控后台参数字典配置
    ACCOUNT_MEMBER_WITHDRAW_REQUEST_DAILY_MAX_COUNT("account.withdraw.member.dailyMxCount", "1"),
    //资资金>账单相关设置 会员单笔可提现最大额度
    ACCOUNT_MEMBER_WITHDRAW_REQUEST_MAX_AMOUNT("account.withdraw.member.maxAmount", "1"),
    //会员取款RMB/USDT汇率边界值「6.5，7.5」
    ACCOUNT_MEMBER_WITHDRAW_DEPOSIT_USDT_RATE("account.member.withdraw.deposit.usdt.rate", "1"),
    //会员取款RMB/USDT汇率边界值「6.5，7.5」
    ACCOUNT_PROXY_WITHDRAW_DEPOSIT_USDT_RATE("account.proxy.withdraw.deposit.usdt.rate", "1"),
    //会员取款时是否需要输入支付密码校验：0-无需校验；1-需要校验
    ACCOUNT_MEMBER_WITHDRAW_PAY_PASSWORD_CHECK("account.member.withdraw.pay.password.check", "1"),
    //代理取款时是否需要输入支付密码校验：0-无需校验；1-需要校验
    ACCOUNT_PROXY_WITHDRAW_PAY_PASSWORD_CHECK("account.proxy.withdraw.pay.password.check", "1"),


    //******************************资金模块配置,其它模块请注意自己的位置哈************************************
    /** 同时开牌桌上限 */
    CLUB_MAXIMUM_NUMBER("club.maximum.number","1"),
    /** 同时开牌桌上限 */
    MAXIMUM_SIMULTANEOUS_LIMIT("maximum.simultaneous.limit","1"),
    /** 单牌桌旁观人数上限 */
    MAXIMUM_ONLOOKERS_LIMIT("maximum.onlookers.limit","1"),
    /** 单牌桌可坐下人数上限 */
    MAXIMUM_SIT_LIMIT("maximum.sit.limit","1"),
    /** 德州单牌桌累计带入上限（倍BB） */
    TEXAS_UPPER_LIMIT("texas.upper.limit","1"),
    /** 短牌单牌桌累计带入上限（倍Ante） */
    SHOORT_UPPER_LIMIT("short.upper.limit","1"),

    //******************************短信验证相关
    /** 短信验证码有效时长*/
    CMS_VALID_TIME("cms.valid.time","1"),
    /** 短信验证码默认过期时间*/
    CMS_DEFAULT_COUNTDOWN("cms.default.countdown","1"),

    PROXY_LEVEL_LIMIT("proxy.level.limit","1"),
	;

    //code转换
    public static void main(String[] args) {
        String a = "proxy.zr.rate";
        String replace = a.replace(".", "_");
        String s = replace.toUpperCase();
        System.out.println(s);
    }


    private String code;

    private String type;

    ConfigKeyEnum(String code, String type) {
        this.code = code;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    //获取供前台使用枚举
    public static List<String> getFrontList() {
        List<String> enums = new LinkedList<>();
        for (ConfigKeyEnum codeMsg : ConfigKeyEnum.values()) {
            if ("1".equals(codeMsg.type)) {
                enums.add(codeMsg.code);
            }
        }
        return enums;
    }

    //获取供后台使用枚举
    public static List<String> getBackList() {
        List<String> enums = new LinkedList<>();
        for (ConfigKeyEnum codeMsg : ConfigKeyEnum.values()) {
            if ("2".equals(codeMsg.type)) {
                enums.add(codeMsg.code);
            }
        }
        return enums;
    }

}
