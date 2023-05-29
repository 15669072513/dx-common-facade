package com.dx.facade.account.req;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author Yinter
 */

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepositWithdrawConfigPageDTO extends PageRequest {

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty("所属商户，支持多个")
    private List<Long> merchantIds;
}
