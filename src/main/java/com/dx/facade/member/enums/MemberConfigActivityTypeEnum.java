package com.dx.facade.member.enums;

import java.util.Objects;

/**
 * 好友邀请-活动指定会员表-活动类型
 * @author agan
 */
public class MemberConfigActivityTypeEnum {
	
	public enum EnumApplyType {
		//活动类型 1-纯展示页活动 2-首存活动 3-好友邀请活动
		纯展示页活动(1, "纯展示页活动"),
		首存活动(2, "首存活动"),
		好友邀请活动(3, "好友邀请活动"),
		排除纯展示页活动(4, "排除纯展示页活动"),
		排除首存活动(5, "排除首存活动"),
		排除好友邀请活动(6, "排除好友邀请活动");
		
		public Integer code;
		public String desc;
		
		EnumApplyType(Integer code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		
		public static String getDesc(Integer code) {
			EnumApplyType applyType = getType(code);
			return Objects.nonNull(applyType) ? applyType.desc : "";
		}

		public static EnumApplyType getType(Integer code) {
			EnumApplyType[] var1 = values();
			int var2 = var1.length;

			for(int var3 = 0; var3 < var2; ++var3) {
				EnumApplyType terminalType = var1[var3];
				if (terminalType.code.equals(code)) {
					return terminalType;
				}
			}
			return null;
		}
	}

}