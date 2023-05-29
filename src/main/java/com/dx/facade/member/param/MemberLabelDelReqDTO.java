package com.dx.facade.member.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 会员标签-删除请求封装参数
 *
 * @author timas
 * @version 1.0.0
 * @date 2021/06/02
 */
@ApiModel(value = "会员标签-删除请求封装参数", description = "会员标签-删除请求封装参数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberLabelDelReqDTO implements Serializable {
    
    @ApiModelProperty(value = "id")
    @NotNull(message = "标签id不能为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
}