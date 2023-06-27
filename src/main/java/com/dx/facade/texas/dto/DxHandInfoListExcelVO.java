package com.dx.facade.texas.dto;

import com.alibaba.excel.annotation.ExcelProperty;
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
 * @since 2023-06-06
 */
@Data
public class DxHandInfoListExcelVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ExcelProperty(value = "牌局主键", index = 0)
    private Long handId;

    @ApiModelProperty("牌局code，业务生成")
    @ExcelProperty(value = "牌局code", index = 1)
    private String handCode;

    @ApiModelProperty("牌桌主键")
    @ExcelProperty(value = "牌桌主键", index = 3)
    private Long tableId;

    @ApiModelProperty("牌桌code")
    @ExcelProperty(value = "牌桌code", index = 4)
    private String tableCode;

    @ApiModelProperty("牌桌类型 2001:德州局 2002:短牌局")
    @ExcelProperty(value = "牌桌类型", index = 5)
    private Long tableType;

    @ApiModelProperty("牌桌名称")
    @ExcelProperty(value = "牌桌名称", index = 6)
    private String tableName;

    @ApiModelProperty("俱乐部主键")
    @ExcelProperty(value = "俱乐部主键", index = 7)
    private Long clubId;

    @ApiModelProperty("俱乐部名称")
    @ExcelProperty(value = "俱乐部名称", index = 8)
    private String clubName;

    @ApiModelProperty("流水订单号，流水信息主键")
    @ExcelProperty(value = "流水订单号", index = 9)
    private String orderNo;

    @ApiModelProperty("游戏ID")
    @ExcelProperty(value = "游戏ID", index = 10)
    private Long gameTypeId;

    @ApiModelProperty("游戏名称")
    @ExcelProperty(value = "游戏名称", index = 11)
    private String gameName;

    @ApiModelProperty("牌局开始时间")
    @ExcelProperty(value = "牌局开始时间", index = 12)
    private Long handBeginTime;

    @ApiModelProperty("牌局结束时间")
    @ExcelProperty(value = "牌局结束时间", index = 13)
    private Long handEndTime;

    @ApiModelProperty("'参与用户ID集合'")
    @ExcelProperty(value = "参与用户ID集合", index = 14)
    private String userIds;

    @ApiModelProperty("参与用户名称集合")
    @ExcelProperty(value = "参与用户名称集合", index = 15)
    private String userNames;

    @ApiModelProperty("局次")
    @ExcelProperty(value = "局次", index = 16)
    private Integer handNum;

    @ApiModelProperty("期初金额汇总")
    @ExcelProperty(value = "期初金额汇总", index = 17)
    private BigDecimal beforeChip;

    @ApiModelProperty("中途带入金额汇总")
    @ExcelProperty(value = "中途带入金额汇总", index = 18)
    private BigDecimal bringMidwayChip;

    @ApiModelProperty("期末余额汇总")
    @ExcelProperty(value = "期末余额汇总", index = 19)
    private BigDecimal afterChip;

    @ApiModelProperty("公牌信息")
    @ExcelProperty(value = "公牌信息", index = 20)
    private String publicCards;

    @ApiModelProperty("有效底池")
    @ExcelProperty(value = "有效底池", index = 21)
    private BigDecimal validPot;

    @ApiModelProperty("0 进行中 1已结束")
    @ExcelProperty(value = "进行状态", index = 22)
    private Integer handStatus;

    @ApiModelProperty("抽水金额")
    @ExcelProperty(value = "抽水金额", index = 23)
    private BigDecimal pumpingAmount;

    @ApiModelProperty("会员输赢汇总")
    @ExcelProperty(value = "会员输赢汇总", index = 24)
    private BigDecimal netAmount;

    @ApiModelProperty("有效金额")
    @ExcelProperty(value = "有效金额", index = 25)
    private BigDecimal validBetAmount;

    @ApiModelProperty("庄家位置")
    @ExcelProperty(value = "庄家位置", index = 26)
    private Integer villageSeat;

    @ApiModelProperty("小盲位置")
    @ExcelProperty(value = "小盲位置", index = 27)
    private Integer sbSeat;

    @ApiModelProperty("大盲位置")
    @ExcelProperty(value = "大盲位置", index = 28)
    private Integer bbSeat;

    @ApiModelProperty("创建时间")
    @ExcelProperty(value = "创建时间", index = 29)
    private Long createdAt;

    @ApiModelProperty("创建人")
    @ExcelProperty(value = "创建人", index = 30)
    private String createdBy;

    @ApiModelProperty("修改时间")
    @ExcelProperty(value = "修改时间", index = 31)
    private Long updatedAt;

    @ExcelProperty(value = "修改人", index = 32)
    private String updatedBy;

    @ExcelProperty(value = "是否删除（0 未删除 1已删除）", index = 33)
    private Integer deleteFlag;
}
