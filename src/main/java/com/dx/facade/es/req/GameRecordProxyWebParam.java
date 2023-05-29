package com.dx.facade.es.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.util.Assert;

import com.dx.facade.common.PageRequest;
import com.dx.facade.member.exception.ErrorCode;
import com.dx.facade.member.param.BaseParmDTO;

@Data
@EqualsAndHashCode(callSuper = true)
public class GameRecordProxyWebParam extends PageRequest implements BaseParmDTO {
	
	@ApiModelProperty("投注时间-开始时间")
	private String startTime;
	
	@ApiModelProperty("投注时间-结束时间")
	private String endTime;
	
	@ApiModelProperty("注单号")
	private String id;
	
	@ApiModelProperty(value = "注单状态 0-未结算 1已结算 2-不结算(如果是全部,则不传此参数)")
	private Integer obBetStatus;
	
	@ApiModelProperty(value = "场馆code,见BwVenueEnum")
	private String venueCode;
	
	@ApiModelProperty(value = "会员账号")
	private String memberName;
	
	@ApiModelProperty(value = "上级代理Id",hidden = true)
	private Long proxyId;
	
	@ApiModelProperty("排序列(1)：1-投注金额 2-有效投注 3-游戏盈亏 4-投注时间 5-结算时间")
	private Integer orderKey;
	
	@ApiModelProperty(value = "排序列(1)：1-投注金额asc 2-投注金额desc 3-有效投注asc 4-有效投注desc 5-游戏盈亏asc 6-游戏盈亏desc 7-投注时间asc 8-投注时间desc 9-结算时间asc 10-结算时间desc", hidden = true)
	private Integer order;
	
	@ApiModelProperty("排序方式(1)：desc-降序 asc-升序")
	private String orderType;
	
	@Override
	public void check() {
		Assert.notNull(proxyId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("proxyId"));
	}
}



