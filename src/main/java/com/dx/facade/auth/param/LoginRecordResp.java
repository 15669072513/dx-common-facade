package com.dx.facade.auth.param;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author sign
 */
@Data
public class LoginRecordResp {

    private long id;

    private Long userId;

    private String userName;

    private Integer type;

    private String ip;

    private Integer device;

    private String deviceId;

    private String browser_info;

    private LocalDateTime createdAt;

    /**
     * 商户唯一标识
     */
    private Long merchantId;

    private String merchantCode;

    private String loginRegion;

    private Integer loginStatus;

    /**
     * 主机名称
     */
    private String hostName;
    /**
     * MAC地址
     */
    private String macAddress;
    /**
     * 主板号
     */
    private String baseBoardId;

}
