package com.dx.facade.venue.req;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
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
public class DxHandInfoListReq extends PageRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌局主键，按业务规则生成")
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

    @ApiModelProperty("局次")
    private Integer handNum;

    @ApiModelProperty("0 进行中 1已结束")
    private Integer handStatus;

    @ApiModelProperty("创建时间")
    private LocalDateTime startTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime endTime;

}
