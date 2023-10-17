package com.dx.facade.enums;

import com.dx.facade.common.utils.ResultJson;
import com.dx.util.GsonUtil;

/**
 * 公共响应码信息
 *
 * @author Nicolas
 * @version 1.0.0
 * @date 2020/10/12 16:05
 */
public enum DXManagerCodeMsgEnum {


    /**
     * 错误码以四位数字表示
     * 风控相关-1开头
     * 会员相关以1开头
     * 商户相关以2开头
     * 账户相关以30开头
     * 账变相关以35开头
     */
    SUCCESS(200, "操作成功"),
    缺少参数(1000, "缺少参数"),
    排序参数异常(91112,"请正确填写排序参数"),
    参数错误(95555, "系统错误，请联系客服"),
    微服务调用异常(98881, "调用服务异常"),
    其他未知异常(99999, "其他系统错误"),
    FAIL(100007, "系统处理失败"),
    
    PARAMETER_EXCEPTION(100000, "参数异常"),
    DATA_PRIMARY_KEY_IS_NULL(100004, "数据主键id不能为空"),
    PARA_INVALID(100006, "参数无效"),
    TRY_AGAIN_EXPORT(100009,"你的操作太频繁，请%s秒后再试！"),
    DATA_NOT_EXISTS(100010,"无相关数据"),
    EXPORT_ERROR(100014,"导出异常"),
    DOWNLOAD_TEMPLATE_ERROR(100015,"下载模板异常"),


    // 会员相关以1开头
    USER_ID_NOT_NULL(100013,"会员ID不能为空"),
    USER_ID_NOT_EXIST(100014,"会员ID不存在"),
    ADD_MEMBER_REMARK_FAIL(100021,"会员备注添加失败"),
    MEMBER_MOBILE_EXIST_SAME_NAME(100025,"手机号已注册会员"),
    USER_NAME_IS_NULL(10029,"用户名为空"),
    USER_NAME_NOT_EXIST(10030,"账号不存在"),
    PROXY_NOT_EXIST(10032,"代理不存在"),
    CURRENT_PROXY_NOT_EXIST(10035,"转代上级代理不能为空"),
    TRANSFER_PROXY_NOT_EXIST(10036,"转入代理不存在"),
    CURRENT_PROXY_EQUES(10039,"转代会员当前代理与转入代理不能相同"),
    VIP权益配置信息没有任何变更(10051,"VIP权益配置信息没有任何变更"),
    
    PROXY_NAME_NOT_EXIST(10054,"代理账号不存在"),
    凌晨0点到凌晨6点不允许修改(10061, "凌晨0点到凌晨6点不允许修改"),

    公告配置id不存在(10053, "公告配置id不存在"),
    开启状态不能删除(10054, "开启状态不能删除"),
    活动通知配置id不存在(10055, "活动通知配置id不存在"),
    类型不对不能撤回(10056, "类型不对不能撤回"),
    会员不存在(10057, "会员不存在"),


    VIP_PROMOTION_ERROR(10060,"VIP晋级配置更新错误"),
    VIP_PROMOTION_NO_UPDATE(10061,"VIP晋级优惠配置信息没有任何变更"),
    分类ID不存在(10062,"该游戏分类不存在"),

    会员提款设置添加失败(10063, "会员提款设置添加失败"),
    会员提款设置不存在(10064, "会员提款设置不存在"),
    会员提款设置VIP等级0不允许被关闭(10065, "会员提款设置VIP等级0不允许被关闭"),
    会员提款设置VIP等级不允许被修改(10066, "会员提款设置VIP等级不允许被修改"),
    会员提款设置修改失败(10067, "会员提款设置修改失败"),

    代理提款设置添加失败(10068, "代理提款设置添加失败"),
    代理提款设置删除失败(10069, "代理提款设置删除失败"),
    代理提款设置不存在(10069, "代理提款设置不存在"),
    代理提款设置修改失败(10070, "代理提款设置修改失败"),
    VIP等级配置信息没有任何变更(10071,"VIP等级配置信息没有任何变更"),

    VIP权益配置等级0升级礼金默认值0且不允许被修改(10072, "VIP权益配置等级0升级礼金默认值0且不允许被修改"),
    VIP权益配置等级0生日礼金默认值0且不允许被修改(10073, "VIP权益配置等级0生日礼金默认值0且不允许被修改"),
    VIP权益配置等级0上半月红包默认值0且不允许被修改(10074, "VIP权益配置等级0上半月红包默认值0且不允许被修改"),
    VIP权益配置等级0下半月红包默认值0且不允许被修改(10075, "VIP权益配置等级0下半月红包默认值0且不允许被修改"),
    VIP权益配置等级0数据不存在(10076, "VIP权益配置等级0数据不存在"),
	VIP权益配置等级0存款额度默认值0且不允许被修改(10099, "VIP权益配置等级0存款额度默认值0且不允许被修改"),
	VIP权益配置等级0每日返水上限默认值0且不允许被修改(10102, "VIP权益配置等级0每日返水上限默认值0且不允许被修改"),
	
