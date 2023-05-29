package com.dx.facade.enums;

import lombok.Data;

import java.util.Objects;

/**
 * 异常注单相关枚举
 *
 * @author fitz
 * @version 1.0.0
 * @since 2021年11月14日 下午7:35:27
 */
@Data
public class GameExceptionRecordEnum {
	
	/**
	 * 异常类型 1. 重算  2. 更改  3. 延迟
	 */
	public static enum ExceptionType {
		RECALCULATE(1, "重算"),
		CHANGE(2, "更改"),
		DELAY(3, "延迟");
		
		public Integer code;
		public String desc;
		
		private ExceptionType(Integer code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		
		public static String getDesc(Integer code) {
			ExceptionType exceptionType = getType(code);
			return Objects.nonNull(exceptionType) ? exceptionType.desc : "";
		}
		
		public static ExceptionType getType(Integer code) {
			ExceptionType[] var1 = values();
			int var2 = var1.length;
			
			for(int var3 = 0; var3 < var2; ++var3) {
				ExceptionType exceptionType = var1[var3];
				if (exceptionType.code.equals(code)) {
					return exceptionType;
				}
			}
			return null;
		}
	}
	
	/**
	 * 重算状态（1-未重算 2-重算中 3-已重算 4-不处理）
	 */
	public static enum DealStatus {
		NOT_RECALCULATED(1, "未重算"),
		RECALCULATING(2, "重算中"),
		RECALCULATED(3, "已重算"),
		DONT_DEAL(4, "不处理");
		
		public Integer code;
		public String desc;
		
		private DealStatus(Integer code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		
		public static String getDesc(Integer code) {
			DealStatus dealStatus = getType(code);
			return Objects.nonNull(dealStatus) ? dealStatus.desc : "";
		}
		
		public static DealStatus getType(Integer code) {
			DealStatus[] var1 = values();
			int var2 = var1.length;
			
			for(int var3 = 0; var3 < var2; ++var3) {
				DealStatus dealStatus = var1[var3];
				if (dealStatus.code.equals(code)) {
					return dealStatus;
				}
			}
			return null;
		}
	}
	
	/**
	 * 处理结果 1-应用成功 2-应用失败
	 */
	public static enum DealResult {
		SUCCESS(1, "成功"),
		FAILED(2, "失败");
		
		public Integer code;
		public String desc;
		
		private DealResult(Integer code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		
		public static String getDesc(Integer code) {
			DealResult dealResult = getType(code);
			return Objects.nonNull(dealResult) ? dealResult.desc : "";
		}
		
		public static DealResult getType(Integer code) {
			DealResult[] var1 = values();
			int var2 = var1.length;
			
			for(int var3 = 0; var3 < var2; ++var3) {
				DealResult dealResult = var1[var3];
				if (dealResult.code.equals(code)) {
					return dealResult;
				}
			}
			
			return null;
		}
	}
	
	public static enum RebateResult {
		SUCCESS(1, "返水重算成功"),
		FAILED(2, "返水重算失败");
		
		public Integer code;
		public String desc;
		
		private RebateResult(Integer code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		
		public static String getDesc(Integer code) {
			RebateResult rebateResult = getType(code);
			return Objects.nonNull(rebateResult) ? rebateResult.desc : "";
		}
		
		public static RebateResult getType(Integer code) {
			RebateResult[] var1 = values();
			int var2 = var1.length;
			
			for(int var3 = 0; var3 < var2; ++var3) {
				RebateResult rebateResult = var1[var3];
				if (rebateResult.code.equals(code)) {
					return rebateResult;
				}
			}
			
			return null;
		}
	}
	
	public static enum RebateRateResult {
		SUCCESS(1, "返点重算成功"),
		FAILED(2, "返点重算失败");
		
		public Integer code;
		public String desc;
		
		private RebateRateResult(Integer code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		
		public static String getDesc(Integer code) {
			RebateRateResult rebateRateResult = getType(code);
			return Objects.nonNull(rebateRateResult) ? rebateRateResult.desc : "";
		}
		
		public static RebateRateResult getType(Integer code) {
			RebateRateResult[] var1 = values();
			int var2 = var1.length;
			
			for(int var3 = 0; var3 < var2; ++var3) {
				RebateRateResult rebateRateResult = var1[var3];
				if (rebateRateResult.code.equals(code)) {
					return rebateRateResult;
				}
			}
			return null;
		}
	}
	
	public static enum CommissionResult {
		SUCCESS(1, "佣金重算成功"),
		FAILED(2, "佣金重算失败");
		
		public Integer code;
		public String desc;
		
		private CommissionResult(Integer code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		
		public static String getDesc(Integer code) {
			CommissionResult commissionResult = getType(code);
			return Objects.nonNull(commissionResult) ? commissionResult.desc : "";
		}
		
		public static CommissionResult getType(Integer code) {
			CommissionResult[] var1 = values();
			int var2 = var1.length;
			
			for(int var3 = 0; var3 < var2; ++var3) {
				CommissionResult commissionResult = var1[var3];
				if (commissionResult.code.equals(code)) {
					return commissionResult;
				}
			}
			
			return null;
		}
	}
	
	public static enum ExceptionBetStatus {
		UN_SETTLEMENT(0, "未结算"),
		SETTLED(1, "已结算"),
		CANCEL(2, "取消"),
		HAS_WON(3, "已中奖"),
		NOT_WINNING(4, "未中奖"),
		TO_BE_DETERMINED(13, "待确定"),
		BET_FAILED(14, "投注失败"),
		REVOKE(15, "撤销"),
		HANG(24, "挂起"),
		ERROR(-1, "错误");
		
		public Integer code;
		public String desc;
		
		private ExceptionBetStatus(Integer code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		
		public static String getDesc(Integer code) {
			ExceptionBetStatus status = getType(code);
			return Objects.nonNull(status) ? status.desc : "";
		}
		
		public static ExceptionBetStatus getType(Integer code) {
			ExceptionBetStatus[] var1 = values();
			int var2 = var1.length;
			
			for(int var3 = 0; var3 < var2; ++var3) {
				ExceptionBetStatus status = var1[var3];
				if (status.code.equals(code)) {
					return status;
				}
			}
			return null;
		}
	}
	
	
	public static enum TyBetResult {
		NO_RESULT(0, "无结果"),
		WATER(2, "走水"),
		LOSE(3, "输"),
		WIN(4, "赢"),
		WIN_HALF(5, "赢一半"),
		LOSE_HALF(6, "输一半");
		
		public Integer code;
		public String desc;
		
		private TyBetResult(Integer code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		
		public static String getDesc(Integer code) {
			TyBetResult status = getType(code);
			return Objects.nonNull(status) ? status.desc : "";
		}
		
		public static TyBetResult getType(Integer code) {
			TyBetResult[] var1 = values();
			int var2 = var1.length;
			
			for(int var3 = 0; var3 < var2; ++var3) {
				TyBetResult status = var1[var3];
				if (status.code.equals(code)) {
					return status;
				}
			}
			return null;
		}
	}
	
}
