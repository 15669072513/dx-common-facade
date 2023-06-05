package com.dx.facade.constant;

import com.dx.facade.enums.ReceiveStatusEnum;

/**
 * 导出excel表头国际化资源key常量
 * @author neko
 */
public interface ExcelHeadI18nKey {

    String VENUE_NAME = "EXCEL_HEAD_I18N_KEY.VENUE_NAME";//场馆名称
    String VENUE_TYPE_NAME = "EXCEL_HEAD_I18N_KEY.VENUE_TYPE_NAME";//场馆类型
    String AMOUNT_IN_CNY = "EXCEL_HEAD_I18N_KEY.AMOUNT_IN_CNY";//返水金额(CNY)

    // 会员存款记录
    String FUNDS_DEPOSIT_ORDER_STATUS = "EXCEL_HEAD_I18N_KEY.FUNDS_DEPOSIT_ORDER_STATUS"; // 存款订单状态
    String FUNDS_DEPOSIT_CLIENT_STATUS = "EXCEL_HEAD_I18N_KEY.FUNDS_DEPOSIT_CLIENT_STATUS"; // 存款客户端状态
    String FUNDS_订单号 = "EXCEL_HEAD_I18N_KEY.FUNDS_订单号"; // 订单号
    String FUNDS_三方订单号 = "EXCEL_HEAD_I18N_KEY.FUNDS_三方订单号"; // 会员账号
    String FUNDS_会员账号 = "EXCEL_HEAD_I18N_KEY.FUNDS_会员账号"; // 会员账号

    String FUNDS_账号类型 = "EXCEL_HEAD_I18N_KEY.FUNDS_账号类型"; // 账号类型

    String FUNDS_总代账号 = "EXCEL_HEAD_I18N_KEY.FUNDS_总代账号"; // 总代账号
    String FUNDS_所属商户 = "EXCEL_HEAD_I18N_KEY.FUNDS_所属商户"; //

    String FUNDS_主商户 = "EXCEL_HEAD_I18N_KEY.FUNDS_主商户"; //
    String FUNDS_VIP等级 = "EXCEL_HEAD_I18N_KEY.FUNDS_VIP等级"; //
    String FUNDS_存款人姓名 = "EXCEL_HEAD_I18N_KEY.FUNDS_存款人姓名"; //
    String FUNDS_订单来源 = "EXCEL_HEAD_I18N_KEY.FUNDS_订单来源"; //
    String FUNDS_订单状态 = "EXCEL_HEAD_I18N_KEY.FUNDS_订单状态"; //
    String FUNDS_客户端状态 = "EXCEL_HEAD_I18N_KEY.FUNDS_客户端状态"; //
    String FUNDS_存款IP风控层级 = "EXCEL_HEAD_I18N_KEY.FUNDS_存款IP风控层级"; //
    String FUNDS_存款终端设备号风控层级 = "EXCEL_HEAD_I18N_KEY.FUNDS_存款终端设备号风控层级"; //
    String FUNDS_支付厂商 = "EXCEL_HEAD_I18N_KEY.FUNDS_支付厂商"; //
    String FUNDS_支付方式 = "EXCEL_HEAD_I18N_KEY.FUNDS_支付方式"; //
    String FUNDS_存款金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_存款金额"; //
    String FUNDS_实际到账金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_实际到账金额"; //
    String FUNDS_信用等级 = "EXCEL_HEAD_I18N_KEY.FUNDS_信用等级"; //
    String FUNDS_申请时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_申请时间"; //
    String FUNDS_到账时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_到账时间"; //
    String FUNDS_备注 = "EXCEL_HEAD_I18N_KEY.FUNDS_备注"; //
    String FUNDS_支付类型 = "EXCEL_HEAD_I18N_KEY.FUNDS_支付类型"; //

    String FUNDS_通道名称 = "EXCEL_HEAD_I18N_KEY.FUNDS_通道名称"; //
    String FUNDS_关联订单号 = "EXCEL_HEAD_I18N_KEY.FUNDS_关联订单号"; //
    String FUNDS_上级代理 = "EXCEL_HEAD_I18N_KEY.FUNDS_上级代理"; //
    String FUNDS_风控层级 = "EXCEL_HEAD_I18N_KEY.FUNDS_风控层级"; //
    String FUNDS_账号状态 = "EXCEL_HEAD_I18N_KEY.FUNDS_账号状态"; //
    String FUNDS_存款类型 = "EXCEL_HEAD_I18N_KEY.FUNDS_存款类型"; //


    String FUNDS_转出代理账号 = "EXCEL_HEAD_I18N_KEY.FUNDS_转出代理账号"; //
    String FUNDS_转出代理层级 = "EXCEL_HEAD_I18N_KEY.FUNDS_转出代理层级"; //
    String FUNDS_转入代理账号 = "EXCEL_HEAD_I18N_KEY.FUNDS_转入代理账号"; //


    String FUNDS_钱包类型 = "EXCEL_HEAD_I18N_KEY.FUNDS_钱包类型"; //

    String FUNDS_业务类型 = "EXCEL_HEAD_I18N_KEY.FUNDS_业务类型"; //