    PASSWORD_IS_EXIST(10077, "原密码与新密码不能一致"),
    WIND_CONTROL_INFO(10078, "风控主体信息不能为空"),
    ACCOUNT_TYPE_NOT_NULL(10079,"账号类型不能为空"),

    HEADER_VALUE_ERROR(93333, "header 异常"),
    //商户相关以2开头,
	MERCHANT_NOT_EXISTS(200001, "找不到对应的商户"),
    PARENT_MERCHANT_IS_NULL(200002, "上级商户 不能为空"),
    INVALID_MERCHANT(200003,"此商户被禁用"),
    MERCHANT_LEVEL_NOT_EXIST(200004,"商户层级不存在"),
    MERCHANT_CODE_REPEAT(200005,"该商户编码已存在，请更换"),
    NAME_REPEAT(200006,"该名称已存在，请更换"),
    MERCHANT_ADD_RECORD_NOT_EXIST(200007,"该新增商户审核单不存在"),
    MERCHANT_ADD_RECORD_LOCK_UN_PROCESS(200008,"你有锁定的订单未处理，锁单失败"),
    MERCHANT_ADD_RECORD_LOCK_ALREADY(200009,"该订单已%s,操作失败"),
    MERCHANT_ADD_RECORD_LOCKED_OTHERS(200010,"该订单被其他人锁定,操作失败"),
    MERCHANT_ADD_RECORD_UNLOCK(200011,"该订单未锁定,操作失败"),
	MERCHANT_LEVEL_CONFIG_NOT_EXIST(200012,"该商户层级配置不存在"),
	MERCHANT_LEVEL_CONFIG_EXIST(200013,"商户层级已存在，请重新输入"),
	PARENT_MERCHANT_LEVEL_ERROR(200014,"上级商户的层级不正确"),
    EDIT_COMMON(200015,"编辑的信息前后一致，修改失败"),
    MERCHANT_STATUS_ERROR(200016,"商户状态 只能是0或者1的数字"),
    REMARK_BEYOND_SIZE(200017,"备注 长度2~500个字符"),
	LANGUAGE_ERROR(200018,"不支持该语言"),
    ACTIVITY_COUNT_ERROR(200019,"已存在7个活动页签，无法新增"),
	NEW_MERCHANT_ADD_ERROR(200020,"新增商户失败"),
    SMS_CHANNEL_NOT_EXIST(200021,"短信渠道不存在，或已删除"),
	MERCHANT_NAME_ERROR(200021,"商户名称 仅支持输入汉字、英文字母、数字 2~20个字符"),
	INVALID_MERCHANT_GAME(200007,"此游戏被商户禁用"),
	GET_SPLIT_MERCHANT_FAIL(200002, "获取游戏商户信息失败"),
	GAME_MERCHANT_NOT_EXISTS(200003, "找不到对应的游戏商户"),
	WHITELIST_NOT_EXITS(200004,"商户白名单没有设置"),
	GET_WHITELIST_FAIL(200005,"获取白名单失败"),
	NO_PERMISSION_RESET_PASSWORD(200006,"无权重置密码"),
	PARENT_NOT_EXISTS(200007, "找不到上级代理"),
	WIND_CONTROL_NO_UPDATE(200008, "未找到风控相关详细信息，不能进行修改!"),
	NO_NULL_NAME_DESC(200038, "风控层级不能为空!"),
    SAME_WIND_NAME_DESC(200141, "风控层级已存在!"),
	NO_NULL_DESCRIPTION_DESC(200039, "风控层级描述不能为空!"),
	REMAR_LENGTH_DESC(200140, "备注长度在2-50个字符之间"),
	TOTALDEPOSIT_OUT_RANGE(200009, "升级条件累计存款不能超过10位数"),
	TATALVALIDWATER_OUT_RANGE(200010, "升级条件累计有效流水不能超过10位数"),
	RELEGATIONWATER_OUT_RANGE(200011, "保级流水不能超过10位数"),
	RELEGATIONVALIDPERIOD_OUT_RANGE(200012, "保级有效期不能超过4位数"),
	MERCHANT_VIP_GRADE_NOT_EXTIS(200013, "该商户的会员vip等级配置不存在"),
	PROXY_NO_SIGN(200014, "代理账号未签订任何契约"),
	MEMBER_DOMAIN_SETTING_FAIL(200015, "会员活动域名配置-设置失败"),
	INPUT_CURRENT_USERNAME_SAME(200016, "输入的代理账号与当前一致"),
    ABNORMAL_MINIMUM_CONTRACT_RATIO(200017,"查询最低契约比例异常"),
    SUBMIT_FAILED_DATA_NOT_CHANGED(200018, "提交失败,数据未发生改变"),
    PLEASE_CHOOSE_ANOTHER(200019,"该比例高于你自身最高比例，请移除或选择另一个复用源"),
    COMMISSION_RATE(200020,"佣金比例"),
    REBATE_RATIO(200021,"返点比例"),
    DOES_NOT_EXIST(200022,"%不存在"),
    PLEASE_CHECK_DATA_LOW_TO_HIGH(200023,"请检查数据是否由低到高"),
    PLEASE_CHECK_DATA_MIN_CONFIG(200024,"请检查契约数据是否低于最低配置"),
    THE_PROXY_NOT_CONTRACT(200025,"该代理未签订佣金契约"),
    THE_PROXY_NOT_RATE_CONTRACT(200026,"该代理未签订返点契约"),

