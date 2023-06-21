package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class UserValiBetAmountReq extends BaseRequest {
    @ApiModelProperty("会员ID集合")
    private List<String> userIdList;
}
