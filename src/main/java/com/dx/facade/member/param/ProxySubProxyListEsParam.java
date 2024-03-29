package com.dx.facade.member.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 下级会员-优惠记录 请求参数
 *
 * @author agan
 * @version 1.0.0
 * @date 2021/9/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProxySubProxyListEsParam {

	@ApiModelProperty(value = "上级代理id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long parentProxyId;

	@ApiModelProperty(value = "当前登录代理id")
	private Long curUserId;

    @ApiModelProperty(value = "当前登录代理账号 (20)", example = "test000")
    private String curUserName;

	@ApiModelProperty(value = "商户id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
	@ApiModelProperty(value = "排序列(1)：1-注册时间近至远  2-登录时间近至远 3-全部代理高至低 4-全部代理低至高 5-全部会员高至低 6-全部会员低至高 默认选中“注册时间近至远”",required = true ,example = "true")
	private Integer orderType;

	@ApiModelProperty(value = "代理web 排序列(1)：1-下级代理人数  2-直属代理人数 3-下级会员人数 4-直属会员人数 5-注册时间 6-最后登录时间 ",required = true ,example = "true")
	private Integer sortKey;
	
	@ApiModelProperty(value = "排序 升序-asc 降序-desc")
	private String sortType;
	
    /** 注册开始时间 */
    @ApiModelProperty("创建开始时间")
    private String createdAtStart;
    
    /** 注册结束时间 */
    @ApiModelProperty("创建结束时间")
    private String createdAtEnd;
    
    @ApiModelProperty(value = "输入代理账号 (20)", example = "test000")
    private String userName;
    
	@ApiModelProperty(value = "上级代理账号")
	private String parentProxyName;
	
	@ApiModelProperty(value = "所属等级")
	private Integer proxyLevel;
	
	@ApiModelProperty(value = "登录权限：0-关闭 1-开启")
	private Integer loginLockStatus;
	
	@ApiModelProperty(value = "开局权限：0-关闭 1-开启")
	private Integer openLockStatus;
	
	@ApiModelProperty(value = "管理俱乐部权限：0-关闭 1-开启")
	private Integer manageClubLockStatus;
	
    /** 最近登录开始时间 */
    @ApiModelProperty("最近登录开始时间")
    private String lastLoginStart;
    
    /** 最近登录结束时间 */
    @ApiModelProperty("最近登录结束时间")
    private String lastLoginEnd;
}
