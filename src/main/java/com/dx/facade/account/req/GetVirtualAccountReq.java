package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

import com.dx.facade.account.service.BaseParmDTO;

/**
 * @author grayson
 */
@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetVirtualAccountReq implements BaseParmDTO {

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "虚拟币账户地址")
    private String virtualAddress;
    
    @ApiModelProperty(value = "用户Id")
    private Long userId;

    @Override
    public void check() {
        //Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        if(Objects.isNull(id) && Objects.isNull(virtualAddress)&& Objects.isNull(userId)){
            throw new IllegalArgumentException("参数id和virtualAddress和userId至少传一个");
        }
    }
}
