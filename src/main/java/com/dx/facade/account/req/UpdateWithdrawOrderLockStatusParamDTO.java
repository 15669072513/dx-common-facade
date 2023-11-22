package com.dx.facade.account.req;

import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author grayson
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateWithdrawOrderLockStatusParamDTO implements Serializable {

    /**
     * 提现订单ID
     */
    private Long id;
    /**
     * 新的锁单状态
     */
    private Integer newLockStatus;
    /**
     * 锁单人ID
     */
    private Long lockAccountId;
    /**
     * 锁单人
     */
    private String lockAccount;
    /**
     * 操作人ip
     */
    private String ipAddr;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 订单号
     */
    private String eventId;
}
