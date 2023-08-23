package com.dx.facade.game.resp;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("dx_hand_info")
@ApiModel(value = "DxHandInfoSumResp对象", description = "")
public class DxHandInfoSumResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌局主键，自增")
    @TableId(value = "hand_id", type = IdType.INPUT)
    private String handId;

    @ApiModelProperty("牌局code，按业务规则生成")
    @TableField("hand_code")
    private String handCode;

    @ApiModelProperty("牌桌主键")
    @TableField("table_id")
    private Long tableId;

    @ApiModelProperty("牌桌code")
    @TableField("table_code")
    private String tableCode;

    @ApiModelProperty("牌桌名称")
    @TableField("table_name")
    private String tableName;

    @ApiModelProperty("俱乐部主键")
    @TableField("club_id")
    private Long clubId;

    @ApiModelProperty("俱乐部名称")
    @TableField("club_name")
    private String clubName;

    @ApiModelProperty("流水订单号，流水信息主键")
    @TableField("order_no")
    private String orderNo;

    @ApiModelProperty("游戏ID")
    @TableField("game_type_id")
    private Long gameTypeId;

    @ApiModelProperty("游戏名称")
    @TableField("game_name")
    private String gameName;

    @ApiModelProperty("牌局开始时间")
    @TableField("hand_begin_time")
    private LocalDateTime handBeginTime;

    @ApiModelProperty("牌局结束时间")
    @TableField("hand_end_time")
    private LocalDateTime handEndTime;

    @ApiModelProperty("'参与用户ID集合'")
    @TableField("`user_ids`")
    private String userIds;

    @ApiModelProperty("参与用户名称集合")
    @TableField("user_names")
    private String userNames;

    @ApiModelProperty("局次")
    @TableField("hand_num")
    private Integer handNum;

    @ApiModelProperty("初期金额")
    @TableField("begin_mount")
    private BigDecimal beginMount;

    @ApiModelProperty("中途带入金额")
    @TableField("bring_midway_amount")
    private BigDecimal bringMidwayAmount;

    @ApiModelProperty("期末金额")
    @TableField("end_amount")
    private BigDecimal endAmount;

    @ApiModelProperty("公牌信息")
    @TableField("public_cards")
    private String publicCards;

    @ApiModelProperty("有效底池")
    @TableField("valid_pot")
    private String validPot;

    @ApiModelProperty("0 进行中 1已结束")
    @TableField("hand_status")
    private Integer handStatus;

    @ApiModelProperty("抽水金额")
    @TableField("pumping_amount")
    private BigDecimal pumpingAmount;

    @ApiModelProperty("会员输赢汇总")
    private BigDecimal netAmount;

    @ApiModelProperty("有效金额")
    private BigDecimal validBetAmount;

    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore;

    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore;
}
