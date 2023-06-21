package com.dx.facade.member.rep;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author knox
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("备注信息入参")
public class MemberRemarkPageReqDTO extends PageRequest implements Serializable {
    private static final long serialVersionUID = 2817562767709381444L;

    @ApiModelProperty(value = "用户Id(20)",required = true,example = "2817562767709381444")
    @NotBlank(message = "用户Id不能为空")
    @Length(max = 20,message = "长度不能超过18位")
    private String userId;
    
}
