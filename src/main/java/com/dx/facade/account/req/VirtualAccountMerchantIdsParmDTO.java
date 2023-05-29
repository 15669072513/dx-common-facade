package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author agan
 */
@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VirtualAccountMerchantIdsParmDTO {

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "商户ID")
    private List<Long> merchantId;

    @ApiModelProperty(value = "虚拟币账户地址")
    private String virtualAddress;

    @ApiModelProperty(value = "用户Id")
    private Long userId;

}
