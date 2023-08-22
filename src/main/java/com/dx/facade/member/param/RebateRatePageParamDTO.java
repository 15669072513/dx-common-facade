package com.dx.facade.member.param;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返点比例请求参数DTO
 *
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = " RebateRatePageParamDTO", description = "RebateRatePageParamDTO")
public class RebateRatePageParamDTO extends PageRequest {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("状态:0-未设置 1-已生效 2-已失效 3-平台调整")
    private Integer status;

    /**
     * 生效开始时间
     */
    @ApiModelProperty("生效开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private String effectDtStart;

    /**
     * 生效结束时间
     */
    @ApiModelProperty("生效结束时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private String effectDtEnd;

    /**
     * 失效开始时间
     */
    @ApiModelProperty("失效开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private String lostEffectDtStart;

    /**
     * 失效结束时间
     */
    @ApiModelProperty("失效结束时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private String lostEffectDtEnd;


}
