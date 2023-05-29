package com.dx.facade.account.req;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArtificialAccountAddRecordPageParmDTO implements BaseParmDTO, Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商户id", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<Long> merchantIdLs;

    @ApiModelProperty(value = "用户类型(0=会员 1=代理)",required = true, example = "1")
    private Integer userType;

    @ApiModelProperty(value = "账号", example = "abc123456")
    private String userName;

    @ApiModelProperty(value = "钱包类型")
    private Integer walletType;

    @ApiModelProperty(value="调整类型（会员）：1-人工充值、2-会员返水、3-会员存款后台、4-其他调整;调整类型（代理）：1-活动奖励、2-佣金、3-红利、4-监管调整、5-代客代存",example = "1")
    private Integer adjustType;

    @ApiModelProperty(value="调整金额-最小值",example = "10")
    private BigDecimal adjustAmountMin;

    @ApiModelProperty(value="调整金额-最大值",example = "1000")
    private BigDecimal adjustAmountMax;

    @ApiModelProperty(value = "订单号", example = "4544654647")
    private String eventId;

    @ApiModelProperty(value = "申请时间-开始", required = true, example = "2021-06-16 00:00:00")
    private String eventTimeStart;

    @ApiModelProperty(value = "申请时间-截止", required = true, example = "2021-06-16 23:59:59")
    private String eventTimeEnd;

    @ApiModelProperty(value = "审核时间-开始", required = true, example = "2021-06-16 00:00:00")
    private String auditTimeStart;

    @ApiModelProperty(value = "审核时间-截止", required = true, example = "2021-06-16 23:59:59")
    private String auditTimeEnd;

    @ApiModelProperty(value = "订单状态(3=审核拒绝,4=审核通过 默认为全部)")
    private Integer orderStatus;;

    @ApiModelProperty(value = "排序列:1-申请时间")
    private Integer orderKey;

    @ApiModelProperty(value = "排序方式(1)：desc-降序 asc-升序",example = "asc")
    private String orderType;

    @Override
    public void check() {
        Assert.notNull(userType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userType"));
    }
}