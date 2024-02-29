package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.TransferToGameParamDTO;

import com.dx.facade.account.req.WalletBalanceDTO;
import com.dx.facade.account.resp.GameOrderInfoRespDTO;
import com.dx.facade.account.resp.WalletRespDTO;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 场馆上下分业务功能
 */
public interface GameTransferRPCService {

    @ApiModelProperty(value = "转入场馆")
    CommonResp transferToGame(TransferToGameParamDTO paramDTO) throws BizException;

    /**
     * 上分 现金钱包转入到德州
     * @param dto
     * @return
     * @throws BizException
     */
    CommonResp<WalletRespDTO> transferInTexas(WalletBalanceDTO dto) throws BizException;


    /**
     * 下分 德州转出到现金钱包
     * @param walletBalanceDTO
     * @return
     * @throws BizException
     */
    CommonResp<Void> texasTransferOutSync(WalletBalanceDTO walletBalanceDTO) throws BizException;


    /**
     * 下分 德州转出到现金钱包 批量下分接口
     * @param list
     * @return
     * @throws BizException
     */
    CommonResp<Void> texasTransferOut(List<WalletBalanceDTO> list) throws BizException;


    /**
     * 检查上下分是否成功
     * @param serialNo: 上下分流水号
     * @return
     * @throws BizException
     */
    CommonResp<Boolean> upScoreReqSucceed(String serialNo) throws BizException;

    /**
     * 跟进订单号查询订单信息 单一钱包场馆调用
     * @param serialNo
     * @return
     * @throws BizException
     */
    CommonResp<GameOrderInfoRespDTO> getOrderIdInfo(String serialNo) throws BizException;

}
