package com.dx.facade.account.param;

import com.dx.facade.account.change.WalletType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.validation.constraints.NotNull;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "帮还款入参", description = "帮还款入参")
public class HelpCreditRepayRecordBatchParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("批量帮还参数")
    private List<HelpCreditRepayRecordParam> batchParams;

}