    String FUNDS_账变类型 = "EXCEL_HEAD_I18N_KEY.FUNDS_账变类型"; //

    String FUNDS_收支类型 = "EXCEL_HEAD_I18N_KEY.FUNDS_收支类型"; //

    String FUNDS_账变前余额 = "EXCEL_HEAD_I18N_KEY.FUNDS_账变前余额"; //

    String FUNDS_账变金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_账变金额"; //

    String FUNDS_账变后余额 = "EXCEL_HEAD_I18N_KEY.FUNDS_账变后余额"; //

    String FUNDS_账变时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_账变时间"; //

    String FUNDS_活动ID = "EXCEL_HEAD_I18N_KEY.FUNDS_活动ID"; //
    String FUNDS_优惠金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_优惠金额"; //
    String FUNDS_领取时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_领取时间"; //
    String FUNDS_订单生成时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_订单生成时间"; //

    String FUNDS_提款IP风控层级 = "EXCEL_HEAD_I18N_KEY.FUNDS_提款IP风控层级"; //
    String FUNDS_提款终端设备号风控层级 = "EXCEL_HEAD_I18N_KEY.FUNDS_提款终端设备号风控层级"; //
    String FUNDS_提款方式 = "EXCEL_HEAD_I18N_KEY.FUNDS_提款方式"; //
    String FUNDS_提款信息 = "EXCEL_HEAD_I18N_KEY.FUNDS_提款信息"; //
    String FUNDS_提款账号 = "EXCEL_HEAD_I18N_KEY.FUNDS_提款账号"; //
    String FUNDS_是否大额 = "EXCEL_HEAD_I18N_KEY.FUNDS_是否大额"; //
    String FUNDS_是否首提 = "EXCEL_HEAD_I18N_KEY.FUNDS_是否首提"; //
    String FUNDS_提款金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_提款金额"; //
    String FUNDS_出款时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_出款时间"; //
    String FUNDS_图片预览 = "EXCEL_HEAD_I18N_KEY.FUNDS_图片预览"; //
    String FUNDS_后台备注 = "EXCEL_HEAD_I18N_KEY.FUNDS_后台备注"; //
    String FUNDS_客户端备注 = "EXCEL_HEAD_I18N_KEY.FUNDS_客户端备注"; //

    String FUNDS_代理账号 = "EXCEL_HEAD_I18N_KEY.FUNDS_代理账号"; //

    String FUNDS_代理姓名 = "EXCEL_HEAD_I18N_KEY.FUNDS_代理姓名"; //
    String FUNDS_代理钱包 = "EXCEL_HEAD_I18N_KEY.FUNDS_代理钱包"; //

    String FUNDS_总计 = "EXCEL_HEAD_I18N_KEY.FUNDS_总计"; //
    String FUNDS_好友邀请数据 = "EXCEL_HEAD_I18N_KEY.FUNDS_好友邀请数据"; //
    String FUNDS_邀请人账号 = "EXCEL_HEAD_I18N_KEY.FUNDS_邀请人账号"; //
    String FUNDS_被邀请人账号 = "EXCEL_HEAD_I18N_KEY.FUNDS_被邀请人账号"; //
    String FUNDS_注册时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_注册时间"; //
    String FUNDS_注册IP = "EXCEL_HEAD_I18N_KEY.FUNDS_注册IP"; //
    String FUNDS_注册设备号 = "EXCEL_HEAD_I18N_KEY.FUNDS_注册设备号"; //
    String FUNDS_首存时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_首存时间"; //
    String FUNDS_首存金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_首存金额"; //

    String FUNDS_邀请人奖励 = "EXCEL_HEAD_I18N_KEY.FUNDS_邀请人奖励"; //
    String FUNDS_邀请人派奖时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_邀请人派奖时间"; //
    String FUNDS_邀请人派奖状态 = "EXCEL_HEAD_I18N_KEY.FUNDS_邀请人派奖状态"; //
    String FUNDS_被邀请人奖励 = "EXCEL_HEAD_I18N_KEY.FUNDS_被邀请人奖励"; //
    String FUNDS_被邀请人派奖时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_被邀请人派奖时间"; //
    String FUNDS_被邀请人派奖状态 = "EXCEL_HEAD_I18N_KEY.FUNDS_被邀请人派奖状态"; //

    String ACTIVITY_INVITE_REWARD_TYPE = "EXCEL_HEAD_I18N_KEY.ACTIVITY_INVITE_REWARD_TYPE";// 任务形式
    String FUNDS_转回金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_转回金额";
    String FUNDS_转回时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_转回时间";

    String FUNDS_代存会员账号 = "EXCEL_HEAD_I18N_KEY.FUNDS_代存会员账号";
    String FUNDS_代存类型 = "EXCEL_HEAD_I18N_KEY.FUNDS_代存类型";
    String FUNDS_代存金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_代存金额";
    String FUNDS_代存时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_代存时间";

