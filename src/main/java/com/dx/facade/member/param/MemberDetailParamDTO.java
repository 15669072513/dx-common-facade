package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.List;
import lombok.Data;

@Data
public class MemberDetailParamDTO {

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("账号")
    private String userName;

    @ApiModelProperty("手机号")
    private String phoneNo;
    @ApiModelProperty(value = "邮箱")
    private String email;
    @ApiModelProperty(value = "姓名")
    private String  realName;
}
