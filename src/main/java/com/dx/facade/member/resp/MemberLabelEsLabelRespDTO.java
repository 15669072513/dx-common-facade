package com.dx.facade.member.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


/**
 * @Description: 会员 文档对象封装
 * @version: v1.0.0
 * @author: fitz
 * @date: 2021/4/11 16:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberLabelEsLabelRespDTO {

    @ApiModelProperty(value = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;
    
    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;
    
    @ApiModelProperty(value = "账号类型名称（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private String accountTypeName;
    
}
