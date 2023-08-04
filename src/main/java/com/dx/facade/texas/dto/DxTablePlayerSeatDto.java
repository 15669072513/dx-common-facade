package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


@ApiModel("获取牌桌玩家座位信息")
@Data
public class DxTablePlayerSeatDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "座位类型大类 1:前位 2:中位 3:后位 4:盲位")
    private String seatType;

    @ApiModelProperty(value = "座位类型,参考枚举:TexasSeatTypeEnum")
    private Integer seatCode;

    @ApiModelProperty(value = "会员ID")
    private Long userId;
}
