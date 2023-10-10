package com.dx.facade.member.proxy.resp;

import com.dx.annotation.I18nField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class MemberCommissionDetailRespDTO {

    /**
     * 锁单账号
     */
    @ApiModelProperty(value = "锁单账号")
    private String lockOperator;

    /**
     * 审核时间
     */
    @ApiModelProperty(value = "审核时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime auditTime;

    /**
     * 审核备注
     */
    @ApiModelProperty(value = "审核备注")
    @I18nField
    private String auditDesc;

    /**
     * 审核环节 1=一审 2=二审
     */
    @ApiModelProperty(value = "审核环节 1=一审 2=二审")
    private Integer auditStep;

}
