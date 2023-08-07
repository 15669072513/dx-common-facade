package com.dx.facade.member.resp;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 代理俱乐部响应DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-5-31
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "代理俱乐部响应DTO", description = "代理俱乐部响应DTO")
public class ProxyClubRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    /** id */
    @ApiModelProperty("ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    
    /** 商户Id */
    @ApiModelProperty("商户Id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
    
    /** 代理Id */
    @ApiModelProperty("代理Id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyId;

    /** 代理名称 */
    @ApiModelProperty("代理名称")
    private String proxyName;
    
    /** 代理姓名 */
    @ApiModelProperty("代理姓名")
    private String proxyRealName;
    
    /** 总代Id */
    @ApiModelProperty("总代Id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long topProxyId;
    
    /** 总代名称 */
    @ApiModelProperty("总代名称")
    private String topProxyName;
    
    /** 俱乐部名称 */
    @ApiModelProperty("俱乐部名称")
    private String clubName;
    
    /** 管理员Id */
    @ApiModelProperty("管理员Id")
    private Long administratorId;
    
    /** 管理员名称 */
    @ApiModelProperty("管理员名称")
    private String administratorName;
    
    /** 人员上线 */
    @ApiModelProperty("人员上线")
    private Integer upperLimit;
    
    @ApiModelProperty("同时开牌桌上限")
    private Integer cardTableLimit;
    
    @ApiModelProperty("单牌桌旁观人数上限")
    private Integer lookOnLimit;
    
    /** 会员人数 */
    @ApiModelProperty("会员人数")
    private Integer membership;
    
    /** icon地址 */
    @ApiModelProperty("icon地址")
    private String iconUrl;
    
    /** 状态 */
    @ApiModelProperty("状态")
    private Integer status;
    
    /** 简介 */
    @ApiModelProperty("简介")
    private String introduction;

    /** 创建人 */
    @ApiModelProperty("创建人")
    private String createdBy;

    /** 创建时间 */
    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    /** 最后操作人 */
    @ApiModelProperty("最后操作人")
    private String updatedBy;

    /** 最后操作时间 */
    @ApiModelProperty("最后操作时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;


}