    String FUNDS_红利金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_红利金额";
    String FUNDS_红利金额_CNY = "EXCEL_HEAD_I18N_KEY.FUNDS_红利金额_CNY";
    String FUNDS_红利金额_THB = "EXCEL_HEAD_I18N_KEY.FUNDS_红利金额_THB";
    String FUNDS_红利金额_VND = "EXCEL_HEAD_I18N_KEY.FUNDS_红利金额_VND";

    String DEPOSIT_DISCOUNT_STATUS_STR = "EXCEL_HEAD_I18N_KEY.DEPOSIT_DISCOUNT_STATUS_STR"; // 领取状态

    String ACTIVITY_RECEIVE_TYPE = "EXCEL_HEAD_I18N_KEY.ACTIVITY_RECEIVE_TYPE"; // 领取方式

    String ACTIVITY_TYPE = "EXCEL_HEAD_I18N_KEY.ACTIVITY_TYPE"; // 活动类型

    String COMMON_YES = "COMMON_KEY.YES"; // 是

    String COMMON_NO = "COMMON_KEY.NO"; //否


    String REPORT_日期 = "EXCEL_HEAD_I18N_KEY.REPORT_日期"; //
    String REPORT_统计日期 = "EXCEL_HEAD_I18N_KEY.REPORT_统计日期"; //
    String REPORT_统计月份 = "EXCEL_HEAD_I18N_KEY.REPORT_统计月份"; //

    String FUNDS_代理类型 = "EXCEL_HEAD_I18N_KEY.FUNDS_代理类型"; //
    String REPORT_注单量 = "EXCEL_HEAD_I18N_KEY.REPORT_注单量"; //
    String REPORT_投注人数 = "EXCEL_HEAD_I18N_KEY.REPORT_投注人数"; //

    String REPORT_总有效投注 = "EXCEL_HEAD_I18N_KEY.REPORT_总有效投注"; //
    String REPORT_直属上级 = "EXCEL_HEAD_I18N_KEY.REPORT_直属上级"; //
    String REPORT_总投注 = "EXCEL_HEAD_I18N_KEY.REPORT_总投注"; //
    String REPORT_直属会员总投注 = "EXCEL_HEAD_I18N_KEY.REPORT_直属会员总投注"; //
    String REPORT_直属会员总有效投注 = "EXCEL_HEAD_I18N_KEY.REPORT_直属会员总有效投注"; //

    String REPORT_直属会员投注盈亏 = "EXCEL_HEAD_I18N_KEY.REPORT_直属会员投注盈亏"; //
    String REPORT_直属会员净盈亏 = "EXCEL_HEAD_I18N_KEY.REPORT_直属会员净盈亏"; //

    String REPORT_会员净盈亏 = "EXCEL_HEAD_I18N_KEY.REPORT_会员净盈亏"; //

    String REPORT_会员净盈亏CNY = "EXCEL_HEAD_I18N_KEY.REPORT_会员净盈亏CNY"; //
    String REPORT_会员净盈亏VND = "EXCEL_HEAD_I18N_KEY.REPORT_会员净盈亏VND"; //
    String REPORT_会员净盈亏THB = "EXCEL_HEAD_I18N_KEY.REPORT_会员净盈亏THB"; //
    String REPORT_投注金额 = "EXCEL_HEAD_I18N_KEY.REPORT_投注金额"; //

    String REPORT_投注金额CNY = "EXCEL_HEAD_I18N_KEY.REPORT_投注金额CNY"; //
    String REPORT_投注金额VND = "EXCEL_HEAD_I18N_KEY.REPORT_投注金额VND"; //
    String REPORT_投注金额THB = "EXCEL_HEAD_I18N_KEY.REPORT_投注金额THB"; //
    String REPORT_有效投注 = "EXCEL_HEAD_I18N_KEY.REPORT_有效投注"; //

    String REPORT_有效投注CNY = "EXCEL_HEAD_I18N_KEY.REPORT_有效投注CNY"; //
    String REPORT_有效投注VND = "EXCEL_HEAD_I18N_KEY.REPORT_有效投注VND"; //
    String REPORT_有效投注THB = "EXCEL_HEAD_I18N_KEY.REPORT_有效投注THB"; //

    String REPORT_游戏名称 = "EXCEL_HEAD_I18N_KEY.REPORT_游戏名称"; //
    String REPORT_投注盈亏 = "EXCEL_HEAD_I18N_KEY.REPORT_投注盈亏"; //
    String REPORT_投注盈亏CNY = "EXCEL_HEAD_I18N_KEY.REPORT_投注盈亏CNY"; //
    String REPORT_投注盈亏VND = "EXCEL_HEAD_I18N_KEY.REPORT_投注盈亏VND"; //
    String REPORT_投注盈亏THB = "EXCEL_HEAD_I18N_KEY.REPORT_投注盈亏THB"; //

    String REPORT_返水金额 = "EXCEL_HEAD_I18N_KEY.REPORT_返水金额"; //
    String REPORT_总返水 = "EXCEL_HEAD_I18N_KEY.REPORT_总返水"; //
    String REPORT_总存款 = "EXCEL_HEAD_I18N_KEY.REPORT_总存款"; //
    String REPORT_总取款 = "EXCEL_HEAD_I18N_KEY.REPORT_总取款"; //

