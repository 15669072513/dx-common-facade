package com.dx.facade.member.param;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberAuditRecordPageParam extends PageRequest {

    @ApiModelProperty(value = "商户ID")
    //@NotNull(message = "商户ID不能为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "商户id", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<Long> merchantIds;

    @ApiModelProperty(value = "申请时间开始", required = true, example = "2021-05-01 00:00:00")
    private String applyTimeStart;

    @ApiModelProperty(value = "申请时间结束",required = true, example = "2021-05-01 00:00:00")
    private String applyTimeEnd;

    @ApiModelProperty(value = "审核开始时间",example = "2021-05-01 00:00:00")
    private String auditTimeStart;

    @ApiModelProperty(value = "审核结束时间(20)",example = "2021-05-01 00:00:00")
    private String auditTimeEnd;

//    @ApiModelProperty(value = "一审审核状态（0-未处理 1-审核处理，2-审核通过，3-审核拒绝）")
//    private List<String> auditStatus;

//    @ApiModelProperty(value="审核环节（0-已结束 1-一审审核 2-二审审核）",example = "1")
//    private Integer auditStep;

    @ApiModelProperty(value = "申请人",example = "admin")
    private String applyName;

    @ApiModelProperty(value = "审核人",example = "admin")
    private String auditName;

    @ApiModelProperty(value = "锁单状态（0-未锁定 1-已锁定）",example = "1")
    private Integer lockStatus;

    @ApiModelProperty("审核状态（0-待处理 1-处理中，2-审核通过，3-审核拒绝）")
    private Integer auditStatus;

//    @ApiModelProperty(value = "排序字段[1-审核状态：auditStatus, 2-申请时间：auditTime 3-审核时间：auditTime ]",example = "auditStatus")
//    private String orderProperties ;
////
//    @ApiModelProperty(value = "排序方式[升序：asc,降序：desc]",example = "desc")
//    private String orderType ;

}
