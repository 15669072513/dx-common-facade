package com.dx.facade.merchant.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExclusiveDomainResp {
    /**
     * 主键ID
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value="主键ID")
    private Long id;

    @ApiModelProperty(value = "专属域名")
    private String exclusiveDomainName;

    @ApiModelProperty(value = "域名状态  1启用中 2已停用")
    private Integer domainStatus;

    @ApiModelProperty(value = "绑定状态 1.已绑定 2.未绑定")
    private Integer bindingStatus;

    @ApiModelProperty(value = "绑定代理")
    private String bindProxy;

    @ApiModelProperty(value = "描述")
    private String domainDesc;

    @ApiModelProperty(value = "创建人")
    private String createdBy;

    @ApiModelProperty(value = "创建时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "操作人")
    private String updatedBy;

    @ApiModelProperty(value = "最近操作时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;
}
