package com.dx.facade.account.req;

import lombok.Data;

@Data
public class WithdrawTodayTotalReqDTO {

    private Long userId;

    private Integer userType;

    private Long merchantId;

}
