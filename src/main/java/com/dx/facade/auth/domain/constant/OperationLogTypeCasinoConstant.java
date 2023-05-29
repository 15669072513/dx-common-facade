package com.dx.facade.auth.domain.constant;

/**
 * 操作日志类型（现场后台管理系统）
 */
public class OperationLogTypeCasinoConstant {

    //登陆
    public final static String LOGIN = "登录";

    //荷官
    public final static String DEALER_ADD = "添加荷官账号";
    public final static String DEALER_ADD_MANAGER = "添加荷官主管账号";
    public final static String DEALER_DISABLE = "停用荷官";
    public final static String DEALER_ENABLE = "启用荷官";
    public final static String DEALER_DISABLE_MANAGER = "停用荷官主管";
    public final static String DEALER_ENABLE_MANAGER = "启用荷官主管";
    public final static String DEALER_UPDATE_STATUS = "修改荷官状态";
    public final static String DEALER_CHANGE_PASSWORD = "修改密码";
    public final static String DEALER_UPDATE = "编辑荷官信息";
    public final static String DEALER_UPDATE_MANAGER = "编辑荷官主管信息";

    //纸牌
    public final static String CARD_IN = "纸牌入库";
    public final static String CARD_OUT = "纸牌出库";
    public final static String CARD_DISCARD = "纸牌废弃";

    //牌盒
    public final static String CARDBOX_SET_WARNING_NUM = "使用次数预警设置";
    public final static String CARDBOX_ADD_SHUFFLE = "添加洗牌方式";
    public final static String CARDBOX_UPDATE_SHUFFLE = "编辑洗牌方式";
    public final static String CARDBOX_DEL_SHUFFLE = "删除洗牌方式";
    public final static String CARDBOX_DISCARD = "纸牌报废";

    //水牌列表
    public final static String WATER_CARD_UNION = "关联水牌";

    //密码管理
    public final static String PASSWORD_MANAGEMENT_UPDATE = "修改密码";

    //账号管理
    public final static String ACCOUNT_ADD = "添加账号";
    public final static String ACCOUNT_ENABLE = "启用账号";
    public final static String ACCOUNT_DISABLE = "停用账号";
    public final static String ACCOUNT_UPDATE_STATUS = "修改账号状态";
    public final static String ACCOUNT_CHANGE_PASSWORD = "修改密码";
    public final static String ACCOUNT_UPDATE = "账号编辑";

    //角色管理
    public final static String ROLE_ADD = "添加角色";
    public final static String ROLE_ENABLE = "启用角色";
    public final static String ROLE_DISABLE = "停用角色";
    public final static String ROLE_UPDATE_STATUS = "修改角色状态";
    public final static String ROLE_UPDATE = "编辑角色";
    public final static String ROLE_DEL = "删除角色";

    //IP白名单
    public final static String IPWHITE_ADD = "添加白名单";
    public final static String IPWHITE_DOWN_TEMPLATE = "白名单模版下载";
    public final static String IPWHITE_DEL = "删除白名单";

    //设备管理
    public final static String DEVICE_ADD = "添加设备";
    public final static String DEVICE_UPDATE = "编辑设备";
    public final static String DEVICE_DOWN_BARCODE = "下载条形码";

    //移动扫描端
    public final static String SCAN_LOGIN = "登录";
    public final static String SCAN_DISCARD = "报废";
    public final static String SCAN_CHOOSE_SHUFFLE = "选择洗牌方式";

}
