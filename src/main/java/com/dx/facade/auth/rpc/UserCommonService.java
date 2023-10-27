package com.dx.facade.auth.rpc;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.auth.domain.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 提供用户权限公共接口
 *
 * @author deft
 */
public interface UserCommonService {

    /**
     * 保存用户信息及对应角色
     *
     * @param userReq
     * @return CommonResp
     */
    CommonResp<Long> saveUserInfo(UserReqDTO userReq);

    /**
     * 查询用户相关信息
     *
     * @param userReq
     * @return UserRespDTO
     */
    CommonResp<List<UserRespDTO>> getUserInfo(UserReqDTO userReq);

    /**
     * 根据角色id查询拥有的用户列表
     *
     * @param roleReq
     * @return
     */
    CommonResp<List<UserRespDTO>> getRoleUsers(RoleReqDTO roleReq);

    CommonResp<UserRespDTO> getUser(UserReqDTO userReq);

    /**
     * 根据用户id查询用户相关信息
     *
     * @param id
     * @return UserRespDTO
     */
    CommonResp<UserRespDTO> getUserInfoById(Long id);

    /**
     * 查询和编辑用户详细信息(主要是用户的角色权限的查看和修改)
     *
     * @param userReq
     * @return RolePermissionRespDTO
     */
    CommonResp<UserRoleRespDTO> getUserDetailInfo(UserReqDTO userReq);

    /**
     * 查询和编辑用户详细信息(主要是用户的角色权限的查看和修改)
     *
     * @param userReq
     * @return RolePermissionRespDTO
     */
    CommonResp<UserRoleRespDTO> getB2BUserDetailInfo(UserReqDTO userReq);

    /**
     * 保存用户修改后的角色信息
     *
     * @param userReq
     * @return CommonResp
     */
    CommonResp updateUserInfo(UserReqDTO userReq);

    /**
     * 修改用户的状态
     *
     * @param userReq
     * @return CommonResp
     */
    CommonResp updateUserStatus(List<UserReqDTO> userReq);

    /*    *//**
     * 修改用户的状态 通过用户ID
     * @param userStatusDTO
     * @return CommonResp
     *//*
    public CommonResp updateUserById(UserStatusDTO userStatusDTO);*/

    /**
     * 保存角色信息以及对应的权限
     *
     * @param roleReq
     * @return CommonResp
     */
    CommonResp<Long> saveRoleInfo(RoleReqDTO roleReq);

    /**
     * 查询角色相关信息
     *
     * @param roleReq
     * @return UserRespDTO
     */
    CommonResp<List<RoleRespDTO>> getRoleInfo(RoleReqDTO roleReq);
    

    /**
     * 回收权限（B2B专用）
     *
     * @return CommonResp
     */
    CommonResp deletePermissionAgent(PermissionAgentReqDTO permissionAgentReqDTO) throws Exception;

    /**
     * 修改角色的状态
     *
     * @param roleReq
     * @return CommonResp
     */
    CommonResp updateRoleStatus(List<RoleReqDTO> roleReq);

    /**
     * 查询和编辑角色详细信息(主要是角色与权限的查看和修改)
     *
     * @param roleReq
     * @return RolePermissionRespDTO
     */
    CommonResp<RolePermissionRespDTO> getRoleDetailInfo(RoleReqDTO roleReq);

    /**
     * 保存角色修改后的权限信息
     *
     * @param roleReq
     * @return CommonResp
     */
    CommonResp updateRoleInfo(RoleReqDTO roleReq);

    /**
     * 修改用户密码
     *
     * @param userReqDTO
     * @return CommonResp
     */
    CommonResp updatePwd(B2bUserReqDTO userReqDTO);

    /**
     * 管理员用户修改其他用户的密码
     * @param userReqDTO
     * @return
     */
    CommonResp updatePwdForAdmin(B2bUserReqDTO userReqDTO);

    /**
     * 获取系统权限列表
     *
     * @param permissionDTO
     * @return CommonResp
     */
    CommonResp<List<PermissionDTO>> getPermission(PermissionDTO permissionDTO);

    /**
     * 根据总控管理员获取商户权限信息
     * @param permissionDTO
     * @return
     */
    CommonResp<List<PermissionDTO>> getMerchantPermission(PermissionDTO permissionDTO);

    /**
     * 获取用户权限列表
     *
     * @param userReqDTO
     * @return CommonResp
     */
    CommonResp<List<PermissionDTO>> getUserPermission(UserReqDTO userReqDTO);

    /**
     * 获取用户商户权限列表
     *
     * @param userReqDTO
     * @return CommonResp
     */
    CommonResp<List<PermissionDTO>> getUserMerchantPermission(UserReqDTO userReqDTO);

    /**
     * @param userReqDTO
     * @return
     */
    CommonResp<List<String>> getUserRoleNames(UserReqDTO userReqDTO);

    /**
     * 删除角色
     *
     * @param roleReq
     * @return
     */
    CommonResp<String> deleteRole(RoleReqDTO roleReq);

    /**
     * 检查密码是否正确
     */
    CommonResp<Boolean> checkPwd(UserReqDTO userReq);

    /**
     * 查询
     *
     * @param userReq
     * @return
     */
    CommonResp<List<RoleRespDTO>> getB2BUserRoleList(UserReqDTO userReq);

    /**
     *
     * 登录日志查询
     *
     * @param loginLogReqDTO
     * @return
     */
    CommonResp<List<LoginLogRespDTO>> getUserLoginLog(LoginLogReqDTO loginLogReqDTO);

    /**
     * 用户角色状态
     *
     * @param roleReq
     * @return
     */
    CommonResp<String> getRoleStatus(RoleReqDTO roleReq);

    CommonResp<List<String>> listB2BUsername(String agentCode);

    /**
     * 解锁用户
     *
     * @param userId 用户id
     * @param type   后台系统类型
     * @return
     */
    CommonResp<Boolean> unLockUser(Long userId, String type);

    /**
     * 根据权限ID查询有该权限的索引用户id
     * @param permissionId
     * @param merchantCode
     * @return
     */
    CommonResp<List<Long>> getUsersByPermissionId(String merchantCode, Long permissionId);

    /**
     * 管理员用户修改自己的密码
     * @param userPwdDTO
     * @return
     */
    CommonResp updatePwdAdmin(UserPwdDTO userPwdDTO);

    /**
     * 根据用户id查询用户相关信息
     *
     * @param id
     * @return UserRespDTO
     */
    CommonResp<UserRespDTO> getUserInfoRoleById(Long id);

    /**
     * 修改单个用户的状态
     *
     * @param userReq
     * @return CommonResp
     */
    CommonResp updateStatus(UserReqDTO userReq);

    /**
     * 删除角色
     *
     * @param id
     * @return
     */
    CommonResp<String> deleteUser(Long id);

    CommonResp<LocalDateTime> getUserLoginLogRpc(LoginLogReqDTO loginLogReqDTO);

    /**
     * 检查是否存在商户管理员
     * @param merchantId
     * @return
     */
    Boolean hasMerchantAdmin(Long merchantId);
    
    /**
     * 更新谷歌验证码的密钥
     *
     * @return
     */
    CommonResp<Boolean> updateGoogleAuthCode(UserReqDTO userReq);
}
