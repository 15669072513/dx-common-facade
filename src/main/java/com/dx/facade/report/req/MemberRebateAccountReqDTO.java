package com.dx.facade.report.req;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("会员返水对账请求参数")
public class MemberRebateAccountReqDTO {

    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @NotNull(message = "分页参数不能为空")
    @Min(value = 1, message = "当前页最小值不能小于1")
    private Long pageNum = 1L;

    @ApiModelProperty(value = "每页条数,默认20条", required = true, example = "10")
    @NotNull(message = "分页参数不能为空")
    @Range(min = 1, max = 500, message = "每页条数必须 ≥ 1 并且 ≤ 500")
    private Long pageSize = 20L;

    @ApiModelProperty(value = "所属商户")
    private Long merchantId;
    @ApiModelProperty("开始结算时间，时间戳")
    private Integer netAtStart;
    @ApiModelProperty("结束结算时间，时间戳")
    private Integer netAtEnd;
    @ApiModelProperty(value = "会员账号")
    private String memberName;
    @ApiModelProperty(value = "总代账号")
    private String topProxyName;
    @ApiModelProperty("上级代理账号")
    private String parentProxyName;
    @ApiModelProperty("场馆名称 多个用,隔开")
    private String venueName;
    @ApiModelProperty("场馆类型 多个用,隔开")
    private String venueType;
    @ApiModelProperty("游戏名称")
    private String gameName;
    @ApiModelProperty(value = "注单号")
    private String betNo;


}
