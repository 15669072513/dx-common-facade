package com.dx.facade.texas.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
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
public class DxGameConfigEditReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("游戏类型id")
    private Long gameTypeId;

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
    private Integer complementLowerLimit;

    @ApiModelProperty("补码上限")
    private Integer complementUpperLimit;

    @ApiModelProperty("游戏时长（H）")
    private String gameTimes;

    @ApiModelProperty("游戏人数")
    private String gamePeopleNumbers;

    @ApiModelProperty("自动开始人数")
    private String autoStartNumbers;

    @ApiModelProperty("抽水比例")
    private BigDecimal rake;

    @ApiModelProperty(
            value = "创建人",
            hidden = true
    )
    private String createdBy;


    @ApiModelProperty(
            value = "修改人",
            hidden = true
    )
    private String updatedBy;

    /** google验证码 */
    @NotNull(message = "google验证码不可为空")
    @ApiModelProperty( value = "google验证码")
    private String googleVerifyCode;

    @ApiModelProperty("turn购买保险最低值，多个用逗号隔开，支持小数点2位")
    private String insuranceTurn;

    @ApiModelProperty("选张购买功能 false-不选张 true-选张，多个用逗号隔开，支持小数点2位")
    private Boolean insuranceChoosSheet;

    @ApiModelProperty("保险模式 可多选，多个用逗号隔开 0-不开保险 1-经典保险")
    private String insuranceMode;

    @ApiModelProperty("保险出发下限")
    private Integer insuranceLower;

    @ApiModelProperty("ALLIN展示OUTS与胜率 0-关闭 1-开启")
    private Integer showOutsWinn;
}
