package com.dx.facade.account.change.param;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @author Dealer
 * @description:
 * @date 2023/08/21
 * @copyright
 */
@Slf4j
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "通用mq账变对象", description = "通用mq账变对象")
public class CmnAccountChangeMQParamDTO implements Serializable {

    private IBWWalletChangeParm changeParm;

    //@See com.dx.facade.account.change.param.CmnAccountChangeMQParamType.code
    private Integer paramType;


    public void main(String[] args) {








    }

}
