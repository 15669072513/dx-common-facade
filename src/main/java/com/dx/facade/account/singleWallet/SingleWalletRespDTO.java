package com.dx.facade.account.singleWallet;

import java.math.BigDecimal;

public class SingleWalletRespDTO {

    private String venueUsername;

    private BigDecimal amount;

    private String eventId;

    private BigDecimal beforeBalance;

    private BigDecimal balance;

    private int code;


    public String getVenueUsername() {
        return venueUsername;
    }

    public void setVenueUsername(String venueUsername) {
        this.venueUsername = venueUsername;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public BigDecimal getBeforeBalance() {
        return beforeBalance;
    }

    public void setBeforeBalance(BigDecimal beforeBalance) {
        this.beforeBalance = beforeBalance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
