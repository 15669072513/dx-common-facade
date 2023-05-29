package com.dx.facade.report.service;


import com.dx.entity.CommonResp;
import com.dx.facade.report.param.member.DwdWalletReqDTO;
import com.dx.facade.report.resp.member.DwdWalletRespDTO;

public interface DwdWalletRPCService {

    CommonResp<DwdWalletRespDTO> getUserWallet(DwdWalletReqDTO respDTO);

}