    String REPORT_取款次数 = "EXCEL_HEAD_I18N_KEY.REPORT_取款次数"; //
    String REPORT_存取差 = "EXCEL_HEAD_I18N_KEY.REPORT_存取差"; //
    String REPORT_存款次数 = "EXCEL_HEAD_I18N_KEY.REPORT_存款次数"; //
    String REPORT_总返水CNY = "EXCEL_HEAD_I18N_KEY.REPORT_总返水CNY"; //
    String REPORT_总返水VND = "EXCEL_HEAD_I18N_KEY.REPORT_总返水VND"; //
    String REPORT_总返水THB = "EXCEL_HEAD_I18N_KEY.REPORT_总返水THB"; //
    String REPORT_总返点 = "EXCEL_HEAD_I18N_KEY.REPORT_总返点"; //
    String REPORT_场馆费 = "EXCEL_HEAD_I18N_KEY.REPORT_场馆费"; //
    String REPORT_其他调整 = "EXCEL_HEAD_I18N_KEY.REPORT_其他调整"; //
    String REPORT_其他调整CNY = "EXCEL_HEAD_I18N_KEY.REPORT_其他调整CNY"; //
    String REPORT_其他调整VND = "EXCEL_HEAD_I18N_KEY.REPORT_其他调整VND"; //
    String REPORT_其他调整THB = "EXCEL_HEAD_I18N_KEY.REPORT_其他调整THB"; //
    String REPORT_总优惠 = "EXCEL_HEAD_I18N_KEY.REPORT_总优惠"; //

    String REPORT_总优惠CNY = "EXCEL_HEAD_I18N_KEY.REPORT_总优惠CNY"; //
    String REPORT_总优惠VND = "EXCEL_HEAD_I18N_KEY.REPORT_总优惠VND"; //
    String REPORT_总优惠THB = "EXCEL_HEAD_I18N_KEY.REPORT_总优惠THB"; //
    String REPORT_优惠金额 = "EXCEL_HEAD_I18N_KEY.REPORT_优惠金额"; //
    String REPORT_净盈亏 = "EXCEL_HEAD_I18N_KEY.REPORT_净盈亏"; //
    String REPORT_上级转入 = "EXCEL_HEAD_I18N_KEY.REPORT_上级转入"; //
    String REPORT_转入次数 = "EXCEL_HEAD_I18N_KEY.REPORT_转入次数"; //
    String REPORT_佣金转回 = "EXCEL_HEAD_I18N_KEY.REPORT_佣金转回"; //
    String REPORT_转回次数 = "EXCEL_HEAD_I18N_KEY.REPORT_转回次数"; //
    String REPORT_转代次数 = "EXCEL_HEAD_I18N_KEY.REPORT_转代次数"; //
    String REPORT_代理净输赢 = "EXCEL_HEAD_I18N_KEY.REPORT_代理净输赢"; //
    String REPORT_上月结余 = "EXCEL_HEAD_I18N_KEY.REPORT_上月结余"; //
    String REPORT_冲正后净输赢 = "EXCEL_HEAD_I18N_KEY.REPORT_冲正后净输赢"; //
    String REPORT_会员首存金额 = "EXCEL_HEAD_I18N_KEY.REPORT_会员首存金额"; //
    String REPORT_会员首存人数 = "EXCEL_HEAD_I18N_KEY.REPORT_会员首存人数"; //
    String REPORT_会员注册首存人数 = "EXCEL_HEAD_I18N_KEY.REPORT_会员注册首存人数"; //
    String REPORT_会员总存款 = "EXCEL_HEAD_I18N_KEY.REPORT_会员总存款"; //
    String REPORT_会员总取款 = "EXCEL_HEAD_I18N_KEY.REPORT_会员总取款"; //
    String REPORT_会员投注盈亏 = "EXCEL_HEAD_I18N_KEY.REPORT_会员投注盈亏"; //
    String REPORT_直属会员注册人数 = "EXCEL_HEAD_I18N_KEY.REPORT_直属会员注册人数"; //
    String REPORT_下级会员注册人数 = "EXCEL_HEAD_I18N_KEY.REPORT_下级会员注册人数"; //
    String REPORT_直属代理注册人数 = "EXCEL_HEAD_I18N_KEY.REPORT_直属代理注册人数"; //
    String REPORT_下级代理注册人数 = "EXCEL_HEAD_I18N_KEY.REPORT_下级代理注册人数"; //
    String REPORT_存取对象 = "EXCEL_HEAD_I18N_KEY.REPORT_存取对象"; //
    String REPORT_出入款差额 = "EXCEL_HEAD_I18N_KEY.REPORT_出入款差额"; //
    String REPORT_出入款差额CNY = "EXCEL_HEAD_I18N_KEY.REPORT_出入款差额CNY"; //
    String REPORT_出入款差额VND = "EXCEL_HEAD_I18N_KEY.REPORT_出入款差额VND"; //
    String REPORT_出入款差额THB = "EXCEL_HEAD_I18N_KEY.REPORT_出入款差额THB"; //

