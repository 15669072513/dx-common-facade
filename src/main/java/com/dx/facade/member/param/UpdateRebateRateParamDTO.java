package com.dx.facade.member.param;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
/**
 * 更新返点比例请求参数DTO
 * 
 * @author bicycle
 *
 */
@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "更新返点比例请求Param", description = "更新返点比例请求Param")
public class UpdateRebateRateParamDTO extends BaseRebateRateParamDTO implements BaseParmDTO, Serializable {


    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("最后操作人")
    private String updatedBy;

    @ApiModelProperty("最后操作时间")
    private LocalDateTime updatedAt;
    
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
    
    @ApiModelProperty("是否为平台调整")
    private boolean isPlatformAdjustment;
    
	@Override
	public void check() {
		 Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
	}

}
