package com.dx.facade.auth.pojo.req;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 新增 登录IP白名单 入参
 *
 * @author fitz
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveIpWhitelistReqDTO {
	
	
	@ApiModelProperty(value = "商户ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@NotNull(message = "商户ID 不能为空")
	private Long merchantId;
	
	@ApiModelProperty(value = "商户CODE")
	@NotBlank(message = "商户CODE 不能为空")
	private String merchantCode;
	
	@ApiModelProperty(value = "登录IP 多个IP用,隔开")
	@NotBlank(message = "登录IP 不能为空")
	private String ip;
	
	@ApiModelProperty(value = "备注")
	private String remark;
	
	@ApiModelProperty(value = "创建人", hidden = true)
	private String createdBy;
	
	@ApiModelProperty(value = "最后操作人", hidden = true)
	private String updatedBy;
	
}
