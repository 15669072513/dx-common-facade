package com.dx.facade.message.req;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class GetBonusPageReq {

    private long userId;
    private long merchantId;
    private int pageNum;
    private int pageSize;
    private String language;

}
