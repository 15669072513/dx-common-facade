package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

import com.dx.facade.account.req.ActivityBonusReleaseEasyExcel;

@Data
public class CheckSubmitBonusRespDTO implements Serializable {

    private static final long serialVersionUID = -4570946269473774727L;

    @ApiModelProperty(value = "计划解析数")
    private Integer plan;

    @ApiModelProperty(value = "成功解析数")
    private Integer success;

    @ApiModelProperty(value = "解析失败集合")
    List<ActivityBonusReleaseEasyExcel> failList;

}
