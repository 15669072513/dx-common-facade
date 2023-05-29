package com.dx.facade.account.service;


import com.dx.exception.BizException;
import com.dx.facade.account.param.ActivityCommonUpdateStatusParam;
import com.dx.facade.account.param.ActivityConfigCommonSelectParam;
import com.dx.facade.account.param.ActivityConfigCommonUpdateParam;
import com.dx.facade.account.resp.ActivityConfigCommonRespDTO;

/**
 * @author agan
 */
public interface ActivityConfigCommonRPCService {

    /**
     * 修改体育盘口值
     * @param param
     * @throws BizException
     */
    void update(ActivityConfigCommonUpdateParam param) throws BizException;

    /**
     * 修改状态
     * @param param
     * @throws BizException
     */
    void updateStatus(ActivityCommonUpdateStatusParam param) throws BizException;

    /**
     * 查询体育 活动公共配置表
     * @param param
     * @return
     */
    ActivityConfigCommonRespDTO select(ActivityConfigCommonSelectParam param) throws BizException;
}
