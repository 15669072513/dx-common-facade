package com.dx.facade.report.message;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 会员升级通知
 */
@Data
public class MemberVipGradeChangeMessageDTO {
    @ApiModelProperty(value = "改变类型 0=升级，1=降级")
    private Integer vipChangeType;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "会员id")
    private Long userId;

    @ApiModelProperty(value = "会员账号")
    private String userName;

    @ApiModelProperty("vip等级id")
    private Long vipId;

    @ApiModelProperty("vip等级序号")
    private Integer vipSerialNum;

    @ApiModelProperty(value = "会员vip级别名字")
    private String vipGradeName;

    @ApiModelProperty(value = "改变时间")
    private LocalDateTime changeTime;
}
