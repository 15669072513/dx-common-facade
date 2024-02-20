package com.dx.facade.member.resp;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 返点比例响应DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-7-22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "RebateRate响应DTO对象", description = "返点比例响应DTO")
public class MemberRebateRateListRespDTO extends BaseMemberRebateRateRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;
    
    @ApiModelProperty("商户Id")
    private Long merchantId;
    
    @ApiModelProperty("商户名称")
    private String merchantName;
    
    @ApiModelProperty("用户类型 0：会员 1：代理")
    private Integer userType;
    
    @ApiModelProperty("用户Id")
    private Long userId;

    @ApiModelProperty("用户名称")
    private String userName;

    /**
     * 非入库字段
     */
    @ApiModelProperty("代理等级")
    private Integer proxyLevel;
    
    @ApiModelProperty("上级代理Id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理名称")
    private String parentProxyName;
    
    @ApiModelProperty("上级代理等级")
    private Integer parentProxyLevel;
    
    @ApiModelProperty("总代ID")
    private Long topProxyId;
    
    @ApiModelProperty("顶级代理名称")
    private String topProxyName;
    
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
    
    @ApiModelProperty("是否有下级代理")
    private boolean hasSub;
    
    @ApiModelProperty("备注")
    private String remark;
    
    @ApiModelProperty("版本号")
    private Integer version;
    
	@ApiModelProperty(value = "代理层级路径(代理账号)")
	private List<String> proxyPathUsername;
	
    @ApiModelProperty("返点分配模式 1：自由模式 2:模板模式")
    private Integer rebateAllotMode;
	
    @ApiModelProperty("返点比率等级")
    private Integer rebateRateLevel;

    @ApiModelProperty("返点比率模板id")
    private Long rebateRateTemplateId;

    @ApiModelProperty("返点比率模板名称")
    private String rebateRateTemplateName;
}
