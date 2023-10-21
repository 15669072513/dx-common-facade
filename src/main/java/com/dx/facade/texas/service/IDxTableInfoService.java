package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.game.req.GameOrderClubSumReq;
import com.dx.facade.game.resp.GameOrderClubSumResp;
import com.dx.facade.game.resp.GameOrderUserTableSumResp;
import com.dx.facade.texas.dto.DxTableInfoDto;
import com.dx.facade.texas.dto.DxTableLimitDto;
import com.dx.facade.texas.dto.DxTableListDto;
import com.dx.facade.texas.req.DxTableCountReq;
import com.dx.facade.texas.req.DxTableInfoAddReq;
import com.dx.facade.texas.req.DxTableInfoLimitReq;
import com.dx.facade.texas.req.DxTableInfoListReq;
import com.dx.facade.texas.resp.DxTableBaseInfoResp;
import com.dx.facade.texas.resp.DxTableClubInfoResp;
import com.dx.facade.texas.resp.DxTableConfigRuleResp;
import com.dx.facade.texas.resp.DxTableCountResp;
import com.dx.facade.texas.resp.DxTableInfoListResp;
import com.dx.facade.texas.resp.DxTableRobotResp;
import com.dx.facade.texas.resp.DxTableSummaryResp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public interface IDxTableInfoService {

    /**
     * 根据条件查询牌桌列表信息-翻页
     *
     * @param req
     * @return
     */
    CommonResp<PageResp<DxTableInfoListResp, DxTableSummaryResp>> listPage(DxTableInfoListReq req);

    /**
     * 根据条件查询牌桌列表信息-翻页（APP使用）
     *
     * @param req
     * @return
     */
    CommonResp<PageResp<DxTableInfoListResp, DxTableSummaryResp>> listPageApp(DxTableInfoListReq req);

    /**
     * 查询牌桌总抽水
     * @param req
     * @return
     */
    CommonResp<DxTableSummaryResp> getTableSummaryInfo(DxTableInfoListReq req);

    /**
     * 根据条件查询牌桌列表信息-导出
     *
     * @param req
     * @return
     */
    CommonResp<DxTableListDto> listAll(DxTableInfoListReq req);

    /**
     * 根据牌桌ID获取牌桌配置信息
     * @param tableId
     * @return
     */
    CommonResp<DxTableConfigRuleResp> getTableConfigByTableId(Long tableId);

    /**
     * 根据多个牌桌ID获取牌桌配置信息
     * @param tableId
     * @return
     */
    CommonResp<List<DxTableConfigRuleResp>> getTableConfigByTableIds(Set<Long> tableId);

    /**
     * 新增牌桌
     * @param req
     */
    CommonResp<DxTableInfoDto> addTable(DxTableInfoAddReq req);

    /**
     * 更新牌桌
     *
     * @param req
     * @throws BizException
     */
    CommonResp<Void> updateTable(DxTableInfoAddReq req) throws BizException;

    /**
     * 根据俱乐部id 获取牌桌个数
     *
     * @param req
     * @return
     */
    CommonResp<DxTableCountResp> getTableCountByClubId(DxTableCountReq req);

    /**
     * 游戏牌桌解散（综合后台强制解散）
     *
     * @param tableId 牌桌id
     */
    CommonResp<Void> gameDissolve(Long tableId);

    /**
     * 游戏牌桌解散（游戏房间内房主解散）
     *
     * @param tableId 牌桌id
     */
    CommonResp<Void> houseOwnerGameDissolve(Long tableId);

    /**
     * 根据牌桌ID获取牌桌基础信息
     */
    CommonResp<DxTableBaseInfoResp> getTableBaseInfoById(Long tableId);

    /**
     * 根据牌桌ID 或者 table_code 获取牌桌基础信息
     */
    CommonResp<DxTableBaseInfoResp> getTableBaseInfoById(String tableId);

    /**
     * 根据牌桌ID获取俱乐部信息
     */
    CommonResp<DxTableClubInfoResp> getTableClubInfoById(Long tableId);

    /**
     * 设置牌桌的机器人数量
     *
     * @param tableId
     * @param robotNum
     * @return
     */
    CommonResp<Void> setTableRobotNum(Long tableId, Integer robotNum) throws Exception;

    /**
     * 获取牌桌机器人信息
     * @param tableId
     * @return
     */
    CommonResp<DxTableRobotResp> getTableRobotInfo(Long tableId) throws Exception;

    CommonResp<DxTableLimitDto> getTableInfoByClubLimit(DxTableInfoLimitReq req);

    /**
     * 获取俱乐部纬度的统计数据
     * @param req
     * @return
     */
    CommonResp<PageResp<GameOrderClubSumResp, ?>> gameOrderClubContributeList(GameOrderClubSumReq req);

    /**
     * 获取牌桌概况
     * @param tableId 牌桌ID
     * @return
     */
    CommonResp<DxTableBaseInfoResp> getTableOverviewInfo(Long tableId);

    /**
     * 根据俱乐部id合游戏类型获取牌桌记录
     * @param clubId
     * @param gameType
     * @param startTime
     * @param endTime
     * @return
     */
    CommonResp<List<GameOrderUserTableSumResp>> getTableRecordByClubId(Long clubId, Integer gameType, LocalDateTime startTime, LocalDateTime endTime);
}
