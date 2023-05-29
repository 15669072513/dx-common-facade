package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.base.MultiplyMerchantLocalDateReq;
import com.dx.facade.report.resp.discount.DiscountReportDetailDTO;
import com.dx.facade.report.resp.discount.DiscountReportListDTO;
import com.dx.facade.report.resp.discount.DiscountReportSummaryDTO;

import java.util.List;


public interface DiscountReportRPCService {


    /**
     * 优惠活动报表列表接口
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<DiscountReportListDTO, ?>> listPage(PageReq<MultiplyMerchantLocalDateReq> reqDTO) throws BizException;

    /**
     * 优惠活动报表-合计接口
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<DiscountReportSummaryDTO> summary(MultiplyMerchantLocalDateReq reqDTO) throws BizException;

    /**
     * 优惠活动报表--单优惠的详情数据
     * @param reqDTO
     * @param discountId
     * @return
     * @throws BizException
     */
    CommonResp<List<DiscountReportDetailDTO>> detailList(MultiplyMerchantLocalDateReq reqDTO, Long discountId) throws BizException;

}
