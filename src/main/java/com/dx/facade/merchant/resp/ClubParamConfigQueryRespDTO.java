package com.dx.facade.merchant.resp;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 俱乐部配置查询响应DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-06-10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ClubParamConfigQueryRespDTO对象", description = "俱乐部配置查询响应DTO")
public class ClubParamConfigQueryRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /** 主键 */
    @ApiModelProperty("唯一主键")
    private Long id;

    /** 商户id */
    @ApiModelProperty("商户id")
    private String merchantId;

    /** 人员上限 */
    @ApiModelProperty(value = "人员上限")
    private Integer upperLimit;

    /** 单牌桌旁观人数上限 */
    @ApiModelProperty("单牌桌旁观人数上限")
    private Integer cardTableLimit;

    /** 单牌桌旁观人数上限 */
    @ApiModelProperty("单牌桌旁观人数上限")
    private Integer lookOnLimit;

    /** 创建人 */
    @ApiModelProperty("创建人")
    private String createdBy;

    /** 创建时间 */
    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    /** 更新人 */
    @ApiModelProperty("更新人")
    private String updatedBy;

    /** 最近操作时间 */
    @ApiModelProperty("最近操作时间")
    private LocalDateTime updatedAt;
}
