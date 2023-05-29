package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 代理资料变更记录 分页 返回参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/05/13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "com-ob-proxy-resp-ProxyInfoChangeRecordRpcPageRespDTO", description = "代理资料变更记录分页参数")
public class ProxyInfoChangeRecordRpcPageRespDTO implements Serializable {

    private static final long serialVersionUID = 2842841229033375497L;
    
    @ApiModelProperty(value = "id", example = "111111")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    
    @ApiModelProperty(value="会员Id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value="审核申请类型（1-账号状态，2-风控层级，3-代理标签，4-账号备注，5-入口权限，6-支付密码重置，7-解除充值限制，8-强制编辑契约生效，9-信用等级变更）")
    private String applyType;

    @ApiModelProperty(value="修改前内容")
    private String beforeModify;
    
    @ApiModelProperty(value="修改后内容")
    private String afterModify;
    
    @ApiModelProperty(value="代理账号")
    private String userName;
    
    @ApiModelProperty(value = "账号类型（1-正式，2-测试，3-合作）")
    private String accountType;
    
    @ApiModelProperty(value="操作人")
    private String applyName;
    
    @ApiModelProperty(value = "申请时间", example = "2021-04-16 07:13:54")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime applyTime;
    
    @ApiModelProperty(value="申请信息")
    private String applyInfo;

}
