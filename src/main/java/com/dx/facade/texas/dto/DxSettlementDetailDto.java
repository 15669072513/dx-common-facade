package com.dx.facade.texas.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
@Getter
@Setter
public class DxSettlementDetailDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long userId;
    private String userName;
    private String nickName;
    private Long clubId;
    private Long merchantId;
    private String merchantName;
    private BigDecimal amount;
    private Integer eventType;
}
