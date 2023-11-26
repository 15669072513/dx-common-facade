package com.dx.facade.member.rep;

import com.dx.facade.member.exception.ErrorCode;
import com.dx.facade.member.param.BaseParmDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

import java.io.Serializable;

@Data
@ApiModel("生成二维码入参")
public class QrCodeGenReqDTO implements BaseParmDTO,Serializable {

    @ApiModelProperty(value="二维码类型：1-用户码，2-用户牌桌码，3-牌桌码")
    private Integer type;

    @ApiModelProperty(value="代理ID")
    private Long proxyId;

    @ApiModelProperty(value="用户ID")
    private Long userId;

    @ApiModelProperty(value="牌桌ID")
    private String tableId;

    @ApiModelProperty(value="password")
    private String password;

    @ApiModelProperty(value="游戏类型id")
    private String gameTypeId;

    @Override
    public void check() {
        Assert.notNull(type, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("type"));
        Assert.notNull(proxyId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("proxyId"));
    }
}
