package com.dx.facade.member.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 美播会员头像返回参数封装
 * @author einson
 */
@Data
@ApiModel(value = "美播会员头像地址返回对象", description = "美播会员头像地址返回对象")
public class MBUserTopImageDTO {
    
    @ApiModelProperty(value = "会员头像id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id ;
    
    @ApiModelProperty(value = "会员头像地址")
    private String topImageUrl ;

}
