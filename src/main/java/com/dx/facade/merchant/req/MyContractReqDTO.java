package com.dx.facade.merchant.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 契约查询请求DTO
 * 
 * @author bicycle
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "MyContractReqDTO", description = "代理个人契约查询传参对象")
public class MyContractReqDTO implements Serializable {


	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Long merchantId;
    
    @ApiModelProperty(value = "签约代理ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Long signProxyId;
    
    @ApiModelProperty(value = "签约代理账号")
    private String signProxyName;

    @ApiModelProperty(value = "生效状态： 1-已生效 2-已失效")
    private Integer effectStatus;

    @ApiModelProperty(value = "契约状态：0-待签约 1-已签约")
    private Integer contractStatus;

    @ApiModelProperty(value = "契约类型：1-佣金契约 2-返点契约")
    private Integer contractType ;

}
