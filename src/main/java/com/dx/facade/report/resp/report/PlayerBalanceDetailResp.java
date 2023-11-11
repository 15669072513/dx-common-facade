package com.dx.facade.report.resp.report;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * PlayerBalanceDetailResp
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年11月16日 下午2:08:12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-ob-resp-report-PlayerBalanceDetailResp", description = "会员余额详情返回对象")
public class PlayerBalanceDetailResp implements Serializable {

    /**
     * serialVersionUid
     */
    private static final long serialVersionUID = 2842841229033375496L;


    @ApiModelProperty("币种")
    private String currency;

    /**
     * 现金余额
     */
    @ApiModelProperty(value = "现金余额", example = "100.00")
    private BigDecimal centerWalletBalance;

    /**
     * 钱包总余额
     */
    @ApiModelProperty(value = "钱包总余额", example = "100.00")
    private BigDecimal totalWalletBalance;
}
