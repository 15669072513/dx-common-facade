package com.dx.facade.member.report.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 @title 取消佣金请求DTO
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年10月18日 13:43:23
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("取消佣金接口请求数据传输对象")
public class FundsPayoutStatusReqDTO {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "转出代理ID")
    private Long transOutId;

    @ApiModelProperty(value = "转出代理名称")
    private String transOutName;

    @ApiModelProperty(value = "审核用户Id")
    private Long currentUserId;

    @ApiModelProperty(value = "审核用户")
    private String currentUser;

    @ApiModelProperty(value = "审核备注")
    private String recordDesc;

    @ApiModelProperty(value = "报表月份")
    private String reportYm;

    @ApiModelProperty(value = "(左边代理树)点击的当前代理佣金记录的id")
    private Long commRecordId;
}
