package com.dx.facade.report.param.member;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyMemberNetListReqDTO {

    @ApiModelProperty(value = "开始时间",required = true)
    private Integer startDate;

    @ApiModelProperty(value = "结束时间",required = true)
    private Integer endDate;

    @ApiModelProperty(value = "代理ID", required = true)
    private Long proxyId;

    @ApiModelProperty(value = "会员ID", required = true)
    private String memberId;

    @ApiModelProperty("会员账号")
    private String memberUserName;

    @ApiModelProperty("代理账号")
    private String proxyUserName;

    @ApiModelProperty("会员级别类型；1=直属，2=全部")
    private Integer memberLevelType = 2;

    @ApiModelProperty("查询日期类型：1=按照日，2=按照月")
    private Integer queryDateType;

    /**
     * orderKey
     */
    @Min(value = 1, message = "排序序号最小为1")
    @Max(value = 7, message = "排序序号最大为7")
    @ApiModelProperty(value = "排序列: 1-总投注,2-总有效投注,3-游戏盈亏,4-会员返水,5-会员优惠,6-账户调整,7-总盈亏", example = "1")
    private Integer orderKey;

    @ApiModelProperty(value = "排序方式：升序：asc/降序：desc", example = "desc")
    private String orderType = "desc";
}
