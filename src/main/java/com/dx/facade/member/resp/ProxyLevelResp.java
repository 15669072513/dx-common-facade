package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 代理层级配置表
 * </p>
 *
 * @author Jackma
 * @since 2022-10-13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyLevelResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("代理层级")
    private Integer proxyLevel;

    @ApiModelProperty("代理层级名称")
    private String proxyLevelName;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("最后操作人")
    private String updatedBy;

    @ApiModelProperty("最后操作时间")
    private LocalDateTime updatedAt;


}
