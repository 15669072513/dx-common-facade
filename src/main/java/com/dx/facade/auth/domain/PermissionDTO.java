package com.dx.facade.auth.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PermissionDTO {

    /**
     * 权限id
     */
    private Long id;

    /**
     * (父id)
     */
    private Long parentId;

    /**
     * 权限名称
     */
    private String permissionName;

    /**
     * 权限中文名称
     */
    private String remark;



    /**
     * 英文菜单名
     */
    private String remarkEnglish;

    /**
     * (权限url)
     */
    private String path;

    /**
     * (权限url)
     */
    private String idPath;

    /**
     * (图标)
     */
    private String icon;

    /**
     * (路由组件)
     */
    private String component;

    /**
     * (类型 0菜单 1按钮 2其他)
     */
    private String type;

    /**
     * (后台系统类型)
     */
    private String userType;

    /**
     * (排序)
     */
    private String orderNum;

    /**
     * (权限是否分配角色0未分配,1已分配)
     */
    private String isExist;
	/**
	 * 前端菜单字段添加
	 */
	private String perms;
	private String sysName;
	private LocalDateTime createdAt;
	private PageDTO pageDto;
	private Integer visible;
	private Integer isCache;
	private Integer menuType;
	
}
