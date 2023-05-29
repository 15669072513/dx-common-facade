package com.dx.facade.auth.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SecurityKeyDTO {

    @ApiModelProperty(value = "主键ID")
    private Long id;

    @ApiModelProperty(value = "应用，枚举ApplicationEnum")
    private Integer application;

    @ApiModelProperty(value = "密钥")
    private String secretKey;

    @ApiModelProperty(value = "密钥版本")
    private Integer secretVersion;

    @ApiModelProperty(value = "状态： 1-有效，0-无效")
    private Integer status;

    @ApiModelProperty(value = "最后的访问时间")
    private LocalDateTime lastAccess;

}
