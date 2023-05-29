package com.dx.facade.auth.rpc;

import com.dx.entity.CommonResp;
import com.dx.facade.auth.domain.PermissionDictDTO;
import com.dx.facade.auth.domain.PermissionReqDTO;
import com.dx.facade.auth.domain.PermissionRespDTO;

import java.util.List;

/**
 * 用于权限字典表的功能
 *
 * @author author
 * @date 2020/9/8 18:38
 * @version 0.1
 */
public interface PermissionRpcService {


    /**
     * 添加一个权限
     *
     * @param permissionDTO
     * @return
     */
    CommonResp<Boolean> addPermission(PermissionDictDTO permissionDTO);


    /**
     * 修改一个权限
     *
     * @param permissionDTO
     * @return
     */
    CommonResp<Boolean> updatePermission(PermissionDictDTO permissionDTO);


    /**
     * 检查id对应的权限是否存在。
     *
     * @param id
     * @return
     */
    CommonResp<Boolean> checkExists(Long id);


    /**
     * 查询权限
     *
     * @param request
     * @return
     */
    CommonResp<List<PermissionRespDTO>> query(PermissionReqDTO request);

    /**
     * 通过Id获得一个权限对象。
     *
     * @param id
     * @return
     */
    CommonResp<PermissionRespDTO> getPermission(Long id);

    /**
     * 获得权限相关的sql语句，按照需求，创建针对permission表的insert语句
     *
     * @param permissionIds
     * @return
     */
    CommonResp<List<String>> getPermissionSql(List<Long> permissionIds);


    /**
     * 获得权限相关的sql语句，按照需求，创建针对role_permission表的insert语句
     *
     * @param permissionIds
     * @return
     */
    CommonResp<List<String>> getGrantSql(List<Long> permissionIds);

    /**
     * 删除权限
     * @param id
     * @return
     */
    public CommonResp delete(Long id);

}
