package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.MemberLoginLogParam;
import com.dx.facade.member.param.UserLastLoginLogParamDTO;
import com.dx.facade.member.resp.LoginLogCountRespDTO;
import com.dx.facade.member.resp.MemberAndProxyLoginLogResp;

/**
 * @Author: AC
 * @Description: TODO
 * @Date: 2022/10/03 17:09
 */
public interface MemberLoginLogRPCService {

    /**
     * 会员登录日志查询
     *
     * @param queryPageParam 登录日志分页查询参数
     * @return 会员（代理）登录记录
     */
    CommonResp<PageResp<MemberAndProxyLoginLogResp, LoginLogCountRespDTO>> memberAndProxyLoginLog(MemberLoginLogParam queryPageParam) throws BizException;

    /**
     * 获取会员/代理最后一次登录日志
     * @param paramDTO
     * @return
     */
    MemberAndProxyLoginLogResp getUserLastLoginLog(UserLastLoginLogParamDTO paramDTO);
}