    //
    // 账户相关以30开头
    MEMBER_ACCOUNT_NOT_EXISTS(30001, "会员钱包账户不存在"),
    ACCOUNT_NOT_ENOUGH(30002, "钱包金额少于下分金额"),
    AMOUNT_NOT_NULL(30003, "金额不能为空"),
    GAME_BALANCE_FAIL(35001, "获取场馆余额失败"),
    GAME_DEPOSIT_FAIL(35002, "场馆内上分失败"),
    GAME_WITHDRAW_FAIL(35003, "场馆内下分失败"),
    GAME_LOGIN_FAIL(35004, "游戏登录请求失败"),
    GAME_REGISTER_FAIL(35005, "游戏注册请求失败"),
    MEMBER_BALANCE_FAIL(35006, "获取统一会员余额失败"),
    GAME_UPDATE_AMOUNT_FAIL(35007, "修改余额失败"),
    GAME_TRANSFER_INSET_FAIL(35008,"插入帐变记录失败"),
    GAME_TRANSFER_NOT_EXITS(35009,"场馆上下分记录不存在"),
    ORDER_ABSENT(34020,"查询订单状态，无此订单号"),
    GAME_CODE_NOT_NULL(31120, "游戏代码不能为空"),
    TRANSFER_NOT_NULL(31121,"交易单号不能为空"),
    风控编辑失败(31122,"风控编辑失败"),
	
	//参数验证相关  以4开头


