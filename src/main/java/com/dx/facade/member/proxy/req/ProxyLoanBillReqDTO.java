package com.dx.facade.member.proxy.req;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
public class ProxyLoanBillReqDTO extends LocalDatePageRequest {

    @ApiModelProperty(value = "账单结束日期", required = true, example = "20210602")
    @NotNull(message = "账单结束日期参数不能为空")
    private Integer billEndDate;

    @ApiModelProperty(value = "账单类型，0-未出，1-已出账单")
    private Integer billType;

    @ApiModelProperty("代理账号")
    private String proxyName;

    @ApiModelProperty("会员账号")
    private String memberName;

    @ApiModelProperty("账单号")
    private String billNo;

    @Min(value = 0, message = "应还借款最小为0")
    @ApiModelProperty(value = "应还借款最小值")
    private BigDecimal loanRepaymentMin;

    @ApiModelProperty(value = "应还借款最大值")
    private BigDecimal loanRepaymentMax;

    @Min(value = 0, message = "可提现额最小为0")
    @ApiModelProperty(value = "可提现额最小值")
    private BigDecimal withdrawableMin;

    @ApiModelProperty(value = "可提现额最大值")
    private BigDecimal withdrawableMax;

    @ApiModelProperty(value = "是否查看下级")
    private Boolean nextFlag;

    @ApiModelProperty(value = "查看数据类型，0-全选，1-自身，2-直属下级代理，3-全部下级代理，4-直属会员，5-全部下级会员")
    private List<Integer> proxyList;


}
