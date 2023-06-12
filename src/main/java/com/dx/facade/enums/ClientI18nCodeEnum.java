package com.dx.facade.enums;

import com.dx.enums.I18nEnum;

/**
 * client-server 国际化错误码枚举
 */
public enum ClientI18nCodeEnum implements I18nEnum {

    SUCCESS(200), // SUCCESS
    缺少参数(10000), // 缺少参数
    HEADER_VALUE_ERROR(93333), // header 异常
    对象拷贝(94444), // 对象拷贝
    参数错误(95555), // 参数错误
    系统错误(96666), // 系统错误
    逻辑业务异常(97777), // 逻辑业务异常
    微服务没有找到(98888), // 微服务没有找到
    空指针异常(93333), // 空指针异常
    其他未知异常(99999), // 其他未知异常
    设备类型不能为空(90001), // 设备类型不能为空
    PROXY_NOT_OPENED(10020), // 成为合营伙伴，尊享55%佣金计划
    PROXY_IS_LOCKED(10021), // 账号存在异常，可联系客服咨询
    PROXY_IS_INVALID(10022), // 当前代理是无效状态
    PROXY_NOT_EXISTS(10018), // 代理不存在
    TRANSFER_TYPE_NOT_NULL(100000), // 额度转换转账类型不能为空
    SOURCE_GAME_NOT_NULL(100001), // 额度转换交易场馆不能为空
    MEMBER_ID_NOT_NULL(100002), // 会员ID不能为空
    MEMBER_TELEPHONE_NUM(100003), // 请填写绑定的电话号码
    RECOVER_PASSWORD_TYPE_ERROR(100005), // 目前不支持此种寻找方式
    NO_VERIFICATION_CODE(100006), // 尚未发送验证码或验证码已过期，请重新发送！
    VERIFICATION_FAILED(100007), // 验证码错误，请检查后输入！
    SEND_VERIFICATION_FAILED(100008), // 发送验证码失败！
    PASSWORD_CONSISTENCY_ERROR(100009), // 确认密码错误！
    DECODE_REFUSE(100010), // 签名验证失败
    ILLEGAL_OPERATION(100012), // 非法操作
    SERVICE_BUSY(100013), // 服务器繁忙,请稍后再试
    DATA_PRIMARY_KEY_IS_NULL(100014), // 数据主键id不能为空
    PARAMETER_IS_ERROR(100015), // 参数错误
    PHONE_IS_ERROR(100016), // 电话号码格式错误
    EMAIL_IS_ERROR(100018), // 邮箱格式错误
    EMAIL_SEND_MESSAGE_ERROR(100019), // 邮箱验证码发送失败
    BIN_DING_PHONE_ERROR(100020), // 已绑定手机号，不能重复绑定
    BIN_DING_EMAIL_ERROR(100021), // 已绑定邮箱地址，不能重复绑定
    REAL_NAME_ERROR(100022), // 真实姓名已存在，不能重复修改
    TRY_AGAIN(100023), // 每1分钟发送一次，请稍后再试
    GENDER_ERROR(100024), // 性别已存在，不能重复修改
    BIRTH_ERROR(100025), // 生日已存在，不能重复修改
    OCCURDTSTART_IS_NULL(100026), // 账变开始时间不能为空
    OCCURDTEND_IS_NULL(100027), // 账变结束时间不能为空
    OCCURDTSTART_ERROR(100028), // 账变开始时间格式错误
    OCCURDTEND_ERROR(100029), // 账变结束时间格式错误
    MEMBER_VIP_INFO_IS_NULL(100030), // VIP等级提款信息配置为空
    MEMBER_INFO_ERROR(100031), // 请先完善您的个人信息
    NOT_EXIST_CLIENT_TYPE(100032), // 系统不支持
    PROXY_NOT_EXIST(100033), // 代理不存在
    USER_EXIST(100034), // 账号已存在
    PROXY_LEVEL_CONFIG_ERROR(100035), // 获取代理层级配置数据异常
    PASS_WORD_NOT_RIGHT(100036), // 请输入8-12位，字母+数字组合的密码
    USERNAME_NOT_EXISTS(100037), // 账号不存在
    USERNAME_NOT_IS_DIRECT_SUBORDINATE(100038), // 输入账号不是您的直属下级
    PROXY_ACCOUNT_LOCK_STATUS(100039), // 您的账号存在异常，请联系客服咨询
    PROXY_DEBT_STATUS_ERROR(100040), // 您有未付清的佣金欠款，还清后才能{message}
    PROXY_TRANSFER_DAY_LIMIT_ERROR(100041), // 当天累计转账金额超出限制，可尝试小额转账
    PROXY_TRANSFER_AMOUNT_ERROR(100042), // 转账金额必须大于0
    PASSWORD_INIT_ERROR(100043), // 原密码错误！
    ASSIT_USERNAME_NOT_EXISTS(100045), // 账号不存在
    NOT_ASSIT_USERNAME(100046), // 输入账号不是您的直属下级
    MEMBER_VIP_PROMOTION_IS_NULL(100047), // VIP晋级优惠活动配置为空
    CONTRACT_MODEL_ERROR(100048), // 契约模式和契约参数不匹配
    SURROGATE_BROKERAGE_ERROR(100049), // 代存金额超出单笔金额限制
    ACCOUNT_LOCK(100050), // 您的账号存在异常，请联系客服咨询
    PROXY_TRANSFER_LOCK_STATUS(100052), // 您有未付清的佣金欠款，还清后才能转账
    NO_CONTRACT_MEMBER(100053), // 您尚未签订契约,无法新增下级会员哦
    NO_CONTRACT_PROXY(100054), // 您尚未签订契约,无法新增下级代理哦
    NO_BIZTYPE_PROXY(100055), // 代理天下钱包充值类型不能为空
    MOBILE_EXP_JAV(100056), // 手机号码格式验证错误
    QUERY_SUCCESS(200000), // 查询成功！
    QUERY_FAIL(200001), // 查询失败！
    SAVE_SUCCESS(200002), // 保存成功！
    SAVE_FAIL(200003), // 保存失败！
    DELETED_SUCCESS(200004), // 删除成功！
    DELETED_FAIL(200005), // 删除失败！
    SUBMIT_FAIL(200006), // 删除失败！
    LOGIN_SUCCESS(300000), // 登录成功！
    LOGIN_FAIL(300001), // 登录失败！
    REGISTER_SUCCESS(300002), // 注册成功！
    REGISTER_FAIL(300003), // 注册失败！
    PASSWORD_ERROR(300004), // 密码不正确！
    UPDATE_PASSWORD_FAIL(300005), // 修改密码失败！
    USER_NAME_EXIST(300006), // 用户名已存在，请重新输入！
    USER_NAME_NOT_EXIST(300006), // 用户不存在！
    USER_IP_BLACK(300007), // 该ip已经被禁用
    USER_BANK_BLACK(300008), // 该卡号已经被禁用
    ADD_BANK_FAIL(300009), // 添加银行卡失败
    UPDATE_BANK_FAIL(300009), // 修改银行卡失败
    LOGIN_GAME_FAIL(300010), // 登录游戏失败
    PIC_TYPE_PNG_JPG(300011), // 只能支持JPE，PNG格式图片
    PIG_SIZE_IN_1M(300012), // 图片大小在1M 以内
    PIG_SIZE_IN_5M(300014), // 图片大小在5M 以内
    PIC_TYPE_PNG_JPG_JPEG(300015), // 只能支持JPG，PNG，JPEG格式图片
    FILE_NO_EMPTY(300013), // 上传文件不能为空!
    PHONE_NUMBER_NOT_BOUND(300014), // 尚未绑定手机号码，请先绑定手机号码!
    NUMBER_OF_BANK_CARDS_EXCEEDS(300015), // 最多绑定3张银行卡!
    BANK_CARD_ALREADY_EXISTS(300016), // 银行卡已存在
    NAMES_ARE_NOT_CONSISTENT(300017), // 账号真实姓名与银行卡不符
    BANK_CARD_IS_BOUND(300018), // 当前银行卡已存在, 无法添加当前银行卡
    MOBILE_ARE_NOT_CONSISTENT(300019), // 手机号码不符合
    开始时间不可大于结束时间(300020), // 开始时间不可大于结束时间
    最大跨度为7天(300021), // 全量查询最大跨度7天，请缩小查询范围
    最大跨度为30天(300022), // 当前查询数据量过大，请缩小查询范围，最大跨度为30天
    最大跨度为60天(300023), // 当前查询数据量过大，请缩小查询范围，最大跨度为60天
    最多可查询90天前的数据(300024), // 最多可查询90天前的数据
    交易类型有误(300025), // 交易类型有误
    该QQ已被他人使用(300026), // 该账号信息已被他人使用
    虚拟币种不正确(300027), // 虚拟币种不正确,暂不支持该币种，请填写正确的虚拟币种
    虚拟协议不正确(300028), // 虚拟协议不正确,暂不支持该协议，请填写正确的虚拟协议
    NUMBER_OF_VIRTUAL_CARDS_EXCEEDS(300029), // 最多绑定3张虚拟卡!
    VIRTUAL_CARD_IS_BOUND(300030), // 该虚拟币地址不能再次绑定
    ADD_VIRTUAL_BANK_FAIL(300031), // 添加虚拟卡失败
    存款金额不能超过10位数(300036), // 存款金额不能超过10位数
    LOWER_MEMBER_LIST_ERROR(300037), // 下级会员列表查询异常
    IMG_PATH_NOT_NULL(300038), // 图片不能为空
    TOP_IMG_FREQUENTLY(300037), // 更换头像过于频繁
    TOP_IMG_6(300037), // 最多传6张图片
    ORDER_NOT_EXIST(300039), // 注单号不存在
    USER_PROXY_EQUES(300040), // 同名会员不能溢出到同名代理
    GAME_LOCK_STATUS(300041), // 该功能已停用，请联系客服
    USER_VIRTUAL_ACCOUNT_BLACK(300075),//账户已被禁用，请更换其他虚拟币账户
    THE_FLYGRAM_USED_BY_OTHERS(300042), // 该账号信息已被他人使用
    BIND_PHONE_BANKCARD(300043), // 请先绑定手机号和银行卡再领取红利
    INVITATION_CODE_NOT_EXIST(300044), // 合营码无效，请确认后重新提交
    PHONE_NUMBER_NOT_FOUND(300045), // 当前手机号未绑定任何账号
    NICK_NAME_EXIST(300101), // 昵称已存在，请重新输入！
    CLUB_NAME_EXIST(300102), // 昵称已存在，请重新输入！
    QUERY_BALANCE_SUCCESS(400000), // 余额查询成功
    QUERY_BALANCE_FAIL(400001), // 余额查询失败
    QUERY_GAME_BALANCE_FAIL(400002), // 查询场馆余额失败
    GAME_WITHDRAW_FAIL(400003), // 游戏下分失败
    GAME_DEPOSIT_FAIL(400003), // 游戏上分失败
    RECOMMEND_TABLE_FAIL(400004), // 真人查询推荐桌台异常
    OTHER_ERROR(500000), // 查询成功！
    ADD_SEARCH_LOG_FAIL(600001), // 游戏搜索日志添加失败
    注单状态不能为空(600002), // 注单状态不能为空
    NULL_GAME_FAIL(600003), // 不存在的游戏收藏
    GAME_TYPE_ERROR(600004), // 游戏类型异常
    USER_GAME_STATUS_ERROR(600005), // 该功能已停用，请联系客服
    MOBILE_NOT_EXIST(600006), // 需要绑定手机号码
    EMAIL_NOT_EXIST(600007), // 需要绑定邮箱
    REALNAME_NOT_EXIST(600007), // 需要绑定真实姓名
    VIPSERIALNUM_NOT_EXIST(600008), // vip等级序号不配对
    GAME_NAME_NOT_EXIST(600009), // 没有搜索到“ %s ”相关游戏信息，您可以重新搜索其他关键词
    USER_LOGIN_ERROR(600010), // 账号已锁定，请联系管理员确认
    GAME_STATUS_MAINTAIN_ERROR(600011), // 游戏维护中
    ASSORT_ID_NOT_NELL(600012), // 游戏分类ID不能为空
    BANKCARD_NOT_EXIST(600013), // 需要绑定银行卡
    TRY_AGAIN_5SECOND(600014), // 收藏&取消收藏操作频繁，请稍后再试
    ENTER_GAME_ERROR(600015), // 服务暂不可用，请稍后再试
    INSUFFIC_BALANCE_ERROR(700001), // 当前代理佣金余额不足
    WITHDRAWABLE_NUM_ERROR(700002), // 用户当日提款次数不足
    WITHDRAWABLE_BALANCE_ERROR(700003), // 可提款金额不足
    BANKCARD_MAX_AMOUNT_ERROR(700004), // 提款金额超过银行卡单次提款最高限额
    VIRTUALCARD_MAX_AMOUNT_ERROR(700005), // 提款金额超过虚拟币单次提款最高限额
    用户充提锁定(700006), // 该功能已停用，请联系客服
    WITHDRAWAL_VIRTUAL_LIMITED(700007), // 虚拟币取款前,需要进行银行卡提款一次
    LOGIN_LOCK(700008), // 当前账户状态为登录锁定
    MEMBER_NOT_BIND_PHONE(700009), // 会员账号没有绑定手机
    PAY_PASSWORD_ERROR(700010), // 支付密码不正确
    CARDHOLDERNAME_NOT_NULL(700011), // 持卡人姓名不能为空
    VIRTUALADDRESS_NOT_NULL(700012), // 虚拟币账户不能为空
    PAYTYPE_NOT_NULL(700013), // 支付类型不能为空!
    DEPOSIT_AMOUNT_ERROR(800001), // 充值金额必须大于0
    DEPOSIT_MORE_COUNT(800002), // 多次存款失败
    FAIL(999999), // 系统处理失败
    NOT_PAYTYPE(800003), // 该功能已停用, 请联系客服
    TRY_GAME(1000001), // 该游戏不支持试玩
    TRY_GAME_CONFIG(1000004), // 获取试玩地址配置异常
    TRY_GAME_BALANCE_TRANSFER(1000002), // 试玩账号不支持额度转换
    TRY_GAME_BALANCE(1000003), // 试玩环境无需上分
    TRY_GAME_ACTIVITY_FAIL(1000004), // 试玩账号不支持活动参加
    ACCOUNT_TYPE_IS_NULL(1100001), // 查询账号类型不能为空
    FIRST_DEPOSIT_GAME_CODE_PARTICIPATING(1200001), // 当前活动当前场馆正在参与中
    FIRST_DEPOSIT_PARTICIPATING(1200002), // 当前活动其他场馆正在参与中
    FIRST_DEPOSIT_OTHER_GAME_ALREADY(1200003), // 当前活动其他场馆已经参加过
    FIRST_DEPOSIT_GAME_CODE_ALREADY(1200004), // 当前活动当前场馆已经完成
    //FIRST_DEPOSIT_UNDONE(1200005), //
    FIRST_DEPOSIT_OUT_OF_RANGE(1200005), // 非指定范围内用户，不能参加当前活动
    FIRST_DEPOSIT_ALREADY_ONLY(1200006), // 您已经参加过每人一次的首存活动，不能再参加其他首存活动
    FIRST_DEPOSIT_MINIMUM_AMOUNT(1200007), // 未达到活动最小金额
    FIRST_DEPOSIT_VIP_LEVEL_ERROR(1200008), // VIP等级不符合要求
    FIRST_DEPOSIT_ALL_GAME_FINISH(1200009), // 当前活动全部已完成，不能参加活动
    活动已过期(12000010), // 活动已过期
    该活动已结束(12000011), // 该活动已结束
    该活动未开始(12000012), // 该活动未开始
    活动已停用(12000013), // 活动已关闭
    不满足首存送活动(300032), // 您尚未满足该活动或您已领取过该活动，领取失败
    活动不存在(300033), // 活动不存在，或该活动已结束
    首存送活动未完成错误(300034), // 您有该场馆未完成的首存活动
    首存送活动已完成错误(300035), // 您已参加过该场馆的首存活动
    ACTIVITY_PARTICIPATING(300036),//您有未完成的活动，暂无法参与

