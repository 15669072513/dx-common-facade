package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("会员场馆类型盈亏统计天")
public class MemberVenueTypeNetReqDTO {
    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

    @ApiModelProperty("所属商户")
    private String merchantId;
    
    @ApiModelProperty(value = "开始时间",example = "20230313")
    private Integer dateStart;

    @ApiModelProperty(value = "结束时间",example = "20230314")
    private Integer dateEnd;

    @ApiModelProperty("场馆类型(如ty,zr,qkl)(见BwVenueTypeEnum)")
    private String venueType;

    @ApiModelProperty("会员账号")
    private String memberName;

    @ApiModelProperty("上级代理账号")
    private String parentProxyName;

    @ApiModelProperty("总代账号")
    private String topProxyName;
}
