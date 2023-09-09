package com.dx.facade.octopus.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class CreateUrlMapResp implements Serializable {
    private String requestId;
    private String shortUrl;
}