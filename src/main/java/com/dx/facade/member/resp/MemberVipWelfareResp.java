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
@ApiModel("会员VIP级别福利列表返回值")
public class MemberVipWelfareResp {

//    显示多条由后台配置的，当前级别能够享受的福利政策
//    福利内容及排序规则，均由后台返回
//    单个福利政策：
//    反例名称：例：生日礼金
//            icon
//    反例数值：例：50元
//            均由后台返回数据
//    等级权益列表（UI需根据此枚举设计icon图标）
//    日提款次数
//    提款额度(每日累计提款额度)
//    每日返水上限
//            升级礼金
//    生日礼金
//            上半月红包
//    下半月红包
//    存款额度(红包发放累计存款额度)

    @ApiModelProperty(value = "已完成流水")
    private BigDecimal doneFlowAmount;





}
