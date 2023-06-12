package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClubDetailsByIdParam implements Serializable {

	private static final long serialVersionUID = -2562023045579551057L;
	@ApiModelProperty(value="id")
    @NotNull(message = "数据id不能为空")
    private Long id;

}
