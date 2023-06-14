package com.dx.facade.report.param.report.business;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.report.param.report.basic.UserBasicVo;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

public class UserReportReqDTO extends UserBasicVo {

    @ApiModelProperty("会员创建时间")
    @TableField("user_created_at")
    private LocalDateTime userCreatedAt;
}
