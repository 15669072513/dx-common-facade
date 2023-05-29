package com.dx.facade.auth.rpc;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dx.entity.CommonResp;
import com.dx.facade.auth.param.LoginRecordReq;
import com.dx.facade.auth.param.LoginRecordResp;

/**
 * 登录日志服务类
 *
 * @author sign
 */
public interface LoginRecordService {


    /**
     * 分页查询登录日志
     * @param authVO
     * @return
     */
    CommonResp<Page<LoginRecordResp>> queryLoginLogPage(LoginRecordReq authVO);


}
