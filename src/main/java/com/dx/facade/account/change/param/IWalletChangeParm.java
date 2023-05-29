package com.dx.facade.account.change.param;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.dx.facade.account.change.IWalletChange;
import com.dx.facade.account.service.BaseParmDTO;

/**
 * 账变基础接口
 */
public interface IWalletChangeParm extends BaseParmDTO {

    /**
     * -1：无需记录流水，0：给流水打取款标记，以后重新计算，1：要求流水累计增加，2：要求流水累计减少，3：已完成流水累计增加，4：已完成流水累计减少
     * @return
     */
    default Integer fundBillShow(){
        return -1;
    }

    /**
     * true：需要累计并插入一条资金使用率，false：不需要累计并不需要插入一条资金使用率
     * @return
     */
    default Boolean isNeedCalBill(){
        if(fundBillShow() <= 0 ){
            return false;
        }
        return true;
    }

    String getEventId();

    LocalDateTime getEventTime();

    BigDecimal getAmount();

    String getRemark();

    IWalletChange getWalletChange();

    Long getId();
}
