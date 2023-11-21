package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Yinter
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBankManageParamDTO {

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "银行名称")
    private String bankName;

    @ApiModelProperty(value = "银行logo")
    private String bankLogo;

    @ApiModelProperty(value = "币种")
    private String currency;

    @ApiModelProperty(value = "修改人")
    private String updatedBy;

    @ApiModelProperty(value = "创建人")
    private String createdBy;

    @ApiModelProperty(value = "ip")
    private String ip;


}
