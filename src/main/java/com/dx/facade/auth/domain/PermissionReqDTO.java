package com.dx.facade.auth.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 *
 * 查询权限的请求
 *
 * @author author
 * @date 2020/9/8 21:24
 * @version 0.1
 */
@Data
public class PermissionReqDTO {

    /**
     * (类型:0B2B后台,1游戏后台,2信用贷后台)
     */
    private Integer userType;

    /**
     * (主键)
     */
    private Long id;

    /**
     * (权限名称)
     */
    private String permissionName;

    /**
     * (类型 0菜单 1按钮 2其他)
     */
    private String type;

    /**
     * (开始时间）
     */
    private LocalDateTime startDate;

    /**
     * （结束时间）
     */
    private LocalDateTime endDate;

    /**
     * 是否分页
     */
    private boolean isPage;

    /**
     * 分页信息
     */
    private PageDTO pageDto;

    /**
     * 菜单类型：0：自用，1：下发商户
     */
    private Integer menuType;

}
