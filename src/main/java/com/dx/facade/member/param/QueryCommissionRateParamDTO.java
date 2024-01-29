package com.dx.facade.member.param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 返佣比例请求参数DTO
 * 
 * @author bicycle
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "返佣比例请求Param", description = "返佣比例请求Param")
public class QueryCommissionRateParamDTO implements BaseParmDTO, Serializable {


    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;
    
    @ApiModelProperty("商户Id")
    private Long merchantId;
    
    @ApiModelProperty("用户Id")
    private Long userId;

    @ApiModelProperty("用户名称")
    private String userName;
    
    @ApiModelProperty("上级代理Id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理名称")
    private String parentProxyName;
    
    @ApiModelProperty("总Id")
    private Long topProxyId;
    
    @ApiModelProperty("总代名称")
    private String topProxyName;
    
    @ApiModelProperty("德州俱乐部返佣比例")
    private BigDecimal texasCommission;
    
    @ApiModelProperty("德州保险返佣比例")
    private BigDecimal texasInsuranceCommission;
    
    @ApiModelProperty("其他返佣比例")
    private BigDecimal otherCommission;
    
    @ApiModelProperty("状态:0-未设置 1-已生效 2-已失效")
    private Integer status;
    
    @ApiModelProperty("生效时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime effectDt;

    @ApiModelProperty("失效时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lostEffectDt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("最后操作人")
    private String updatedBy;

    @ApiModelProperty("最后操作时间")
    private LocalDateTime updatedAt;
    
    /** 生效开始时间 */
    @ApiModelProperty("生效开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String effectDtStart;
    
    /** 生效结束时间 */
    @ApiModelProperty("生效结束时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String effectDtEnd;
    
    /** 失效开始时间 */
    @ApiModelProperty("失效开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String lostEffectDtStart;
    
    /** 失效结束时间 */
    @ApiModelProperty("失效结束时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String lostEffectDtEnd;
    
    /** 修改开始时间 */
    @ApiModelProperty("修改开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String updatedAtStart;
    
    /** 修改结束时间 */
    @ApiModelProperty("修改结束时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String updatedAtEnd;
    
    /** 注册开始时间 */
    @ApiModelProperty("注册开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String createdAtStart;
    
    /** 注册结束时间 */
    @ApiModelProperty("注册结束时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String createdAtEnd;
    
    @ApiModelProperty("上级代理等级")
    private Integer parentProxyLevel;
    
    @ApiModelProperty("是否查询总代")
    private Boolean isTopProxy;
    
    @ApiModelProperty("查询所有代理下级")
    private Boolean isAllSub;
    
    @ApiModelProperty("代理id列表")
    private List<Long> proxyIds;
    
    @ApiModelProperty("排序列 1：修改时间 2：账号 3：失效时间")
    private Integer orderKey;

    @ApiModelProperty("排序方式(1)：desc-降序 asc-升序")
    private String orderType;
    
    @ApiModelProperty("版本号")
    private Integer version;

	@Override
	public void check() {
	}

}
