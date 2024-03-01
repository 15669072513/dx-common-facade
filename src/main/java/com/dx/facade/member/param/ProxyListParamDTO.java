package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyListParamDTO {

    @ApiModelProperty("商户ID列表")
    private List<Long> merchantIdLs;

    @ApiModelProperty("账号")
    private String userName;

    @ApiModelProperty("账号")
    private Set<Long> userIds;

}
