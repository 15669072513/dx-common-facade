//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class AuditCommisonReqDTO implements Serializable {
    @ApiModelProperty(value = "订单号")
    private List<String> orderNo;

    @ApiModelProperty(value = "1：待一审，2：待二审")
    private Integer auditStatus;

    @ApiModelProperty(value = "1：通过，2：拒绝")
    private Integer operationId;
}
