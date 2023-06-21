package com.dx.facade.constant;

public class DXManagerConstant {

    /**
     * 茶百道后台管理系统
     */
    // 用户、角色、菜单权限使用此项
    public static final String SYSTEM_TYPE_MERCHANT = "1";
	
	public final static String BUCKET_NAME = "bw-merchant-manager";
    // 参数字典使用此项
    public static final Long SYSTEM_APP_ID = 1L;

    public static final String SUFFIX_X_LSX = ".xlsx";

    public static final String  WIND_YES= "是";
    public static final String  WIND_NO= "否";
    public static final Integer 负一 = -1;
    public static final Long NEGATIVE_1_L = -1L;
    public static final Integer ZERO = 0;
    public static final Long ZERO_L = 0L;
    public static final String ZERO_S = "0";
    public static final Integer ONE = 1;
    public static final String ONE_S = "1";
	public static final String SLASH_ZERO_S = "/0";
    public static final Long ONE_L = 1L;
    public static final Integer TWO = 2;
    public static final Integer THREE = 3;
    public static final Integer FOUR = 4;
    public static final Integer FIVE = 5;
    public static final Integer SIX = 6;
    public static final Integer SEVEN = 7;
    public static final Integer EIGHT = 8;
    public static final Integer NINE = 9;
    public static final Integer TEN = 10;
    public static final Integer ELEVEN = 11;
    public static final Integer TWELVE = 12;
    public static final Integer FIFTEEN = 15;
    public static final Integer NINETEEN = 19;
    public static final Integer TWENTY = 20;
    public static final Integer TWENTY_FIVE = 25;
    public static final Integer FIFTY = 50;
    public static final Integer SIXTY = 60;
    public static final Integer ONE_HUNDRED = 100;
    public static final Integer TWO_HUNDRED = 200;
    public static final Integer FIVE_HUNDRED = 500;
    public static final Integer TIME_LIMIT = 600000;
    public static final String ASC = "asc";
    public static final String DESC = "desc";
    public static final String NULL = "暂无数据";
    public static final String VIP = "VIP";
    public static final Integer FIVE_M = 1024 * 1024 * 5;
    public static final String SUFFIX_XLSX = ".xlsx";
    public static final String SUFFIX_XLSX_WITHOUT_DOT = "xlsx";
    public static final String DOT = ".";
    public static final String COMMA = ",";
	public static final Integer AUDIT_NUM_BOUND = 9999;

    public static final Long MAX_EXPORT_SIZE = 100000L;
    public static final Long EXPORT_PAGE_NUM = 1L;
    /*************************************************枚举定义**********************************************/
    /**
     * 支付 - 币种类型
     */
    public static final String PAYMENTCURRENCYTYPE = "paymentCurrencyType";
    /**
     * 支付 - 存款类型
     */
    public static final String DEPOSITPAYMENTTYPE = "depositPaymentType";
    /**
     * 支付 - 取款类型
     */
    public static final String WITHDRAWPAYMENTTYPE = "withdrawPaymentType";
    /**
     * 支付 - 通道状态
     */
    public static final String PAYMENTCHANNNELSTATUS = "paymentChannelStatus";
    /**
     * 支付 - 虚拟币汇率调整方式
     */
    public static final String VirtualRateAdjustType = "virtualRateAdjustType";
    /**
     * 币种
     */
    public static final String CURRENCY = "currency";
    /**
     * 币种带符号
     */
    public static final String CURRENCY_SYMBOL = "currencySymbol";
    /**
     * 账户类别
     */
    public static final String ACCOUNT_KIND = "accountKind";
    /**
     * 环境类型
     */
    public static final String PROFILE_TYPE = "profileType";
    /**
     * 账号类型
     */
    public static final String ACCOUNT_TYPE = "accountType";
    /**
     * 会员账号状态（1-正常，2-登录锁定，3-游戏锁定，4-充提锁定）
     */
    public static final String ACCOUNT_STATUS_TYPE = "accountStatusType";
    /**
     * 注册终端类型 （1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP 6-后台）
     */
    public static final String DEVICE_TYPE = "deviceType";
    /**
     * 登录端类型 （1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP）
     */
    public static final String LOGIN_DEVICE_TYPE = "loginDeviceType";
	/**
	 * 人工加、减额 调整类型
	 */
    public static final String ADJUST_TYPE = "adjustType";
	/**
	 * 人工加额 审核状态
	 */
    public static final String AUDIT_STATUS = "auditStatus";

