package com.dx.facade.operate.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 @title
 @desc
 @path
 @author Gollum
 @version 1.0.0
 @since 2023-04-12 16:37:40
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="会员活动域名随机查询数据请求传输对象", description="随机查询会员活动域名入参")
public class ConfigMemberDomainGetOneReqDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "域名状态：0-已停用 1-启用中 ", position = 1)
    private Integer status;

    @ApiModelProperty(value = "操作人", position = 2)
    private String updatedBy;
}
