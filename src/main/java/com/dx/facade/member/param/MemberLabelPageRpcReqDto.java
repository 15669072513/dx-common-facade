package com.dx.facade.member.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 会员标签表
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/06/02
 */
@ApiModel(value = "com-ob-member-dto-MemberLabelPageRpcReqDto", description = "会员标签分页查询请求参数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberLabelPageRpcReqDto implements Serializable {

    @ApiModelProperty(value = "商户id", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<Long> merchantIds;
    
    @ApiModelProperty(value = "标签名称")
    private String labelName;
    
    @ApiModelProperty(value = "创建人")
    private String createdBy;
    
    @ApiModelProperty(value = "排序列(1)：1-创建时间 2-最近操作时间")
    private Integer orderKey;
    
    @ApiModelProperty(value = "排序方式(1)：desc-降序 asc-升序")
    private String orderType;

    @ApiModelProperty("账号类型 （0-会员标签 1-代理标签）")
    private Integer labelType;
 
}