package com.dx.facade.message.req;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GetBonusListReq {

    private long userId;
    private long merchantId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

}
