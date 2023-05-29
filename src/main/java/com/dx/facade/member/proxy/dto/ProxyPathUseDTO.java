package com.dx.facade.member.proxy.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 代理层级
 *
 * @author laway
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyPathUseDTO {

    @ApiModelProperty(value = "当前层级")
    private List<String> proxyPathUsername;

}
