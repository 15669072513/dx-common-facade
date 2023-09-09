package com.dx.facade.octopus.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class CreateUrlMapReq implements Serializable {
    private String requestId;
    private String longUrl;
    private String description;
}

