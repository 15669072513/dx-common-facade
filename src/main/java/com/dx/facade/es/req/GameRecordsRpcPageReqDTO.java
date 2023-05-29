package com.dx.facade.es.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description: 游戏注单 分页查询请求参数封装
 * @version: v1.0.0
 * @author: fitz
 * @date: 2022/9/24 13:10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GameRecordsRpcPageReqDTO {
	
	@ApiModelProperty("商户Ids")
	private List<Long> merchantIds;
	@ApiModelProperty("注单ID")
	private String id;
	@ApiModelProperty("第三方订单号")
	private String thirdOrderId;
	@ApiModelProperty(value = "下注时间-开始 格式：yyyy-MM-dd HH:mm:ss", required = true, example = "2021-06-08 12:00:00")
	private String createAtStart;
	@ApiModelProperty(value = "下注时间-截止 格式：yyyy-MM-dd HH:mm:ss", required = true, example = "2021-06-08 12:00:00")
	private String createAtEnd;
	@ApiModelProperty("结算时间-开始 格式：yyyy-MM-dd HH:mm:ss")
	private String netAtStart;
	@ApiModelProperty("结算时间-截止 格式：yyyy-MM-dd HH:mm:ss")
	private String netAtEnd;
	@ApiModelProperty(value = "场馆类型 示例：ty zr dj dy cp qp by 等")
	private String venueType;
	@ApiModelProperty(value = "场馆名称 示例：如ob真人,ob捕鱼,ag真人,FC电子等")
	private List<String> venueName;
	@ApiModelProperty("游戏名称")
	private String gameTypeName;
	@ApiModelProperty("会员账号")
	private String memberName;
	@ApiModelProperty("游戏账号")
	private String playerName;
	@ApiModelProperty("上级代理")
	private String parentProxyName;
	@ApiModelProperty(value = "总代账号")
	private String proxyName;
	@ApiModelProperty("注单状态 1已结算 2未结算 3已取消")
	private String betStatus;
	@ApiModelProperty("投注金额-最小值")
	private BigDecimal betAmountMin;
	@ApiModelProperty("投注金额-最大值")
	private BigDecimal betAmountMax;
	@ApiModelProperty("会员输赢-最小值")
	private BigDecimal netAmountMin;
	@ApiModelProperty("会员输赢-最大值")
	private BigDecimal netAmountMax;
	@ApiModelProperty("投注ip")
	private String loginIp;
	@ApiModelProperty("设备类型 PC，IOS_APP，IOS_H5，Android_H5，Android_APP，IOS， Android，H5")
	private List<String> deviceType;
	@ApiModelProperty(value = "vip等级序号-最小值")
	private Integer vipSerialNumMin;
	@ApiModelProperty(value = "vip等级序号-最大值")
	private Integer vipSerialNumMax;
	@ApiModelProperty("排序列(1)：1-投注金额  2-会员输赢 3-投注时间 4-结算时间 5-返水比例 6-返水金额 7-有效投注 8-串关首场开始时间 9-预计最高可赢")
	private Integer orderKey;
	@ApiModelProperty("排序方式(1)：desc-降序 asc-升序")
	private String orderType;

}
