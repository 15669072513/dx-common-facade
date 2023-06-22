package com.dx.facade.security.service;

import com.dx.entity.CommonResp;
import com.dx.facade.security.dto.SecurityKeyInfoDTO;
import com.dx.facade.security.req.KeyIdReq;
import com.dx.facade.security.req.ListKeyReq;
import com.dx.facade.security.req.SecurityKeyReq;

import java.util.List;

public interface SecurityKeyRPCService {

  /**
   * 根据platformId、applicationId、version获取key
   *
   * @param req
   * @return
   */
  CommonResp<SecurityKeyInfoDTO> getKeyByParams(SecurityKeyReq req) throws Exception;

  /**
   * 根据keyId获取key
   *
   * @param req
   * @return
   */
  CommonResp<SecurityKeyInfoDTO> getKeyByKeyId(KeyIdReq req) throws Exception;

  /**
   * 根据多个keyId获取多个key
   * @param req
   * @return
   * @throws Exception
   */
  CommonResp<List<SecurityKeyInfoDTO>> getListKey(ListKeyReq req) throws Exception;
}
