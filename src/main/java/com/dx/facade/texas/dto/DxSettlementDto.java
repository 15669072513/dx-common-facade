package com.dx.facade.texas.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class DxSettlementDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<DxSettlementDetailDto> chipScoreChangeDtoList;
    private String eventId;
    private Long eventTime;
    private Integer changeType;
    private List<DxSettlementDetailDto> gameOrderDetailDtoList;
    private Long tableId;
    private String tableCode;
}
