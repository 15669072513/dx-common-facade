package com.dx.facade.account.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author orbit
 * @datetime 2023-10-15 11:46
 * @desc 所需流水调整请求参数
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdjustBillDetailReq implements Serializable {
    /**
     * 商户ID
     */
    private Long merchantId;
    /**
     * 会员ID
     */
    private Long memberId;
    /**
     * 调整类型：0-非调整，1-调整增加，2-调整扣除，参见StatementAdjustTypeEnum枚举
     */
    private Integer adjustType;
    /**
     * 调整金额：增加时为正值，扣除是为负值
     */
    private BigDecimal amount;
    /**
     * 调整操作人
     */
    private String operator;
    /**
     * 调整备注
     */
    private String remark;
    /**
     * 调整时间
     */
    private LocalDateTime adjustTime;
}
