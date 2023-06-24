package com.dx.facade.security.service;

import com.dx.entity.CommonResp;
import com.dx.facade.security.dto.KeyInfoDTO;
import com.dx.facade.security.req.SecurityKeyReq;

public interface SecurityKeyRPCService {

  /**
   * 根据platformId、applicationId、version获取key
   *
   * @param req
   * @return
   */
  CommonResp<KeyInfoDTO> getKeyByParams(SecurityKeyReq req) throws Exception;
}
