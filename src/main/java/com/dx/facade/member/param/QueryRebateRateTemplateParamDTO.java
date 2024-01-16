package com.dx.facade.member.param;

import java.io.Serializable;

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
 * 返点比例模板请求参数DTO
 * 
 * @author bicycle
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "返点比例模板请求Param", description = "返点比例模板请求Param")
public class QueryRebateRateTemplateParamDTO extends PageRequest implements BaseParmDTO, Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;
    
    @ApiModelProperty("商户Id")
    private Long merchantId;
    
    @ApiModelProperty("模板类型 1-返点模板")
    private Integer templateType;
    
    @ApiModelProperty("模板名称")
    private String templateName;
    
    /** 创建开始时间 */
    @ApiModelProperty("创建开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String createdAtStart;
    
    /** 创建结束时间 */
    @ApiModelProperty("创建结束时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String createdAtEnd;
    
	@Override
	public void check() {
	}

	@Override
	public String toString() {
		return "QueryRebateRateTemplateParamDTO [id=" + id + ", merchantId=" + merchantId + ", templateType="
				+ templateType + ", templateName=" + templateName + ", createdAtStart=" + createdAtStart
				+ ", createdAtEnd=" + createdAtEnd + "]";
	}

}