    /**
     * 专属域名绑定状态
     */
    public static final String EXCLUSIVE_DOMAIN_BIND = "exclusiveBind";

    /**
     * 专属域名域名状态
     */
    public static final String EXCLUSIVE_DOMAIN_DOMAIN = "exclusiveDomain";
	/**
	 * 订单锁定
	 */
	public static final String LOCK_STATUS = "lockStatus";
	/**
	 * 商户状态
	 */
	public static final String MERCHANT_STATUS = "merchantStatus";
	/**
	 * 支持语言
	 */
	public static final String LANGUAGE = "language";
	/**
	 * 人工加额 审核状态（完成态）
	 */
    public static final String FINISH_AUDIT_STATUS = "finishAuditStatus";
	/**
	 * 三方商户操作记录 操作类型
	 */
    public static final String THIRD_PAYMENT_CONFIG_OPERATE_TYPE = "thirdPaymentConfigOperateType";
	
	/**
	 * 第三方商户号 支付通道
	 */
	public static final String THIRD_PAYMENT_CHANNEL = "thirdPaymentChannel";
	
	/**
	 * 充值商户支付类型枚举
	 */
	public static final String THIRD_PAYMENT_TYPE = "thirdPaymentType";

    /************************************************正则表达式*********************************************/

    /**
     * 校验 时间格式yyyy-MM-dd
     */
    public static final String REG_YYYY_MM_DD = "^((([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29))$";

    /**
     * 校验 时间格式yyyy-MM
     */
    public static final String REG_YYYY_MM = "^\\d{4}(\\-|\\/|\\.)\\d{2,2}$";

    /**
     * 32位数字和字母组合校验
     */
    public static final String REG_32 = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{32}$";


    /**
     * IP格式
     */
    public final static String REG_IP = "^((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})(\\.((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})){3}$";
    /**
     * 时间格式    YYYY_MM_DD_HH_MM_SS
     */
    public static final String REG_YYYY_MM_DD_HH_MM_SS = "^(?:19|20)[0-9][0-9]-(?:(?:0[1-9])|(?:1[0-2]))-(?:(?:[0-2][1-9])|(?:[1-3][0-1])) (?:(?:[0-2][0-3])|(?:[0-1][0-9])):[0-5][0-9]:[0-5][0-9]$";
    /**
     * 时间格式    YYYYMMDD
     */
    public static final String REG_YYYYMMDD = "((\\d{3}[1-9]|\\d{2}[1-9]\\d|\\d[1-9]\\d{2}|[1-9]\\d{3})(((0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|((0[469]|11)(0[1-9]|[12]\\d|30))|(02(0[1-9]|[1]\\d|2[0-8]))))|(((\\d{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229)";

    /**
     * 数字校验 只能是6到20位数字
     */
    public static final String REG_NUM_6_20 = "^\\d{6,20}$";

    /**
     * 数字校验 只能是1到3位数字
     */
    public static final String REG_NUM_0_2 = "^[1-3]\\d*$";

    /**
     * 数字校验 只能是1到5位数字
     */
    public static final String REG_NUM_0_5 = "^[1-5]\\d*$";

    /**
     * 数字效验 只能输出数字和小数点后2位
     */
    public static final String REG_NUM_DECIMAL ="^([1-9][0-9]*)+(\\.[0-9]{1,2})?$";

