package com.dx.facade.merchant.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 会员vip返水resp
 * </p>
 *
 * @author quentin
 * @since 2021-06-02
 */

@Data
public class MemberVipRebateVo {

    /**
     * 场馆id
     */
    @ApiModelProperty("场馆id")
    private Long venueId;

    /**
     * 场馆名称
     */
    @ApiModelProperty("场馆名称")
    private String venueName;

    /**
     * 游戏id
     */
    @ApiModelProperty("游戏id")
    private Long gameId;

    @ApiModelProperty("游戏id")
    private String gameName;


    /**
     * id
     */
    @ApiModelProperty("id")
    private Long id;

    /**
     * 商户id
     */
    @ApiModelProperty("商户id")
    private Long merchantId;

    /**
     * 配置信息json字段（vip等级id/返水比例值）
     */
    @ApiModelProperty("配置信息json字段（vip等级id/返水比例值）")
    private String configVipRebate;

    @ApiModelProperty("是否默认返水(0=不是默认返水,1=默认返水)")
    private Integer defaultType;
    
    @ApiModelProperty("对接参数")
    private String accessInfo;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    /**
     * 创建人
     */
    @ApiModelProperty("创建人")
    private String createdBy;

    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private LocalDateTime updatedAt;

    /**
     * 修改人
     */
    @ApiModelProperty("修改人")
    private String updatedBy;

    /**
     * 签名
     */
    @ApiModelProperty("签名")
    private String sign;

    /**
     * 场馆code
     */
    private String venueCode;
}
