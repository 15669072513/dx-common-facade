package com.dx.facade.auth.param;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author sign
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LoginRecordReq extends BasePage {

    private Long userId;

    private String userName;

    private Integer type;

    private String ip;

    private Integer device;

    /**
     * 商户唯一标识
     */
    private Long merchantId;

    /**
     * 商户id列表，查询用
     */
    private List<Long> merchantIdList;

    private String merchantCode;
}
