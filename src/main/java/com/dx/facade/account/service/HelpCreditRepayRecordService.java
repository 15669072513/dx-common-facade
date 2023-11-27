package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.MemberUserBankAndVirtualParam;
import com.dx.facade.account.param.UpdateBankCardParmDTO;
import com.dx.facade.account.param.UpdateWithdrawalParam;
import com.dx.facade.account.req.*;
import com.dx.facade.account.resp.BankCardRespDTO;
import com.dx.facade.account.resp.UserBankAndVirtualUpdateBindStatusReqDTO;
import com.dx.facade.member.param.UserBankCardOperationQureyParam;
import com.dx.facade.member.param.UserBankCardQureyParam;
import com.dx.facade.member.param.UserVirtualOperationQureyParam;
import com.dx.facade.member.resp.MemberBankCardOperationResp;
import com.dx.facade.member.resp.MemberVirtualOperationResp;
import com.dx.facade.member.resp.UserBankCardResp;
import com.dx.facade.payment.req.BankCardParmDTO;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author agan
 */
public interface HelpCreditRepayRecordService {

    CommonResp<Long> saveRecord(HelpCreditRepayRecordDTO repayRecordDTO);

    /**
     * 帮还款列表查询
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<HelpCreditRepayRecordDTO, String>> pageList(PageReq<HelpCreditRepayRecordReq> pageReq);
}