    TIMESTAMP_FORMAT_ERROR(45050, "时间戳应是13位数整形"),
    DEPOSIT_ILLEGAL_ACCOUNT(42070,"上分失败，额度小于0"),
    AMOUNT_ERROR(43000, "输入金额异常，应大于0"),
    TRADE_NO_LENGTH_ERROR(43050, "交易单号超出长度范围：50个字符"),
    NICK_NAME_NOT_NULL(41170, "玩家昵称不能为空"),
    GAME_ID_NOT_NULL(41180, "场馆ID或者代码不能为空"),
    MERCHANT_CODE_NOT_NULL(41200, "商户代码不能为空"),
    ORDER_NO_NOT_NULL(41220, "订单号不能为空"),
    ACCOUNT_LENGTH_ERROR(42020, "游戏账号长度应为：6-15字符串"),
    GAME_ASSORT_SORT_ERROR(42021, "分类顺序不能与其他子游戏相同"),
    MERCHANT_ID_ERROR(42022, "商户ID不存在"),
    MERCHANT_ID_NULL(42023, "商户ID不能为空"),
    WIND_CONTROL_RECORD_NULL(42024, "该笔风控层级记录不存在"),
    ACCOUNT_NUMBER_NOT_SUB(800003, "输入账号不是您的下级"),
    PASSWORD_LENGTH_ERROR(42030, "登陆密码介于6-32个字符"),
    ACCOUNT_TYPE_ERROR(42040, "账号类型介于0或1"),
    BET_STATUS_ERROR(42050, "账号投注状态介于0或1"),
    ACCOUNT_SPECIAL_CHAR(42060, "账号存在特殊字符"),
    PASSWORD_SPECIAL_CHAR(42070, "密码存在特殊字符"),
    NICK_NAME_ERROR(42100, "昵称介于4-12个字符"),
    NICK_NAME_SPECIAL_CHAR(42110, "昵称存在特殊字符"),
    ACCOUNT_NOT_NULL(42120, "游戏账号不能为空"),
    PASSWORD_NOT_NULL(42130, "登陆密码不能为空"),
    AGENT_DOMAIN_NOT_EXIST(45350, "游戏域名为空或不存在"),
    DEVICE_TYPE_NOT_NULL(41130, "设备类型不能为空"),
    ORDER_REPEATED(42050,"操作失败，订单号已存在"),
    MEMBER_PROXY_TYPE_DIFF_TRANSFER(42051,"会员账号类型与代理不符，无法转入"),
    MEMBER_PROXY_TYPE_DIFF_OVER(42051,"会员账号类型与代理不符，无法绑定"),
    时间格式错误(42052,"请正确输入时间格式：yyyy-MM-dd HH:mm:ss"),
    账号类型错误(42053,"请正确输入账号类型"),
    IP格式错误(42054,"请正确输入ip"),
    终端设备参数错误(42055,"终端设备参数错误"),
    归属地参数错误(42056,"输入归属地参数超出长度"),
    风控类型参数不能为空(42057,"风控类型参数不能为空"),
    风控类型参数错误(42058,"请正确输入风控类型"),
    图片不能为空(42059,"图片参数不能为空"),
    审核状态参数错误(42060,"请正确输入审核状态"),
    申请人错误(42061,"操作人 数字+字符的12位字符"),
    一审人错误(42062,"一审人参数格式错误"),
    性别参数错误(42063,"请正确输入性别参数"),
	姓名参数错误(42064,"姓名不能超过64个字符"),
	申请信息参数错误(42065,"申请信息不能超过50个字符"),
	邮箱参数错误(42066,"请正确填入邮箱地址"),
	id不能为空(42067,"id不能为空"),
	创建人错误(42068,"创建人请输入：2-12个字符"),
	标签名称错误(42069,"标签名称请输入：2-20个字符"),
	标签描述错误(42070,"标签描述请输入：2-500个字符"),
	账号格式错误(42071,"账号 4-11位，最少1个字母+数字组合，首位字母"),
	编辑前后信息一致(42072,"编辑前后信息一致，请重新选择"),
	大小倒置错误(42073,"%s 起始值不能大于截止值"),
	非负数错误(42074,"%s 不能为负数"),
	投注状态错误(42075,"请正确填写投注状态"),
	游戏平台错误(42076,"请正确填写游戏平台"),
	字符长度超过100(42077,"%s 字符长度不能超过100"),
	ID格式错误(42078,"%s 请正确输入6-20数字"),
	登录状态错误(42079,"请正确输入登录状态"),
	终端设备号参数错误(42080,"请正确输入终端设备号"),
	备注信息超长(42081,"备注新增不超过50个字符"),
    结束时间必须要大于开始时间(42082, "结束时间必须要大于开始时间"),
	锁单状态错误(42083, "请正确填入锁单状态"),
	分类顺序错误(42084, "分类顺序最大长度5个字符"),
	不能转代到当前代理(42085, "转入代理不能是当前代理"),
	游戏账号错误(42086, "游戏账号不能超过25个字符"),
	字符长度超过10(42087, "%s 字符长度不能超过10"),
	银行卡错误(42088, "请规范输入银行卡号"),
	字符长度超过6(42089, "%s 字符长度不能超过6"),
	操作类型错误(42090, "操作类型 只能输入0-1的数字"),
	会员账变类型错误(42091, "会员账变类型 只能输入1-22的数字"),
	会员业务类型错误(42092, "业务类型 只能输入1-13的数字"),
	会员收支类型错误(42093, "会员收支类型 只能输入1-2的数字"),
	字符长度超过3(42094, "%s 字符长度不能超过3"),
	账号状态错误(42095, "账号状态 只能输入1-4的数字"),
	派彩方式错误(42096, "派彩方式 只能输入1-2的数字"),
	发放类型错误(42097, "发放类型 只能输入1-5的数字"),
	订单状态错误(42098, "订单状态 只能输入1-3的数字"),
	支付类型错误(42099, "支付类型 参数错误,请联系管理员"),
	派彩订单状态错误(42100, "订单状态 只能输入1-2的数字"),
	审核订单状态错误(42101, "订单状态 只能输入8-13的数字"),
	人工加额审核订单状态错误(42102, "订单状态 只能输入5-7的数字"),
	代存类型错误(42103, "代存类型 只能输入1-2的数字"),
	调整类型错误(42104, "调整类型 只能输入1-4的数字"),
	代存订单状态错误(42105, "订单状态 只能输入0-2的数字"),
	代理转账订单状态错误(42106, "订单状态 只能输入0-2的数字"),
	代理提款订单状态错误(42107, "订单状态 只能输入1-12的数字"),
	金额输入超长(42108, "金额 最多输入10个数字"),
	字符长度超过60(42109, "%s 字符长度不能超过60"),
	VIP_ID参数错误(42110, "vipId 只能输入1-11"),
    该会员未绑定银行卡(42111, "该会员未绑定银行卡"),
	转账状态(42112, "转账状态 只能输入0-1"),
	钱包参数错误(42113, "%s 钱包不存在"),
	获取场馆名称失败(42114, "获取场馆名称失败"),
	排序集合参数不能为空(42115, "排序集合长度必须固定为10"),
	模块ID参数错误(42116, "模块ID 只能输入1-10"),
	字符长度2_10(42117, "%s 请输入2-10位字符"),
	字符长度2_100(42118, "%s 请输入2-100位字符"),
	模块名称参数错误(42119, "模块名称 请输入1-10的数字"),
    输入的会员账号错误(42120, "输入的会员账号错误"),
    标签名称超长(42121, "标签名称 输入字符长度不能超过10个"),
    首页推荐位排序模块ID不存在(42122, "传入模块ID %s不存在"),
    VIP序号参数错误(42123, "VIP序号 只能输入0-10的数字"),
    状态不能为空(42124, "状态不能为空"),
    状态参数错误(42125, "状态 只能输入0-1数字"),
    排序参数不能为空(42126, "排序参数不能为空"),
	全部游戏数量超长(42127,"全部游戏数量 最多3位字符"),
	滚屏数量限制超长(42128,"滚屏数量限制 最多3位字符"),
	代理钱包参数错误(42129,"代理钱包 请输入0、6、7的数字"),
    标签变更类型错误(42130, "标签变更类型 只能输入1-3的数字"),
	游戏推荐操作类型参数错误(42131, "变更类型 请输入1-14的数字"),
	姓名不正常(42132, "姓名与银行卡姓名不一致"),
	终端参数错误(42133, "终端 请输入1-3的数字"),
	无对应的账变类型(42135, "该bizCode 无对应的账变类型"),
	无对应的业务类型(42136, "该walletCode 无对应的业务类型"),
	报表日期不能为空(42137, "报表日期不能为空"),
    会员充值未达到5次(42138, "会员充值未达到5次限制"),
	查看更多跳转地址ID不能为空(42139, "查看更多跳转地址ID不能为空"),
	单据未锁定(42140, "单据未锁定,操作失败"),
	BIRTH_ERROR(42141, "出生日期不能选择未来时间"),
	GET_PROXY_LEVEL_CONF_LIST_ERROR(42142, "获取代理层级名称下拉框异常"),
	字符长度超过15(42143, "%s 字符长度不能超过15"),
	ENTRY_AUTHORITY_CLOSE(42144, "上级代理入口权限未开启"),
	NOT_ALLOW_ADD_PROXY(42145, "该代理不允许继续发展下级代理"),
	GENERAL_PROXY_DATA_ERROR(42146, "总代数据不存在"),
	PROXY_NEXT_LEVEL_ERROR(42147, "获取代理下一层级信息异常"),
	PROXY_LEVEL_CONFIG_ERROR(42148, "代理层级配置数据异常"),
    CONTRACT_REFRESH_PAGE(310072, "不是最新的契约，请重新刷新页面"),
    CONTRACT_REFRESH_PAGE_WEB(310073, "契约状态已变，请重新刷新"),
    TARE_CONTRACT_ERROR(310032, "契约不存在或者已经删除"),
    账号的状态为充值锁定(42149,"账号的状态为充值锁定"),
	PROXY_LEVEL_INFO_ERROR(42150, "代理层级信息数据缺失,不允许添加下级代理"),
    会员后台提款流水不足(42151, "此会员当前流水不足，不能进行提款操作"),
    输入的代理账号错误(42152, "输入的代理账号错误"),
	GAME_CODE_ERROR(42153, "获取gameCode异常"),
	PARENT_PROXY_NOT_EXIST(42154, "上级代理账号不存在"),
	USERNAME_NOT_PROXY(42155, "该账号不是代理无法转入会员"),
	USERNAME_IS_PROXY(42156, "该账号是代理不支持转代"),
    虚拟币账号不存在(42157, "虚拟币账号不存在"),
    银行卡号不存在(42158, "银行卡号不存在"),
	NO_PARENT_PROXY_DONT_TRANSFER(42159, "无上级代理,无法转代申请"),
	CURRENT_PROXY_NAME_ERROR(42160, "当前上级代理参数错误"),
	不可修改用户姓名(42161,"不可修改用户姓名"),
	HAVE_DATA_CANT_EDIT(42164,"该代理线层级上限第%s层已产生数据，禁止减少调整层级"),
	NO_GENERAL_PROXY_CANT_EDIT(42162,"该账号不是总代，无法修改"),
	PHONE_NOT_NULL(42166,"手机号码不能为空"),
    AREA_NOT_NULL(42166,"请选择区号"),
	PHONE_IS_ERROR(42167,"请输入有效号码"),
	INFO_SAME_CANT_EDIT(42163,"编辑信息与当前一致，修改无效"),
    DOWN_TIME_AFTER_UP_TIME(42168, "下架时间必须大于上架时间且大于当前时间"),
    邮箱已被绑定(42169, "邮箱已被绑定"),
    GAME_CODE_EMPTY(42170, "gameCode不能为空"),
    ADJUST_AMOUNT_LONG(42108, "输入金额不能大于999999999999.99"),
    //游戏相关
    GAME_MANAGE_ID_NOT_NULL(50001,"游戏ID 不能为空"),
    GAME_ID_NOT_EXIST(50002,"游戏ID 不存在"),
    PIC_TYPE_PNG_JPG(50003,"只能支持JPE，JPEG，PNG格式图片"),
    PIG_SIZE_IN_2M(50004,"图片大小在5M 以内"),
    MAIN_TITLE_INFO_NOT_NULL(50005,"主标题信息不能为空"),
    SUB_TITLE_INFO_NOT_NULL(50006,"副标题信息不能为空"),
    SCROLLING_NUM_NOT_NULL(50007,"滚屏数量不能为空"),
    ALL_GAME_NUM_NOT_NULL(50008,"全部游戏数量不能为空"),
    GAME_NAME_NOT_NULL(50009,"游戏名称不能为空"),
    SUPPORT_TERMINAL_NOT_NULL(50010,"支持终端不能为空"),
    ACCESS_INFO_NOT_NULL(50011,"接入参数不能为空"),
    RELATION_OTHER_GAME_NOT_NULL(50012,"关联推荐游戏不能为空"),
    RELATION_GAME_MODULE_NOT_NULL(50013,"关联游戏模块不能为空"),
    GAME_PIC_NOT_NULL(50014,"游戏图片不能为空"),
    GAME_MODULE_ID_NOT_NULL(50015,"游戏模块ID不能为空"),
    GAME_MODULE_STATUS_NOT_NULL(50016,"模块状态不能为空"),
    GAME_ASSORT_ID_NOT_NULL(50017,"分类id不能为空"),
    GAME_MODULE_DESCRIPTION_NOT_NULL(50018,"模块说明不能为空"),
    GAME_STATUS_NOT_EXIST(50019,"游戏状态不存在"),
    GAME_STATUS_NOT_NULL(50020,"游戏状态不能为空"),
    关联游戏模块数量必填五个(50021,"关联游戏模块数量必填五个"),
    关联游戏模块必填一个最多二个(50022,"关联游戏模块必填一个最多二个"),
    编辑游戏专题失败(50023,"编辑游戏专题失败"),
    编辑最新游戏失败(50024,"编辑最新游戏失败"),
	删除游戏专题失败(50025,"删除游戏专题失败"),
	游戏专题不存在(50026,"游戏专题不存在"),
	游戏推荐更新操作记录失败(50027,"游戏推荐更新操作记录失败"),
	游戏分类下拉框获取失败(50028,"游戏分类下拉框获取失败"),
    增加数额1_999随机数起始值要小于结束值(50029,"增加数额1_999随机数起始值要小于结束值"),
    CONFIG_REBATE_STATUS_NOT_NULL(50030,"是否配置返水不能为空"),
    全部游戏数量上限不能为空(50031,"全部游戏数量上限 不能为空"),
    分类名称ID不能为空(50032,"分类名称ID 不能为空"),
    游戏分类名称不存在(50033,"游戏分类名称不存在"),
	GAME_RECOMMEND_SAVE_ERROR(50034,"游戏推荐保存失败"),
	GAME_RECOMMEND_NOT_NULL(50035,"请勾选游戏移入推荐列表"),
	GAME_RECOMMEND_BEYOND_20(50036,"当前游戏推荐列表可保存20款游戏，请先删除不需要的列表游戏，在进行重新进行配置"),
	GAME_IDS_NOT_NULL(50037,"游戏ids不能为空"),
	GAME_RECOMMEND_QUERY_ERROR(50038,"游戏推荐查询失败"),

