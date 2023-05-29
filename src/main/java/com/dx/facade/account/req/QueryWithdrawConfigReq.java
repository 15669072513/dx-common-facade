package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import java.util.List;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueryWithdrawConfigReq implements BaseParmDTO {

    @ApiModelProperty("用户类型")
    private Integer userType;

    @ApiModelProperty("商户ID")
    private List<Long> merchantIdList;

    @ApiModelProperty("代理账号")
    private String proxyName;

    @Override
    public void check() {
        Assert.notNull(userType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userType"));
    }
}
