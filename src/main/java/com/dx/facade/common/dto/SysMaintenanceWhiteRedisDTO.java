package com.dx.facade.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysMaintenanceWhiteRedisDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商户id
     */
    private Long merchantId;
    /**
     * 商户名称
     */
    private String merchantName;
    /**
     * 总代用户id
     */
    private Long topProxyId;
    /**
     * 总代用户名
     */
    private String topProxyName;

    /**
     * 用户类型 0会员/1代理
     */
    private Integer userType;

    /**
     * 白名单用户ID
     */
    private Long whiteUserId;

    /**
     * 白名单用户名
     */
    private String whiteUserName;


}
