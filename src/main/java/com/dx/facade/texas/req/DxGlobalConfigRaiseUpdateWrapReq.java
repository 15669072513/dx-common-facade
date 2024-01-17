package com.dx.facade.texas.req;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


/**
 * 全局配置--批量加注配置req
 */
@Data
public class DxGlobalConfigRaiseUpdateWrapReq implements Serializable {
    private static final long serialVersionUID = 1L;

    List<DxGlobalConfigRaiseUpdateReq> config;

}
