package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.texas.req.DxGlobalConfigReq;
import com.dx.facade.texas.req.DxGlobalConfigToggleUpdateReq;
import com.dx.facade.texas.req.DxGlobalConfigValUpdateReq;
import com.dx.facade.texas.resp.DxGlobalConfigListResp;
import com.dx.facade.texas.resp.DxGlobalConfigRaiseAppResp;
import com.dx.facade.texas.resp.DxGlobalConfigShortPhraseAppResp;
import com.dx.facade.texas.resp.DxGlobalConfigValueAddedResp;

import java.util.List;

/**
 * 全局配置信息
 */
public interface IDxGlobalConfigRpcService {

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
    CommonResp<Void> updateJsonConfigVal(DxGlobalConfigValUpdateReq req) throws BizException;

    /**
     * 根据类型查询配置信息
     *
     * @param type
     * @return
     */
    CommonResp<List<DxGlobalConfigListResp>> getConfigListByType(Integer type);

    /**
     * 根据配置类型列表查询配置信息
     *
     * @param types
     * @return
     */
    CommonResp<List<DxGlobalConfigListResp>> getConfigListByTypes(List<Integer> types);

    /**
     * 更新开关类配置
     *
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<Void> updateToggleOnOff(DxGlobalConfigToggleUpdateReq req) throws BizException;

    /**
     * 获取聊天短语列表(返回全部信息)
     *
     * @return
     */
    CommonResp<List<DxGlobalConfigListResp>> getChatPhrasesList();

    /**
     * 获取加注配置（返回全部信息）
     *
     * @return
     */
    CommonResp<List<DxGlobalConfigListResp>> getRaiseConfigList();

    /**
     * 游戏端获取短语配置(只返回生效的，内容信息)
     *
     * @return
     */
    CommonResp<List<DxGlobalConfigShortPhraseAppResp>> getChatPhrasesListForApp();

    /**
     * 游戏端获取加注配置(只返回生效的，内容信息)
     *
     * @return
     */
    CommonResp<List<DxGlobalConfigRaiseAppResp>> getRaiseConfigListForApp();

    /**
     * 游戏端获取增值服务配置(只返回生效的)
     *
     * @return
     */
    CommonResp<List<DxGlobalConfigValueAddedResp>> getValueAddedConfigList();

    /**
     * 游戏端获取增值服务配置 (根据类型获取配置信息）
     *
     * @return
     */
    CommonResp<DxGlobalConfigValueAddedResp> getValueAddedConfigByType(Integer type);
}
