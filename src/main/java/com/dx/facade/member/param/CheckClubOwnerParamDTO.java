package com.dx.facade.member.param;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;
/**
 * 校验俱乐部所有者请求DTO
 * 
 * @author bicycle
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CheckClubOwnerParamDTO implements BaseParmDTO{

    @ApiModelProperty(value="商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
    
    @ApiModelProperty(value="代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyId;

    @Override
    public void check() {
    	Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(proxyId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("proxyId"));
    }

}
