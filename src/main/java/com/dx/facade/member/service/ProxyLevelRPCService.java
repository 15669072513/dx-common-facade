package com.dx.facade.member.service;

import java.util.List;

import com.dx.facade.member.param.UpdateProxyLevelReq;
import com.dx.facade.member.resp.ProxyLevelResp;

public interface ProxyLevelRPCService {

    List<ProxyLevelResp> getAllProxyLevel();

    void updateProxyLevel(UpdateProxyLevelReq updateProxyLevelReq);
}
