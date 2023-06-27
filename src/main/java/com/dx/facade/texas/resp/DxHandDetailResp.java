package com.dx.facade.texas.resp;

import com.dx.facade.common.utils.DateToLongSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author broadway
 * @since 2023-06-06
 */
@Data
public class DxHandDetailResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌局主键，自增")
    private Long handId;

    @ApiModelProperty("牌局code，业务生成")
    private String handCode;

    @ApiModelProperty("牌桌主键")
    private Long tableId;

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

    @ApiModelProperty("牌局开始时间")
    @JsonSerialize(using = DateToLongSerializer.class)
    private Date handBeginTime;

    @ApiModelProperty("牌局结束时间")
    @JsonSerialize(using = DateToLongSerializer.class)
    private Date handEndTime;

    @ApiModelProperty("'参与用户ID集合'")
    private String userIds;

    @ApiModelProperty("参与用户名称集合")
    private String userNames;

    @ApiModelProperty("局次")
    private Integer handNum;

    @ApiModelProperty("期初金额汇总")
    private BigDecimal beforeChip;

    @ApiModelProperty("中途带入金额汇总")
    private BigDecimal bringMidwayChip;

    @ApiModelProperty("期末余额汇总")
    private BigDecimal afterChip;

    @ApiModelProperty("公牌信息")
    private String publicCards;

    @ApiModelProperty("有效底池")
    private BigDecimal validPot;

    @ApiModelProperty("0 进行中 1已结束")
    private Integer handStatus;

    @ApiModelProperty("抽水金额")
    private BigDecimal pumpingAmount;

    @ApiModelProperty("会员输赢汇总")
    private BigDecimal netAmount;

    @ApiModelProperty("有效金额")
    private BigDecimal validBetAmount;

    @ApiModelProperty("手牌信息")
    private String handInfos;  //手牌信息

    @ApiModelProperty("结算信息")
    private String settleInfo;  //结算信息

    @ApiModelProperty("创建时间")
    @JsonSerialize(using = DateToLongSerializer.class)
    private Date createdAt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改时间")
    @JsonSerialize(using = DateToLongSerializer.class)
    private Date updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("是否删除（0 未删除 1已删除）")
    private Integer deleteFlag;
}
