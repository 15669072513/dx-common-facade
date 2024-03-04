package com.dx.facade.member.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 下级会员、会员列表 分页查询 参数封装
 * @version: v1.0.0
 * @author: fitz
 * @date: 2021/9/29
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LowerMemberListReqDto {
	@ApiModelProperty(value = "当前代理账号的id")
	private Long curUserId;

	@ApiModelProperty(value = "当前代理账号")
	private String curUserName;
	
	@ApiModelProperty(value = "会员账号/代理账号")
	private String userName;

	@ApiModelProperty(value = "商户ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
	@ApiModelProperty(value = "层级：1-全部会员、2-直属会员")
	private Integer proxyLevel;
	
	@ApiModelProperty("排序：1-注册时间近至远 2-登录时间近至远 3-存款大至小 4-取款大至小 5-存款小到大 6-取款小到大 7-注册事情远至近 8-登录时间远至近")
	private Integer orderType;
	
	@ApiModelProperty(value = "代理pc排序列(1)：1-总存款  2-总取款 3-注册时间 4-最后登录时间")
	private Integer sortKey;
	
	@ApiModelProperty(value = "排序 升序-asc 降序-desc")
	private String sortType;

	@ApiModelProperty(value = "是否是代理web")
	private Boolean isWeb = false;
	@ApiModelProperty("身份1代理 0会员")
	private Integer identityCode;

	@ApiModelProperty("所属代理账号")
	private String parentProxyName;

	@ApiModelProperty("注册时间开始")
	private String occurDtStart;

	@ApiModelProperty("注册时间结束")
	private String occurDtEnd;

	@ApiModelProperty("最后登录时间-开始")
	private String startDate;

	@ApiModelProperty("最后登录时间-结束")
	private String endDate;

	@ApiModelProperty(value = "俱乐部id")
	private Long clubId;

	@ApiModelProperty("游戏锁定状态 0-未锁定 1-游戏锁定")
	private Integer gameLockStatus;
	
	@ApiModelProperty("入局锁定状态 0-未锁定 1-入局锁定")
	private Integer joinGameLockStatus;

	@ApiModelProperty("仅限直属会员可见开关 0-隐藏 1-可见")
	private Integer onlyDirectMemberSwitch ;
}