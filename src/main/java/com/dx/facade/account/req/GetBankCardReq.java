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
public class GetBankCardReq implements BaseParmDTO {
    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "卡号")
    private String cardNumber;
    @ApiModelProperty(value = "用户Id")
    private Long userId;

    @Override
    public void check() {
        if(Objects.isNull(id) && Objects.isNull(cardNumber)&&Objects.isNull(userId)){
            throw new IllegalArgumentException("参数id和cardNumber和userId至少传一个");
        }
    }
}
