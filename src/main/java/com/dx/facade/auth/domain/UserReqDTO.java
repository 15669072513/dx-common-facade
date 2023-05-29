package com.dx.facade.auth.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 用户公共RPC接口入参
 *
 * @author deft
 */
@Data
public class UserReqDTO {

    /**
     * 用户id
     */
    private Long id;

    /**
     * 操作人id
     */
    private Long execId;

    /**
     * 操作人idList
     */
    private List<Long> execIdList;

    /**
     * 用户名
     */
    private String userName;

    /**
     * (昵称)
     */
    private String nickName;

    /**
     * 后台系统类型
     */
    private String type;

    /**
     * (系统角色类型)
     */
    private String systemType;

    /**
     * (商户id)
     */
    private Long merchantId;

    /**
     * (商户code)
     */
    private String agentCode;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 确认密码
     */
    private String rePwd;

    /**
     * google 验证码
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
     * 授权的角色列表
     */
    private List<Long> roleIds;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 是否分页
     */
    private boolean isPage;

    /**
     * 分页信息
     */
    private PageDTO pageDto;

    /**
     * 1-谷歌验证码 2-图形验证码
     */
    private Integer verifyCodeType;

    /**
     * 调用接口的版本号，目前和密码相关的version=2.0 表示新的处理方式，不输入或者其他值表示使用旧的密码处理方式
     */
    private String version;

    /**
     * 用户类型
     */
    private Integer userType;

    /**
     * 在职
     */
    private Integer active;

    /**
     * 商户id列表，查询用
     */
    private List<Long> merchantIdList;


    @Override
    public String toString() {
        return "UserReqDTO{" +
                "id=" + id +
                ", execId=" + execId +
                ", execIdList=" + execIdList +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", type='" + type + '\'' +
                ", agentCode='" + agentCode + '\'' +
                ", pwd='" + pwd + '\'' +
                ", rePwd='" + rePwd + '\'' +
                ", googleAuthCode='" + googleAuthCode + '\'' +
                ", haiyueAuthCode='" + haiyueAuthCode + '\'' +
                ", roleIds=" + roleIds +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status='" + status + '\'' +
                ", createBy='" + createBy + '\'' +
                ", isPage=" + isPage +
                ", pageDto=" + pageDto +
                ", verifyCodeType=" + verifyCodeType +
                '}';
    }
}
