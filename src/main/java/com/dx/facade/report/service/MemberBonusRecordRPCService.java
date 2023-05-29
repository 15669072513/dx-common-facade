package com.dx.facade.report.service;

import com.dx.exception.BizException;
import com.dx.facade.enums.ProvideBonusTypeEnum;

public interface MemberBonusRecordRPCService {
    void setRecordStatusToTimeout(ProvideBonusTypeEnum var1, String var2) throws BizException;
}
