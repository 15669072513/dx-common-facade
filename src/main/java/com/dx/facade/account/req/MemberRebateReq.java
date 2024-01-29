package com.dx.facade.account.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Dealer
 * @description:
 * @date 2024/01/19
 * @copyright
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberRebateReq {

    /**
     * @author Dealer
     * @description: 会员id列表
     * @date 2024/1/19
     * @copyright
     */
    private List<Long> memberIds;

    /**
     * @author Dealer
     * @description: 开始时间
     * @date 2024/1/19
     * @copyright
     */
    private LocalDateTime start;

    /**
     * @author Dealer
     * @description: 结束时间
     * @date 2024/1/19
     * @copyright
     */
    private LocalDateTime end;
}
