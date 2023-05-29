package com.dx.facade.member.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 代理详情-代理信息编辑 强制契约 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/09/13
 */
@Data
@ApiModel(value = "com-ob-facade-member-proxy-req-ProxyInfoRpcEditSharingPolicyReqDTO", description = "信息编辑-分润政策调整")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyInfoRpcEditSharingPolicyReqDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "分润政策id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long sharingPolicyId;
	
	@ApiModelProperty(value = "备注")
	private String remark;
}
