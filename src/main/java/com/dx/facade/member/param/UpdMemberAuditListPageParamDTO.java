package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdMemberAuditListPageParamDTO {

    @ApiModelProperty("商户ID列表")
    private List<Long> merchantIdLs;

    @ApiModelProperty("账号类型 （0-会员 1-代理）")
    private Integer userType;

    @ApiModelProperty(value="时间类型，0-申请时间, 1-审核完成时间")
    private Integer timeType;

    @ApiModelProperty(value="开始时间")
    private String timeStart;

    @ApiModelProperty(value="结束时间")
    private String timeEnd;

    @ApiModelProperty("操作人类型：0-申请人, 1-审核人")
    private Integer operatorType;

    @ApiModelProperty("操作人")
    private String operatorName;

    @ApiModelProperty("审核状态（0-待处理 1-处理中，2-审核通过，3-审核拒绝）")
    private Integer auditStatus;

    @ApiModelProperty("锁单状态（0-未锁定 1-已锁定）")
    private Integer lockStatus;

}
