package com.dx.facade.member.param;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
public class UserBankCardOperationQureyParam extends PageRequest {

    @ApiModelProperty(value = "商户id")
    @NotNull(message = "商户ID不能为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "商户idList")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<Long> merchantIds;

    @ApiModelProperty("操作时间开始")
    @NotNull(message = "操作时间开始不能为空")
    private LocalDateTime eventTimeStart;

    @ApiModelProperty("操作时间结束")
    @NotNull(message = "操作时间结束不能为空")
    private LocalDateTime eventTimeEnd;

    @ApiModelProperty(value = "银行卡号")
    private String cardNumber;

    @ApiModelProperty(value = "银行名称")
    private String bankName;

    @ApiModelProperty(value = "银行支行")
    private String bankRegion;

    @ApiModelProperty(value = "会员账号")
    @Length(max = 15, message = "会员账号不能超过15个字符")
    private String userName;

    @ApiModelProperty("上级代理")
    private String parentProxyName;

    @ApiModelProperty("持卡人")
    private String cnName;

    @ApiModelProperty("操作人")
    private String operator;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）",hidden = true)
    private Integer accountType;

    @ApiModelProperty("风控层级")
    private List<String> windControlId;

    @ApiModelProperty(value = "操作类型（0-解绑 1-绑定 2-下架 3-启用 4-禁用）")
    private Integer operateType;

}
