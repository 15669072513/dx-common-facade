package com.dx.facade.octopus.dto;

import java.io.Serializable;

public class CreateUrlMapReq implements Serializable {
    private String requestId;
    private String longUrl;
    private String description;

    public CreateUrlMapReq() {
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getLongUrl() {
        return this.longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

