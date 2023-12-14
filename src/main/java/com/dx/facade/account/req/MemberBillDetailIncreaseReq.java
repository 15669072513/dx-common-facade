package com.dx.facade.account.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author orbit
 * @datetime 2023-10-04 11:10
 * @desc 给会员增加流水Req
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberBillDetailIncreaseReq implements Serializable {
    /**
     * 商户ID
     */
    private Long merchantId;
    /**
     * 会员ID
     */
    @NotNull(message = "会员ID不能为空")
    private Long memberId;
    private String eventId;
    private LocalDateTime eventTime;
    private Integer changeType;
    private String changeTypeDesc;
    /**
     * 流水基数
     */
    @NotNull(message = "流水基数不能为空")
    private BigDecimal baseAmount;
    /**
     * 流水倍数
     */
    private BigDecimal multiple;

    /**
     * 操作人
     */
    private String operator;
    /**
     * 操作人ip
     */
    private String ipAddr;
}
