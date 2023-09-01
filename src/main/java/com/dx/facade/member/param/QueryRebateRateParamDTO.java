package com.dx.facade.member.param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.baomidou.mybatisplus.annotation.TableField;
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
 * 返点比例请求参数DTO
 * 
 * @author bicycle
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "返点比例请求Param", description = "返点比例请求Param")
public class QueryRebateRateParamDTO implements BaseParmDTO, Serializable {


    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;
    
    @ApiModelProperty("商户Id")
    private Long merchantId;
    
    @ApiModelProperty("用户类型 0：会员 1：代理")
    private Integer userType;
    
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
    
    @ApiModelProperty("德州返点比例")
    private BigDecimal texasRebate;
    
    @ApiModelProperty("真人返点比例")
    @TableField("actual_person_rebate")
    private BigDecimal actualPersonRebate;
    
    @ApiModelProperty("体育返点比例")
    @TableField("sports_rebate")
    private BigDecimal sportsRebate;
    
    @ApiModelProperty("彩票返点比例")
    private BigDecimal lotteryTicketRebate;
    
    @ApiModelProperty("棋牌返点比例")
    private BigDecimal chessRebate;
    
    @ApiModelProperty("电竞返点比例")
    private BigDecimal esportsRebate;
    
    @ApiModelProperty("状态:0-未设置 1-已生效 2-已失效 3-平台调整")
    private Integer status;
    
    /** 生效时间 */
    @ApiModelProperty("生效时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime effectDt;

    /** 契约失效时间 */
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
    
    @ApiModelProperty("查询所以代理下级")
    private Boolean isAllSub;
    
    @ApiModelProperty("代理id列表")
    private List<Long> proxyIds;

	@Override
	public void check() {
	}

}
