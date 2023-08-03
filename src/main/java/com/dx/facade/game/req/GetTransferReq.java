package com.dx.facade.game.req;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class GetTransferReq extends PageRequest {


    @ApiModelProperty("会员账号")
    private String memberName;

    @ApiModelProperty("商户号")
    private Long merchantId;

    @ApiModelProperty("订单号")
    private String orderId;

    @ApiModelProperty("会员名")
    private String realName;

    @ApiModelProperty("转出钱包 中心钱包用center 全部传空")
    private String fromWallet;

    @ApiModelProperty("转入钱包 中心钱包用center 全部传空")
    private String toWallet;

    @ApiModelProperty("转账状态 0：初始 1：转账中 2: 成功 3：失败")
    private Integer transferStatus;

    @ApiModelProperty("转账时间结束")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime occurDtStart;

    @ApiModelProperty("转账时间结束")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime occurDtEnd;


    private List<Long> merchantIds;

}
