package com.dx.facade.member.param;

import com.dx.enums.ConstantEnums;
import com.dx.facade.enums.ActivityEnums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/**
 * 会员详情-会员信息编辑 邮箱 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "com-ob-param-MemberInfoRpcEditActivityTaskLimit", description = "会员信息编辑-活动流水限制")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfoRpcEditActivityTaskLimit implements Serializable {
	
    @ApiModelProperty(value = "场馆钱包")
    private String gameCode;
	
	@ApiModelProperty("活动类型:1=首存活动，2=vip晋级优惠 枚举 TaskType")
	private Integer taskType;
	
	public Integer getTaskType() {
		if (Objects.equals(taskType, ActivityEnums.TaskType.FIRST_DEPOSIT_ACTIVITY.code())){
			return ConstantEnums.EnumApplyType.首存.code;
		}else if (Objects.equals(taskType,ActivityEnums.TaskType.VIP_PROMOTION_ACTIVITY.code())){
			return ConstantEnums.EnumApplyType.VIP晋级.code;
		}else {
			return -1;
		}
	}
	
}
