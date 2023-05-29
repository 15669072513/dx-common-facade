package com.dx.facade.auth.domain;

import lombok.Data;

/**
 *
 * 用于权限字典管理，不要对外权限混用
 * 
 *
 * @author author
 * @date 2020/9/8 19:52
 * @version 1.0
 */
@Data
public class PermissionDictDTO {


    /**
     * (主键)
     */
    private Long id;

    /**
     * (主键)
     */
    private Long parentId;

    /**
     * (权限名称)
     */
    private String permissionName;

    /**
     * (路径)
     */
    private String path;

    /**
     * (id路径)
     */
    private String idPath;

    /**
     * (路由组件)
     */
    private String component;

    /**
     * (权限标识)
     */
    private String perms;

    /**
     * (图标)
     */
    private String icon;

    /**
     * (类型 0菜单 1按钮 2其他)
     */
    private String type;

    /**
     * (类型:0B2B后台,1游戏后台,2信用贷后台)
     */
    private String userType;

    /**
     * (排序)
     */
    private Integer orderNum;

    /**
     * 备注
     */
    private String remark;

    /**
     * 英文菜单名
     */
    private String remarkEnglish;

    /**
     * 是否可见：0：隐藏，1：可见
     */
    private Integer visible;

    /**
     * 是否缓存：0：不缓存，1：缓存
     */
    private Integer isCache;

    /**
     * 菜单类型：0：自用，1：下发商户
     */
    private Integer menuType;

    /**
     * 组件路由
     */
    private String componentNew;
}

