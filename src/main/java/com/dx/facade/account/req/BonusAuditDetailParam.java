package com.dx.facade.account.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * <p>
 * 提交红利发放 入参
 * </p>
 * @author admin
 * @since 2022-01-07
 */
@Data
@ApiModel(value="BonusAuditDetailParam对象", description="红利审核详情参数")
public class BonusAuditDetailParam {

    @ApiModelProperty(value = "红利发放记录id")
    @NotNull(message = "红利发放记录id不能为空")
    private Long bonusAuditId;
}
