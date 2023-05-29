package com.dx.facade.venue.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@Data
public class VenueStatusReq {
    @ApiModelProperty(value = "场馆id")
    @NotNull
    private Long venueId;

    @ApiModelProperty(value = "状态(0已禁用,1开启中,2维护中)")
    @Range(min = 0, max = 2)
    private Integer status;

    @ApiModelProperty("备注(用于场馆管理页面,当修改状态时,可能会输入)")
    private String changeStatusRemark;

    @ApiModelProperty(value = "当前登录用户", hidden = true)
    private String currentUser;

}
