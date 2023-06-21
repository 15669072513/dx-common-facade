package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberBaseParam {

    @ApiModelProperty(value = "会员的商户id", required = true, example = "6020229")
    @NotNull(message = "商户id不能为空")
    private Long merchantId;

    @ApiModelProperty(value = "会员id(18)", required = true)
    @NotNull(message = "用户id不能为空")
    private Long userId;

}
