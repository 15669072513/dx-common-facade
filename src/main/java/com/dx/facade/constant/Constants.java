package com.dx.facade.constant;

/**
 * @Description:
 * @Author: morman
 * @Date 2022/7/14
 */
public class Constants {

    public static final Integer ZERO = 0;
    public static final Long ZERO_L = 0L;
    public static final Integer ONE = 1;
    public static final Integer NEGATIVE_ONE = -1;
    public static final Long ONE_L = 1L;
    
    public static final Integer TWO = 2;
    public static final Integer THREE = 3;
    public static final Integer FOUR = 4;
    public static final Integer FIVE = 5;
    public static final Integer SIX = 6;
    public static final Integer EIGHT = 8;
    public static final Integer NINE = 9;
    public static final Integer TEN = 10;
    public static final Integer ELEVEN = 11;
	public static final Integer AUDIT_NUM_BOUND = 9999;
    public static final Integer HUNDRED = 100;
    public static final Integer TWOHUNDRED = 200;
    public static final String ASC = "asc";
    public static final String DESC = "desc";
    public static final String NULL = "暂无数据";
    public static final String  SLASH = "/";

    public static final String INVITATION_CODE_NOTIFY_TITLE = "【成为合营伙伴】";
    public static final String INVITATION_CODE_NOTIFY_CONTEXT = "恭喜您已通过平台合营申请审核成为正式代理，通过推广模块可以获取您的推广链接。契约是保证推广收益的前提，请前往我的契约模块确认自身是否签订契约哦";
    public static final String NEW_UNDER_MEMBER_CODE_NOTIFY_TITLE = "【新增下级会员通知】";
    public static final String NEW_UNDER_MEMBER_CODE_NOTIFY_CONTEXT = "新会员 %s 已转入到您的名下。祝您财源滚滚，大吉大利！";
    public static final Integer HALF_YEAR = 180;
    public static final Integer QUERTA_YEAR = 90;
    public static final String CONTRACT_CODE__SUB_TITLE = "【下级签约通知】";
    public static final String CONTRACT_CODE_PLATFROM_TITLE = "【平台代签通知】";
    public static final String CONTRACT_CODE_SIGN_TITLE= "【成功签署契约】";
    public static final String CONTRACT_CODE_SIGN_INFO = "在致富的道路上一路有你，愿我们携手共进再创辉煌。";
    public static final String CONTRACT_CODE_NEW_CONTEXT = "预祝您们在新的环境新的机遇中，合作愉快，万事如意。";
    public static final String CONTRACT_CODE_NEW_TITLE = "【新的契约通知】";
    public static final String CONTRACT_CODE_NEW_INFO = "可在【我的契约】页面可查看详情！契约是代理享受收益的前提，每一份契约都要细心检查哟。";
    public static final String MEMBER_EDIT_TITLE = "【个人资料修改成功通知】";
    public static final String MEMBER_EDIT_CONTEXT = "尊敬的%s : 您的%s已经修改成功。祝您财源滚滚，大吉大利！如有任何疑问，可联系客服。";
    public static final String MEMBER_REGISTER_TITLE = "【注册成功，欢迎加入本平台】";
    public static final String MEMBER_REGISTER_CONTEXT = "尊敬的%s : 恭喜您已经成为本平台正式会员。本平台拥有欧洲马耳他MGA、菲律宾政府（PAGCOR）颁发的合法执照。注册 于英属维尔京群岛，是受国际行业协会认可的合法公司，选择本平台将为您的账号和资金安全保驾护航。我们将为您提供全球最 顶级的体育赛事、真人娱乐、棋牌游戏、电子游戏等多种产品。 我们还为您提供了超便捷的存款方式和提款渠道，存款只需60 秒，提款只需要90秒即可快速到账。";
    public static final String CONTRACT_CODE_POLICY_TYPE= "【契约更改通知】";
    public static final String CONTRACT_CODE_POLICY_TYPE_INFO = "您的契约已调整，请尽快对下级代理签订新契约。祝您财源滚滚，大吉大利！";
    public static final String CONTRACT_CODE_INVALID= "【契约已失效】";
    public static final String CONTRACT_CODE_INVALID_INFO = "您的契约已失效，请联系上级代理签订新契约。祝您财源滚滚，大吉大利！";
    public static final String ACTIVITY_TASK_LIMIT = "解除%s活动流水限制";
    public static final String SIT_BANKER_NOTIFY_TITLE = "【开通坐庄】";
    public static final String SIT_BANKER_NOTIFY_CONTEXT = "恭喜您开通坐庄功能，祝您财源滚滚，大吉大利！";
    public static final String SLASH_i_CODE = "/?i_code=";
    public static final String SLASH_CODE = "/?code=";
    public static final String AND_CODE = "&code=";

	/**
	 * 账号 4-11位 至少两个字母加数字组合，首位字母
	 */
	public static final String REG_4_11 = "^[A-Za-z]{1}(?=(.*[a-zA-Z]){0,})(?=(.*[0-9]){1,})[0-9A-Za-z]{3,10}$";

}
