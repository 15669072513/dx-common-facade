package com.dx.facade.member.service;

import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.member.param.AddUserRemarkParamDTO;
import com.dx.facade.member.param.UserRemarkListParamDTO;
import com.dx.facade.member.resp.UserRemarkRespDTO;

public interface UserRemarkRPCService {

    /**
     * 用户备注列表分页查询
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<UserRemarkRespDTO, ?>> listPage(PageReq<UserRemarkListParamDTO> pageReq);

    /**
     * 添加用户备注
     * @param paramDTO
     * @return
     */
    CommonResp addUserRemark(AddUserRemarkParamDTO paramDTO);
    
    /**
     * 根据userId和操作人查询用户最新的备注
     * 
     * @param pageReq
     * @return
     */
    CommonResp<UserRemarkRespDTO> queryUserLastRemark(UserRemarkListParamDTO paramDTO);
}
