package com.dx.facade.merchant.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RebateContractParam {

    @ApiModelProperty(value = "id ",hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Long id;

    @ApiModelProperty(value = "契约或模板ID",hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Long contractId;

    @ApiModelProperty(value = "等级序号",required = true,example = "1")
    public Integer level;

    @ApiModelProperty(value = "数据来源 1:模板配置 2:契约管理",required = true,example = "2")
    public Integer dataSourceType;

    @ApiModelProperty(value="代理净输赢要求",required = true,example = "1000")
    private BigDecimal netAmount;

    @ApiModelProperty(value="游戏流水要求",required = true,example = "1000")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value = "本月活跃人数要求",required = true,example = "10")
    private Long activeUsers;

    @ApiModelProperty(value = "本月有效活跃人数要求",required = true,example = "10")
    private Long effecactiveUsers;

    @ApiModelProperty(value = "本月新增有效活跃人数",required = true,example = "10")
    private Long monthAddActiveCount;

    @ApiModelProperty(value="返佣比例",required = true,example = "1")
    private BigDecimal rebateRate;

    @ApiModelProperty(value = "创建时间", example = "2021-09-16 07:13:54",hidden = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createDt;

    @ApiModelProperty(value = "更新时间", example = "2021-09-16 07:13:54",hidden = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastUpdateDt;

    @ApiModelProperty(value = "是否可用 1:超出 2:正常",hidden = true)
    public Integer available;

    @ApiModelProperty(value = "上级代理账号")
    private String parentProxyName;

}
