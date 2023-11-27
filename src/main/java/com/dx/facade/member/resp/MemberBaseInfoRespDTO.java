package com.dx.facade.member.resp;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 会员基础信息
 * 
 * @author bicycle
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberBaseInfoRespDTO extends ProxyInfoRespDTO {

    @ApiModelProperty("ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    
    @ApiModelProperty("会员账号")
    private String userName;
    
    @ApiModelProperty("昵称")
    private String nickName;

    @ApiModelProperty("头像")
    private String topImagesUrl;
}
