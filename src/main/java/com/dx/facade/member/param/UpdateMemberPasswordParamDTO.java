package com.dx.facade.member.param;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;
/**
 * 更新用户登录密码请求参数DTO
 * 
 * @author bicycle
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateMemberPasswordParamDTO implements BaseParmDTO{

    @ApiModelProperty(value="会员ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value="商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
    
    @ApiModelProperty(value="原密码")
    private String originalPassword;
    
    @ApiModelProperty(value="原密码")
    private String newPassword;

    @Override
    public void check() {
    	Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
        Assert.notNull(originalPassword, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("originalPassword"));
        Assert.notNull(newPassword, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("newPassword"));
    }
}
