package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * 会员VIP返水响应DTO
 * 
 * @author Administrator
 */
@Data
public class MemberVipRebateRespDTO {

	/** 游戏id */
    @ApiModelProperty("游戏id")
    private Long gameId;

    /** 配置信息json字段（vip等级/返水比例值） */
    @ApiModelProperty("配置信息json字段（vip等级/返水比例值）")
    private String configVipRebate;

    /** 是否默认返水(0=不是默认返水,1=默认返水) */
    @ApiModelProperty("是否默认返水(0=不是默认返水,1=默认返水)")
    private Integer defaultType;

    /** 接入参数 */
    @ApiModelProperty("接入参数")
    private String accessInfo;


}
