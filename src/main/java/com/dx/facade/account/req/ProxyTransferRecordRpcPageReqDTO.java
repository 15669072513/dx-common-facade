package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author grayson
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyTransferRecordRpcPageReqDTO {

    @ApiModelProperty(value="商户idList",required = true)
    private List<Long> merchantIdList;

    @ApiModelProperty(value="商户id",required = true)
    private Long merchantId;

    @ApiModelProperty(value = "业务类型，1代理代存，2代理转账")
    private Integer bizType;

    @ApiModelProperty(value = "子业务类型，详见Payment.ProxyAssistDepositType")
    private Integer type;

    @ApiModelProperty(value="事件ID")
    private String outEventId;

    @ApiModelProperty(value="转出账号",example = "acv13246")
    private String outUserName;

    @ApiModelProperty(value="转出姓名",example = "张三")
    private String outRealName;

    @ApiModelProperty(value="转出账户类型，AccountType",example = "6")
    private Integer outAccountType;

    @ApiModelProperty(value="转入账号",example = "acv13246")
    private String inUserName;

    @ApiModelProperty(value = "收款账号查询",example = "acv13246")
    private String username;

    @ApiModelProperty(value="状态(0=待处理 1=成功 2=失败)",example = "1")
    private Integer orderStatus;

    @ApiModelProperty(value="转账金额-最小值",example = "100")
    private BigDecimal amountMin;

    @ApiModelProperty(value="转账金额-最大值",example = "300")
    private BigDecimal amountMax;

    @ApiModelProperty(value="转账时间-开始",required = true,example = "2021-06-17 00:00:00")
    private String createdTimeStart;

    @ApiModelProperty(value="转账时间-截止",required = true,example = "2021-06-17 23:59:59")
    private String createdTimeEnd;

    @ApiModelProperty(value = "排序字段",example = "amount")
    private String orderField;

    @ApiModelProperty(value = "排序方式(1)：desc-降序 asc-升序",example = "asc")
    private String orderType;

}