    GAME_ASSORT_NOT_EXIST(100013,"游戏分类不存在"),
    ASSORT_IS_EXIST(100014,"游戏分类顺序或名称已存在"),
    GAME_ASSORT_EDIT_EXCEPTIONS(100015,"游戏分类异常"),
    GAME_NAME_EXIST(100016,"游戏名已存在"),
    游戏标签添加失败(100017,"游戏标签添加失败"),
    游戏标签删除失败(100018,"游戏标签删除失败"),
    模块说明_全部游戏数量必填(100019,"模块说明/全部游戏数量 必填"),
    滚屏数量限制必填(100020,"滚屏数量限制 必填"),
	首页推荐位状态编辑失败(100021,"首页推荐位状态编辑失败"),
	游戏模块不存在(100022,"游戏模块不存在"),
    首页推荐位管理编辑失败(100023,"首页推荐位管理编辑失败"),
    主副标题信息必填(100024,"主标题信息/副标题信息 必填"),
    尚有数据未填写完整(10125, "尚有数据未填写完整"),
    游戏标签id不存在(100026, "游戏标签id不存在"),
    无相关游戏信息(10027,"无相关游戏信息"),
    游戏标签名称过长(10028, "游戏标签名称不能超过10个字符"),
    人工扣款金额不能小于零(10029, "人工扣款金额不能小于零"),
    余额必须要大于等于扣款余额(10030, "余额必须要大于等于扣款余额"),
    人工加款金额不能小于零(10031, "人工加款金额不能小于零"),
    VIP等级名称不能超过(10032, "VIP等级名称不能超过10位字符"),
    游戏标签id长度过长(100033, "游戏标签id长度过长"),
	游戏专题状态修改失败(100024,"游戏专题状态修改失败"),
	最新游戏模块不存在(100025,"最新游戏模块不存在"),
	游戏模块非法删除(100026,"只能删除id大于等于10的游戏专题模块"),
	游戏专题模块不存在(100027,"游戏专题模块不存在"),
	状态修改前后一致(100028,"状态修改前后一致,操作失败"),
	游戏名称获取失败(100029,"游戏名称获取失败"),
	直播模块不存在(100030,"直播模块不存在"),
    会员标签id不能为空(100031, "会员标签id不能为空"),
    会员性别不能为空(100032, "会员性别不能为空"),
    会员出生日期不能为空(100033, "会员出生日期不能为空"),
	