    String REPORT_总出款 = "EXCEL_HEAD_I18N_KEY.REPORT_总出款"; //
    String REPORT_总出款CNY = "EXCEL_HEAD_I18N_KEY.REPORT_总出款CNY"; //
    String REPORT_总出款VND = "EXCEL_HEAD_I18N_KEY.REPORT_总出款VND"; //
    String REPORT_总出款THB = "EXCEL_HEAD_I18N_KEY.REPORT_总出款THB"; //

    String REPORT_总入款 = "EXCEL_HEAD_I18N_KEY.REPORT_总入款"; //
    String REPORT_总入款CNY = "EXCEL_HEAD_I18N_KEY.REPORT_总入款CNY"; //
    String REPORT_总入款VND = "EXCEL_HEAD_I18N_KEY.REPORT_总入款VND"; //
    String REPORT_总入款THB = "EXCEL_HEAD_I18N_KEY.REPORT_总入款THB"; //

    String REPORT_人工出款 = "EXCEL_HEAD_I18N_KEY.REPORT_人工出款"; //
    String REPORT_人工出款CNY = "EXCEL_HEAD_I18N_KEY.REPORT_人工出款CNY"; //
    String REPORT_人工出款VND = "EXCEL_HEAD_I18N_KEY.REPORT_人工出款VND"; //
    String REPORT_人工出款THB = "EXCEL_HEAD_I18N_KEY.REPORT_人工出款THB"; //

    String REPORT_三方出款 = "EXCEL_HEAD_I18N_KEY.REPORT_三方出款"; //
    String REPORT_三方出款CNY = "EXCEL_HEAD_I18N_KEY.REPORT_三方出款CNY"; //
    String REPORT_三方出款VND = "EXCEL_HEAD_I18N_KEY.REPORT_三方出款VND"; //
    String REPORT_三方出款THB = "EXCEL_HEAD_I18N_KEY.REPORT_三方出款THB"; //

    String REPORT_人工入款 = "EXCEL_HEAD_I18N_KEY.REPORT_人工入款"; //
    String REPORT_人工入款CNY = "EXCEL_HEAD_I18N_KEY.REPORT_人工入款CNY"; //
    String REPORT_人工入款VND = "EXCEL_HEAD_I18N_KEY.REPORT_人工入款VND"; //
    String REPORT_人工入款THB = "EXCEL_HEAD_I18N_KEY.REPORT_人工入款THB"; //

    String REPORT_三方入款 = "EXCEL_HEAD_I18N_KEY.REPORT_三方入款"; //
    String REPORT_三方入款CNY = "EXCEL_HEAD_I18N_KEY.REPORT_三方入款CNY"; //
    String REPORT_三方入款VND = "EXCEL_HEAD_I18N_KEY.REPORT_三方入款VND"; //
    String REPORT_三方入款THB = "EXCEL_HEAD_I18N_KEY.REPORT_三方入款THB"; //
    String REPORT_会员 = "EXCEL_HEAD_I18N_KEY.REPORT_会员"; //
    String REPORT_代理 = "EXCEL_HEAD_I18N_KEY.REPORT_代理"; //


    String REPORT_返点周期 = "EXCEL_HEAD_I18N_KEY.REPORT_返点周期"; //
    String REPORT_风控层级 = "EXCEL_HEAD_I18N_KEY.REPORT_风控层级"; //
    String REPORT_个人返点 = "EXCEL_HEAD_I18N_KEY.REPORT_个人返点"; //
    String REPORT_下级返点 = "EXCEL_HEAD_I18N_KEY.REPORT_下级返点"; //
    String REPORT_团队返点 = "EXCEL_HEAD_I18N_KEY.REPORT_团队返点"; //
    String REPORT_团队流水 = "EXCEL_HEAD_I18N_KEY.REPORT_团队流水"; //
    String REPORT_返点比例 = "EXCEL_HEAD_I18N_KEY.REPORT_返点比例"; //
    String REPORT_发放时间 = "EXCEL_HEAD_I18N_KEY.REPORT_发放时间"; //

    String REPORT_审核订单号 = "EXCEL_HEAD_I18N_KEY.REPORT_审核订单号"; //
    String REPORT_佣金月份 = "EXCEL_HEAD_I18N_KEY.REPORT_佣金月份"; //
    String REPORT_剩余未收佣金 = "EXCEL_HEAD_I18N_KEY.REPORT_剩余未收佣金"; //
    String REPORT_个人佣金 = "EXCEL_HEAD_I18N_KEY.REPORT_个人佣金"; //
    String REPORT_下级佣金 = "EXCEL_HEAD_I18N_KEY.REPORT_下级佣金"; //
    String REPORT_团队佣金 = "EXCEL_HEAD_I18N_KEY.REPORT_团队佣金"; //
    String REPORT_佣金加减 = "EXCEL_HEAD_I18N_KEY.REPORT_佣金加减"; //
    String REPORT_返佣金额 = "EXCEL_HEAD_I18N_KEY.REPORT_返佣金额"; //
    String REPORT_佣金比例 = "EXCEL_HEAD_I18N_KEY.REPORT_佣金比例";
    String REPORT_会员总输赢 = "EXCEL_HEAD_I18N_KEY.REPORT_会员总输赢";


