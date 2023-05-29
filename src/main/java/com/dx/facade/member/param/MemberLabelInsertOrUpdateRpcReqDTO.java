package com.dx.facade.member.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
* 会员标签表
*
* @author fitz
* @version 1.0.0
* @date 2021/06/02
*/
@ApiModel(value="com-ob-member-dto-MemberLabelInsertOrUpdateRpcReqDTO", description = "会员标签新增(编辑)请求参数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberLabelInsertOrUpdateRpcReqDTO implements Serializable {


    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("商户名称")
    private String merchantName;

    @ApiModelProperty("账号类型 （0-会员标签 1-代理标签）")
    private Integer labelType;

    @ApiModelProperty("标签名称")
    private String labelName;

    @ApiModelProperty("标签描述")
    private String labelDesc;

    @ApiModelProperty("打上这个标签的人数")
    private Integer labelUsedNum;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("最后操作人")
    private String updatedBy;

    @ApiModelProperty("最后操作时间")
    private LocalDateTime updatedAt;
}