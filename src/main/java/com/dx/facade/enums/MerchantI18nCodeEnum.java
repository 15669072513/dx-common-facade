package com.dx.facade.enums;

import com.dx.enums.I18nEnum;

public enum MerchantI18nCodeEnum implements I18nEnum {

    CONTRACT_REFRESH_PAGE(310072),//CONTRACT_REFRESH_PAGE(310072, "不是最新的契约，请重新刷新页面")
    SUBMIT_FAILED_DATA_NOT_CHANGED(200018),//SUBMIT_FAILED_DATA_NOT_CHANGED(200018, "提交失败,数据未发生改变")
    PLEASE_CHOOSE_ANOTHER(200019),//PLEASE_CHOOSE_ANOTHER(200019,"该比例高于你自身最高比例，请移除或选择另一个复用源")
    PLEASE_CHECK_DATA_LOW_TO_HIGH(200023),//PLEASE_CHECK_DATA_LOW_TO_HIGH(200023,"请检查数据是否由低到高")
    PLEASE_CHECK_DATA_MIN_CONFIG(200024),//PLEASE_CHECK_DATA_MIN_CONFIG(200024,"请检查契约数据是否低于最低配置"),
    THE_PROXY_NOT_CONTRACT(200025),//THE_PROXY_NOT_CONTRACT(200025,"该代理未签订佣金契约"),
    THE_PROXY_NOT_RATE_CONTRACT(200026),//THE_PROXY_NOT_RATE_CONTRACT(200026,"该代理未签订返点契约"),
    ABNORMAL_PERMISSIONS_CANNOT_EMPTY(90036),//ABNORMAL_PERMISSIONS_CANNOT_EMPTY(90036, "权限不能为空")
    ROLE_MUST_BE_ASSIGNED(400),//ROLE_MUST_BE_ASSIGNED(400, "必须分配角色")
    PASSWORD_IS_INCONSISTENT(3004),//PASSWORD_IS_INCONSISTENT(3004, "密码不一致"),
    PARA_INVALID(10021),//PARA_INVALID(10021, "参数无效"),
    ROLE_CANNOT_BE_EMPTY(200117),//角色不能为空
    USER_NAME_LENGTH_LIMIT(200118),//用户名长度需要在2~11个字符之间
    NAME_LENGTH_LIMIT(200119),//姓名长度需要在2~20个字符之间
    VALUE_CANNOT_BE_EMPTY(500),//值不能为空!
    DICTIONARY_CODE_CANNOT_BE_EMPTY(500),//字典code不能为空！
    PLEASE_ENTER_A_POSITIVE_INTEGER(500),//请输入正整数，非0开头！如：正整数,正整数
    WRONG_FORMAT(500),//格式错误！请输入如：正整数,正整数
    FAIL_4_READ_UPLOAD_CONFIG_DOMAIN(90035),//读取Excel异常
    FAIL_4_SUFFIX_UPLOAD_CONFIG_DOMAIN(90034),//文件不是xlsx文档！
    FAIL_4_NULL_UPLOAD_CONFIG_DOMAIN(90032),//没有导入文件！
    FAIL_4_SIZE_UPLOAD_CONFIG_DOMAIN(90033),//文档大小超过5M！
    FAIL_4_DUPLICATE_KEY_CONFIG_DOMAIN(90031),//该域名已存在！
    VERSION_NUMBER_ALREADY_EXISTS(500),//版本号已存在！
    UPDATE_FAILED(500),//更新失败
    UPDATE_STATUS_IS_ABNORMAL(500),//更新状态异常
    DUPLICATE_CHANNEL_NAME(500),//通道名称重复
    DAILY_ACCUMULATIVE_WITHDRAWAL_AMOUNT(500),//每日累计提款金额 不能小于 大额标记金额
    PROXY_ACCOUNT_DOES_NOT_EXIST(500),//代理账号不存在
    ACCOUNT_NOT_PROXY_AUTHORITY(500),//该账号未开通代理权限
    ACCOUNT_PROXY_AUTHORITY_NOT_OPEN(500),//该代理入口权限未开启

