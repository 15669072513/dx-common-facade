package com.dx.facade.member.rep;

import com.dx.facade.member.param.MemberLoginParamDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("解析二维码入参")
public class QrCodeParseReqDTO extends MemberLoginParamDTO implements Serializable {

    @ApiModelProperty(value="短码")
    private String sc;


}
