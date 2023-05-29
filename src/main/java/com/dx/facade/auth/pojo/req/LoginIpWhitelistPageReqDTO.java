package com.dx.facade.auth.pojo.req;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * 登录IP白名单 分页查询 入参
 *
 * @author fitz
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginIpWhitelistPageReqDTO extends PageRequest {
	
	@ApiModelProperty(value = "商户ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
	@ApiModelProperty(value = "登录IP")
	private String ip;
	
	@ApiModelProperty(value = "登录IP归属地")
	private String ipAttribution;
	
	@ApiModelProperty(value = "创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime createdAtBegin;
	
	@ApiModelProperty(value = "创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime createdAtEnd;
	
	@ApiModelProperty(value = "创建人")
	private String createdBy;
	
}
