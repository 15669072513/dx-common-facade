package com.dx.facade.operate.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 系统消息配置表
 * </p>
 *
 * @author morman
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="sysMsg对象", description="系统消息配置表配置表")
public class MerchantSysMsg implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Long id;
    /**
     * 商户id
     */
    public Long merchantId;

    @ApiModelProperty(value = "模块")
    private Integer module;

    @ApiModelProperty(value = "消息内容 中文")
    private String content;

    @ApiModelProperty(value = "消息内容 英文")
    private String contentEn;

    @ApiModelProperty(value = "消息内容 越南")
    private String contentVi;

    @ApiModelProperty(value = "消息内容 泰文")
    private String contentTh;

    @ApiModelProperty(value = "消息标题 中文")
    private String title;

    @ApiModelProperty(value = "消息标题 英文")
    private String titleEn;

    @ApiModelProperty(value = "消息标题 越南")
    private String titleVi;

    @ApiModelProperty(value = "消息标题 泰文")
    private String titleTh;

    @ApiModelProperty(value = "code")
    private String k;

    @ApiModelProperty(value = "状态 0停用 1启用")
    private Integer status;

    @ApiModelProperty(value = "类型 1会员 2代理")
    private Integer type;

    @ApiModelProperty(value = "时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "最近操作人 长度为2-10个字符")
    private String updatedBy;
}
