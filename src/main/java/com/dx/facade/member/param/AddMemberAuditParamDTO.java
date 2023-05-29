package com.dx.facade.member.param;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.member.exception.ErrorCode;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

@Data
public class AddMemberAuditParamDTO implements BaseParmDTO{

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("账号类型（1-正式，2-商务，3-置换）")
    private Integer accountType;

    @ApiModelProperty("会员账号")
    private String userName;

    @ApiModelProperty("盐")
    private String salt;

    @ApiModelProperty("会员密码")
    private String password;

    @ApiModelProperty("会员手机号码")
    @TableField("mobile")
    private String mobile;

    @ApiModelProperty("性别 0-女，1-男")
    @TableField("gender")
    private Integer gender;

    @ApiModelProperty("邮箱")
    @TableField("email")
    private String email;

    @ApiModelProperty("会员真实姓名")
    private String realName;

    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理名称")
    private String parentProxyName;

    @ApiModelProperty("vip等级id")
    private Long vipId;

    @ApiModelProperty("vip等级")
    private Integer vipLevel;

    @ApiModelProperty("单号")
    private String eventId;

    @ApiModelProperty("申请备注")
    private String applyRemark;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(accountType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("accountType"));
        Assert.notNull(userName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userName"));
        Assert.notNull(password, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("password"));
        Assert.notNull(gender, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("gender"));
        Assert.notNull(parentProxyId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("parentProxyId"));
        Assert.notNull(parentProxyName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("parentProxyName"));
        Assert.notNull(vipId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("vipId"));
        Assert.notNull(vipLevel, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("vipLevel"));
        Assert.notNull(eventId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventId"));

    }
}
