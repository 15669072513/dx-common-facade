package com.dx.facade.auth.domain;

import java.time.LocalDateTime;

/**
 * 用户公共RPC接口入参
 *
 * @author deft
 */
public class LoginLogRespDTO {

    /**
     * (主键id)
     */
    private Long id;

    /**
     * (用户id)
     */
    private Long userId;

    /**
     * (用户名)
     */
    private String userName;

    /**
     * (类型0,B2B;1,游戏后台)
     */
    private String type;

    /**
     * (ip地址)
     */
    private String ip;

    /**
     * (设备信息)
     */
    private String device;

    /**
     * (设备id)
     */
    private String deviceId;

    /**
     * (浏览器信息)
     */
    private String browserInfo;

    /**
     * (创建时间)
     */
    private LocalDateTime createdAt;

    /**
     * 分页信息
     */
    private PageDTO pageDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getBrowserInfo() {
        return browserInfo;
    }

    public void setBrowserInfo(String browserInfo) {
        this.browserInfo = browserInfo;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PageDTO getPageDto() {
        return pageDto;
    }

    public void setPageDto(PageDTO pageDto) {
        this.pageDto = pageDto;
    }

}
