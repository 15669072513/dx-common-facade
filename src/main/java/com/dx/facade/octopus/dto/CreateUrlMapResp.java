package com.dx.facade.octopus.dto;

import java.io.Serializable;

public class CreateUrlMapResp implements Serializable {
    private String requestId;
    private String shortUrl;

    public CreateUrlMapResp() {
    }

    public CreateUrlMapResp(String requestId, String shortUrl) {
        this.requestId = requestId;
        this.shortUrl = shortUrl;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getShortUrl() {
        return this.shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }
}