package com.dx.facade.account.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawTodayTotalReqDTO implements Serializable {

    private Long userId;

    private Integer userType;

    private Long merchantId;

}
