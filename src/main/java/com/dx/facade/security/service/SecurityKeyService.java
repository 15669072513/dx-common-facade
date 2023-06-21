package com.dx.facade.security.service;

import com.dx.entity.CommonResp;
import com.dx.facade.security.dto.SecurityKeyInfoDTO;
import com.dx.facade.security.req.KeyIdReq;
import com.dx.facade.security.req.SecurityKeyReq;

public interface SecurityKeyService {

  /**
   * 根据platformId、applicationId、version获取key
   * @param req
   * @return
   */
  CommonResp<SecurityKeyInfoDTO> getKeyByParams(SecurityKeyReq req);

  /**
   * 根据keyId获取key
   * @param req
   * @return
   */
  CommonResp<SecurityKeyInfoDTO> getKeyByKeyId(KeyIdReq req);
}
