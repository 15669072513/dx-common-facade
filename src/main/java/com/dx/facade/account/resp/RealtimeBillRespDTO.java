package com.dx.facade.account.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author orbit
 * @datetime 2023-09-02 14:30
 * @desc 实时账单
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RealtimeBillRespDTO implements Serializable {
    private BigDecimal cashAvailable;
    private BigDecimal creditAvailable;
}
