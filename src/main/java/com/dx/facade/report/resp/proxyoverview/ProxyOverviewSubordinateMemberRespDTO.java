package com.dx.facade.report.resp.proxyoverview;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "ProxyOverviewSubordinateMemberRespDTO", description = "下级会员")
public class ProxyOverviewSubordinateMemberRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("下级会员人数")
    private Integer underMemberNum;

    @ApiModelProperty("本月活跃会员人数")
    private Integer monthActiveNum;

    @ApiModelProperty("本月非活跃会员人数")
    private Integer monthNotActiveNum;
}
