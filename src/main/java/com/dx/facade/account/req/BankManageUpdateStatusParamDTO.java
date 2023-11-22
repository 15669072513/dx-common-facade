package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Yinter
 */
@Data
public class BankManageUpdateStatusParamDTO {

    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "是否启用 (0=停用, 1=启用)")
    private Integer status;
    
    @ApiModelProperty(value = "最后操作人", hidden = true)
    private String updatedBy;
}
