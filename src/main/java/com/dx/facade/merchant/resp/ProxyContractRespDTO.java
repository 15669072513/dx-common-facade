package com.dx.facade.merchant.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyContractRespDTO implements Serializable {

	private static final long serialVersionUID = -4045584080487816420L;

	@ApiModelProperty(value = "契约id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id ;

    @ApiModelProperty(value = "契约类型：1-佣金契约 2-返点契约")
    private Integer contractType ;

    @ApiModelProperty(value = "契约状态：0-待签约 1-已签约'")
    private Integer contractStatus ;

    @ApiModelProperty(value = "生效状态：0-未生效 1-已生效 2-已失效")
    private Integer effectStatus;

    @ApiModelProperty(value = "代理账号")
    private String signProxyName;

    @ApiModelProperty(value = "数据来源:1-新增 2-重订")
    private Integer dataSources;

    @ApiModelProperty(value = "签约时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime signDt;
    
    @ApiModelProperty(value = "失效时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lostEffectDt;

    @ApiModelProperty(value = "契约制定时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createDt;

    @ApiModelProperty(value = "代理类型 1:直属代理 2非直属代理")
    private Integer proxyType;


    @ApiModelProperty(value = "最低比例", required = true)
    private BigDecimal beginRate;

    @ApiModelProperty(value = "最高比例", required = true)
    private BigDecimal endRate;

    @ApiModelProperty(value = "头像URL")
    private String topImagesUrl;

    @ApiModelProperty(value = "账户类型 代理类型（1-正式，2-测试，3-合作）")
    private Integer accountType;

    @ApiModelProperty(value = "详情列表")
    List<ContractDetailRespDTO> contractDetailRespList;

    @ApiModelProperty(value = "签约代理ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long signProxyId;

    @ApiModelProperty(value = "签约代理层级ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long signProxyLevelId;

    @ApiModelProperty(value = "签约代理层级")
    @JsonProperty(value = "signProxyLevel")
    private Integer signProxyLevel;

    @ApiModelProperty(value = "父级代理ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long parentProxyId;

    @ApiModelProperty(value = "父级代理名称")
    private String parentProxyName;

    @ApiModelProperty(value = "签约类型: 0-签约确认  1-强制签约")
    private Integer sginType;

    @ApiModelProperty(value = "契约制定账号")
    private String createAccount;

    @ApiModelProperty(value = "备注")
    private String backNote;

    @ApiModelProperty(value = "当前层级数组")
    private List<String> levlList;

    @ApiModelProperty("是否存在下级")
    private Boolean isAllSub;

    @ApiModelProperty(value="政策类型配置id")
    public Long policyTypeConfigId;
    
    /**
     * 契约最后修改时间
     */
    @ApiModelProperty(value = "契约最后修改时间")
    private LocalDateTime lastModDt;
}
