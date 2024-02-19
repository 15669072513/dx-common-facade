package com.dx.facade.member.param;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberParamDTO implements BaseParmDTO{

    @ApiModelProperty(value="会员ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value="商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
    @ApiModelProperty(value="代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyId;

    @ApiModelProperty(value="用户模式 1-现金模式，2-信用模式")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer businessModel;
    @ApiModelProperty(value="用户名")
    private String userName;
    
    @ApiModelProperty(value="昵称")
    private String nickName;
    
    @ApiModelProperty(value="头像url")
    private String topImagesUrl;

    @ApiModelProperty(value="手机号码")
    private String mobile;

    @ApiModelProperty(value="邮箱")
    private String email;

    @ApiModelProperty(value="邀请码")
    private String invitationCode;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
    }

    public void checkUserName() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userName"));
    }
    
    public void checkNickName() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
        Assert.notNull(nickName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("nickName"));
    }

    public void checkMobile() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(mobile, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("mobile"));
    }

    public void checkEmail() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(email, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("email"));
    }
    
    public void checkTopImagesUrl() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
        Assert.notNull(topImagesUrl, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("topImagesUrl"));
    }
}
