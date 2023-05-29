package com.dx.facade.operate.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.operate.req.ActivityConfigTabReq;
import com.dx.facade.operate.resp.ActivityConfigTabRespDTO;

import java.util.List;

/**
 * @Author: timas
 * @Description: TODO
 * @Date: 2022/09/29 14:03
 */
public interface ActivityConfigTabRPCService {

    /**
     * 获取商户优惠配置页签
     * @param req
     * @return
     * @throws BizException
     */
    List<ActivityConfigTabRespDTO> select(ActivityConfigTabReq req) throws BizException;

    CommonResp<ActivityConfigTabRespDTO> queryById(Long id) throws BizException;

}
