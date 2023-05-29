package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.facade.report.resp.proxy.ProxyTeamInfoRespDTO;

public interface ProxyTeamService {

    /**
     * 通过代理id 获取代理团队信息
     * @param proxyId
     * @return
     */
    CommonResp<ProxyTeamInfoRespDTO> getTeamsInfo(Long proxyId);

}
