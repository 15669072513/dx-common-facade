package com.dx.facade.report.service;

import com.dx.facade.report.param.report.ProfitAndLossReq;
import com.dx.facade.report.param.report.ProfitAndLossTabReq;
import com.dx.facade.report.resp.report.DwmProfitAndLossDetailRespDTO;

import java.util.List;

public interface ProfitAndLossRPCService {
    DwmProfitAndLossDetailRespDTO getProfitAndLoss(ProfitAndLossReq var1);

    List<DwmProfitAndLossDetailRespDTO> getAllProfitAndLoss(ProfitAndLossReq var1);

    List<DwmProfitAndLossDetailRespDTO> getAllProfitAndLossTab(ProfitAndLossTabReq var1);

}
