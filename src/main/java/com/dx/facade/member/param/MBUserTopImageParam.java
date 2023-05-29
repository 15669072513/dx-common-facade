package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 包网会员上传头像参数封装
 * @author einson
 */
@Data
@ApiModel(value = "包网会员头像参数", description = "包网会员头像参数")
public class MBUserTopImageParam {
    
    @ApiModelProperty(value = "会员id", hidden = true)
    private Long userId;
    
    @ApiModelProperty(value = "商户Id", hidden = true)
    private Long merchantId;
    
    @ApiModelProperty(value = "会员头像id", required = true)
    private Long id ;

}
