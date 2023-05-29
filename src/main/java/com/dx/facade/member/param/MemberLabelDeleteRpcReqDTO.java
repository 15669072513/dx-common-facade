package com.dx.facade.member.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 会员标签表
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/06/02
 */
@ApiModel(value = "com-ob-member-dto-MemberLabelDeleteRpcReqDTO", description = "会员标签删除请求参数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberLabelDeleteRpcReqDTO implements Serializable {
    
    
    @ApiModelProperty(value = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    
    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
    
    @ApiModelProperty(value = "修改人")
    private String updatedBy;
	
	@ApiModelProperty(value = "数据类型 （0-会员 1-代理）")
	private Integer dataType;
}