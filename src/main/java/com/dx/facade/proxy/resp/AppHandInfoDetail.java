package com.dx.facade.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author royal
 * APP手牌列表返回
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppHandInfoDetail implements Serializable {

    @ApiModelProperty("手牌牌号码")
    private Integer cardNum;

    @ApiModelProperty("是否改牌")
    private boolean manipulateMark;

    @ApiModelProperty("眼睛标识")
    private boolean showFlag;

    @ApiModelProperty("是否置灰")
    private boolean displayFlag;
}
