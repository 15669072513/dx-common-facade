package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.req.OrderRecordLogReq;


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

  /**
   * 删除订单记录日志表信息
   * @param orderRecordLogReq
   * @return
   */
  CommonResp<Boolean> deleteOrderRecordLog(OrderRecordLogReq orderRecordLogReq);
}
