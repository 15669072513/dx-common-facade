package com.dx.facade.report.param.base;

import java.util.Objects;

/**
 * 多商户方案接口，方便设值
 */
public interface MultiplyMerchantAble {
    void setDataAreaType(int dataAreaType);
    int getDataAreaType();

    void setMerchantId(Long merchantId);
    Long getMerchantId();

    default Long getMerchantIdPath() {
        if (Objects.equals(1, getDataAreaType())) {
            return getMerchantId();
        }
        return null;
    }

    default Long getOwnerMerchantId() {
        if (Objects.equals(0, getDataAreaType())) {
            return getMerchantId();
        }
        return null;
    }
}
