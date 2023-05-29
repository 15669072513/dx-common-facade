package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 代理转账记录 分页 返回参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/06/16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-ob-proxy-resp-ProxyTransferInnerRecordRpcPageRespDTO", description = "代理转账记录")
public class ProxyTransferInnerRecordRpcPageRespDTO implements Serializable {

    private static final long serialVersionUID = 2842841229033375497L;

	@ApiModelProperty(value="商户id")
	private Long merchantId;

	@ApiModelProperty(value="商户名称")
	private String merchantName;
	
	@ApiModelProperty(value="订单号")
	private String orderNo;
	
	@TableField(value = "proxy_name")
	@ApiModelProperty(value="代理账号")
	private String proxyName;
	
	@ApiModelProperty(value="代理姓名")
	private String realName;
	
	@ApiModelProperty(value = "风控层级")
	private String windControlName;
	
	@ApiModelProperty(value="状态(0=待处理 1=成功 2=失败)")
	private Integer orderStatus;
	
	@ApiModelProperty(value="转账金额")
	private BigDecimal amount;

	@ApiModelProperty(value="币种")
	private String currency;
	
	@ApiModelProperty(value="转账时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime createdTime;

}