    GAME_INFO_UPDATE_FAIL(60000,"场馆更新失败"),
    GAME_INFO_ADD_FAIL(6001,"场馆添加失败"),
    GAME_INFO_DEL_FAIL(6002,"场馆删除失败"),
    GAME_INFO_NOT_EXISTS(6003,"场馆不存在"),
    GAME_PLATFORM_NOT_EXISTS(6004,"游戏平台不存在"),
	GAME_PLATFORM_CONFIG(6005,"商户无场馆配置信息"),
    会员或代理不存在(8005, "该会员或代理不存在"),
    操作金额只能11位(8006, "操作金额最多只能输入11位数字"),
    暂时无此活动(8007, "暂时无此活动"),
    STATUS_DISABLED(8008, "此活动状态为禁用"),
    USER_ACCOUNT_NOT_EMPTY(8009, "会员帐号不允许为空"),
	活动类型不匹配(8009,"活动类型不匹配"),

    ACTIVITY_QUERY_FAIL(7000,"活动优惠查询失败"),

    保级有效期大于10天(7001, "保级有效期需要大于10天"),
    保级有效期不能配置为0(7002, "保级有效期不能配置为0"),

    
    MERCHANT_GAME_SAVE_FAIL(80001,"商户场馆配置失败"),
    MERCHANT_GAME_QUERY_FAIL(80002,"商户-游戏平台获取失败"),
    WIND_CONTROL_LEVEL_QUERY_FAIL(80003,"风控层级字典获取失败"),
    保级流水小于升级流水(80004, "保级流水配置需小于升级所需流水"),
    会员只能给会员现金加额(8007, "会员类型只能操作会员额度钱包"),
    代理只能给代理现金加额(8008, "代理类型只能操作代理额度钱包或者代理佣金钱包"),
    充值送活动存在一个有效(80005, "只能存在一个有效的充值送活动"),
    教程名称下教程页签数据超出不可新增(8010,"教程名称下教程页签数据超出不可新增"),
    数据不存在或已删除(8011,"数据不存在或已删除"),
    启用中的状态无法删除(8012,"启用中的状态无法删除"),
    教程名称不存在(8013,"教程名称不存在"),
    余额为0不能进行扣款(8014, "余额为0不能进行扣款"),
    人工扣款金额不能小于等于零(8015, "人工扣款金额不能小于等于零"),
    请填写随机收藏数(8016, "请填写随机收藏数"),
    PROXY_DOMAIN_EDIT_SAME(8023,"新旧数据相同，并未更改"),
    MERCHANT_ID_NOT_NULL(8017, "商户ID不能为空"),
    PROXY_LEVEL_NOT_NULL(8018, "代理层级不能为空"),
	MERCHANT_CLIENT_NAME_EXIT(8019, "商户名称[%s]已存在"),
	TEMPLATE_MERCHANT_CLIENT_DONT_DEL(8019, "模板商户名不能删除"),
	OPERATION_EXCEL_ERROR(8020,"文件不是xlsx文档 或 大小超过5M"),
	OPERATION_EXCEL_NULL(8021,"没有导入文件"),
	OPERATION_EXCEL_READ_ERROR(8022,"读取Excel异常"),
    FAIL_4_ADD_MEMBER_DOMAIN(8023, "新增域名失败！"),
    FAIL_4_DUPLICATE_KEY_MEMBER_DOMAIN(8024, "该域名已存在！"),
    FAIL_4_GET_RECORD(8025, "获取数据记录失败"),
    FAIL_4_INVITATIONCODE_MEMBER_DOMAIN(8026, "邀请码失效！"),
	REQ_FAST(800001, "请求太频繁"),
    DOMAIN_NAME_ALREADY_EXISTS(800005, "该域名已存在"),
    DOWN_TIME_EXISTS(800006, "下架时间不能为空"),
    GAME_TARGET_EXISTS(800007, "游戏或URL链接不能为空"),
    ABLE_STATUS(800008,"启用中的状态无法修改"),
	MEMBER_DOMAIN_NAME_ALREADY_EXISTS(800006, "域名已存在"),
    SAME_CLIENT_TYPE_ONE_DATA(800009,"同一个显示终端的数据只能开启一条"),
	INVITE_SHARE_DOMAIN_NOT_NULL(800006, "绑定失败，请先配置并开启好友邀请域名以及活动分享域名"),
	INVITE_DOMAIN_NOT_NULL(800007, "绑定失败，请先配置并开启好友邀请域名"),
	SHARE_DOMAIN_NOT_NULL(800008, "绑定失败，请先配置并开启活动分享域名"),
	DOMAIN_NAME_ALREADY_BIND(800009, "该代理已绑定域名"),
    BANNER_SORT_CLIENT_TYPE_SAME(800009, "相同顺序的轮播图只能开启1张"),
    ACTIVITY_TAB_IS_DATA_DEL(800010, "该页签下存在开启活动，不能进行删除"),
    ACTIVITY_TAB_IS_DATA_DISABLE(800011, "该页签下存在开启活动，不能进行停用"),
    BANNER_IMG_COUNT_TEN(800012,"客户端轮播图最多可展示10张"),

