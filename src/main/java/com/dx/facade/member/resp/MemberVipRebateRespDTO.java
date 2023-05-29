package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MemberVipRebateRespDTO {


    @ApiModelProperty("游戏id")
    private Long gameId;

    @ApiModelProperty("配置信息json字段（vip等级/返水比例值）")
    private String configVipRebate;

    @ApiModelProperty("是否默认返水(0=不是默认返水,1=默认返水)")
    private Integer defaultType;

    @ApiModelProperty("接入参数")
    private String accessInfo;


}