    /**
     * 数字效验 零和非零开头的正数
     */
    public static final String REG_NUM_ZERO = "^(0|[1-9][0-9]*)$";
	/**
	 * 数字效验 8位正整数
	 */
    public static final String REG_POSITIVE_INTEGER_8 = "^([1-9][0-9]{0,7})$";
	/**
	 * 2~10位 数字 + 字母 至少有1个字母
	 */
    public static final String REG_NUM_ALPHABET_2_11 = "^(?=.*[a-zA-Z])[a-zA-Z0-9.@]{2,10}$";
	/**
	 * 20-20位数字、字母、中文
	 */
	public static final String REG_NUM_ALPHABET_CN_2_20 = "^[a-zA-Z0-9_\\u4e00-\\u9fa5]{2,20}$";
	/**
	 * 0或者1的 数字
	 */
	public static final String REG_NUM_0_1 = "^[0-1]*$";
    /**
     * 账号 4-11位，最少1个字母+数字组合，首位字母
     */
    public static final String REG_4_11 = "^[A-Za-z]{1}(?=(.*[a-zA-Z]){0,})(?=(.*[0-9]){1,})[0-9A-Za-z]{3,10}$";

    public static final String REG_EMAIL = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";

    /**
     * 只能输入数字在1-99之间，保留一位小数
     */
    public static final String REG_100_1 = "^[1-9]\\d?(\\.\\d)?$";

    /**
     * 首页弹窗-- 查询时间类型[0:开启时间，1：结束时间]
     */
    public static final String POPUP_TIMETYPEID = "popupTimeTypeId";

    /**
     * 首页弹窗-- 弹窗状态[0-下架中-已禁用 1-上架中-开启中]
     */
    public static final String POPUP_STATUS = "popupStatus";

    /**
     * 搜索热词-- 词条状态[0-已禁用 1-开启中]
     */
    public static final String SEARCHHOT_STATUS = "searchhotStatus";

    /**
     * 交流群配置列表-- 展示状态[0-已禁用 1-开启中]
     */
    public static final String CONNECT_STATUS = "connectStatus";

    /**
     * 分享域名管理-- 域名状态[0-已禁用 1-开启中]
     */
    public static final String SHAREDOMAIN_STATUS = "sharedomainStatus";

    /**
     * 系统->APP域名预埋配置-- 域名状态[0-停用 1-启用]
     */
    public static final String CONFIGDOMAIN_STATUS = "configdomainStatus";

    /**
     * 系统->APP域名预埋配置-- 域名类型[1-activity，2-member，3-launch，4-其他]
     */
    public static final String CONFIGDOMAIN_TYPE = "configdomainType";

    /**
     * 包网场馆列表
     */
    public static final String BW_VENUE_LIST = "bwVenueList";

    /**
     * 包网场馆类型列表
     */
    public static final String BW_VENUE_TYPE_LIST = "bwVenueTypeList";

    /**
     * 注单状态
     */
    public static final String BET_STATUS_TYPE = "betStatusType";

    /**
     * 金币使用记录购买类型枚举
     */
    public static final String JAV_COIN_BUY_TYPE_NAME = "coinBuyTypeName";

    /**
     * JAV会员人工加额审核 订单状态
     */
    public static final String JAV_PATCH_ADJUST_STATUS = "javPatchAdjustStatus";

    /**
     * JAV资产类型枚举
     */
    public static final String JAV_ACCOUNT_TYPE = "javAccountType";

    /**
     * jav会员人工加减额调整类型
     */
    public static final String JAV_MEMBER_ADJUST_TYPE = "javMemberAdjustType";

    /**
     * jav会员金币充值订单状态
     */
    public static final String JAV_DEPOSIT_ORDER_STATUS = "javDepositOrderStatus";

    /**
     * jav会员金币充值订单客户端状态
     */
    public static final String JAV_DEPOSIT_ORDER_APP_STATUS = "javDepositOrderAppStatus";

    /**
     * jav会员金币充值订单支付类型
     */
    public static final String JAV_TY_PAY_TYPE = "javTyPayType";

    /**
     * jav会员账变业务类型
     */
    public static final String JAV_BIZ_TYPE = "javBizType";

    /**
     * jav会员账变类型
     */
    public static final String JAV_CHANGE_TYPE = "javChangeType";

    /**
     * 账变收支类型
     */
    public static final String TRANS_TYPE = "transType";

    /**
     * 领取方式
     */
    public static final String RECEIVE_TYPE = "receiveType";

    /**
     * 活动类型
     */
    public static final String ACTIVITY_TYPE = "activityType";

    /**
     * 活动类型-去掉VIP晋级优化
     */
    public static final String ACTIVITY_TYPE_TWO = "activityTypeTwo";

