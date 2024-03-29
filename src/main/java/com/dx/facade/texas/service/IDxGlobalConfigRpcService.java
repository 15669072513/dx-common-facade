package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.texas.req.*;
import com.dx.facade.texas.resp.*;

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
     * 新增或者更新配置
     *
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<Void> saveOrUpdateConfig(DxGlobalConfigReq req) throws BizException;

    /**
     * 批量新增或者更新配置
     *
     * @param reqs
     * @return
     * @throws BizException
     */
    CommonResp<Void> saveOrUpdateConfigBatch(List<DxGlobalConfigReq> reqs) throws BizException;

    /**
     * 更新配置值
     *
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<Void> updateJsonConfigVal(DxGlobalConfigValUpdateReq req) throws BizException;

    /**
     * 更新配置值
     *
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<Void> updateJsonConfigMultipleVal(DxGlobalConfigMultipleValUpdateReq req) throws BizException;


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
    CommonResp<List<DxGlobalConfigShortPhraseResp>> getChatPhrasesList();

    /**
     * 获取聊天短语列表(分页查询)
     *
     * @return
     */
    CommonResp<PageResp<DxGlobalConfigShortPhraseResp, Void>> getChatPhrasesPageList(DxGlobalConfigChatPhrasesListReq req);

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
     * 游戏端获取增值服务配置(只返回生效的)
     *
     * @return
     */
    CommonResp<List<DxGlobalConfigCommonValueAddedResp>> getCommonValueAddedConfigList();

    /**
     * 游戏端获取增值服务配置(只返回生效的)
     *
     * @return
     */
    CommonResp<List<DxGlobalConfigValueAddedResp>> getValueAddedConfigList(List<Integer> bizTypes);

    /**
     * 游戏端获取增值服务配置 (根据类型获取配置信息）
     *
     * @return
     */
    CommonResp<DxGlobalConfigValueAddedResp> getValueAddedConfigByType(Integer type);


    /**
     * 游戏端获取增值服务配置(只返回生效的)
     *
     * @return
     */
    CommonResp<List<DxGlobalConfigCommonValueAddedResp>> getCommonValueAddedConfigList(List<Integer> bizTypes);

    /**
     * 游戏端获取增值服务配置 (根据类型获取配置信息）
     *
     * @return
     */
    CommonResp<DxGlobalConfigCommonValueAddedResp> getCommonValueAddedConfigByType(Integer type);
}
