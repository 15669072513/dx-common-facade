package com.dx.facade.member.param;

import java.util.List;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClubAuditRecordPageParam extends PageRequest {

    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "商户id", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<Long> merchantIds;
    
    @ApiModelProperty(value = "代理ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyId;

    @ApiModelProperty(value = "申请时间开始", required = true, example = "2021-05-01 00:00:00")
    private String applyTimeStart;

    @ApiModelProperty(value = "申请时间结束",required = true, example = "2021-05-01 00:00:00")
    private String applyTimeEnd;

    @ApiModelProperty(value = "审核开始时间",example = "2021-05-01 00:00:00")
    private String auditTimeStart;

    @ApiModelProperty(value = "审核结束时间(20)",example = "2021-05-01 00:00:00")
    private String auditTimeEnd;

    @ApiModelProperty(value = "申请人",example = "admin")
    private String applyName;

    @ApiModelProperty(value = "审核人",example = "admin")
    private String auditName;

    @ApiModelProperty(value = "锁单状态（0-未锁定 1-已锁定）",example = "1")
    private Integer lockStatus;

    @ApiModelProperty("审核状态（0-待处理 1-处理中，3-审核通过，2-审核拒绝）")
    private Integer auditStatus;
    
    @ApiModelProperty("代理名称")
    private String proxyName;

    @ApiModelProperty("代理姓名")
    private String proxyRealName;
    
    @ApiModelProperty("总代名称")
    private String topProxyName;

}
