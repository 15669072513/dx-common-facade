package com.dx.facade.report.param.proxy;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyCommissionOperateRecordReqDTO {
    @ApiModelProperty(value="申请时间开始，格式：yyyy-MM-dd HH:mm:ss")
    private String applyTimeStart;

    @ApiModelProperty(value="申请时间结束，格式：yyyy-MM-dd HH:mm:ss")
    private String applyTimeEnd;

    @ApiModelProperty(value="佣金类型1=代发佣金,2=取消佣金,3=佣金加减")
    private Integer operateType;

    @ApiModelProperty(value="收款账号")
    private String inUserName;

    @ApiModelProperty(value="商户ID")
    private String merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

    @ApiModelProperty(value="操作人")
    private String operateName;

    @ApiModelProperty(value="代理账号")
    private String proxyName;

    @ApiModelProperty(value="排序")
    private String orderType;
}
