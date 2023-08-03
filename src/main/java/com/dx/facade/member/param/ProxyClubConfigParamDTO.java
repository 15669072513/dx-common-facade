package com.dx.facade.member.param;

import java.io.Serializable;

import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 代理俱乐部配置参数DTO
 * 
 * @author bicycle
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "代理俱乐部配置Param", description = "代理俱乐部配置Param")
public class ProxyClubConfigParamDTO implements BaseParmDTO, Serializable {

    private static final long serialVersionUID = -5276753294444979337L;
    
    @ApiModelProperty(value="商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
    
    /** 人员上线 */
    @ApiModelProperty("人员上线")
    private Integer upperLimit;
    
    @ApiModelProperty("同时开牌桌上限")
    private Integer cardTableLimit;
    
    @ApiModelProperty("单牌桌旁观人数上限")
    private Integer lookOnLimit;

    @Override
    public void check() {
    	Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(upperLimit, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("upperLimit"));
        Assert.notNull(cardTableLimit, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("cardTableLimit"));
        Assert.notNull(lookOnLimit, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("lookOnLimit"));
    }
}
