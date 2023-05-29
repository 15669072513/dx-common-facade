package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.dx.facade.merchant.resp.MemberVipInComRespDTO;
import com.dx.facade.merchant.resp.MemberVipPromotionResp;
import com.dx.facade.merchant.resp.MemberVipRebateVo;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("会员VIP详情返回值")
public class MemberVipDetailResp {

    @ApiModelProperty("用户userId")
    private Long userId;

    @ApiModelProperty(value = "会员头像")
    private String topImagesUrl;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "当前vip等级id")
    private Long vipId;

    @ApiModelProperty(value = "当前当前vip等级")
    private String vipLevel;

    @ApiModelProperty(value = "当前vip经验值")
    private Long vipExperience;

    @ApiModelProperty(value = "当前VIP等级名称")
    private String vipName;

    @ApiModelProperty(value = "商户VIP等级列表(大于当前级别)")
    private List<MemberVipGradeRespDTO>  memberVipGradeRespDTO;

    @ApiModelProperty(value = "商户VIP等级别福利(当前等级)")
    private List<MemberVipInComRespDTO>  memberVipInComRespDTO;

    @ApiModelProperty(value = "商户晋级活动列表(当前等级)")
    private List<MemberVipPromotionResp> memberVipPromotionResp;

    @ApiModelProperty(value = "vip返水配置信息")
    private List<MemberVipRebateVo> vipRebateVoList;

    @ApiModelProperty(value = "下一个vip等级id")
    private Long vipNextId;

    @ApiModelProperty(value = "下一个序号序号(VIP等级)")
    private String vipNextLevel;

    @ApiModelProperty(value = "下一个vip经验值")
    private Long vipNextExperience;

    @ApiModelProperty(value = "下一个vip等级名称")
    private String vipNextName;

    @ApiModelProperty(value = "当前VIP累积存款")
    private BigDecimal cumulativeDeposit;

    @ApiModelProperty(value = "当前VIP累积流水")
    private BigDecimal cumulativeTurnover;

    @ApiModelProperty(value = "当前VIP保级流水")
    private BigDecimal relegationTurnover;

    @ApiModelProperty(value = "升级条件累计存款(包含代充)")
    private BigDecimal totalDeposit;

    @ApiModelProperty(value = "升级条件累计有效流水")
    private BigDecimal tatalValidWater;


}
