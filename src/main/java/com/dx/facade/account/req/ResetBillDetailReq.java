package com.dx.facade.account.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author orbit
 * @datetime 2023-10-15 11:46
 * @desc 会员流水重置RPC入参
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResetBillDetailReq implements Serializable {
    /**
     * 商户ID
     */
    private Long merchantId;
    /**
     * 会员ID
     */
    private List<Long> memberIds;
    /**
     * 流水重置操作人
     */
    private String operator;

}
