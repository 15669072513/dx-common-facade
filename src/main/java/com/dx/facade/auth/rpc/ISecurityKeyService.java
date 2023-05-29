package com.dx.facade.auth.rpc;

import com.dx.exception.BizException;
import com.dx.facade.auth.domain.SecurityKeyDTO;

/**
 * 密钥表 服务类
 *
 * @author string
 * @since 2021-11-08
 */
public interface ISecurityKeyService {

    /**
     * 生成 密钥
     * @param application 应用
     * @param version 版本号
     * @throws BizException
     */
    void generatorSecurityKey(Integer application, Integer version) throws BizException;

    /**
     * 失效 密钥
     * @param application 应用
     * @param version 版本号
     */
    void invalidSecurityKey(Integer application, Integer version);

    /**
     * 启用 密钥
     * @param application 应用
     * @param version 版本号
     */
    void enableSecurityKey(Integer application, Integer version);

    /**
     * 获取密钥
     * @param application 应用
     * @param version 版本号
     * @return
     */
    SecurityKeyDTO getSecurityKey(Integer application, Integer version);

}
