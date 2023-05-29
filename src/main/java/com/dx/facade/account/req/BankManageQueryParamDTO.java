package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import com.dx.facade.common.PageRequest;

/**
 * @author Yinter
 */

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankManageQueryParamDTO extends PageRequest {

    @ApiModelProperty(value = "币种")
    private String currency;


}
