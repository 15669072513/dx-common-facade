package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameRecordProxyWebRespDTO {
	
	
    @ApiModelProperty("注单号")
    private String id;
	
	@ApiModelProperty("会员账号")
	private String memberName;

    @ApiModelProperty("场馆code(如agzr,imsb,cp,dj,cq9)")
    private String venueCode;

    @ApiModelProperty("场馆类型code(见BwVenueTypeEnum)")
    private String venueTypeCode;
	
	@ApiModelProperty("场馆名称(如ob真人,ag捕鱼)")
	private String venueName;

    @ApiModelProperty("注单状态 0-未结算 1已结算 2-不结算 ")
    private Integer obBetStatus;
	
	@ApiModelProperty("游戏名称")
	private String gameTypeName;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注金额")
    private BigDecimal validBetAmount;

    @ApiModelProperty("游戏盈亏")
    private BigDecimal netAmount;

    @ApiModelProperty("投注时间")
    private String createAt;
	
	@ApiModelProperty("结算时间")
	private String netAt;
}
