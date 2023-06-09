package com.dx.facade.venue.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author broadway
 * @since 2023-06-05
 */
@Data
public class DxHandDetailAddReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键自增")
    private Long id;

    @ApiModelProperty("牌局id,牌局表主键")
    private String roundId;

    @ApiModelProperty("俱乐部主键")
    private Long clubId;

    @ApiModelProperty("牌局用户")
    private Long userId;

    @ApiModelProperty("牌局用户名称")
    private String userName;

    @ApiModelProperty("座位号")
    private Integer seatNumber;

    @ApiModelProperty("总输赢")
    private BigDecimal totalWinLoss;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改人")
    private String updatedBy;
}
