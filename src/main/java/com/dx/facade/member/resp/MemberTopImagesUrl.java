package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberTopImagesUrl {

//    @ApiModelProperty(value = "表名后缀", hidden = true)
//    private Long suffix;

    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;
    

    @ApiModelProperty(value = "会员头像URL")
    private String topImagesUrl;


    private static final long serialVersionUID = 1L;
}