package com.dx.facade.member.resp;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@ApiModel(value = "RebateRateConfig响应DTO对象", description = "返点比例响应DTO")
public class RebateRateConfigRespDTO extends BaseRebateRateConfigRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;
    
    @ApiModelProperty("商户Id")
    private Long merchantId;
    
    @ApiModelProperty("商户名称")
    private String merchantName;
    
    @ApiModelProperty("类型 0-直属会员返水比率 1-直属代理团队返点比例 2-直属代理团队占成比例")
    private Integer type;
    
    @ApiModelProperty("用户Id")
    private Long userId;

    @ApiModelProperty("用户名称")
    private String userName;
    
    @ApiModelProperty("状态:0-未设置 1-已生效 2-已失效")
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
    
    @ApiModelProperty("备注")
    private String remark;
    
    @ApiModelProperty("版本号")
    private Integer version;

}
