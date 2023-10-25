package com.dx.facade.octopus.service;

import com.dx.entity.CommonResp;
import com.dx.facade.octopus.dto.CreateUrlMapReq;
import com.dx.facade.octopus.dto.CreateUrlMapResp;

public interface UrlMapRpcService {
    CommonResp<CreateUrlMapResp> createUrlMap(CreateUrlMapReq request);
}