    DECRYPT_ERROR(55770, "解密失败"),
    SIGN_VERIFIED_FAILED(55780, "验证签名失败"),
    SYSTEM_MAINTENANCE(55790, "系统维护"),

    CHECK_DUPLICATE_FAILED(-10005,"{0}已存在，请勿重复操作！"),
    USER_NAME_NOT_EXIST_CD(55791,"该代理还在新增审核中，无法重订"),
    USER_NAME_NOT_EXIST_ADD(55792,"该代理还在新增审核中，无法新增"),
    NON_DATA(301,"未查询到相关数据"),
	DOMAIN_AUTHORITY_CLOSE(55794, "代理账号入口权限未开启，无法绑定！"),
	DOMAIN_CONTRACT_MODEL_CLOSE(55795, "代理账号无契约，无法绑定！"),
	GET_ACTIVITY_SHARING_LINK(310067, "活动分享链接获取失败"),
    MERCHANT_WIND_CONTROL_NO(310068,"是"),
    MERCHANT_WIND_CONTROL_YES(310069,"否"),
	// 系统模块
	FAIL_4_DUPLICATE_KEY_CONFIG_DOMAIN(90031, "该域名已存在！"),
	FAIL_4_NULL_UPLOAD_CONFIG_DOMAIN(90032, "没有导入文件！"),
	FAIL_4_SIZE_UPLOAD_CONFIG_DOMAIN(90033, "文档大小超过5M！"),
	FAIL_4_SUFFIX_UPLOAD_CONFIG_DOMAIN(90034, "文件不是xlsx文档！"),
	FAIL_4_READ_UPLOAD_CONFIG_DOMAIN(90035,"读取Excel异常"),
    //资金
    PAYMENT_MERCHANT_REPEAT(200066,"支付厂商已存在，请更换"),
    MERCHANT_ACTIVITY_NAME_EXSIT(200067,"活动页签名称已存在"),

