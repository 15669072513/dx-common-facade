package com.dx.facade.member.service;

import com.dx.facade.member.param.LoginThirdPlatformRelReq;
import com.dx.facade.member.resp.ThridPlatformMemberVO;

public interface ThirdPlatformRelRPCService {

    ThridPlatformMemberVO loginByThirdPlatform(LoginThirdPlatformRelReq loginThirdPlatformRelReq) throws Exception;
}
