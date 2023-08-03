package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
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

public interface IDxTableInfoService {

  /**
   * 根据条件查询牌桌列表信息-翻页
   *
   * @param req
   * @return
   */
  CommonResp<PageResp<DxTableInfoListResp, DxTableSummaryResp>> listPage(DxTableInfoListReq req);

  /**
   * 根据条件查询牌桌列表信息-导出
   * 最多只会返回1000条数据
   * @param req
   * @return
   */
  CommonResp<DxTableListDto> listAll(DxTableInfoListReq req);

  CommonResp<DxTableConfigRuleResp> getTableConfigByTableId(Long tableId);

  /**
   * 新增牌桌
   *
   * @param req
   * @throws BizException
   */
  CommonResp<DxTableInfoDto> addTable(DxTableInfoAddReq req) throws BizException;

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
}
