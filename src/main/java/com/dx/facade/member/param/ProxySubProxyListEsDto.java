package com.dx.facade.member.param;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 信息面板-充提记录 取款记录返回前端参数VO
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/14
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxySubProxyListEsDto {
	
	@ApiModelProperty("代理id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long id;
	
	@ApiModelProperty("代理账号")
	private String userName;
	
	@ApiModelProperty("下级代理人数")
	private Integer underProxyNum;
	
	@ApiModelProperty("直属下级代理人数")
	private Integer directlyUnderProxyNum;
	
	@ApiModelProperty("下级会员人数")
	private Integer underMemberNum;
	
	@ApiModelProperty("直属下级会员人数")
	private Integer directlyUnderMemberNum;
	
	@ApiModelProperty(value = "累计首存人数")
	private Integer totalFirstDepositNum;

	@ApiModelProperty(value = "注册方式：0-手动 1-自动")
	private Integer registerType;
	
	@ApiModelProperty("注册时间")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime createDt;
	
	@ApiModelProperty(value = "最后登录时间")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime lastLoginTime;
	
	@ApiModelProperty(value = "离线天数 近xx天未登录")
	private Integer offLineDays;
	
	@ApiModelProperty(value = "代理层级路径(代理账号)")
	private List<String> proxyPathUsername;
	
	@ApiModelProperty(value = "登录权限：0-关闭 1-开启")
	private Integer loginLockStatus;
	
	@ApiModelProperty(value = "开局权限：0-关闭 1-开启")
	private Integer openLockStatus;
	
	@ApiModelProperty(value = "管理俱乐部权限：0-关闭 1-开启")
	private Integer manageClubLockStatus;
	
	@ApiModelProperty(value = "俱乐部数量")
	private Integer clubCount;
	
	@ApiModelProperty(value = "俱乐部人数")
	private Integer clubMemberCount;
	
    @ApiModelProperty("佣金钱包余额")
    private BigDecimal commissionBalance;

    @ApiModelProperty("额度钱包余额")
    private BigDecimal quotaBalance;
    
    @ApiModelProperty(value = "现金余额")
    private BigDecimal centerWalletBalance;
    
    @ApiModelProperty(value = "信用钱包余额")
    private BigDecimal creditWalletBalance;

    @ApiModelProperty(value = "信用额度")
    private BigDecimal creditQuota;

    @ApiModelProperty(value = "应收账款")
    private BigDecimal accountsReceivable;

	@ApiModelProperty(value = "应还借款" )
	private BigDecimal borrowAmount;

	@ApiModelProperty(value = "外放额度" )
	private BigDecimal dispatchAmount;

	@ApiModelProperty(value = "授信总额" )
	private BigDecimal teamCreditTotal;
    
    @ApiModelProperty("备注")
    private String remark;

	@ApiModelProperty(value="累计存款金额")
	private BigDecimal totalDepositAmount;

	@ApiModelProperty(value="累计提款金额")
	private BigDecimal totalWithdrawAmount;

	@ApiModelProperty(value = "支付密码重置审核状态 0 未审核   1 审核中")
	private Integer payPasswordAudit = 0;
}