    NO_CORRESPONDING_BUSINESS_TYPE(42136),//该walletCode 无对应的业务类型
    无对应的账变类型(42135),//该bizCode 无对应的账变类型
    大小倒置错误(42073),//%s 起始值不能大于截止值
    ADJUST_AMOUNT_LONG(42108),//输入金额不能大于999999999999.99
    EXCEL_EXPORT_MAX(10028),//"导出数据超出最大行限制范围"
    微服务调用异常(98881),//调用服务异常
    结束时间必须要大于开始时间(42082),//结束时间必须要大于开始时间
    UNSUPPORTED_WALLET_TYPE(500),//不支持的钱包类型
    红利金额不能为空(500),//红利金额不能为空
    红利金额不能小于(500),//红利金额不能小于0.01
    红利金额不能大于(500),//红利金额不能大于999999999999.99
    审核单ID为空(500),//审核单ID为空
    请选择商户(500),//请选择商户
    提交红利发放失败(500),//提交红利发放失败
    参数必传(500),//参数ids为必传
    活动配置查询失败(500),//活动配置查询失败
    CLIENT_REMARKS_CANNOT_BE_EMPTY(95555),//客户端备注不能为空
    ORDER_STATUS_IS_ABNORMAL(500),//订单状态异常
    ORDER_NUMBER_CANNOT_BE_EMPTY(500),//订单号不能为空
    转账时间起始值不能大于截止值(42073),//转账时间起始值不能大于截止值
    代存时间起始值不能大于截止值(42073),//代存时间起始值不能大于截止值
    申请时间起始值不能大于截止值(42073),//申请时间起始值不能大于截止值
    操作时间起始值不能大于截止值(42073),//操作时间起始值不能大于截止值
    vip等级起始值不能大于截止值(42073),//vip等级起始值不能大于截止值
    金额不能为负数(42074),//金额不能为负数
    金额起始值不能大于截止值(42073),//金额起始值不能大于截止值
    金额输入超长(42108),//金额最多输入10个数字
    发放时间起始值不能大于截止值(42073),//发放时间起始值不能大于截止值
    ABNORMAL_MINIMUM_CONTRACT_RATIO(200017), // ABNORMAL_MINIMUM_CONTRACT_RATIO(200017,"查询最低契约比例异常"),
	时间格式错误(42052),//请正确输入时间格式：yyyy-MM-dd HH:mm:ss
	排序参数异常(91112),//请正确填写排序参数
	IP格式错误(42054),//请正确输入ip
	终端设备参数错误(42055),//终端设备参数错误
	终端设备号参数错误(42080),//请正确输入终端设备号
	风控类型参数错误(42058),//请正确输入风控类型
	账号类型错误(42053),//请正确输入账号类型
	账号格式错误(42071),//账号 4-11位，最少1个字母+数字组合，首位字母
	标签名称错误(42069),//标签名称请输入：2-20个字符
	归属地参数错误(42056),//输入归属地参数超出长度
	登录状态错误(42079),//请正确输入登录状态
	派彩方式错误(42096),//派彩方式 只能输入1-2的数字
	发放类型错误(42097),//发放类型 只能输入1-5的数字
	创建人错误(42068),//操作人请输入：2-12个字符
	备注信息超长(42081),//备注新增不超过50个字符
	代存订单状态错误(42105),//订单状态 只能输入0-2的数字
	代理转账订单状态错误(42106),//订单状态 只能输入0-2的数字
	USER_NAME_NOT_EXIST(10030),//账号不存在
	MEMBER_MOBILE_EXIST_SAME_NAME(100025),//手机号已注册会员
	邮箱参数错误(42066),//请正确填入邮箱地址
	姓名参数错误(42064),//姓名不能超过15个字符
	RPC_TRANSFER_MEMBER_ERROR(400),//RPC调用会员服务失败
	PASSWORD_LENGTH_ERROR(42030),//登陆密码介于6-32个字符
	PHONE_IS_ERROR(42167),//请输入有效号码
	VIP权益配置信息没有任何变更(10051),//VIP权益配置信息没有任何变更
	VIP权益配置等级0升级礼金默认值0且不允许被修改(10072),//VIP权益配置等级0升级礼金默认值0且不允许被修改
	VIP权益配置等级0生日礼金默认值0且不允许被修改(10073),//VIP权益配置等级0生日礼金默认值0且不允许被修改
	VIP权益配置等级0上半月红包默认值0且不允许被修改(10074),//VIP权益配置等级0上半月红包默认值0且不允许被修改
	VIP权益配置等级0下半月红包默认值0且不允许被修改(10075),//VIP权益配置等级0下半月红包默认值0且不允许被修改
	VIP权益配置等级0数据不存在(10076),//VIP权益配置等级0数据不存在
	VIP权益配置等级0存款额度默认值0且不允许被修改(10099),//VIP权益配置等级0存款额度默认值0且不允许被修改
	VIP权益配置等级0每日返水上限默认值0且不允许被修改(10102),//VIP权益配置等级0每日返水上限默认值0且不允许被修改
	ADD_MEMBER_REMARK_FAIL(100021),//会员备注添加失败
	凌晨0点到凌晨6点不允许修改(10061),//凌晨0点到凌晨6点不允许修改
	VIP_PROMOTION_NO_UPDATE(10061),//VIP晋级优惠配置信息没有任何变更
	VIP_PROMOTION_ERROR(10060),//VIP晋级配置更新错误
	POLICYTYPE_EXIST(500),//政策类型已存在
	REBATE_RATIO_REPEAT(500),//比例存在重复
	POLICYTYPE_IS_USED(500),//该政策已投入使用，禁止删除
	TEMPLATE_NAME_EXIST(500),//模板名称已存在
	PIG_SIZE_IN_5M(50004),//仅支持png，jpg,图片尺寸，图片大小不超过5M
	CURRENT_PROXY_NOT_EXIST(10035),//转代上级代理不能为空
	CURRENT_PROXY_EQUES(10039),//转代会员当前代理与转入代理不能相同
	TRANSFER_PROXY_NOT_EXIST(10036),//转入代理不存在
    ACCOUNT_TYPE_NOT_NULL(10079),//账号类型不能为空
	不能转代到当前代理(42085),//转入代理不能是当前代理
	USERNAME_NOT_PROXY(42155),//该账号不是代理无法转入会员
	NO_PARENT_PROXY_DONT_TRANSFER(42159),//无上级代理,无法转代申请
	USERNAME_IS_PROXY(42156),//该账号是代理不支持转代
	CURRENT_PROXY_NAME_ERROR(42160),//当前上级代理参数错误
	MEMBER_PROXY_TYPE_DIFF_TRANSFER(42051),//会员账号类型与代理不符，无法转入
	RPC_TRANSFER_PROXY_ERROR(500),//RPC调用代理服务失败
	LEVEL_NAME_REPEAT(500),//层级名称不能重复
	GET_PROXY_LEVEL_CONF_LIST_ERROR(42142),//获取代理层级名称下拉框异常
	TRY_AGAIN_EXPORT(100009),//你的操作太频繁，请%s秒后再试！
    MERCHANT_NO_VENUE(6005), //商户无场馆配置信息
    MERCHANT_NO_DATA(20006), //无相关数据
    MERCHANT_CONFIG_EXIST(180013),//该商户已配置
    MERCHANT_NOT_MATCH(180015),//初代账号与你所设置的商户不符
    PROXY_NOT_TOP(180016),//初代账号不是总代
    MERCHANT_EDIT_NOT_SAME(180017),//编辑的信息前后一致,修改失败
    WIND_INFO_NOT_EXIST(10078),// 风控主体信息不能为空
    MERCHANT_ID_NULL(42023),  //商户ID不能为空
    MERCHANT_NOT_EXIST(42022), //商户ID不存在
    SERVICE_ERROR(100007), // 系统处理失败
    NO_NULL_DESCRIPTION_DESC(200039), // 风控层级描述不能为空!
    NO_NULL_WIND_NAME_DESC(200038), // 风控层级不能为空!
    SAME_WIND_NAME_DESC(200141), // 风控层级已存在!
    WIND_CONTROL_RECORD_NULL(42024), // 该笔风控层级记录不存在
    WIND_CONTROL_NO_UPDATE(200008), // 未找到风控相关详细信息，不能进行修改!
    WIND_EDIT_SAME(42072), // 编辑前后信息一致，请重新选择
    BANK_CARD_NOT_EXIST(42158), // 银行卡号不存在
    VIRTURAL_ADDR_NOT_EXIST(42157), // 虚拟币账号不存在
    IP_ADDR_ERROR(42054) , // 请正确输入ip
    WIND_EDIT_ERROR(31122), // 风控编辑失败
    WIND_COUNT_ERROR(31123), // 统计代理下级被风控数
	EXPORT_ERROR(500),//导表失败
	SUCCESS(200),//成功
	FAIL(500),//程序失败
    保级流水小于升级流水(80004),//保级流水配置需小于升级所需流水
    会员只能给会员现金加额(8007),//会员类型只能操作会员额度钱包
    代理只能给代理现金加额(8008),//代理类型只能操作代理额度钱包或者代理佣金钱包
    输入的会员账号错误(42120),//输入的会员账号错误
    输入的代理账号错误(42152),//输入的代理账号错误
    活动类型不匹配(8009),//活动类型不匹配
    暂时无此活动(80010),//暂时无此活动
    调整类型为会员福利时福利类型不能为空(80011),//调整类型为会员福利时福利类型不能为空
    调整类型为会员福利时奖励类型不能为空(80012),//调整类型为会员福利时奖励类型不能为空
    福利类型为会员vip奖励(80013),//福利类型为会员vip奖励时奖励类型为：上半月红包，下半月红包，升级礼金，生日礼金
    人工扣款金额不能小于零(10029),//人工扣款金额不能小于零
    人工加款金额不能小于零(10031),//人工加款金额不能小于零
	
	
	ACTIVITY_COUNT_ERROR(200019),// 已存在7个活动页签，无法新增
	ACTIVITY_TAB_IS_DATA_DEL(800010),// 该页签下存在开启活动，不能进行删除
	ACTIVITY_TAB_IS_DATA_DISABLE(800011),// 该页签下存在开启活动，不能进行停用
	启用中的状态无法删除(8012),// 启用中的状态无法删除
	BANNER_IMG_COUNT_TEN(800012),// 客户端轮播图最多可展示10张
	BANNER_SORT_CLIENT_TYPE_SAME(800009),// 相同顺序的轮播图只能开启1张
	GAME_CODE_EMPTY(42170),// gameCode不能为空
	DOWN_TIME_EXISTS(800006),// 下架时间不能为空
	GAME_TARGET_EXISTS(800007),// 游戏或URL链接不能为空
	ABLE_STATUS(800008),// 启用中的状态无法修改
	GAME_ID_NOT_NULL(41180),// 场馆ID或者代码不能为空
	SAME_CLIENT_TYPE_ONE_DATA(800009),// 同一个显示终端的数据只能开启一条
	MEMBER_DOMAIN_NAME_ALREADY_EXISTS(800006),// 域名已存在
	MEMBER_DOMAIN_NAME_LENTH_500(500),// 域名地址长度超过100！
	DOMAIN_DESC_LENTH_50(500),// 描述说明长度超过50！！
	INPUT_CURRENT_USERNAME_SAME(200016),// 输入的代理账号与当前一致
	SHARE_DOMAIN_NOT_NULL(800008),// 绑定失败，请先配置并开启活动分享域名
	MEMBER_DOMAIN_SETTING_FAIL(200015),// 会员活动域名配置-设置失败

