package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 代理表
 * </p>
 *
 * @author fitz
 * @since 2022-10-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyLinkRespDTO {
	
	
	@ApiModelProperty("代理ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long id;
	
	@ApiModelProperty("商户ID")
	private Long merchantId;
	
	@ApiModelProperty("商户名称")
	private String merchantName;
	
	@ApiModelProperty("商户层级路径")
	private String merchantPath;
	
	@ApiModelProperty("父级商户ID")
	private Long parentMerchantId;
	
	@ApiModelProperty("父级商户层级路径")
	private String parentMerchantPath;
	
	@ApiModelProperty("主商户ID")
	private Long topMerchantId;
	
	@ApiModelProperty("主商户名称")
	private String topMerchantName;
	
	@ApiModelProperty("代理层级")
	private Integer proxyLevel;
	
	@ApiModelProperty("代理层级名称")
	private String proxyLevelName;
	
	@ApiModelProperty("代理线层级上限")
	private Integer maxLevel;
	
	@ApiModelProperty("代理层级路径")
	private String proxyPath;
	
	@ApiModelProperty("代理用户名层级路径")
	private String proxyPathUsername;
	
	@ApiModelProperty("上级代理id")
	private Long parentProxyId;
	
	@ApiModelProperty("上级代理名称")
	private String parentProxyName;
	
	@ApiModelProperty("上级代理层级路径")
	private String parentProxyPath;
	
	@ApiModelProperty("上级代理层级")
	private Integer parentProxyLevel;
	
	@ApiModelProperty("上级代理层级名称")
	private String parentProxyLevelName;
	
	@ApiModelProperty("总代id")
	private Long topProxyId;
	
	@ApiModelProperty("总代名称")
	private String topProxyName;
	
	@ApiModelProperty("下级代理人数")
	private Integer underProxyNum;
	
	@ApiModelProperty("直属下级代理人数")
	private Integer directlyUnderProxyNum;
	
	@ApiModelProperty("下级会员人数")
	private Integer underMemberNum;
	
	@ApiModelProperty("直属下级会员人数")
	private Integer directlyUnderMemberNum;
	
	@ApiModelProperty("转出会员人数")
	private Integer transferOutNum;
	
	@ApiModelProperty("转入会员人数")
	private Integer transferInNum;
	
}
