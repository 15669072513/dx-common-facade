package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("会员详情-牌桌列表")
@Data
public class GameOrderUserNameReq extends BaseRequest {

    @ApiModelProperty("商户Id")
    private String merchantId;

    @ApiModelProperty("会员账号")
    private String userName;
}
