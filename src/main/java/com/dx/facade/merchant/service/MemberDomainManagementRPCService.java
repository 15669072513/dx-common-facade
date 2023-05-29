package com.dx.facade.merchant.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.merchant.req.MemberDomainLinkParam;

public interface MemberDomainManagementRPCService {

    /**
     * 获取 活动分享 客户端链接展示
     *
     * 若该域名绑定代理，则由 长链接 + 代理的合营码 生成二维码
     * 若该域名未绑定代理，则由 长链接  生成二维码
     * 随机一条启动中且域名类型为活动分享的长链接 / code=合营码
     * @param param 入参
     * @return 活动分享链接
     * @throws BizException 业务异常
     */
    CommonResp<String> getActivitySharingLink(MemberDomainLinkParam param) throws BizException;

}
