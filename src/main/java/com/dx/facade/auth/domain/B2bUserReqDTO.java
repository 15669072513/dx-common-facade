package com.dx.facade.auth.domain;

import lombok.Data;

/**
 * B2B用户信息操作入参
 *
 * @author deft
 */
@Data
public class B2bUserReqDTO {

    /**
     * 用户id
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 类型
     */
    private String type;

    /**
     * 商户唯一标识
     */
    private String agentCode;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 确认密码
     */
    private String resPwd;

    /**
     * (google验证码)
     */
    private String googleAuthCode;

    /**
     * 调用接口的版本号，目前和密码相关的version=2.0 表示新的处理方式，不输入或者其他值表示使用旧的密码处理方式
     */
    private String version;

}
