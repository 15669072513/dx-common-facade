package com.dx.facade.report.param.member;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 会员预期发水分页查询
 */
@Data
@ApiModel(value = "MemberExpectRebateReqDTO", description = "会员预期发水分页查询")
public class MemberExpectRebateReqDTO extends PageRequest {

    @ApiModelProperty("会员账号名")
    private String memberAccount;

    /**
     * proxyName
     */
    @ApiModelProperty("直属代理账号")
    private String proxyName;
    @ApiModelProperty("总代理账号")
    private String topProxyAccount;
    /**
     * 所属商户id
     */

    @ApiModelProperty("所属商户id")
    private Long merchantId;
    /**
     * orderKey
     */
    @ApiModelProperty(value = "排序字段", example = "1")
    private String orderKey;

    /**
     * orderType
     */
    @ApiModelProperty(value = "排序方式：升序：asc/降序：desc", example = "desc")
    private String orderType = "asc";
}
