package com.dx.facade.texas.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.common.utils.DateToLongSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
public class DxHandInfoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌局主键，自增")
    private Long handId;

    @ApiModelProperty("牌局code，业务生成")
    private String handCode;

    @ApiModelProperty("牌桌主键")
    private Long tableId;

    @ApiModelProperty("牌桌Code")
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

    @ApiModelProperty("牌局开始时间")
    @JsonSerialize(using = DateToLongSerializer.class)
    private LocalDateTime handBeginTime;

    @ApiModelProperty("牌局结束时间")
    @JsonSerialize(using = DateToLongSerializer.class)
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
    @TableField("end_amount")
    private BigDecimal endAmount;

    @ApiModelProperty("公牌信息")
    private String publicCards;

    @ApiModelProperty("有效底池")
    private String validPot;

    @ApiModelProperty("0 进行中 1已结束")
    private Integer handStatus;

    @ApiModelProperty("抽水金额")
    private BigDecimal pumpingAmount;

    @ApiModelProperty("创建时间")
    @JsonSerialize(using = DateToLongSerializer.class)
    private LocalDateTime createdAt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改时间")
    @JsonSerialize(using = DateToLongSerializer.class)
    private LocalDateTime updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("是否删除（0 未删除 1已删除）")
    private Integer deleteFlag;
}
