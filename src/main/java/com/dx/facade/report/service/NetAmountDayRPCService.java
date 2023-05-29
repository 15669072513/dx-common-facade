package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.report.netamountday.NetAmountDayReqDTO;
import com.dx.facade.report.resp.report.NetAmountDayRespDTO;
import com.dx.facade.report.resp.report.NetAmountDaySummaryRespDTO;

import java.time.LocalDate;

public interface NetAmountDayRPCService {

    /**
     * 每日盈亏列表和本页合计接口
     *
     * @param requestDto
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<NetAmountDayRespDTO, NetAmountDaySummaryRespDTO>> queryNetAmountDayList(NetAmountDayReqDTO requestDto) throws BizException;

    /**
     * 每日盈亏全部合计接口
     *
     * @param requestDto
     * @return
     * @throws BizException
     */
    CommonResp<NetAmountDaySummaryRespDTO> queryNetAmountDayTotal(NetAmountDayReqDTO requestDto) throws BizException;

//    /**
//     * 统计盈亏日报表
//     * @param statisticDate
//     * @return
//     */
//    Integer statisticNetAmountDayReport(LocalDate statisticDate);

//
//    /**
//     * T+1离线数据更新业绩报表 会员报表 (更新前删除）
//     *
//     * @param staticDate
//     * @return
//     */
//    Integer deleteNetAmountDayRecords(Integer staticDate) throws Exception;
//
//    /**
//     * T+1离线数据更新业绩报表 会员报表
//     *
//     * @param records
//     * @return
//     */
//    Integer batchInsertNetAmountDayRecords(List<NetAmountDayInsertDTO> records) throws Exception;
}
