package com.dx.facade.venue.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author broadway
 * @since 2023-06-06
 */
@Data
public class DxHandInfoAddReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "牌局主键，按业务规则生成", hidden = true)
    private String handId;

    @ApiModelProperty("牌桌主键")
    private String tableId;

    @ApiModelProperty("牌桌名称")
    private String tableName;

    @ApiModelProperty("俱乐部主键")
    private Long clubId;

    @ApiModelProperty("俱乐部名称")
    private String clubName;

    @ApiModelProperty("流水订单号，流水信息主键")
    private String orderNo;

    @ApiModelProperty("游戏ID")
    private Long gameTypeId;

    @ApiModelProperty("游戏名称")
    private String gameName;

    @ApiModelProperty("牌局开始时间")
    private LocalDateTime handBeginTime;

    @ApiModelProperty("牌局结束时间")
    private LocalDateTime handEndTime;

    @ApiModelProperty("'参与用户ID集合'")
    private String userIds;

    @ApiModelProperty("参与用户名称集合")
    private String userNames;

    @ApiModelProperty("局次")
    private Integer handNum;

    @ApiModelProperty("初期金额")
    private BigDecimal beginMount;

    @ApiModelProperty("中途带入金额")
    private BigDecimal bringMidwayAmount;

    @ApiModelProperty("期末金额")
    private BigDecimal endAmount;

    @ApiModelProperty("公牌信息")
    private String publicCards;

    @ApiModelProperty("有效底池")
    private String validPot;

    @ApiModelProperty("0 进行中 1已结束")
    private Integer handStatus;

    @ApiModelProperty(value = "创建时间", hidden = true)
    private LocalDateTime createdAt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty(value = "修改时间", hidden = true)
    private LocalDateTime updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty(value = "是否删除（0 未删除 1已删除）", hidden = true)
    private Integer deleteFlag;
}
