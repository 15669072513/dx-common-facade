package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author grayson
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetUserInviteDataRespDTO {

    @ApiModelProperty("邀请人数")
    private Integer inviteTotal;

    @ApiModelProperty("达标人数")
    private Integer taskTotal;

    @ApiModelProperty("已获彩金")
    private BigDecimal inviteRewardAmountTotal;

}
