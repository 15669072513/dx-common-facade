package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.dto.game.GameOrderRecordUserNetChipSumReqDto;
import com.dx.facade.game.dto.game.GameOrderUserSumByUserIdRespDto;
import com.dx.facade.game.req.GameOrderClubSumReq;
import com.dx.facade.game.req.GameOrderRecordUserNetChipSumReq;
import com.dx.facade.game.req.GameOrderUserSumByUserIdReq;
import com.dx.facade.game.req.GameOrderUserTableSumReq;
import com.dx.facade.game.req.UserTableAggReq;
import com.dx.facade.game.req.UserTableReq;
import com.dx.facade.game.resp.GameOrderClubSumResp;
import com.dx.facade.game.resp.GameOrderUserTableResp;
import com.dx.facade.game.resp.GameOrderUserTableSumResp;
import com.dx.facade.game.resp.UserTableAggListResp;
import com.dx.facade.game.resp.gamedetail.GameOrderRecordDetail;
import java.util.List;

public interface UserTableAggRpcService {


    /**
     * 查询当前会员参与的所有牌桌ID
     * @param userTableReq
     * @return
     */
    CommonResp<List<GameOrderUserTableResp>> getUserTableListByUserId(UserTableReq userTableReq);

    /**
     * 盈亏总额
     * @param req
     * @return
     */
    CommonResp<GameOrderRecordUserNetChipSumReqDto> userNetAmountSummary(GameOrderRecordUserNetChipSumReq req);

    /**
     * 查询战绩列表
     * @param orderUserTableSumReq
     * @return
     */
    CommonResp<PageResp<GameOrderUserTableSumResp, ?>> queryGameOrderUserTableSumList(GameOrderUserTableSumReq orderUserTableSumReq);

    /**
     * 查询战绩详情
     * @param tableId
     * @return
     */
    CommonResp<List<GameOrderRecordDetail.GameOrderRecord>> getGameOrderPlayerRecords(Long tableId);


    /**
     * 查询战绩详情分页
     * @param pageNum
     * @param pageSize
     * @param tableId
     * @return
     */
    CommonResp<PageResp<GameOrderRecordDetail.GameOrderRecord,?>> getGameOrderPlayerRecordPage(Long pageNum,Long pageSize,
        Long tableId);

    /**
     * 查询战绩详情分页(等待局服务费计算结束---异步转同步：牌桌解散弹窗试用)
     * @param pageNum
     * @param pageSize
     * @param tableId
     * @return
     */
    CommonResp<PageResp<GameOrderRecordDetail.GameOrderRecord,?>> getGameOrderPlayerRecordWaitTableFeeProcessEndPage(Long pageNum,Long pageSize,
                                                                                               Long tableId);

    /**
     * 条件查询用户牌桌统计表
     * @param userTableAggReq
     * @return
     */
    CommonResp<List<UserTableAggListResp>> list(UserTableAggReq userTableAggReq);


    /**
     * 获取游戏订单俱乐部贡献列表
     * @param req
     * @return
     */
    CommonResp<PageResp<GameOrderClubSumResp, ?>> gameOrderClubContributeList(GameOrderClubSumReq req);

    /**
     * 根据用户id集合获取统计注单信息
     * @param userSumByUserIdReq
     * @return
     */
    CommonResp<GameOrderUserSumByUserIdRespDto> getGameOrderUserSumList(GameOrderUserSumByUserIdReq userSumByUserIdReq);
}
