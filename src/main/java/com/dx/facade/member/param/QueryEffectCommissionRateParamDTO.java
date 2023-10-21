package com.dx.facade.member.param;

import java.io.Serializable;

import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 生效中的返佣比例请求参数DTO
 * 
 * @author bicycle
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "生效中返佣比例请求Param", description = "生效中返佣比例请求Param")
public class QueryEffectCommissionRateParamDTO implements BaseParmDTO, Serializable {


    private static final long serialVersionUID = 1L;

    
    @ApiModelProperty("商户Id")
    private Long merchantId;
    
    @ApiModelProperty("用户Id")
    private Long userId;


	@Override
	public void check() {
		 Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
		 Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
	}

}
