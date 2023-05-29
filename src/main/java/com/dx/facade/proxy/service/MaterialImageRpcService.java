package com.dx.facade.proxy.service;


import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.proxy.req.SelectProxyMaterialImageReqDTO;
import com.dx.facade.proxy.resp.MaterialImageRecordRespDTO;
import com.dx.facade.proxy.resp.SelectProxyMaterialImageRespDTO;

import java.util.List;

/**
 @title 相关相关接口
 @desc 代理推广素材(图片)
 @path
 @author kygo
 @version 1.0.0
 @since
 */
public interface MaterialImageRpcService {
    CommonResp<List<MaterialImageRecordRespDTO>> getByMerchantId(Long merchantId);

    CommonResp<PageResp<SelectProxyMaterialImageRespDTO, ?>> selectMaterialImage(SelectProxyMaterialImageReqDTO var1);


}
