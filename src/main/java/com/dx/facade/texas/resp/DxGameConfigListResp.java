package com.dx.facade.texas.resp;

import com.baomidou.mybatisplus.annotation.TableField;
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
public class DxGameConfigListResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("游戏类型id")
    private Long gameTypeId;

    @ApiModelProperty("场馆类型(如by,ty,zr,qkl)")
    private String venueTypeCode;

    @ApiModelProperty("所属场馆(即bw_venue表的venue_code)")
    private String venueCode;

    @ApiModelProperty("场馆名称")
    private String venueName;

    @ApiModelProperty("游戏名称")
    private String gameName;

    @ApiModelProperty("游戏中文名")
    private String gameZhName;

    @ApiModelProperty("游戏英文名")
    private String gameEnName;

    @ApiModelProperty("游戏泰语名")
    private String gameThName;

    @ApiModelProperty("游戏越南名")
    private String gameVnName;

    @ApiModelProperty("接入参数")
    private String accessInfo;

    @ApiModelProperty("图标状态")
    private Integer iconStatus;

    @ApiModelProperty("支持终端")
    private String supportTerminals;

    @ApiModelProperty("图标图标URL")
    private String iconUrl;

    @ApiModelProperty("游戏描述")
    private String description;

    @ApiModelProperty("状态(0已禁用,1开启中,2维护中)")
    private Integer status;

    @ApiModelProperty("超时（min）自动解散房间")
    private Integer gameOvertime;

    @ApiModelProperty("大盲BB设置")
    private String bbSetting;

    @ApiModelProperty("默认带入值（BB）")
    private String bbDefaultCarry;

    @ApiModelProperty("补码下限")
    private Integer complementLowerLimit=0;

    @ApiModelProperty("补码上限")
    private Integer complementUpperLimit=0;

    @ApiModelProperty("游戏时长（H）")
    private String gameTimes;

    @ApiModelProperty("游戏人数")
    private String gamePeopleNumbers;

    @ApiModelProperty("自动开始人数")
    private String autoStartNumbers;

    @ApiModelProperty("抽水比例")
    private BigDecimal rake=BigDecimal.ZERO;

    @ApiModelProperty("创建时间")
    private Long createAt;

    @ApiModelProperty("创建人")
    private String createBy;

    @ApiModelProperty("修改时间")
    private Long updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("是否删除（0 未删除 1已删除）")
    private Integer deleteFlag;

    @ApiModelProperty("单牌桌累计带入上限")
    private Integer bringInLimit=0;

    @ApiModelProperty("turn购买保险最低值，多个用逗号隔开，支持小数点2位")
    private String insuranceTurn;

    @ApiModelProperty("选张购买功能 false-不选张 true-选张，多个用逗号隔开，支持小数点2位")
    private Boolean insuranceChoosSheet;

    @ApiModelProperty("保险模式 可多选，多个用逗号隔开 0-不开保险 1-经典保险")
    private String insuranceMode;

    @ApiModelProperty("保险出发下限")
    private Integer insuranceLower=0;

    @ApiModelProperty("ALLIN展示OUTS与胜率 0-关闭 1-开启")
    private Integer showOutsWinn;

    @ApiModelProperty("允许主动带出 0-关闭 1-开启 默认关闭")
    private Integer activeBringOut;

    @ApiModelProperty("必要保留筹码 多个用逗号隔开 不支持小数")
    private String mustKeepChip;

    @ApiModelProperty("每手服务费，0-关闭 1-按底池比例 2-按盈利比例 3-都选择")
    private Integer serviceCharge;

    @ApiModelProperty("按底池比例收费 多个用逗号隔开 支持小数")
    private String bottomPoolFee;

    @ApiModelProperty("按盈利比例收费 多个用逗号隔开  支持小数")
    private String profitFee;

    @ApiModelProperty("收费上限 多个用逗号隔开 支持小数 -1代表无上限")
    private String feeCap;

    @ApiModelProperty("允许主动带出 0-关闭 1-开启 默认关闭")
    private Integer hideDecimals;

    @ApiModelProperty("preflop看牌 0-关 1-开 默认为0")
    private Integer preflopDelay;

    @ApiModelProperty("语音聊天功能 0-关 1-开 默认为0")
    private Integer voiceChatSwitch;

    @ApiModelProperty("入桌密码功能 0-关 1-开 默认为0")
    private Integer tableEntryPasswordSwitch;
}
