package com.dx.facade.game.resp;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class GameOrderRecordUserResp {
    private Long userId;
    private Long roundId;
    private Date gameDate;
    private String gameName;
    private Integer gameType;
    private Integer ms;
    private BigDecimal netAmount;
}