    /**
     * 第三方商户号状态
     */
    public static final String THIRD_MERCHANT_CONFIG_STATUS = "thirdMerchantConfigStatus";

    /**
     * 第三方商户号操作记录类型
     */
    public static final String THIRD_MERCHANT_RECORD_TYPE = "thirdMerchantRecordType";

    /**
     * 第三方商户号 支付类型枚举
     */
    public static final String THIRD_MERCHANT_PAYTYPE_NAME_TYPE = "thirdMerchantpayTypeNameType";

    /**
     * 第三方商户号 客户端支付状态
     */
    public static final String MEMBER_STATUS_ENUM = "memberStatusEnum";

    /**
     * 通用上下架状态：【0-已禁用，1-开启中】
     */
    public static final String COMMON_ONOFF = "commonOnOff";

    /**
     * Banner类型：【1:发现页,2:搜索,3:搜索文本,4:列表Banner,5:充值大厅,6:我的,7:官方信息】
     */
    public static final String BANNER_TYPE = "bannerType";

    /**
     * Banner跳转目标，【1:活动,2:外部地址,3:固定界面,4:不跳】
     */
    public static final String BANNER_LINK_TARGET = "bannerLinkTarget";

    /**
     * Banner固定界面，【1:首页-综合,2:首页-VIP区,3:首页-高端,4:首页-赔付,5:首页-楼凤,6:首页-茶友分享,7:我的,8:充值大厅,9:活动专区】
     */
    public static final String BANNER_APP_LOCATION = "bannerAppLocation";

    /**
     * 搜索热词，【1:自定义热词,2:佳丽标签,3:服务项目】
     */
    public static final String SEARCHHOT_TYPE = "searchHotType";

    /**
     * 账变类型
     */
    public static final String CHANGE_TYPE = "changeType";

    /**
     * 业务类型
     */
    public static final String BIZ_TYPE = "bizType";

    /**
     * 业务类型
     */
    public static final String CBD_ACCOUNT_TYPE = "CbdAccountType";

    /**
     * 活动类型
     */
    public static final String CBD_ACTIVITY_GRADE = "cbdActivityGrade";

    /**
     * 是否
     */
    public static final String CBD_YES_OR_NO = "cbdYesOrNo";

    /**
     * 状态
     */
    public static final String CBD_ON_OFF = "onOff";

    /**
     * 登录记录状态类型
     */
    public static final String LOGIN_STATUS_TYPE = "loginStatusType";


    /**
     * 活动列表 模板类型
     */
    public static final String CBD_ACTIVITY_TYPE = "activityType";

    /**
     * APP版本-终端[1:Android,2:IOS]
     */
    public static final String APP_VERSION_CLIENT_TYPE = "appVersionClientType";

    /**
     * 福利类型
     */
    public static final String WELFARE_TYPE = "welfareType";

    /**
     * 奖励类型
     */
    public static final String AWARD_TYPE = "awardType";

    /**
     * 返水状态（0待发放/1-已发放/2-发放失败）
     */
    public static final String REBATE_TYPE = "rebateType";

    /**
     * 红利发放类型
     */
    public static final String SEND_TYPE = "sendType";

    /**
     * 红利发送位置
     */
    public static final String SEND_POSITION = "sendPosition";

    /**
     * 用户登录状态[0:失败,1:成功]
     */
    public static final String USER_LOGIN_STATUS = "userLoginStatus";

    /**
     * APP版本-状态 [0:待开启,1:开启中]
     */
    public static final String APP_VERSION_STATUS = "appVersionStatus";

    /**
     * 代理推广域名类型
     */
    public static final String ENUM_PROXY_DOMAIN_TYPE_OPERATE = "enumProxyDomainTypeOperate";

    /**
     * APP版本-更新类型: [1:弱更新,2:强更新]
     */
    public static final String APP_VERSION_UPDATE_TYPE = "appVersionUpdateType";

    /**
     * 账号类型：[0:超级管理员，1：商户管理员，2：管理员，3：职员]
     */
    public static final String USER_TYPE = "userType";

    /**
     * 在职：[0:已离职，1：在职]
     */
    public static final String USER_ACTIVE = "userActive";


