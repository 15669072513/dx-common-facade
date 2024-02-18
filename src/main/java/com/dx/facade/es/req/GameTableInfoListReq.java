package com.dx.facade.es.req;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
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
public class GameTableInfoListReq extends PageRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌局主键，自增")
    private String handId;

    @ApiModelProperty("牌局code，业务生成")
    private String handCode;

    @ApiModelProperty("牌桌主键")
    private String tableId;


    @ApiModelProperty("牌桌Code")
    private String tableCode;
    /**
     *
     @ApiModelProperty("0 进行中 1已结束")
     */
    @ApiModelProperty("牌桌状态")
    private Integer status;


    @ApiModelProperty("会员id")
    private Long userId;
    @ApiModelProperty("玩家名称")
    private String userName;

    @ApiModelProperty("牌桌名称")
    private String tableName;

    @ApiModelProperty("俱乐部主键")
    private Long clubId;

    @ApiModelProperty("俱乐部名称")
    private String clubName;

    @ApiModelProperty("流水订单号，流水信息主键")
    private String orderNo;

    @ApiModelProperty("游戏ID")
    private Long tableType;

    @ApiModelProperty("游戏名称")
    private String gameName;

    @ApiModelProperty("牌局开始时间-开始")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime handBeginTimeFrom;

    @ApiModelProperty("牌局开始时间-结束")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime handBeginTimeTo;

    @ApiModelProperty("牌局结束时间-开始")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime handEndTimeFrom;

    @ApiModelProperty("牌局结束时间-结束")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime handEndTimeTo;

    @ApiModelProperty("局次")
    private Integer handNum;

    @ApiModelProperty("0 进行中 1已结束")
    private Integer handStatus;
    /**
     * 牌桌创建-开始
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createdStartAt;
    /**
     * 牌桌创建时间-结束
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createdEndAt;

    @ApiModelProperty("是否包含局服务费字段，默认包含")
    private Boolean includeTableFee = true;

}
