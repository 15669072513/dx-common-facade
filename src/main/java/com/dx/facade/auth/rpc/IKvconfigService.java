package com.dx.facade.auth.rpc;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.auth.entity.Kvconfig;
import com.dx.facade.auth.entity.PersonConfig;
import com.dx.facade.auth.param.KvconfigPageReq;

import java.util.List;

/**
 * <p>
 * kv配置表 服务类
 * </p>
 *
 * @author sign
 * @since 2021-06-21
 */
public interface IKvconfigService {

    /**
     * 根据id查下配置
     * @param id
     * @return
     */
    CommonResp<Kvconfig> foundById(Long id) ;

    /**
     * 查询分页列表
     * @param req
     * @return
     */
    CommonResp<Page<Kvconfig>> queryList(KvconfigPageReq req) ;

    /**
     * 修改 系统参数
     * @param kvconfig
     * @return
     * @throws BizException
     */
    CommonResp update(Kvconfig kvconfig) throws BizException ;


    /**
     * 根据key 商户获取value
     * @param k
     * @return
     */
    CommonResp<String> getValue(String k,Long merchantId);

    /**
     * 根据key获取value
     * @param k
     * @return
     */
    public CommonResp<String> getValue(String k);

    /**
     * 根据tag获取value
     * @param tag
     * @return
     */
    CommonResp<List<Kvconfig>> getValueList(String tag);

    /**
     * 根据key获取Kvconfig
     * @param k
     * @return
     */
    CommonResp<Kvconfig> getKvconfigValue(String k);
	
	/**
	 * 根据 字典code 获取value
	 * @param keys 字段code
	 * @return 字段集合
	 */
	CommonResp<List<Kvconfig>> getValueList(List<String> keys);

    /**
     * 加载模块列表
     * @return
     */
    public List<String> loadModuleList();

    /**
     * 获取支持的区号
     * @return
     */
    public List<String> getSupportPhoneCode();

    /**
     * 根据 字典code 获取value
     * @param k 字段code
     * @return 字段集合
     */
    CommonResp<List<PersonConfig>> getKValueList(String k);
}
