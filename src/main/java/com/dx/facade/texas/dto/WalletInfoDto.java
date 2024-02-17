package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel("用户牌桌余额汇总信息")
@Data
public class WalletInfoDto implements Serializable {
    private TableBringInfoDto tableBringInfoDto;
    /**
     * 牌桌总服务费
     */
    private BigDecimal totalTableFee;
}
