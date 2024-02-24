package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.param.HelpCreditRepayRecordBatchParam;
import com.dx.facade.account.param.HelpCreditRepayRecordParam;
import com.dx.facade.account.req.HelpCreditRepayRecordDTO;
import com.dx.facade.account.req.HelpCreditRepayRecordReq;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface HelpCreditRepayRecordService {

    /**
     * @author Dealer
     * @description: 插入帮款款记录
     * @date 2023/11/27
     * @copyright
     */
    CommonResp<Long> saveRecord(HelpCreditRepayRecordDTO repayRecordDTO);

    /**
     * 帮还款列表查询
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<HelpCreditRepayRecordDTO, String>> pageList(PageReq<HelpCreditRepayRecordReq> pageReq);

    /**
     * @author Dealer
     * @description: 帮信用还款
     * @date 2023/11/27
     * @copyright
     */
    CommonResp<Long> creditRepay(HelpCreditRepayRecordParam param, Boolean insertRecord);

    /**
     * @author Dealer
     * @description: 单笔帮还
     * @date 2024/2/1
     * @copyright
     */
    CommonResp<Long> beginCreditRepay(String logPrefix, HelpCreditRepayRecordParam param, Boolean insertRecord);

    /**
     * @author Dealer
     * @description: 批量帮还
     * @date 2024/1/31
     * @copyright
     */

    CommonResp<List<Long>> creditRepayBatch(HelpCreditRepayRecordBatchParam param, Boolean insertRecord);
}
