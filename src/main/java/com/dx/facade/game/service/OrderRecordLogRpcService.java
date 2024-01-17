package com.dx.facade.game.service;

import com.dx.entity.CommonResp;


/**
 *订单记录日志表rpc调用
 */
public interface OrderRecordLogRpcService {


  /**
   * 删除订单记录日志表信息
   * @param serialNo
   * @return
   */
  CommonResp<Boolean> deleteOrderRecordLog(String serialNo);
}
