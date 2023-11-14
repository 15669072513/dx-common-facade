package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class DxSettlementCommissionProxyRecordLogReqDTO {
    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @NotNull(message = "分页参数不能为空")
    @Min(value = 1, message = "当前页最小值不能小于1")
    protected Long pageNum = 1L;

    @ApiModelProperty(value = "每页条数,默认20条", required = true, example = "10")
    @NotNull(message = "分页参数不能为空")
    @Range(min = 1, max = 500, message = "每页条数必须 ≥ 1 并且 ≤ 500")
    protected Long pageSize = 20L;
    /**
     * 商户id
     */
    @ApiModelProperty("商户id")
    private Long merchantId;
    /**
     * '1：调整返佣增加，2：调整返佣减少，3：返佣取消，4：代发佣金）
     */
    @ApiModelProperty("'操作类型（1：调整返佣增加，2：调整返佣减少，3：返佣取消，4：代发佣金）")
    private List<Integer> operationTypes;
    /**
     * 操作时间
     */
    @ApiModelProperty("操作时间")
    private LocalDateTime operationStartTime;
    /**
     * 操作时间
     */
    @ApiModelProperty("操作时间")
    private LocalDateTime operationEndTime;

    /**
     * 代理账号&收款代理账号
     */
    @ApiModelProperty("代理账号")
    private String proxyName;
    /**
     * 付款代理账号
     */
    @ApiModelProperty("付款代理账号")
    private String payProxyName;
    /**
     * 操作人
     */
    @ApiModelProperty("操作人")
    private String operateName;

}
