package com.dx.facade.game.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Data
@ApiModel("牌局回顾详情明细")
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class GameRecordRoundDeatailDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("圈层")
    private int roundCode;

    @ApiModelProperty("最终成牌")
    @JsonIgnore
    private String lastCards;

    @ApiModelProperty("公牌")
    private String publicCards;

    @ApiModelProperty("手牌")
    private String handCards;

    @ApiModelProperty("座位号")
    private Integer chairId;

    @ApiModelProperty("座位类型大类 1:前位 2:中位 3:后位 4:盲位")
    private Integer seatType;

    @ApiModelProperty("座位类型,参考枚举:TexasSeatTypeEnum")
    private Integer seatCode;

    /**
     *  会员id
     */
    @ApiModelProperty("会员id")
    private String memberId;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("玩家头像")
    private String topImagesUrl;

    @ApiModelProperty("玩家昵称")
    private String nickName;

    @ApiModelProperty("备注名")
    private String userNameRemark="";

    @ApiModelProperty("在加注的基础上再加注 比如3B，当raiseCount>=2需要 拼接raiseCount+betAction")
    private Integer raiseCount;


    @ApiModelProperty("玩家下注指令")
    private String betAction;

    @ApiModelProperty("玩家下注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("玩家剩余筹码")
    private BigDecimal afterChip;

    @ApiModelProperty("玩家操作后底池")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal leijiPotAmount;

    @ApiModelProperty("弃牌玩家数")
    private Integer losePalyers;

    @ApiModelProperty("连续弃牌标识")
    private boolean consecutiveFold;

    /**
     * 开牌结果（#PokerResultInfoEnum）
     */
    @ApiModelProperty("牌型")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String resultInfo;
    /**
     * 眼睛标识
     */
    @ApiModelProperty("眼睛标识")
    private boolean showFlag;

    @ApiModelProperty("玩家手牌亮牌")
    private List<Map<Integer,Boolean>> lightCards =new ArrayList<>();

    @ApiModelProperty("玩家牌型显示是否置灰标识")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Map<Integer,Boolean>> showCards =new ArrayList<>();

    @ApiModelProperty("总输赢（打牌输赢+保险输赢）")
    private BigDecimal totalNetAmount= BigDecimal.ZERO;

    @ApiModelProperty("打牌输赢")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal netAmount= BigDecimal.ZERO;

    @ApiModelProperty("保险输赢")
    private BigDecimal insuredNetAmount=BigDecimal.ZERO;

    @ApiModelProperty("是否投保 0否  1是")
    private Integer isInsured;

    @ApiModelProperty("底池竞争亮牌标识 0不需要亮牌 1强制亮牌 2自主亮牌通知 3已自主亮牌")
    private Integer showStatus;

    @ApiModelProperty("参与保险的底池")
    private BigDecimal potAmount;

    @ApiModelProperty("池子编号")
    private String potNo;

}
