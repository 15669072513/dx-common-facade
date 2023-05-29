package com.dx.facade.merchant.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ProxyContractAddReqDTO", description = "新增契约传参对象")
public class ProxyContractAddReqDTO {


    @ApiModelProperty(value = "id",hidden = true)
    public Long id;

    @ApiModelProperty(value = "商户id")
    public Long merchantId;

    @ApiModelProperty(value = "契约类型：1-佣金契约 2-返点契约")
    @Min(value = 1, message = "契约类型只能是1或者2")
    @Max(value = 2, message = "契约类型只能是1或者2")
    public Integer contractType;

    @ApiModelProperty(value = "签约代理ID")
    private Long signProxyId;

    @ApiModelProperty(value = "签约代理账号")
    @Length(max = 11,message = "长度不能超过11位")
    private String signProxyName;

    @ApiModelProperty(value = "签约代理层级ID")
    private Long signProxyLevelId;

    @ApiModelProperty(value = "签约代理层级")
    private Integer signProxyLevel;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty(value = "父级代理ID")
    private Long parentProxyId;

    @ApiModelProperty(value = "父级代理名称")
    private String parentProxyName;

    @ApiModelProperty(value = "开始比例")
    private BigDecimal beginRate;

    @ApiModelProperty(value = "终止比例")
    private BigDecimal endRate;

    @ApiModelProperty(value = "数据来源:1-新增 2-重订 3-修改重发")
    @Min(value = 1, message = "数据来源只能是1~3")
    @Max(value = 3, message = "数据来源只能是1~3")
    private Integer dataSources;

    @ApiModelProperty(value = "契约状态:0-待签约 1-已签约")
    @Min(value = 0, message = "契约状态只能是0或者1")
    @Max(value = 1, message = "契约状态只能是0或者1")
    private Integer contractStatus;

    @ApiModelProperty(value = "契约生效状态:0-未生效 1-已生效 2-已失效 未审核1")
    private Integer effectStatus;

    @ApiModelProperty(value = "签约类型: 0-签约确认  1-强制签约")
    @Min(value = 0, message = "签约类型只能是0或者1")
    @Max(value = 1, message = "签约类型只能是0或者1")
    private Integer sginType;

    @ApiModelProperty(value = "页面类型: 1契约管理-编辑契约， 2 代理信息-政策编辑")
    @Min(value = 1, message = "签约类型只能是1或者2")
    @Max(value = 2, message = "签约类型只能是2或者2")
    private Integer pageType;

    @ApiModelProperty(value = "契约制定账号")
    private String createAccount;

    @ApiModelProperty(value = "反点比例集合")
    public List<RebateContractParam> rebateContractList;

    @ApiModelProperty(value = "佣金比例集合")
    public List<RebateContractParam> commissionContractList;

    @ApiModelProperty(value = "备注")
    private String backNote;

    @ApiModelProperty(value = "佣金政策类型配置id")
    public Long commissionPolicyTypeId;

    @ApiModelProperty(value = "返点政策类型配置id")
    public Long rebatePolicyTypeId;

    @ApiModelProperty("返点契约ID")
    private Long rebateContractId;

    @ApiModelProperty("佣金契约ID")
    private Long commissionContractId;


    @ApiModelProperty(value = "契约制定时间",hidden = true)
    private LocalDateTime createDt;

    @ApiModelProperty(value = "契约最后修改时间",hidden = true)
    private LocalDateTime lastModDt;

    @ApiModelProperty(value = "契约签订时间",hidden = true)
    private LocalDateTime signDt;

    @ApiModelProperty(value = "契约生效时间",hidden = true)
    private LocalDateTime effectDt;

    @ApiModelProperty(value = "契约失效时间",hidden = true)
    private LocalDateTime lostEffectDt;

    @ApiModelProperty(value = "记录最后更新时间",hidden = true)
    private LocalDateTime lastUpdateDt;

    @ApiModelProperty(value = "操作人",hidden = true)
    private String updatedBy;

    @ApiModelProperty(value = "来源 1 平台 2app")
    private Integer sourceType ;

}
