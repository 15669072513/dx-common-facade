package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.facade.report.resp.proxy.ProxyTeamInfoRespDTO;

/**
 @title 代理->代理详情
 @desc
 @path OB旗舰中控后台->代理->代理详情
 @author gollum
 @version 1.0.0
 @since 2021年09月28日 00:36:58
*/
public interface ProxyDetailsRPCService {

    /**
     * @title 获取代理团队信息接口
     * @desc 正常应该是3个接口分开显示，但由于时间原因先合并为一个~
     * @author gollum
     * @version 1.0.0
     * @since 2021年09月28日 00:40:18
     * @param proxyId
     * return com.dx.entity.CommonResp<com.dx.facade.member.report.resp.ProxyTeamInfoRespDTO>
     */
    CommonResp<ProxyTeamInfoRespDTO> getTeamsInfo(Long proxyId);
}
