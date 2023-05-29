package com.dx.facade.auth.pojo.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * 登录IP白名单管理列表 分页返回参数
 *
 * @author fitz
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginIpWhitelistPageRespDTO {
	
	@ApiModelProperty(value = "主键")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long id;
	
	@ApiModelProperty(value = "商户ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
	@ApiModelProperty(value = "商户CODE")
	private String merchantCode;
	
	@ApiModelProperty(value = "登录IP")
	private String ip;
	
	@ApiModelProperty(value = "登录IP归属地")
	private String ipAttribution;
	
	@ApiModelProperty(value = "备注")
	private String remark;
	
	@ApiModelProperty(value = "创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime createdAt;
	
	@ApiModelProperty(value = "创建人")
	private String createdBy;
	
	@ApiModelProperty(value = "最后操作时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime updatedAt;
	
	@ApiModelProperty(value = "最后操作人")
	private String updatedBy;
	
}
