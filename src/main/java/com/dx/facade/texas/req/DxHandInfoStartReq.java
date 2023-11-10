package com.dx.facade.texas.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * <p>
 *
 * </p>
 *
 * @author royal
 * @since 2023-06-06
 */
@Data
public class DxHandInfoStartReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌桌主键")
    private Long tableId;

    @ApiModelProperty("牌局code，业务生成")
    private String handCode;

    @ApiModelProperty(value = "局次")
    private Integer handNum;

    @ApiModelProperty("0 进行中 1已结束")
    private Integer handStatus;

    @ApiModelProperty("牌局开始时间")
    private Long handBeginTime;
}
