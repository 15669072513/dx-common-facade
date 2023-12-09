package com.dx.facade.game.dto;

import java.math.BigDecimal;

public class BringInDto {
    private BigDecimal bringIn;
    private Integer count;

    public BringInDto(BigDecimal bringIn, Integer count) {
        this.bringIn = bringIn;
        this.count = count;
    }

    public BringInDto() {
    }

    public BigDecimal getBringIn() {
        return this.bringIn;
    }

    public void setBringIn(BigDecimal bringIn) {
        this.bringIn = bringIn;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