    ACTIVITY_MEMBER_NOT_TOP(90012, "该账号不是总代"),
    ACTIVITY_MEMBER_NOT_PROXY(90013, "该账号不是代理"),
    ACTIVITY_MEMBER_NOT_EXSIT(90014, "该账号不存在"),
    ACTIVITY_MEMBER_IN_DATA(90015, "该账号已在名单内"),
	;

    private final Integer code;

    private final String msg;

    DXManagerCodeMsgEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static DXManagerCodeMsgEnum getCode(int code) {
        for (DXManagerCodeMsgEnum codeMsg : DXManagerCodeMsgEnum.values()) {
            if (codeMsg.getCode() == code) {
                return codeMsg;
            }
        }
        return SUCCESS;
    }
    public String message() {
        return GsonUtil.getInstance().toJson(
                ResultJson.builder().code(this.code + "").msg(this.message()).build()
        );
    }
    
    
    public String message(String message) {
        return GsonUtil.getInstance().toJson(
                ResultJson.builder().code(this.code + "").msg(message).build()
        );
    }
    
    public String message(int code, String message) {
        return GsonUtil.getInstance().toJson(
                ResultJson.builder().code(code + "")
                        .msg(message)
                        .build()
        );
    }
    
    public String messageAfter(String message) {
        return this.msg.concat("[").concat(message).concat("]");
    }
}
