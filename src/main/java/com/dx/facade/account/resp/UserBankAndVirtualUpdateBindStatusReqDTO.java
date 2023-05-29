package com.dx.facade.account.resp;

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
public class UserBankAndVirtualUpdateBindStatusReqDTO {

    @ApiModelProperty(value="银行卡主键id", example = "607976484459651072", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @NotNull(message = "银行卡主键id不能为空")
    private Long id;

    @ApiModelProperty(value = "备注", required = true, example = "备注")
    @NotNull(message = "备注不能为空")
    private String remark;

    @ApiModelProperty(value = "商户id",hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "会员id, 是Long ",example = "607208542101348352L", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value = "绑定状态（0-待绑定 1-绑定中）与会员账号是否绑定", required = true)
    @Min(value = 0, message = "状态最小值只能是0")
    @Max(value = 1, message = "状态最大值只能是1")
    @NotNull(message = "绑定状态不能为空")
    private Integer bindStatus;

    @ApiModelProperty(value = "黑名单状态（0-禁用中 1-启用中）是否将银行卡列变更为黑名单禁用状态, 0是列入 禁用状态")
    private Integer blacklistStatus;

    @ApiModelProperty(value = "操作人", hidden = true)
    private String operator;

}