    /**
     * 订单来源
     */
    public static final String CLIENT_TYPE = "clientType";

    /**
     * 充值订单状态
     */
    public static final String DEPOSIT_ORDER_STATUS = "depositOrderStatus";

    /**
     * 充值订单客户端状态
     */
    public static final String DEPOSIT_ORDER_CLIENT_STATUS = "depositOrderClientStatus";

    /**
     * 会员账变业务类型
     */
    public static final String MEMBER_BIZ_TYPE = "memberBizType";

    /**
     * 会员账变类型
     */
    public static final String MEMBER_CHANGE_TYPE = "memberChangeType";

    /**
     * 提款订单状态
     */
    public static final String WITHDRAW_ORDER_STATUS = "withdrawOrderStatus";

    /**
     * 提款订单客户端状态
     */
    public static final String WITHDRAW_ORDER_CLIENT_STATUS = "withdrawOrderClientStatus";

    /**
     * 提款订单三方消息状态
     */
    public static final String WITHDRAW_THIRD_MESSAGE_STATUS = "withdrawThirdMessageStatus";

    /**
     *图片素材类型（ 1-综合推广图 2-体育推广图 3-真人推广图 4-电竞推广图 5-彩票推广图 6-棋牌推广图 7-活动推广图）
     */
    public static final String MATERIAL_PICTURE_TYPE = "materialPictureType";

    /**
     *图片尺寸（ 1-750*1334 2-1044*507 3-1080*1921 4-1210*588 5-1080*1920）
     */
    public static final String PICTURE_SIZE_TYPE = "pictureSizeType";

    /**
     * 风控类型 (1-风险会员，2-风险代理，3-风险银行卡，4-风险虚拟账号，5-风险IP，6-风险终端号 )
     */
    public static final String WIND_LEVEL_TYPE = "windLevelType";

    /**
     * 性别
     */
    public static final String GENDER_TYPE = "genderType";

    /**
     * 用户资料修改审核状态
     */
    public static final String UPD_MEMBER_AUDIT_STATUS = "updMemberAuditStatus";

    /**
     * 黑名单状态（0-禁用中 1-启用中）
     */
    public static final String BLACK_STATUS_TYPE = "blackStatusType";

    /**
     * 绑定状态（0-待绑定 1-绑定中）
     */
    public static final String BIND_STATUS_TYPE = "bindStatusType";

    /**
     * 虚拟币种
     */
    public static final String VIRTUAL_TYPE = "virtualType";

    /**
     * 虚拟协议
     */
    public static final String VIRTUAL_PROTOCOL_TYPE = "virtualProtocolType";

    /**
     * 域名管理类型
     */
    public static final String DOMAIN_NAME_TYPE = "domainNameType";

    /**
     *域名状态（0-已停用 1-已启用）
     */
    public static final String DOMAIN_STATUS_TYPE = "domainStatusType";

    /**
     * 参与次数（0-仅限1次、1-每周1次、2-每月1次）
     */
    public static final String PARTICIPATE_TYPE = "participateType";

    /**
     * 变更类型（0-升级，1-降级）
     */
    public static final String VIP_CHANGE_TYPE = "vipChangeType";


    /**
     * 会员人工加额 调整类型
     */
    public static final String MEMBER_PATCH_ADD_ADJUST_TYPE = "memberPatchAddAdjustType";
    /**
     * 会员人工扣除金额 调整类型
     */
    public static final String MEMBER_PATCH_SUB_ADJUST_TYPE = "memberPatchSubAdjustType";
    /**
     * 代理人工加额 调整类型
     */
    public static final String PROXY_PATCH_ADD_ADJUST_TYPE = "proxyPatchAddAdjustType";
    /**
     * 代理人工扣除金额 调整类型
     */
    public static final String PROXY_PATCH_SUB_ADJUST_TYPE = "proxyPatchSubAdjustType";
    /**
     * 会员人工加额审核 订单状态
     */
    public static final String PATCH_ADJUST_STATUS = "patchAdjustStatus";
    /**
     * 会员人工加额审核 订单状态 完成
     */
    public static final String PATCH_ADJUST_STATUS_FINISH = "patchAdjustStatusFinish";
    /**
     * 公告时效[0-全部 1-限时 2-永久]
     */
    public static final String ANNOUNCEMENT_AGING_TYPE = "announcementAgingType";

