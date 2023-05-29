package com.dx.facade.game.dto;

import com.dx.facade.enums.BwVenueEnum;

public class GameDto {

    //商户号
    private Long merchantId;

    //场馆code
    private BwVenueEnum venue;

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public BwVenueEnum getVenue() {
        return venue;
    }

    public void setVenue(BwVenueEnum venue) {
        this.venue = venue;
    }
}
