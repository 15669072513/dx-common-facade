package com.dx.facade.enums;

import java.util.Objects;
/**
 * 会员操作枚举
 * 
 * @author Bicycle
 *
 */
public class MemberOperationEnums {
	
	public MemberOperationEnums() {
    }
	/**
	 * 所属栏目
	 * 
	 * @author Bicycle
	 *
	 */
	public static enum Column {
		MEMBER_MANAGER(0, "会员管理"),;

		public Integer code;
		public String desc;

		private Column(Integer code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		public static String getDesc(Integer code) {
			MemberOperationEnums.Column column = getColumn(code);
			return Objects.nonNull(column) ? column.desc : "";
		}
		public static MemberOperationEnums.Column getColumn(Integer code) {
			MemberOperationEnums.Column[] var1 = values();
			int var2 = var1.length;
			for (int var3 = 0; var3 < var2; ++var3) {
				MemberOperationEnums.Column column = var1[var3];
				if (column.code.equals(code)) {
					return column;
				}
			}
			return null;
		}
	}
	
	/**
	 * 所属页面
	 * 
	 * @author Bicycle
	 *
	 */
	public static enum Page {
		MEMBER_DETAIL(0, "会员详情"),
		MEMBER_LABLE_CONFIG(1, "会员标签配置"),;
		
		public Integer code;
		public String desc;

		private Page(Integer code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		public static String getDesc(Integer code) {
			MemberOperationEnums.Page page = getPage(code);
			return Objects.nonNull(page) ? page.desc : "";
		}
		public static MemberOperationEnums.Page getPage(Integer code) {
			MemberOperationEnums.Page[] var1 = values();
			int var2 = var1.length;

			for (int var3 = 0; var3 < var2; ++var3) {
				MemberOperationEnums.Page page = var1[var3];
				if (page.code.equals(code)) {
					return page;
				}
			}
			return null;
		}
	}
	
	/**
	 * 操作类型
	 * 
	 * @author Bicycle
	 *
	 */
	public static enum OperationType {
	    ADD(1,"新增"),
	    EDIT(2, "编辑"),
	    HIDE(3,"隐藏"),
	    SHOW(4,"显示"),
	    ENABLE(5,"启用"),
	    DISABLE(6, "停用"),;
		
		public Integer code;
		public String desc;

		private OperationType(Integer code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		public static String getDesc(Integer code) {
			MemberOperationEnums.OperationType type = getType(code);
			return Objects.nonNull(type) ? type.desc : "";
		}
		public static MemberOperationEnums.OperationType getType(Integer code) {
			MemberOperationEnums.OperationType[] var1 = values();
			int var2 = var1.length;

			for (int var3 = 0; var3 < var2; ++var3) {
				MemberOperationEnums.OperationType type = var1[var3];
				if (type.code.equals(code)) {
					return type;
				}
			}
			return null;
		}
	}
	
	/**
	 * 操作功能
	 * 
	 * @author Bicycle
	 *
	 */
	public static enum OperationFunc {
	    ACCOUNT_STATUS(1,"账号状态"),
	    RISK_CONTROL_LEVEL(2, "风控层级"),
	    MEMBER_LABLE(3,"会员标签"),
	    PHONE_NO(4,"手机号码"),
	    BIRTH_DAY(5,"出生日期"),
	    NICKNAME(6, "会员昵称"),
	    GENDER(7, "性别"),
	    EMAIL(8, "邮箱"),
	    REMARK(9, "账号备注"),
	    RESET_PASSWORD(10, "登录密码重置"),
	    CREDI_LEVEL(11, "信用等级"),
	    RESET_PAY_PASSWORD(12, "支付密码重置"),
	    REAL_NAME(13, "姓名"),
	    ;
		
		public Integer code;
		public String desc;

		private OperationFunc(Integer code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		public static String getDesc(Integer code) {
			MemberOperationEnums.OperationFunc func = getFunc(code);
			return Objects.nonNull(func) ? func.desc : "";
		}
		public static MemberOperationEnums.OperationFunc getFunc(Integer code) {
			MemberOperationEnums.OperationFunc[] var1 = values();
			int var2 = var1.length;

			for (int var3 = 0; var3 < var2; ++var3) {
				MemberOperationEnums.OperationFunc func = var1[var3];
				if (func.code.equals(code)) {
					return func;
				}
			}
			return null;
		}
	}
	
	
}