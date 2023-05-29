package com.dx.facade.merchant.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商户场馆费率配置 返回参数
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/1
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MerchantGameRateResp implements Serializable {
	
    /**
     * 场馆代码
     */
    private String gameCode;

    /**
     * 场馆名称
     */
    private String gameName;

    /**
     * 场馆费率
     */
    private BigDecimal feeRate;
    
}