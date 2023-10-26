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
    private Integer walletType;
    private Integer changeType;
    private Long clubId;
    private Long merchantId;
    private String merchantName;
    private String nickName;
    private Long tableId;
    private String tableName;
    private String currency;
    private BigDecimal amount;
    private BigDecimal netChip;
    private String handCode;
    private String eventId;
    private Integer eventType;
    private Long eventTime;
    private Integer roundNo;
}
