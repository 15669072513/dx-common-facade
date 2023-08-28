package com.dx.facade.venue.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.venue.dto.GameHallDTO;
import com.dx.facade.venue.dto.GameVenueDTO;
import com.dx.facade.venue.dto.TransferDetailDTO;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author Rock
 * 场馆业务RPC
 **/
public interface VenueService {

    CommonResp<GameHallDTO> venueList();


    CommonResp<List<GameVenueDTO>> recommendGameList(String venueTypeCode);


    CommonResp<List<GameVenueDTO>> switchGameList();

    /**
     * 转账页详情
     * @param memberId
     * @param merchantId
     * @param venueTypeCode
     * @return
     */
    CommonResp<TransferDetailDTO> transferDetail(Long memberId, Long merchantId, String venueTypeCode);

    CommonResp autoBring(Long memberId, Integer autoBring);


    CommonResp balanceTransfer(String venueWalletType, Long memberId, Long merchantId, BigDecimal amount,
                               Integer transferType, String merchantName, Integer clientType);

}
