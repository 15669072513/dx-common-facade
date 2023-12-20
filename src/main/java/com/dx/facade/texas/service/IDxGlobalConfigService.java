package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.texas.req.DxGlobalConfigReq;
import com.dx.facade.texas.req.DxGlobalConfigValUpdateReq;
import com.dx.facade.texas.resp.DxGameConfigListResp;

import java.util.List;

/**
 * 全局配置信息
 */
public interface IDxGlobalConfigService {

    /**
     * 新增全局配置
     *
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<Void> addConfig(DxGlobalConfigReq req) throws BizException;

    /**
     * 根据主键更新全局配置，覆盖更新
     *
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<Void> updateConfig(DxGlobalConfigReq req) throws BizException;

    /**
     * 更新配置值
     *
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<Void> updateConfigVal(DxGlobalConfigValUpdateReq req) throws BizException;

    /**
     * 根据类型查询配置信息
     *
     * @param type
     * @return
     */
    CommonResp<List<DxGameConfigListResp>> getConfigListByType(Integer type);

    /**
     * 根据配置类型列表查询配置信息
     *
     * @param types
     * @return
     */
    CommonResp<List<DxGameConfigListResp>> getConfigListByTypes(List<Integer> types);

    /**
     * 更新开关类配置
     *
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<Void> updateSwitch(DxGlobalConfigValUpdateReq req) throws BizException;

    /**
     * 获取聊天短语列表
     *
     * @return
     */
    CommonResp<List<DxGameConfigListResp>> getChatPhrasesList();
}
