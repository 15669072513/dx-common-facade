package com.dx.facade.merchant.req;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 俱乐部配置查询请求DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-06-10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ClubParamConfigQueryReqDTO对象", description = "俱乐部配置查询请求DTO")
public class ClubParamConfigQueryReqDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /** 主键 */
    @ApiModelProperty("唯一主键")
    private Long id;

    /** 商户id */
    @ApiModelProperty("商户id")
    private String merchantId;

}
