package com.dx.facade.account.req;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author orbit
 * @datetime 2024-01-07 23:01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountOptLogSaveReqDTO implements Serializable {
    /**
     * 栏目code，参见SectionEnum
     */
    private Integer sectionCode;

    /**
     * 页面code，参见PageEnum
     */
    private Integer pageCode;

    /**
     * 操作类型，参见OptTypeEnum
     */
    private Integer optType;

    /**
     * 所属功能
     */
    private String optFuncDesc;

    /**
     * 所属对象
     */
    private String optObj;

    /**
     * 操作用户
     */
    private String optUsername;

    /**
     * 操作用户类型
     */
    private Integer optUserType;

    /**
     * 所属商户名称
     */
    private String merchantName;

    /**
     * 所属商户ID
     */
    private Long merchantId;

    /**
     * 操作IP
     */
    private String optIp;

    /**
     * 操作前
     */
    private String optBefore;

    /**
     * 操作后
     */
    private String optAfter;

    /**
     * 备注
     */
    private String remark;
}