    String	FUNDS_会员姓名 = "EXCEL_HEAD_I18N_KEY.FUNDS_会员姓名";
    String	FUNDS_上级代理_代理层级 = "EXCEL_HEAD_I18N_KEY.FUNDS_上级代理_代理层级";
    String	FUNDS_手机号码 = "EXCEL_HEAD_I18N_KEY.FUNDS_手机号码";
    String	FUNDS_会员标签 = "EXCEL_HEAD_I18N_KEY.FUNDS_会员标签";
    String	FUNDS_中心钱包余额 = "EXCEL_HEAD_I18N_KEY.FUNDS_中心钱包余额";
    String	FUNDS_注册终端 = "EXCEL_HEAD_I18N_KEY.FUNDS_注册终端";
    String	FUNDS_最后登录时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_最后登录时间";
    String	FUNDS_最后登录IP = "EXCEL_HEAD_I18N_KEY.FUNDS_最后登录IP";

    String	FUNDS_转出钱包 = "EXCEL_HEAD_I18N_KEY.FUNDS_转出钱包";
    String	FUNDS_转入钱包 = "EXCEL_HEAD_I18N_KEY.FUNDS_转入钱包";
    String	FUNDS_转账金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_转账金额";
    String	FUNDS_转账时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_转账时间";
    String	FUNDS_三方注单号 = "EXCEL_HEAD_I18N_KEY.FUNDS_三方注单号";
    String	FUNDS_游戏平台游戏名称 = "EXCEL_HEAD_I18N_KEY.FUNDS_游戏平台游戏名称";
    String	FUNDS_游戏账号 = "EXCEL_HEAD_I18N_KEY.FUNDS_游戏账号";
    String	FUNDS_注单状态 = "EXCEL_HEAD_I18N_KEY.FUNDS_注单状态";
    String	FUNDS_投注金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_投注金额";
    String	FUNDS_会员输赢 = "EXCEL_HEAD_I18N_KEY.FUNDS_会员输赢";
    String	FUNDS_有效投注 = "EXCEL_HEAD_I18N_KEY.FUNDS_有效投注";
    String	FUNDS_返水比例 = "EXCEL_HEAD_I18N_KEY.FUNDS_返水比例";
    String	FUNDS_投注时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_投注时间";
    String	FUNDS_返水金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_返水金额";
    String	FUNDS_结算时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_结算时间";
    String	FUNDS_投注ip = "EXCEL_HEAD_I18N_KEY.FUNDS_投注ip";
    String	FUNDS_投注终端 = "EXCEL_HEAD_I18N_KEY.FUNDS_投注终端";
    String	FUNDS_会员转账记录 = "EXCEL_HEAD_I18N_KEY.FUNDS_会员转账记录";
    String	FUNDS_游戏注单 = "EXCEL_HEAD_I18N_KEY.FUNDS_游戏注单";
    String	FUNDS_中心钱包 = "EXCEL_HEAD_I18N_KEY.FUNDS_中心钱包";
    String	FUNDS_未结算 = "EXCEL_HEAD_I18N_KEY.FUNDS_未结算";
    String	FUNDS_已结算 = "EXCEL_HEAD_I18N_KEY.FUNDS_已结算";
    String	FUNDS_已取消 = "EXCEL_HEAD_I18N_KEY.FUNDS_已取消";
    String	FUNDS_正式 = "EXCEL_HEAD_I18N_KEY.FUNDS_正式";
    String	FUNDS_商务 = "EXCEL_HEAD_I18N_KEY.FUNDS_商务";
    String	FUNDS_置换 = "EXCEL_HEAD_I18N_KEY.FUNDS_置换";
    String	FUNDS_试玩 = "EXCEL_HEAD_I18N_KEY.FUNDS_试玩";
    String	FUNDS_初始 = "EXCEL_HEAD_I18N_KEY.FUNDS_初始";
    String	FUNDS_转账中 = "EXCEL_HEAD_I18N_KEY.FUNDS_转账中";
    String	FUNDS_成功 = "EXCEL_HEAD_I18N_KEY.FUNDS_成功";
    String	FUNDS_失败 = "EXCEL_HEAD_I18N_KEY.FUNDS_失败";
    String	FUNDS_待处理 = "EXCEL_HEAD_I18N_KEY.FUNDS_待处理";

