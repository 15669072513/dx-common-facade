package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
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
 * 代理资料审核记录 分页 返回参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/05/13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-ob-proxy-resp-ProxyRpcDataRecordPageRespDTO", description = "代理资料审核记录分页参数")
public class ProxyRpcDataRecordPageRespDTO implements Serializable {

    private static final long serialVersionUID = 2842841229033375497L;
    
    @ApiModelProperty(value = "id", example = "111111")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    
    @ApiModelProperty(value="会员Id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;
    
    @ApiModelProperty(value="审核单号")
    private String auditNum;
    
    @ApiModelProperty(value="审核申请类型（1-账号状态，2-风控层级，3-代理标签，4-账号备注，5-入口权限，6-支付密码重置）")
    private String applyType;

    @ApiModelProperty(value="修改前内容")
    private String beforeModify;
    
    @ApiModelProperty(value="修改后内容")
    private String afterModify;
    
    @ApiModelProperty(value="代理账号")
    private String userName;
    
    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private String accountType;
    
    @ApiModelProperty(value="申请人")
    private String applyName;
    
    @ApiModelProperty(value = "申请时间", example = "2021-04-16 07:13:54")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime applyTime;
    
    @ApiModelProperty(value="申请信息")
    private String applyInfo;
    
    @ApiModelProperty(value = "审核状态（0-待处理 1-处理中，2-审核通过，3-审核拒绝）")
    private String auditStatus;
    
    @ApiModelProperty(value = "审核操作(1)（0-结单查看 1-一审审核）")
    private String auditStep;
    
    @ApiModelProperty(value="一审审核人")
    private String auditName;
    
    @ApiModelProperty(value = "一审审批时间", example = "2021-04-16 07:13:54")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime auditTime;
    
    @ApiModelProperty(value="锁单状态（0-未锁定 1-已锁定）")
    private String lockOrder;

    @ApiModelProperty(value = "私庄模式,1:吃单模式 2:坐庄模式")
    private Integer bankerMode;

    @ApiModelProperty(value = "代理层级")
    private Integer proxyLevel;

    @ApiModelProperty(value = "代理层级名称")
    private String proxyLevelName;
}
