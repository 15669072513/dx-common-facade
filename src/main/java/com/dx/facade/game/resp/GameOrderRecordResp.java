package com.dx.facade.game.resp;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class GameOrderRecordResp {
    private Long roundId;
    private Date roundDate;
    private String userHearUrl;
    private String userName;
    private String handInfo;
    private String globalPokerCode;
    private String resultInfo;
    private String betStatus;
    private BigDecimal netChip;

}
