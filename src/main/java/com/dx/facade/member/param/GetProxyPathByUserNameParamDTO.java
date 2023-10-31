package com.dx.facade.member.param;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 红利消息 实体类
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/15
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetProxyPathByUserNameParamDTO implements BaseParmDTO{
	
	@ApiModelProperty(value = "商户id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;

	@ApiModelProperty(value = "商户ids")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private List<Long> merchantIds;
	
	@ApiModelProperty(value = "代理账号")
	private String userName;
	
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

	}
}
