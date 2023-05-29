package com.dx.facade.auth.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户公共RPC接口出参
 *
 * @author deft
 */
@Data
public class UserRespDTO {

    /**
     * 用户id
     */
    private Long id;

    private Long merchantId;

    /**
     * (商户唯一标识)
     */
    private String agentCode;

    /**
     * (登录账号)
     */
    private String userName;

    /**
     * (角色名)
     */
    private String roleName;

    /**
     * (用户名)
     */
    private String nickName;

    /**
     * 状态
     */
    private String status;

    /**
     * 描述
     */
    private String remark;

    /**
     * 创建时间
     */
    private LocalDateTime createAt;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * (google验证码)
     */
    private String googleAuthCode;

    /**
     * 海月盾 秘钥
     */
    private String haiyueAuthCode;

    /**
     * 敏感等级唯一标识，为方便日后扩展，使用等级标记，暂时只分为1级敏感信息
     * 0：无权限，1：查看1级敏感信息权限
     */
    private Integer sensitiveLevelId;

    /**
     * 分页信息
     */
    private PageDTO pageDto;

    /**
     * 1-谷歌验证码 2-图形验证码
     */
    private Integer verifyCodeType;

    /**
     * 锁定状态，0未锁定，1锁定
     */
    private Integer lockStatus;

    /**
     * 手机号码
     */
    private String phone;

    private Integer userType;

    private Integer active;
}
