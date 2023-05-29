package com.dx.facade.merchant.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MerchantNameByVenueCodeRespDTO {
	
	@ApiModelProperty(value = "商户名称 长度2~20个字符")
	private String merchantName;
}
