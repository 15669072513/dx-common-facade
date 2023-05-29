package com.dx.facade.account.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author agan
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberUserBankAndVirtualParam {

    private Long pageSize;

    private Long pageNum;

    @ApiModelProperty("会员id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;
    
    @ApiModelProperty(value = "商户id", hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "商户id集合", hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<Long> merchantIds;

    @ApiModelProperty("银行卡号,不能超过25个字符")
    private String cardNumber;
    @ApiModelProperty("银行名称,不能超过10个字符")
    private String bankName;
    @ApiModelProperty("银行支行,不能超过10个字符")
    private String bankRegion;
    @ApiModelProperty("会员/代理 银行卡是否在黑名单状态中,(0-禁用中 1-启用中)")
    @Min(value = 0, message = "黑名单状态最小值不能为0")
    @Max(value = 1, message = "黑名单状态最大值不能为1")
    private Integer blackStatus;

    @ApiModelProperty("虚拟地址")
    private String virtualAddress;
    @ApiModelProperty("虚拟币种类")
    private List<String> virtualCoinKind;
    @ApiModelProperty("虚拟币协议")
    private List<String> virtualAgreement;
    @ApiModelProperty(value = "数据类型：1-银行卡 2-虚拟账户", required = true, example = "1")
    @Min(value = 1, message = "数据类型最小不能小于 1")
    @Max(value = 2, message = "数据类型最大不能超过 2")
    private Integer dataType;

    @ApiModelProperty(value = "账户类型：0-会员 1-代理", required = true, example = "0")
    @Min(value = 0,message = "账户类型只能是0或1两个数字")
    @Max(value = 1,message = "账户类型只能是0或1两个数字")
    private Integer accountType;

    @ApiModelProperty(value = "1=当前绑定的会员账号, 2=会员姓名")
    private Integer nameType;

    @ApiModelProperty("绑定状态,会员账号与银行卡是否绑定,绑定状态(0-待绑定 1-绑定中)")
    @Min(value = 0,message = "绑定状态只能是0或1两个数字")
    @Max(value = 1,message = "绑定状态只能是0或1两个数字")
    private Integer bindStatus;

    @ApiModelProperty("最近操作人")
    private String lastOperator;
    @ApiModelProperty("当前绑定会员真实姓名")
    private String bindUserName;
    @ApiModelProperty("会员账号")
    private String userName;

    @ApiModelProperty(value = "次数类型 1=会员提款成功次数,2=会员提款被拒次数,3=会员提款总金额,4=代理提款成功次数,5=代理提款被拒次数,6=代理提款总金额")
    private Integer timesType;

    @ApiModelProperty("会员提款被拒次数最小值")
    private String minCount;

    @ApiModelProperty("会员提款被拒次数最大值")
    private String maxCount;

    @ApiModelProperty("风控层级")
    private List<String> windControlId;

    @ApiModelProperty("绑定账号次数")
    private Integer bindAccountCount;

    @ApiModelProperty(value = "排序列：1-银行卡新增时间 2-最近提款时间 3-最近操作时间", example = "1")
    @Min(value = 1, message = "排序列最小值为1")
    @Max(value = 3, message = "排序列最大值为3")
    private Integer orderKey;
    @ApiModelProperty(value = "排序方式：升序：asc/降序：desc", example = "desc")
    private String orderType;

}
