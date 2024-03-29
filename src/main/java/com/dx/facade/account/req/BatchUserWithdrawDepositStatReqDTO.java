package com.dx.facade.account.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author orbit
 * @datetime 2023-09-27 20:40
 * @desc 获取会员/代理历史存取款统计信息查询接口
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BatchUserWithdrawDepositStatReqDTO implements Serializable {

    /**
     * 会员ID或代理ID
     */
    private List<Long> userIds;
    /**
     * 用户类型：0-会员，1-代理
     */
    private Integer userType;

}
