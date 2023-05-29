package com.dx.facade.merchant.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContractStatusRespDTO {


    /**
     * 代理ID
     */
    @ApiModelProperty(value = "代理ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "user_name")
    @ApiModelProperty(value="用户名")
    private String userName;



    /**
     * 代理层级ID
     */
    @ApiModelProperty(value = "代理层级ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyLevelId;

    /**
     * 代理层级
     */
    @ApiModelProperty(value = "代理层级")
    private Integer proxyLevel;

    /**
     * 代理层级名称
     */
    @ApiModelProperty(value = "代理层级名称")
    private String proxyLevelName;

    /**
     * 代理线层级上限
     */
    @ApiModelProperty(value = "代理线层级上限")
    private Integer maxLevels;

    /**
     * 上级代理id
     */
    @ApiModelProperty(value="上级代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long parentProxyId;

    /**
     * 上级代理账号
     */
    @TableField(value = "parent_proxy_name")
    @ApiModelProperty(value="上级代理账号")
    private String parentProxyName;


    @ApiModelProperty(value="上级返点政策类型ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long rebatePolicyTypeId;

    @ApiModelProperty(value="上级佣金政策类型ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long commissionPolicyTypeId;


    /**
     * 强制契约生效标志 0-未生效 1-生效
     */
    @ApiModelProperty(value = "强制契约生效标志 0-未生效 1-生效")
    private Integer enforceContractStatus;

    /**
     * 契约模式 0-无契约 1-佣金契约 2-返点契约 3-佣金+返点契约
     */
    @ApiModelProperty(value = "上级契约模式 0-无契约 1-佣金契约 2-返点契约 3-佣金+返点契约")
    private Integer contractModel;

    /**
     * 契约模式 0-无契约 1-佣金契约 2-返点契约 3-佣金+返点契约
     */
    @ApiModelProperty(value = "自身契约模式 0-无契约 1-佣金契约 2-返点契约 3-佣金+返点契约")
    private Integer ownContractModel;


    /**
     * 账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）
     */
    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    /**
     * 返点契约ID
     */
    @ApiModelProperty(value = "返点契约ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long rebateContractId;

    /**
     * 佣金契约ID
     */
    @ApiModelProperty(value = "佣金契约ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long commissionContractId;
	
	@ApiModelProperty(value = "返点契约最大比例")
	private BigDecimal rebateMaxRate;
	
	@ApiModelProperty(value = "佣金契约最大比例")
	private BigDecimal commissionMaxRate;

    @ApiModelProperty(value = "是否签约类型（0-未签约，1-佣金签约，2-返点签约，3-返点+佣金签约")
    private Integer signContractType;



    private static final long serialVersionUID = 1L;

}
