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
@ApiModel("会员VIP基本Tab返回值")
public class MemberVipTabResp {

//    静态文本：当前等级
//    动态级别：显示当前级别
//    动态日期：显示当前保级期限
//    显示静态文本：保级期限日期
//    显示动态日期：天数，数值计算方式：天数 = 保级到期日期 - 当前日期
//    显示当前级别logo，logo打包到本地，每次根据不同级别更换显示
//    累计存款：显示当前级别所需的参数，由后台返回数据
//    流水要求：显示当前级别所需的参数，由后台返回数据
//    保级要求：显示当前级别所需的参数，由后台返回数据

    @ApiModelProperty(value = "已完成流水")
    private BigDecimal doneFlowAmount;




}
