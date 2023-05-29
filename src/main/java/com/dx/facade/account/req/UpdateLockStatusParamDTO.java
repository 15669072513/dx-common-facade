package com.dx.facade.account.req;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author grayson
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLockStatusParamDTO implements BaseParmDTO {

    @ApiModelProperty(value = "审核单ID列表", required = true)
    private List<Long> ids;

    @ApiModelProperty(value = "锁单状态 0：解锁，1：锁单", required = true)
    private Integer lockStatus;

    @ApiModelProperty(value = "执行锁定人")
    private String lockAccount;

    @ApiModelProperty(value = "执行锁定人")
    private Long lockAccountId;

    @ApiModelProperty(value = "本次操作是否是全选，0:不是，1:是")
    private Integer selectAll;

    @Override
    public void check() {
        Assert.notEmpty(ids, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("ids"));
        Assert.notNull(lockStatus, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("lockStatus"));
        Assert.notNull(lockAccount, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("lockAccount"));
        if(lockStatus != 0 && lockStatus != 1){
            throw new IllegalArgumentException("lockStatus传值不正确！");
        }
    }
}