    // 补充国际化
    CANT_ADD_OTHER_GAMES(11030), // 不能添加除电游类以外的游戏
    MERCHANT_LEVEL_CONFIG_EXIST(200013), // 商户层级已存在，请重新输入
    FIRST_DEPOSIT_APPLY_QUERY_FAIL(200014), // 首存活动申请记录分页查询异常
    DISPLAY_APPLY_QUERY_FAIL(200015), // 纯展示页活动申请记录分页查询异常
    ACTIVITY_DATA_COUNT_QUERY_FAIL(200016), // 活动数据统计查询异常
    DATA_NOT_EXISTS(100010), // 无相关数据
    DATE_RANGE_TO_31_DAY(200017), // 请缩小搜索范围至31天
    DATE_RANGE_TO_92_DAY(200018), // 请缩小搜索范围至92天
    DATE_RANGE_TO_12_MONTH(200019), // 请缩小搜索范围至12个月
    ENABLED_STATUS_CANT_DELETE(8012), // 启用中的状态无法删除
    MERCHANT_LEVEL_NOT_EXIST(200004), // 商户层级不存在
    PARENT_MERCHANT_IS_NULL(200002), // 上级商户 不能为空
    MERCHANT_CODE_REPEAT(200005),   // 该商户编码已存在，请更换
    NAME_REPEAT(200006),    // 该名称已存在，请更换
    PARENT_MERCHANT_LEVEL_ERROR(200014), // 上级商户的层级不正确
    MERCHANT_ADD_RECORD_NOT_EXIST(200007), // 该新增商户审核单不存在
    MERCHANT_ADD_RECORD_LOCK_UN_PROCESS(200008), // 你有锁定的订单未处理，锁单失败
    MERCHANT_ADD_RECORD_LOCK_ALREADY(200009), // 该订单已%s,操作失败
    MERCHANT_ADD_RECORD_LOCKED_OTHERS(200010), // 该订单被其他人锁定,操作失败
    LANGUAGE_ERROR(200018), // 不支持该语言
    NEW_MERCHANT_ADD_ERROR(200020), // 新增商户失败
    MERCHANT_CLIENT_NAME_EXIT(8019), // 商户名称[%s]已存在
    MERCHANT_NAME_ERROR(200021), // 商户名称 仅支持输入汉字、英文字母、数字 2~20个字符
    MERCHANT_STATUS_ERROR(200016), // 商户状态 只能是0或者1的数字
    EDIT_COMMON(200015), // 编辑的信息前后一致，修改失败
    REMARK_BEYOND_SIZE(200017), // 备注 长度2~500个字符
    MERCHANT_LEVEL_CONFIG_NOT_EXIST(200012), // 该商户层级配置不存在
    SMS_CHANNEL_NOT_EXIST(200021), // 短信渠道不存在，或已删除
    MERCHANT_ADD_RECORD_UNLOCK(200011), // 该订单未锁定,操作失败
    该商户配置不存在(200022),//该商户配置不存在
    MEMBER_LABLE_PARAM_ERROR(200023), //标签参数错误
    MEMBER_GENDER_PARAM_ERROR(200024), //会员性别参数错误
    MEMBER_BIRTH_PARAM_ERROR(200033),//会员出生日期参数错误(请选择出生日期)
	TOTALDEPOSIT_OUT_RANGE(200009),// 升级条件累计存款不能超过10位数
	VIP等级配置信息没有任何变更(10071),// VIP等级配置信息没有任何变更
	TATALVALIDWATER_OUT_RANGE(200010),// 升级条件累计有效流水不能超过10位数
	RELEGATIONWATER_OUT_RANGE(200011),// 保级流水不能超过10位数
	RELEGATIONVALIDPERIOD_OUT_RANGE(200012),// 保级有效期不能超过4位数
	DOES_NOT_EXIST(200022),// 不存在
	COMMISSION_RATE(200020),// 佣金比例
	保级有效期大于10天(7001),// 保级有效期需要大于10天
	保级有效期不能配置为0(7002),// 保级有效期不能配置为0
    PAYMENT_MERCHANT_REPEAT(200066),//"支付厂商已存在，请更换"
    PROXY_NAME_NOT_EXIST(10054),//代理账号不存在
    DOMAIN_AUTHORITY_CLOSE(55794),//, "代理账号入口权限未开启，无法绑定！"
    DOMAIN_CONTRACT_MODEL_CLOSE(55795),//, "代理账号无契约，无法绑定！"
    DOMAIN_NAME_ALREADY_EXISTS(800005),//, "该域名已存在"
    VIP返水配置信息没有任何变更(400),//VIP返水配置信息没有任何变更
    INFO_SAME_CANT_EDIT(42163), //"编辑信息与当前一致，修改无效"
    NO_GENERAL_PROXY_CANT_EDIT(42162), //该账号不是总代，无法修改
    HAVE_DATA_CANT_EDIT(42164), //该代理线层级上限第%s层已产生数据，禁止减少调整层级
	USER_NAME_NOT_NULL(400),// 账号不能为空
	DUPLICATE_USER_NAME(400),// 请勿输入重复的会员账号
    MERCHANT_ACTIVITY_NAME_EXSIT(200067),//,"活动页签名称已存在"
    BANK_NAME_BEEN_USED(200067),//该银行名称已被使用，请先移除已绑定的支付渠道
    PAYMENT_CHANNEL_BEEN_USED(200068),//该支付渠道已被使用，请先移除已绑定的商户
    ACTIVITY_MEMBER_NOT_TOP(90012),//该账号不是总代
    ACTIVITY_MEMBER_NOT_PROXY(90013),//该账号不是代理
    ACTIVITY_MEMBER_NOT_EXSIT(90014),//该账号不存在
    ACTIVITY_MEMBER_IN_DATA(90015),//该账号已在名单内
	;
    private int code;

    MerchantI18nCodeEnum(Integer code){
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
