package com.dx.facade.account.req;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WithdrawTodayTotalReqDTO implements Serializable {

    private Long userId;

    private Integer userType;

    private Long merchantId;

}
