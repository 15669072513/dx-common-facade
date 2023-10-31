package com.dx.facade.report.param.proxydayreport;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyDayReportReqDTO  {

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "统计开始日期")
    private Long startTime;

    @ApiModelProperty(value = "统计结束日期")
    private Long endTime;

    @ApiModelProperty(value = "详情页proxyId")
    private Long proxyId;

    @ApiModelProperty(value = "注册开始时间", example = "2021-06-17")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String registerStartTime;

    @ApiModelProperty(value = "注册结束时间", example = "2021-06-17")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String registerEndTime;

    @ApiModelProperty(value = "代理账号", example = "zw9z_string0001")
    private String proxyName;

    @ApiModelProperty(value = "直属上级")
    private String parentProxyName;

    @ApiModelProperty(value = "账号类型  2-商务，3-正式，5-置换", example = "[2,3]", allowableValues = "[2,3,5]")
    private List<Integer> accountTypeList;

    @ApiModelProperty("累计返佣 - 最小")
    @Range(min = 0, max = 9999999999L, message = "累计返佣必须 ≥ 0 并且 ≤ 9999999999")
    private Long rebateMin;

    @ApiModelProperty("累计返佣 - 最大")
    @Range(min = 0, max = 9999999999L, message = "累计返佣必须 ≥ 0 并且 ≤ 9999999999")
    private Long rebateMax;

    @ApiModelProperty("累计返点 - 最小")
    @Range(min = 0, max = 9999999999L, message = "累计返佣必须 ≥ 0 并且 ≤ 9999999999")
    private Long giveBackMin;

    @ApiModelProperty("累计返点 - 最大")
    @Range(min = 0, max = 9999999999L, message = "累计返佣必须 ≥ 0 并且 ≤ 9999999999")
    private Long giveBackMax;

    @ApiModelProperty(value = "排序列: 1-注册时间,2-总存款,3-存款次数,4-总取款,5-取款次数,6-大额取款次数,7-存取差,8-累计返佣,9-累计返点,10-代存会员总额,11-代存会员人数,12-代存会员次数," +
            "13-代理转账总额,14-代理转账人数,15-代理转账次数,16-转入现金钱包总额,17-转入现金钱包次数,18-总优惠,19-佣金调整,20-返点调整," +
            "21-其他调整,22-佣金钱包余额,23-额度钱包余额,24-全部代理人数,25-直属代理人数,26-全部会员人数,27-直属会员人数,28-会员首存人数,29-会员首存总额,30-会员总存款," +
            "31-会员总取款,32-会员存取差,33-转入会员人数,34-转出会员人数")
    private Integer orderKey;

    @ApiModelProperty(value = "排序方式：升序：asc/降序：desc", example = "desc")
    private String orderType = "DESC";
}
