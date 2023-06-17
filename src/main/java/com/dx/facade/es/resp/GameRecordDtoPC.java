package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameRecordDtoPC {
    @ApiModelProperty("带场馆code拼接的注单id(如OBTY_8923472),用这个就行")
    private String id;

    @ApiModelProperty("注单id(暂时不需要这个id)")
    private String generatedId;

    @ApiModelProperty("场馆code(如agzr,imsb,cp,dj,cq9)")
    private String venueCode;

    @ApiModelProperty("注单状态 0-未结算 1已结算 2-不结算")
    private Integer obBetStatus;

    @ApiModelProperty("投注内容(由现有字段生成的字段,为app和管理后台展示用)")
    private String betContent;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注金额")
    private BigDecimal validBetAmount;

    @ApiModelProperty("会员输赢")
    private BigDecimal netAmount;

    @ApiModelProperty("投注时间")
    private Long createAt;

    //------------上述为索引中的字段,下面为额外添加的字段------------

    @ApiModelProperty("投注时间(yyyy-MM-dd HH:mm:ss)")
    private String createAtString;

    @ApiModelProperty("场馆名称(如ob真人,ag捕鱼)")
    private String venueName;

    @ApiModelProperty("场馆图标url")
    private String venueIconUrl;
}
