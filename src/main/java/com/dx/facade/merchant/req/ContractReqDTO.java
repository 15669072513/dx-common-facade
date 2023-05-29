package com.dx.facade.merchant.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel(value = "ContractReqDTO", description = "接受契约传参对象")
public class ContractReqDTO {


    @ApiModelProperty(value = "商户id")
    public Long merchantId;

    @ApiModelProperty(value = "代理ID",hidden = true)
    private Long proxyId ;

    @ApiModelProperty(value = "契约id")
    private Long contractId ;

    @ApiModelProperty(value = "来源 1 平台 2app")
    private Integer sourceType ;

    @ApiModelProperty(value = "最低比例", required = true)
    private BigDecimal beginRate;

    @ApiModelProperty(value = "最高比例", required = true)
    private BigDecimal endRate;

    @ApiModelProperty(value="备注")
    private String remark;

    @ApiModelProperty(value = "操作人",hidden = true)
    private String updatedBy;

}
