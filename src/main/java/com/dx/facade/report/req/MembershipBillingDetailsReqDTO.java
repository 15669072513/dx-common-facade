package com.dx.facade.report.req;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author rebuy
 * @description： 会员帐单详情入参
 */
@Setter
@Getter
@ApiModel("帐单详情请求参数")
public class MembershipBillingDetailsReqDTO {
    @ApiModelProperty("账单号")
    private String billNo;
    @ApiModelProperty("是否比较上期账单")
    private Boolean isCompareLastBill;
    @JsonIgnore
    private Long userId;
    @JsonIgnore
    private Long merchantId;
    @JsonIgnore
    private Integer reportDate;
}