    FIRST_DEPOSIT_VENUE_IS_NOT_SUPPORTED(300033),//此活动不支持该场馆，不能参加
    FIRST_DEPOSIT_DEVICE_IS_NOT_SUPPORTED(300033),//该活动不支持此设备终端，不能参加
    FIRST_DEPOSIT_RULE_NOT_CONFIGURED(300033),//首存活动规则未配置


    INVITE_DEPOSIT_NOT_STANDARD(12000020), // 未达标，不能参加活动
    INVITE_DEPOSIT_PARTICIPATED(12000021), // 您已参加过当前活动，不能重复参加活动
    INVITE_DEPOSIT_IP_LIMIT(12000022), // 您目前不符合本活动参与条件，如果对本次提示有疑问,请联系在线客服
    INVITE_DEPOSIT_DEVICE_LIMIT(12000023), // 您目前不符合本活动参与条件，如果对本次提示有疑问,请联系在线客服
    INVITE_TASK_AGENT_ERROR(12000031), // 代理无法参与活动

    // =========== 包网 ===========
    NOT_FOUND_CURRENCY(81000001), // 无匹配的币种
    VENUE_NOT_FOUND(81000002), // 场馆不存在
    NAMES_ARE_NOT_CONSISTENT_BW(81000003), // 添加的银行卡姓名需与账号真实姓名一致
    BIRTH_BEFORE_NOW_ERROR(100057),//, "出生日期不能选择未来时间"
    BIND_PHONE_CONFIRM(100058),//, "请输入有效号码"
    PWD_NEW_OLD_NOT_SAME(300049),//, 新旧密码不能一致，请重新输入
    PLACEHOLDER(66661), // 还有%s次机会
    what协议的虚拟地址必须以1或者3开头(300028), // 协议的虚拟地址必须以1或者3开头
    what协议的虚拟地址必须以0x开头(300028), // 协议的虚拟地址必须以0x开头
    what协议的虚拟地址必须以T开头(300028), // 协议的虚拟地址必须以T开头
    USER_GAME_STATUS_ERROR_2(600005), // 账号已被锁定，无法进行游戏，请联系客服询问!
//    USER_VIRTUAL_ACCOUNT_BLACK(300075),//账户已被禁用，请更换其他虚拟币账户
    ACCESS_TOKEN(500), // 授权码不能为空
    请输入合法的姓名(81000004), // 请输入合法的姓名

    ACITVITY_UN_START(81000005), // 活动未开始，请留意活动最新公告！
    ACITVITY_IS_END(81000006), // 活动已结束，请留意活动最近公告！
    ACITVITY_DOMAIN_NULL(81000007), // 商户活动域名未配置
    ;

    private int code;

    ClientI18nCodeEnum(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
