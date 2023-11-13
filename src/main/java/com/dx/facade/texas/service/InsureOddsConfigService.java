package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.texas.dto.InsureOddsConfigDto;
import com.dx.facade.texas.req.InsureOddsListReq;
import com.dx.facade.texas.req.UpdateInsureOddsListReq;

import java.util.List;

public interface InsureOddsConfigService {

  /**
   * 获取保险赔率
   * @param req
   * @return
   */
  CommonResp<List<InsureOddsConfigDto>> getInsureOddsList(InsureOddsListReq req);

  /**
   * 修改赔率
   * @param req
   * @return
   */
  CommonResp<String> updateInsureOdds(UpdateInsureOddsListReq req);
}