    String	FUNDS_代理层级 = "EXCEL_HEAD_I18N_KEY.FUNDS_代理层级";
    String	FUNDS_层级名称 = "EXCEL_HEAD_I18N_KEY.FUNDS_层级名称";
    String	FUNDS_直属上级 = "EXCEL_HEAD_I18N_KEY.FUNDS_直属上级";
    String	FUNDS_代理标签 = "EXCEL_HEAD_I18N_KEY.FUNDS_代理标签";
    String	FUNDS_入口权限 = "EXCEL_HEAD_I18N_KEY.FUNDS_入口权限";
    String	FUNDS_契约模式 = "EXCEL_HEAD_I18N_KEY.FUNDS_契约模式";
    String	FUNDS_是否有欠款 = "EXCEL_HEAD_I18N_KEY.FUNDS_是否有欠款";
    String	FUNDS_累计返佣 = "EXCEL_HEAD_I18N_KEY.FUNDS_累计返佣";
    String	FUNDS_累计返点 = "EXCEL_HEAD_I18N_KEY.FUNDS_累计返点";
    String	FUNDS_下级代理人数 = "EXCEL_HEAD_I18N_KEY.FUNDS_下级代理人数";
    String	FUNDS_下级会员人数 = "EXCEL_HEAD_I18N_KEY.FUNDS_下级会员人数";
    String	FUNDS_直属代理人数 = "EXCEL_HEAD_I18N_KEY.FUNDS_直属代理人数";
    String	FUNDS_直属会员人数 = "EXCEL_HEAD_I18N_KEY.FUNDS_直属会员人数";
    String	FUNDS_佣金钱包余额 = "EXCEL_HEAD_I18N_KEY.FUNDS_佣金钱包余额";
    String	FUNDS_额度钱包余额 = "EXCEL_HEAD_I18N_KEY.FUNDS_额度钱包余额";
    String	FUNDS_总存款金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_总存款金额";
    String	FUNDS_总存款次数 = "EXCEL_HEAD_I18N_KEY.FUNDS_总存款次数";
    String	FUNDS_总提款金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_总提款金额";
    String	FUNDS_总提款次数 = "EXCEL_HEAD_I18N_KEY.FUNDS_总提款次数";

    String	FUNDS_调整类型 = "EXCEL_HEAD_I18N_KEY.FUNDS_调整类型";
    String	FUNDS_调整金额 = "EXCEL_HEAD_I18N_KEY.FUNDS_调整金额";
    String	FUNDS_操作人 = "EXCEL_HEAD_I18N_KEY.FUNDS_操作人";
    String	FUNDS_操作时间 = "EXCEL_HEAD_I18N_KEY.FUNDS_操作时间";
    String	FUNDS_申请人 = "EXCEL_HEAD_I18N_KEY.FUNDS_申请人";

    String FILE_NAME_会员列表 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_会员列表";
    String FILE_NAME_代理列表 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_代理列表";
    String FILE_NAME_会员人工减额记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_会员人工减额记录";
    String FILE_NAME_会员人工加额记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_会员人工加额记录";
    String FILE_NAME_会员活动记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_会员活动记录";
    String FILE_NAME_代理账变记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_代理账变记录";
    String FILE_NAME_代理代存记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_代理代存记录";
    String FILE_NAME_代理转账记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_代理转账记录";
    String FILE_NAME_代理佣金转回记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_代理佣金转回记录";
    String FILE_NAME_代理人工加额记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_代理人工加额记录";
    String FILE_NAME_代理人工减额记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_代理人工减额记录";
    String FILE_NAME_会员盈亏报表 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_会员盈亏报表";
    String FILE_NAME_代理盈亏报表 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_代理盈亏报表";
    String FILE_NAME_游戏盈亏报表 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_游戏盈亏报表";
    String FILE_NAME_场馆盈亏报表 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_场馆盈亏报表";
    String FILE_NAME_每日盈亏报表 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_每日盈亏报表";
    String FILE_NAME_会员报表 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_会员报表";
    String FILE_NAME_代理报表 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_代理报表";
    String FILE_NAME_平台出入款报表 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_平台出入款报表";
    String FILE_NAME_会员游戏盈亏 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_会员游戏盈亏";

    String FILE_NAME_代理返点记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_代理返点记录";
    String FILE_NAME_总代佣金记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_总代佣金记录";
    String FILE_NAME_非总代佣金记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_非总代佣金记录";
    String FILE_NAME_会员存款记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_会员存款记录";
    String FILE_NAME_会员取款记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_会员取款记录";
    String FILE_NAME_会员账变记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_会员账变记录";
    String FILE_NAME_代理存款记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_代理存款记录";
    String FILE_NAME_代理取款记录 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_代理取款记录";
    String FILE_NAME_红利发放导入模板 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_红利发放导入模板";

    String FILE_NAME_MERCHANT_LIST = "EXCEL_HEAD_I18N_KEY.FILE_NAME_MERCHANT_LIST";

