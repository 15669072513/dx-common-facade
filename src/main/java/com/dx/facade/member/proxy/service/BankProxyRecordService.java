package com.dx.facade.member.proxy.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.proxy.req.SelectBankProxyRecordReqDTO;
import com.dx.facade.member.proxy.req.SelectVirtualProxyRecordReqDTO;
import com.dx.facade.member.proxy.resp.SelectBankProxyRecordRespDTO;
import com.dx.facade.member.proxy.resp.SelectVirtualProxyRecordRespDTO;

import java.text.ParseException;

/**
 * <p>
 * 代理用卡记录表 服务类
 * </p>
 *
 * @author  agan
 * @since 2021-05-14
 */
public interface BankProxyRecordService {

    /**
     * 代理银行卡记录
     * @param dto
     * @return
     */
    CommonResp<PageResp<SelectBankProxyRecordRespDTO,?>> selectBankProxyRecord(SelectBankProxyRecordReqDTO dto) throws BizException, ParseException;

    /**
     * 代理虚拟币
     * @param dto
     * @return
     */
    CommonResp<PageResp<SelectVirtualProxyRecordRespDTO,?>> selectVirtualProxyRecord(SelectVirtualProxyRecordReqDTO dto) throws BizException,ParseException;

    /**
     * 统计代理 银行卡数量
     * @param dto
     * @return
     */
    Integer getProxyBankCount(SelectBankProxyRecordReqDTO dto);

    /**
     * 统计代理 虚拟币数量
     * @param dto
     * @return
     */
    Integer getProxyVirtualCount(SelectVirtualProxyRecordReqDTO dto);
}
