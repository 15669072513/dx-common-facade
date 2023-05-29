package com.dx.facade.report.resp.rebate;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
* 会员返水记录分页查询 返回参数
*
* @author fitz
* @version 1.0.0
* @date 2021/06/02
*/
@ApiModel(value="com-ob-member-resp-MemberRebateRecordRpcPageRespDTO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberRebateRecordRpcPageRespDTO implements Serializable {


	@ApiModelProperty(value = "注单号")
	private String betNum;
	
	@ApiModelProperty(value="场馆id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long venueId;

	@ApiModelProperty(value="场馆名称")
	private String venueName;
	
	@ApiModelProperty(value="游戏id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long gameId;

	@ApiModelProperty(value="游戏名称")
	private String gameName;

	@ApiModelProperty(value = "投注时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime betTime;

	@ApiModelProperty(value="vip等级")
	private Integer vipSerialNum;

	@ApiModelProperty(value="上级代理")
	private String parentProxyName;

	@ApiModelProperty(value="注单性质(1原始单,2总代吃单,3总代坐庄单,4总代转单)")
	private Integer orderNature;

	@ApiModelProperty(value="有效投注金额")
	private BigDecimal validBetAmount;

	@ApiModelProperty(value="返水比例 %")
	private BigDecimal rebateRatio;

	@ApiModelProperty(value="返水金额")
	private BigDecimal rebateAmount;

	@ApiModelProperty(value = "坐庄返水金额")
	private BigDecimal holderRebateAmount;

	@ApiModelProperty(value="账号类型")
	private Integer accountType;

}