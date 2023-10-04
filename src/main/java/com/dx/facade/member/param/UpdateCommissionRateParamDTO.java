package com.dx.facade.member.param;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
/**
 * 更新返佣比例请求参数DTO
 * 
 * @author bicycle
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "更新返佣比例请求Param", description = "更新返佣比例请求Param")
public class UpdateCommissionRateParamDTO implements BaseParmDTO, Serializable {

    private static final long serialVersionUID = 1L;
    
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
    
    @ApiModelProperty("状态:0-未设置 1-已生效 2-已失效")
    private Integer status;

    @ApiModelProperty("最后操作人")
    private String updatedBy;
    
	@ApiModelProperty("最后操作时间")
	private LocalDateTime updatedAt;

	/** 生效时间 */
	@ApiModelProperty("生效时间")
	private LocalDateTime effectDt;

	/** 契约失效时间 */
	@ApiModelProperty("失效时间")
	private LocalDateTime lostEffectDt;
    
    @ApiModelProperty("备注")
    private String remark;
    
    @ApiModelProperty("返佣比例列表")
    private List<BaseCommissionRateParamDTO> commissionRateList;
    
	@Override
	public void check() {
		 Assert.notNull(commissionRateList, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("commissionRateList"));
	}

}
