package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author nichols
 */
@Data
public class LoginLogCountRespDTO {
    
    @ApiModelProperty(value = "登录成功次数")
    private Long successCount = 0L;
    
    @ApiModelProperty(value = "登录失败次数")
    private Long failCount = 0L;
    
    @ApiModelProperty(value = "总次数")
    private Long count = 0L;
}
