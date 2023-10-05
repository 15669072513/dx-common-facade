package com.dx.facade.report.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class DwdBetMemberRecordDDTO {


    @ApiModelProperty(value="注单号")
    private String orderNo ;

    @ApiModelProperty(value="场馆名称")
    private String venueName;

    @ApiModelProperty(value="游戏名称")
    private String gameTypeName;

    @ApiModelProperty(value="注单时间")
    private Long createAt;

    @ApiModelProperty(value="注单时间2")
    private LocalDateTime createAt2;

    @ApiModelProperty(value="上级代理")
    private String parentProxyName;


    @ApiModelProperty(value="有效投注金额")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value="返水比例")
    private BigDecimal rebateRate;


    @ApiModelProperty(value="返水金额")
    private BigDecimal rebateAmount;

    //@ApiModelProperty(value="实际返水金额")
    //private BigDecimal rebateAmount;





}
