package com.dx.facade.member.service;

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
}
