package com.dx.facade.auth.domain;

import lombok.Data;

/**
 * 配置rpc入参
 */
@Data
public class KvConfigReqDTO {

    /**
     * (主键)
     */
    private Long id;

    /**
     * 配置key
     */
    private String k;

    /**
     * 配置的value
     */
    private String v;

    /**
     * 配置value类型
     */
    private String valueType;

    /**
     * modile
     */
    private String module;

}
