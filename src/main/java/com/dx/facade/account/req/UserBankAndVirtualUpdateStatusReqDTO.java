package com.dx.facade.account.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author agan
 */
@Data
public class UserBankAndVirtualUpdateStatusReqDTO {

    @ApiModelProperty(value="主键",example = "607999640155496448", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @NotNull(message = "id不能为空")
    private Long id;

    @ApiModelProperty(value = "数据类型(1-银行卡 2-虚拟货币)", example = "1", required = true)
    @Min(value = 1, message = "数据类型最小值只能为1")
    @Max(value = 2, message = "数据类型最大值只能为2")
    private Integer dataType;

    @ApiModelProperty(value = "备注", example = "1111", required = true)
    @NotNull(message = "备注不能为空")
    private String remark;

    @ApiModelProperty(value = "商户id", hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "会员id, Long 类型", example = "607208542101348352", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @NotNull(message = "会员id不能为空")
    private Long userId;

    @ApiModelProperty(value = "0-禁用，1-可用,只有 0和1 两个值", required = true)
    @Min(value = 0, message = "状态最小值只能是0")
    @Max(value = 1, message = "状态最大值只能是1")
    @NotNull(message = "状态不能为空")
    private Integer status;

    @ApiModelProperty(value = "操作人", hidden = true)
    private String operator;
}
