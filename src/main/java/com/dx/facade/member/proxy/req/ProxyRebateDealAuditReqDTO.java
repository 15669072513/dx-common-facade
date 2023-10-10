package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;
import java.util.List;

@ApiModel(value="返点审核请求",description = "返点审核请求")
@Data
public class ProxyRebateDealAuditReqDTO {

    @ApiModelProperty(value = "当前操作人Id")
    private Long auditUserId;

    @ApiModelProperty(value = "当前操作人")
    private String auditUser;
    @ApiModelProperty(value = "批量操作记录id")
    private List<Long> recordIdList;
    @ApiModelProperty(value = "备注")
    private String auditDesc;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "调整类型(1=返佣增加 2=返佣减少)",  example = "1")
    private Integer adjustType;

    @ApiModelProperty(value = "调整金额", example = "1")
    private BigDecimal adjustAmount;

}
