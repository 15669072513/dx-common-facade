package com.dx.facade.texas.resp;
import com.dx.facade.annotation.FieldOperate;
import com.dx.facade.annotation.ValueConvert;
import com.dx.facade.game.convert.FeeCapRender;
import com.dx.facade.game.convert.GameStatusRender;
import com.dx.facade.game.convert.GameTypeIdRender;
import com.dx.facade.game.convert.InsuranceChooseSheetRender;
import com.dx.facade.game.convert.InsuranceModeRender;
import com.dx.facade.game.convert.ServiceChargeRender;
import com.dx.facade.game.convert.TableFeeSwitchRender;
import com.dx.facade.game.convert.UniversalCloseOpenRender;
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
    @ValueConvert(renderers = GameTypeIdRender.class)
    private Long gameTypeId;

    @ApiModelProperty("场馆类型(如by,ty,zr,qkl)")
    private String venueTypeCode;

    @ApiModelProperty("所属场馆(即bw_venue表的venue_code)")
    private String venueCode;

    @ApiModelProperty("场馆名称")
    private String venueName;

    @ApiModelProperty("游戏名称")
    @FieldOperate(fieldName ="游戏名称")
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
    @ValueConvert(renderers = GameStatusRender.class)
    @FieldOperate(fieldName ="游戏总开关")
    private Integer status;

    @ApiModelProperty("超时（min）自动解散房间")
    @FieldOperate(fieldName ="超时（min）自动解散房间")
    private Integer gameOvertime;

    @ApiModelProperty("大盲BB设置")
    @FieldOperate(fieldName ="大盲BB设置")
    private String bbSetting;

    @ApiModelProperty("补码上下限（BB）")
    @FieldOperate(fieldName ="补码上下限（BB）")
    private String bbDefaultCarry;

    @ApiModelProperty("补码下限")
    @FieldOperate(fieldName ="补码下限")
    private Integer complementLowerLimit=0;

    @ApiModelProperty("补码上限")
    @FieldOperate(fieldName ="补码上限")
    private Integer complementUpperLimit=0;

    @ApiModelProperty("游戏时长（H）")
    @FieldOperate(fieldName ="游戏时长（H）")
    private String gameTimes;

    @ApiModelProperty("游戏人数")
    @FieldOperate(fieldName ="游戏人数")
    private String gamePeopleNumbers;

    @ApiModelProperty("自动开始人数")
    @FieldOperate(fieldName ="自动开始人数")
    private String autoStartNumbers;

    @ApiModelProperty("抽水比例")
    @FieldOperate(fieldName ="抽水比例")
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
    @FieldOperate(fieldName ="turn购买保险最低值")
    private String insuranceTurn;

    @ApiModelProperty("选张购买功能 false-不选张 true-选张，多个用逗号隔开，支持小数点2位")
    @ValueConvert(renderers = InsuranceChooseSheetRender.class)
    @FieldOperate(fieldName ="选张购买功能")
    private Boolean insuranceChoosSheet;

    @ApiModelProperty("保险模式 可多选，多个用逗号隔开 0-不开保险 1-经典保险")
    @ValueConvert(renderers = InsuranceModeRender.class)
    @FieldOperate(fieldName ="保险模式")
    private String insuranceMode;

    @ApiModelProperty("保险出发下限")
    @FieldOperate(fieldName ="保险触发下限")
    private Integer insuranceLower=0;

    @ApiModelProperty("ALLIN展示OUTS与胜率 0-关闭 1-开启")
    @ValueConvert(renderers = UniversalCloseOpenRender.class)
    @FieldOperate(fieldName ="ALLIN展示OUTS与胜率")
    private Integer showOutsWinn;

    @ApiModelProperty("允许主动带出 0-关闭 1-开启 默认关闭")
    @ValueConvert(renderers = UniversalCloseOpenRender.class)
    @FieldOperate(fieldName ="允许主动带出")
    private Integer activeBringOut;

    @ApiModelProperty("必要保留筹码 多个用逗号隔开 不支持小数")
    @FieldOperate(fieldName ="必要保留筹码")
    private String mustKeepChip;

    @ApiModelProperty("每手服务费，0-关闭 1-按底池比例 2-按盈利比例 3-都选择")
    @ValueConvert(renderers = ServiceChargeRender.class)
    @FieldOperate(fieldName ="每手服务费")
    private Integer serviceCharge;

    @ApiModelProperty("每手服务费选择列表,多个用逗号隔开1按底池比例 2,按盈利比例，3无")
    private String serviceChargeList;

    @ApiModelProperty("按底池比例收费 多个用逗号隔开 支持小数")
    @FieldOperate(fieldName ="按底池比例收费")
    private String bottomPoolFee;

    @ApiModelProperty("按盈利比例收费 多个用逗号隔开  支持小数")
    @FieldOperate(fieldName ="按盈利比例收费")
    private String profitFee;

    @ApiModelProperty("收费上限 多个用逗号隔开 支持小数 -1代表无上限")
    @ValueConvert(renderers = FeeCapRender.class)
    @FieldOperate(fieldName ="收费上限")
    private String feeCap;

    @ApiModelProperty("允许主动带出 0-关闭 1-开启 默认关闭")
    @ValueConvert(renderers = UniversalCloseOpenRender.class)
    @FieldOperate(fieldName ="允许主动带出")
    private Integer hideDecimals;

    @ApiModelProperty("preflop看牌 0-关 1-开 默认为0")
    @ValueConvert(renderers = UniversalCloseOpenRender.class)
    @FieldOperate(fieldName ="preflop看牌")
    private Integer preflopDelay;

    @ApiModelProperty("前注功能 0-关闭 1-开启")
    @ValueConvert(renderers = UniversalCloseOpenRender.class)
    @FieldOperate(fieldName ="前注功能")
    private Integer anteSwitch;

    @ApiModelProperty("前注（倍BB）,多个用逗号隔开")
    @FieldOperate(fieldName ="前注（倍BB）")
    private String anteLimits;

    @ApiModelProperty("语音聊天功能 0-关 1-开 默认为0")
    @FieldOperate(fieldName ="语音聊天功能")
    @ValueConvert(renderers = UniversalCloseOpenRender.class)
    private Integer voiceChatSwitch;

    @ApiModelProperty("入桌密码功能 0-关 1-开 默认为0")
    @ValueConvert(renderers = UniversalCloseOpenRender.class)
    @FieldOperate(fieldName ="入桌密码功能")
    private Integer tableEntryPasswordSwitch;

    @ApiModelProperty("仅限直属会员可见开关 0-隐藏 1-可见'")
    @FieldOperate(fieldName ="仅限直属会员可见开关")
    @ValueConvert(renderers = UniversalCloseOpenRender.class)
    private Integer onlyDirectMemberSwitch;

    @ApiModelProperty("局服务费 0-配置没开启  1-关 2-开 默认为0")
    @FieldOperate(fieldName ="局服务费")
    @ValueConvert(renderers = TableFeeSwitchRender.class)
    private Integer tableFeeSwitch;

    @ApiModelProperty("局服务费比例,多个用逗号隔开")
    @FieldOperate(fieldName ="局服务费比例")
    private String tableFeeScale = "";
}