    /**
     * 活动配置的活动状态
     */
    public static final String ACTIVITY_CONFIG_ACTIVITY_STATUS = "activityConfigActivityStatus";

    /**
     * 契约类型
     */
    public static final String CONTRACT_TEMPLATE_TYPE = "contractTemplateType";

    /**
     * 契约模式
     */
    public static final String CONTRACT_TYPE = "contractType";

    /**
     * 契约生效状态
     */
    public static final String EFFECT_STATUS_TYPE = "effectStatusType";

    /**
     * 契约变更类型
     */
    public static final String CONTRACT_CHANGE_TYPE = "contractChangeType";

    /**
     * 契约状态类型
     */
    public static final String CONTRACT_STATUS_TYPE = "contractStatusType";

    /**
     * 会员反馈类型
     */
    public static final String MEMBER_FEED_BACK_TYPE = "memberFeedBackType";

    /**
     * 场馆上下分转账状态
     */
    public static final String MEMBER_TRANSFER_STATUS = "memberTransferStatus";

    /**
     * 活动对象
     */
    public static final String ACTIVITY_CONFIG_IN_TYPE_USER = "activityConfigInTypeUser";

    /**
     * 红利审核状态
     */
    public static final String ACTIVITY_BONUS_AUDIT_STATUS = "activityBonusOrderStatus";

    /**
     * 审核操作（0-结单查看 1-审核）
     */
    public static final String AUDIT_STEP_TYPE = "auditStepType";

    /**
     * 会员账户修改审核申请类型枚举
     */
    public static final String UPD_MEMBER_APPLY_TYPE = "updMemberApplyType";

    /**
     * 代理账户修改审核申请类型枚举
     */
    public static final String UPD_PROXY_APPLY_TYPE = "updProxyApplyType";

    /**
     * 代存类型
     */
    public static final String PROXY_ASSIST_DEPOSIT_TYPE = "proxyAssistDepositType";

    /**
     * 代理钱包
     */
    public static final String PROXY_WALLET_TYPE = "proxyWalletType";

    /**
     * 流水返点记录-客户端状态(0-未结算 2=待领取 3-领取成功 4-超时未领取 5-无返点 6-已取消)
     */
    public static final String PROXY_WATER_REBATE_STATUS_NEW = "proxyWaterRebateStatusNew";

    /**
     * 总代佣金记录-客户端状态
     */
    public static final String PROXY_PAYOUT_STATUS = "proxyPayoutStatus";

    /**
     * 非总代佣金记录-客户端状态
     */
    public static final String PROXY_SETTLEMENT_STATUS = "proxySettlementStatus";

    /**
     * 活动流水限制类型
     */
    public static final String TASK_TYPE = "taskType";

    /**
     *入口权限（0-关闭 1-开启）
     */
    public static final String ENTR_AUTHORITY_TYPE = "entrAuthorityType";

    /**
     * 代理契约模式
     */
    public static final String CONTRACT_MODULE = "contractModule";
    /**
     * 商户个性化模块 资金
     */
    public static final String PERSON_CONFIG_MODULE = "personConfigModule";

    /**
     * 商户个性化模块 基本
     */
    public static final String PERSON_CONFIG_FOUND_MODULE = "personConfigFoundModule";

    /**
     * 商户个性化模块 代理
     */
    public static final String PERSON_CONFIG_PROXY_MODULE = "personConfigProxyModule";
    /**
     * 商户个性化模块 会员
     */
    public static final String PERSON_CONFIG_MEMBER_MODULE = "personConfigMemberModule";

    /**
     * 支付厂商管理 出入款枚举
     */
    public static final String PAYMENT_MERCHANT_TYPE = "paymentMerchantType";
    /**
     * 系统消息配置模块 会员
     */
    public static final String SYS_MSG_MEMBER_MODULE = "sysMsgMemberModule";
    /**
     * 系统消息配置模块 代理
     */
    public static final String SYS_MSG_PROXY_MODULE = "sysMsgProxyModule";
    
}
