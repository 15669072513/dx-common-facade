package com.dx.facade.member.param;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

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
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "更新返点比例请求Param", description = "更新返点比例请求Param")
public class UpdateRebateRateParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
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
    
    @ApiModelProperty("返点比例列表")
    private List<RebateRateDTO> rebateRateList;

    @ApiModelProperty("最后操作人")
    private String updatedBy;

    @ApiModelProperty("最后操作时间")
    private LocalDateTime updatedAt;
    
    @ApiModelProperty("是否为平台调整")
    private boolean isPlatformAdjustment;
    
    @ApiModelProperty("佣金模式 1：返点模式 2：返佣模式")
    private Integer commissionMode;
    
    @ApiModelProperty("remark")
    private String remark;
    
    @ApiModelProperty("是否更新所以下级")
    private boolean isAllSub;
    
}
