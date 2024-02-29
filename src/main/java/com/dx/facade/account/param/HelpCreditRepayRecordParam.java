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
import javax.validation.constraints.NotNull;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "HelpCreditRepayRecordParam", description = "帮会员还款记入参")
public class HelpCreditRepayRecordParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商户ID")
    @NotNull(message = "商户ID-不能为空")
    private Long merchantId;

    @ApiModelProperty("商户名称")
    @NotNull(message = "商户名称-不能为空")
    private String merchantName;

    @ApiModelProperty("被操作人Id")
    @NotNull(message = "被操作人Id")
    private Long userId;

    @ApiModelProperty("被操作人账号")
    @NotNull(message = "被操作人账号")
    private String userName;

    @ApiModelProperty("被操作人类型- 0:会员，1:代理")
    @NotNull(message = "被操作人类型- 0:会员，1:代理")
    private Integer userType;

    @ApiModelProperty("用户类型")
    @NotNull(message = ("操作人ID"))
    private Long operatorId;

    @ApiModelProperty("操作人账号")
    @NotNull(message = ("操作人账号"))
    private String operator;

    @ApiModelProperty("还款金额")
    @NotNull(message = ("还款金额"))
    private BigDecimal amount;

    @ApiModelProperty("币种")
    @NotNull(message = ("币种"))
    private String currency;

    @ApiModelProperty("操作代理钱包类型 - 17:现金钱包， 18:信用钱包")
    @NotNull(message = "操作代理钱包类型不能为空")
    private Integer operatorWalletType;

    @ApiModelProperty("操作代理业务类型 - 37:还款")
    @NotNull(message = "操作代理业务类型不能为空")
    private Integer operatorBizType;

    @ApiModelProperty("操作代理账变类型 - 117:代理帮下级信用还款,118:代理帮会员信用还款")
    @NotNull(message = "操作代理账变类型不能为空")
    private Integer operatorChangeType;

    @Builder.Default
    @ApiModelProperty("被操作人[会员]钱包类型 - 9:信用钱包")
    private Integer memberWalletType = WalletType.credit_available.code();

    @ApiModelProperty("被操作人[会员]业务类型 - 18:还款")
    private Integer memberBizType;

    @ApiModelProperty("被操作人[会员]账变类型 - 112:代理帮信用还款")
    private Integer memberChangeType;

    @Builder.Default
    @ApiModelProperty("被操作人[代理]钱包类型 - 17:现金钱包，18:信用钱包")
    private Integer agentWalletType = WalletType.agent_credit_available.code();

    @ApiModelProperty("被操作人[代理]业务类型 - 37:还款")
    private Integer agentBizType;

    @ApiModelProperty("被操作人[代理]账变类型 - 115:官方帮代理信用还款,116:上级帮代理信用还款,")
    private Integer agentChangeType;

}
