package com.dx.facade.account.change.param;

import java.math.BigDecimal;

import com.dx.facade.account.service.BaseParmDTO;

/**
 * 账变基础接口
 */
public interface IBillParm extends BaseParmDTO {

    BigDecimal getValidMultiple();

    BigDecimal getValidAmount();
}
