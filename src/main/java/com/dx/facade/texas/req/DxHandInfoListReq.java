package com.dx.facade.texas.req;

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
public class DxHandInfoListReq extends PageRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌局主键，自增")
    private String handId;

    @ApiModelProperty("最大手牌Id")
    private Long maxhandId;

    @ApiModelProperty("牌局code，业务生成")
    private String handCode;

    @ApiModelProperty("牌桌主键")
    private Long tableId;

    @ApiModelProperty("会员账号")
    private String userName;

    @ApiModelProperty("会员id")
    private Long userId;

    @ApiModelProperty("牌桌code")
    private String tableCode;

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

    @ApiModelProperty("会员账号，最多9个账号，英文逗号隔开，账户之间为”且“的关系")
    private String userNames;

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

    @ApiModelProperty("牌局开始时间-开始时间戳")
    private Long handBeginTimeFromTs;

    @ApiModelProperty("牌局开始时间-结束时间戳")
    private Long handBeginTimeToTs;

    @ApiModelProperty("牌局结束时间-开始时间戳")
    private Long handEndTimeFromTs;

    @ApiModelProperty("牌局结束时间-结束时间戳")
    private Long handEndTimeToTs;

    @ApiModelProperty("局次")
    private Integer handNum;

    @ApiModelProperty("0 进行中 1已结束")
    private Integer handStatus;

    @ApiModelProperty("0 进行中 1已结束")
    private Integer tableStatus;

    @ApiModelProperty("创建时间")
    private LocalDateTime startTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime endTime;

}
