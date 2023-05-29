package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import java.util.Objects;

/**
 * @author grayson
 */
@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetVirtualAccountParmDTO implements BaseParmDTO {

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "虚拟币账户地址")
    private String virtualAddress;
    
    @ApiModelProperty(value = "用户Id")
    private Long userId;

    @ApiModelProperty(value = "黑名单状态（0-禁用中 1-启用中）")
    private Integer blacklistStatus;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        if(Objects.isNull(id) && Objects.isNull(virtualAddress)&& Objects.isNull(userId)){
            throw new IllegalArgumentException("参数id和virtualAddress和userId至少传一个");
        }
    }
}
