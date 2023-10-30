package com.dx.facade.member.resp;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyCommissionSettleCycleRespDTO {
    
    @ApiModelProperty("佣金结算周期 1：半月结 2：月结")
    private Integer commissionSettleCycle;

    public static void main(String[] args) {
		System.out.println(LocalDateTime.now().getDayOfMonth());
	}
}
