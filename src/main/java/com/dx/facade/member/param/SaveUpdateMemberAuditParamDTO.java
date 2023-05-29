package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaveUpdateMemberAuditParamDTO {

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("会员/代理ID")
    private Long userId;

    @ApiModelProperty("修改前")
    private String beforeModify;

    @ApiModelProperty("修改后")
    private String afterModify;

    @ApiModelProperty("单号")
    private String eventId;

    @ApiModelProperty("申请人")
    private String applyName;

    @ApiModelProperty("审核申请类型（1-姓名，2-性别，3-出生日期，4-手机号码，5-邮箱，6-账号状态，7-风控层级，8-会员标签）详见UpdateMemberAuditEnums.ApplyType")
    private Integer applyType;

    @ApiModelProperty("申请备注")
    private String applyRemark;

}