    String	MERCHANT_MERCHANT_NAME = "EXCEL_HEAD_I18N_KEY.MERCHANT_MERCHANT_NAME";
    String	MERCHANT_MERCHANT_LEVEL = "EXCEL_HEAD_I18N_KEY.MERCHANT_MERCHANT_LEVEL";
    String	MERCHANT_MERCHANT_CODE = "EXCEL_HEAD_I18N_KEY.MERCHANT_MERCHANT_CODE";
    String	MERCHANT_SUPPORTED_LANGUAGES = "EXCEL_HEAD_I18N_KEY.MERCHANT_SUPPORTED_LANGUAGES";
    String	MERCHANT_WALLET_CURRENCY = "EXCEL_HEAD_I18N_KEY.MERCHANT_WALLET_CURRENCY";
    String	MERCHANT_MERCHANT_STATUS = "EXCEL_HEAD_I18N_KEY.MERCHANT_MERCHANT_STATUS";
    String	MERCHANT_NUMBER_OF_MEMBERS = "EXCEL_HEAD_I18N_KEY.MERCHANT_NUMBER_OF_MEMBERS";
    String	MERCHANT_NUMBER_OF_AGENTS = "EXCEL_HEAD_I18N_KEY.MERCHANT_NUMBER_OF_AGENTS";
    String	MERCHANT_MEMBER_CENTER_WALLET_BALANCE = "EXCEL_HEAD_I18N_KEY.MERCHANT_MEMBER_CENTER_WALLET_BALANCE";
    String	MERCHANT_CREATOR = "EXCEL_HEAD_I18N_KEY.MERCHANT_CREATOR";
    String	MERCHANT_CREATE_TIME = "EXCEL_HEAD_I18N_KEY.MERCHANT_CREATE_TIME";
    String	MERCHANT_MERCHANT_REMARK = "EXCEL_HEAD_I18N_KEY.MERCHANT_MERCHANT_REMARK";

    String ZH_CN = "EXCEL_HEAD_I18N_KEY.CHINESE";
    String EN_US = "EXCEL_HEAD_I18N_KEY.ENGLISH";
    String TH_TH = "EXCEL_HEAD_I18N_KEY.THAI";
    String VI_VN = "EXCEL_HEAD_I18N_KEY.VIETNAMESE";

    String FREEZE = "EXCEL_HEAD_I18N_KEY.FREEZE";
    String NORMAL = "EXCEL_HEAD_I18N_KEY.NORMAL";

    String FILE_NAME_DOMAIN_CONFIGURATION_IMPORT_TEMPLATE = "EXCEL_HEAD_I18N_KEY.FILE_NAME_DOMAIN_CONFIGURATION_IMPORT_TEMPLATE";
    String CHARACTERS_OR_LESS_200 = "EXCEL_HEAD_I18N_KEY.CHARACTERS_OR_LESS_200";
    String CHARACTERS_OR_LESS_50 = "EXCEL_HEAD_I18N_KEY.CHARACTERS_OR_LESS_50";
    String ENABLE = "EXCEL_HEAD_I18N_KEY.ENABLE";
    String DISABLE = "EXCEL_HEAD_I18N_KEY.DISABLE";
    String DOMAIN_ADDRESS = "EXCEL_HEAD_I18N_KEY.DOMAIN_ADDRESS";
    String DOMAIN_TYPE = "EXCEL_HEAD_I18N_KEY.DOMAIN_TYPE";
    String DOMAIN_STATUS = "EXCEL_HEAD_I18N_KEY.DOMAIN_STATUS";
    String DESCRIPTION_INFO = "EXCEL_HEAD_I18N_KEY.DESCRIPTION_INFO";

    String LIST_REMARK_转入 = "EXCEL_HEAD_I18N_KEY.LIST_REMARK_转入";
    String LIST_REMARK_转给 = "EXCEL_HEAD_I18N_KEY.LIST_REMARK_转给";
    String LIST_REMARK_上分失败加回 = "EXCEL_HEAD_I18N_KEY.LIST_REMARK_上分失败加回";
    String LIST_REMARK_上分失败 = "EXCEL_HEAD_I18N_KEY.LIST_REMARK_上分失败";
    String LIST_REMARK_下分失败 = "EXCEL_HEAD_I18N_KEY.LIST_REMARK_下分失败";

    String FUNDS_序号 = "EXCEL_HEAD_I18N_KEY.FUNDS_序号";
    String FUNDS_商户名称 = "EXCEL_HEAD_I18N_KEY.FUNDS_商户名称";
    String FUNDS_域名地址 = "EXCEL_HEAD_I18N_KEY.FUNDS_域名地址";
    String FUNDS_域名状态 = "EXCEL_HEAD_I18N_KEY.FUNDS_域名状态";
    String FUNDS_域名类型 = "EXCEL_HEAD_I18N_KEY.FUNDS_域名类型";
    String FUNDS_描述说明 = "EXCEL_HEAD_I18N_KEY.FUNDS_描述说明";

    String LENGHT_商户名称 = "EXCEL_HEAD_I18N_KEY.LENGTH_商户名称";
    String LENGTH_域名地址 = "EXCEL_HEAD_I18N_KEY.LENGTH_域名地址";
    String LENGTH_域名状态 = "EXCEL_HEAD_I18N_KEY.LENGTH_域名状态";
    String LENGTH_域名类型 = "EXCEL_HEAD_I18N_KEY.LENGTH_域名类型";
    String LENGTH_描述说明 = "EXCEL_HEAD_I18N_KEY.LENGTH_描述说明";

    String FILE_NAME_域名导入模板 = "EXCEL_HEAD_I18N_KEY.FUNDS_域名导入模板";

    String FILE_NAME_会员取款 = "EXCEL_HEAD_I18N_KEY.FILE_NAME_会员取款";
}