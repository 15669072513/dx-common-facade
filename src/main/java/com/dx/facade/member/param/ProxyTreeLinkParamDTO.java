package com.dx.facade.member.param;

import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 代理结构树查询请求DTO
 *
 * @author grayson
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyTreeLinkParamDTO implements BaseParmDTO{

	@ApiModelProperty(value = "商户id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;

	@ApiModelProperty(value = "代理id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long id;
	
	@ApiModelProperty(value = "是否查询所有下级代理")
	private Boolean isAllSub;
	
    /** 注册开始时间 */
    @ApiModelProperty("注册开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String createdAtStart;
    
    /** 注册结束时间 */
    @ApiModelProperty("注册结束时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String createdAtEnd;

	@Override
	public void check() {
		Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
	}
}
