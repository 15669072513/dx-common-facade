package com.dx.facade.report.param.proxynetamountmonth;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

/**
 * ProxyNetAmountMonthReqDto
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午3:46:05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyNetAmountMonthReqDTO {

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

    @ApiModelProperty("商户Id")
    private Long merchantId;

    /** proxyName */
    @ApiModelProperty("代理账号")
    private String proxyName;

    /** parentProxyName */
    @ApiModelProperty("上级代理账号")
    private String parentProxyName;

    @ApiModelProperty("总代理账号")
    private String topProxyName;

    /** accountTypeList */
    @ApiModelProperty("代理类型")
    private List<Integer> accountTypeList;

    /** accountLevelList */
    @ApiModelProperty("代理层级")
    private List<String> accountLevelList;

    @ApiModelProperty(value = "开始月份", required = true, example = "202106")
    private Integer startMonth;

    @ApiModelProperty(value = "结束月份", required = true, example = "202106")
    private Integer endMonth;

    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @NotNull(message = "分页参数不能为空")
    @Min(value = 1, message = "当前页最小值不能小于1")
    private Long pageNum = 1L;

    @ApiModelProperty(value = "每页条数,默认20条", required = true, example = "10")
    @NotNull(message = "分页参数不能为空")
    @Range(min = 1, max = 500, message = "每页条数必须 ≥ 1 并且 ≤ 500")
    private Long pageSize = 20L;


}
