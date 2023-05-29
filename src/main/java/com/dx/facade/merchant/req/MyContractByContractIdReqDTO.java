package com.dx.facade.merchant.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 代理详情-我的有效契约查询 入参对象
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/24
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MyContractByContractIdReqDTO {

    @ApiModelProperty(value = "商户id")
    public Long merchantId;
	
	@ApiModelProperty(value = "返点契约ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long rebateContractId;
	
	@ApiModelProperty(value = "佣金契约ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long commissionContractId;

}
