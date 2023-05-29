package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import com.dx.facade.report.param.base.LocalDatePageRequest;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("会员盈亏查询报表")
public class MemberNetAmountReqDTO extends LocalDatePageRequest {

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

    @ApiModelProperty("所属商户")
    private String merchantId;

    @ApiModelProperty("会员账号")
    private String userName;

    @ApiModelProperty("上级代理账号")
    private String parentProxyName;

    @ApiModelProperty("总代账号")
    private String topProxyName;
}
