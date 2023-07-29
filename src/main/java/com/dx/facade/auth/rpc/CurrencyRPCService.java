package com.dx.facade.auth.rpc;

import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.facade.auth.domain.BwCurrencyDTO;

/**
 * 货币RPC接口
 *
 * @author bicycle
 */
public interface CurrencyRPCService {

    /**
     * 获取所以的货币
     *
     * @param userReq
     * @return CommonResp
     */
    CommonResp<List<BwCurrencyDTO>> getAllCurrency();

    /**
     * 根据货币编码获取货币
     *
     * @param code
     * @return CommonResp
     */
    CommonResp<BwCurrencyDTO> getCurrencyByCode(String code);
   
}
