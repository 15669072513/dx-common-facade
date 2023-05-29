package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("会员晋级活动列表返回值")
public class MemberPromotionActivityResp {

//    不同级别晋级活动由后台配置，由后台返回各级别的优惠信息，后台配置路径为：后台>>会员>>会员vip管理>>vip晋级优惠配置
//    点击问号，显示提示文本：
//    温馨提示
//    会员可在VIP特权页面进行申请，申请晋级优惠后开始计算活动有效流水。此优惠不与平台其它优惠共享，仅与返水优惠共享。有任何疑问请咨询7x24小时在线客服。备注：达到流水额度或余额低于5元时转入任意金额即可解锁场馆

    @ApiModelProperty(value = "已完成流水")
    private BigDecimal doneFlowAmount;





}
