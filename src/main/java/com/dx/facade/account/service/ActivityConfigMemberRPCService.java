package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.*;
import com.dx.facade.account.resp.ActivityConfigMemberRespDTO;

import java.util.List;

/**
 * 活动指定会员RPC
 * 好友邀请-规则配置-排除名单
 * @author agan
 */
public interface ActivityConfigMemberRPCService {

    Boolean checkActivityConfigMember(CheckActivityConfigMemberParmDTO parmDTO) throws BizException;

    Boolean checkActivityConfigProxy(CheckActivityConfigProxyParmDTO parmDTO) throws BizException;

    /**
     * 活动指定排除RPC
     * @param parmDTO
     * @return
     * @throws BizException
     */
    Boolean checkActivityConfigExcludeMember(CheckActivityConfigMemberParmDTO parmDTO) throws BizException;

    /**
     * 排除名单添加
     * @param param
     * @return
     * @throws BizException
     */
    CommonResp<Boolean> addActivityConfigMember(AddActivityConfigMemberParam param) throws BizException;

    /**
     * 排除名单删除
     * @param id 数据表的id
     * @return
     * @throws BizException
     */
    CommonResp<Boolean> delActivityConfigMember(Long id) throws BizException;

    /**
     * 排除名单分页查询
     * @param param
     * @return
     */
    CommonResp<PageResp<ActivityConfigMemberRespDTO,?>> queryActivityConfigMemberPage(PageReq<ActivityConfigMemberPageReqDto> param) throws BizException;

    /**
     * 查询记录
     * @return
     * @throws BizException
     */
    List<ActivityConfigMemberRespDTO> queryActivityConfigMemberList(ActivityConfigMemberQueryParam param) throws BizException;
}
