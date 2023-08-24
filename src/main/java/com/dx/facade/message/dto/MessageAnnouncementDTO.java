package com.dx.facade.message.dto;


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
 * <p>
 * 公告配置表
 * </p>
 *
 * @author dereck
 * @since 2022-10-05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "BwMessageAnnouncementPO对象", description = "公告配置表")
public class MessageAnnouncementDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("商户Id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("英文")
    private String titleEn;

    @ApiModelProperty("越南")
    private String titleVi;

    @ApiModelProperty("泰文")
    private String titleTh;

    @ApiModelProperty("公告内容")
    private String content;

    @ApiModelProperty("公告内容 英文")
    private String contentEn;

    @ApiModelProperty("公告内容 越南")
    private String contentVi;

    @ApiModelProperty("公告内容 泰文")
    private String contentTh;

    @ApiModelProperty("标识[0-无 1-重要]")
    private Integer tag;

    @ApiModelProperty("终端")
    private String terminal;

    @ApiModelProperty("公告时效[1-限时 2-永久]")
    private Integer aging;

    @ApiModelProperty("上架时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime upTime;

    @ApiModelProperty("下架时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime downTime;

    @ApiModelProperty("公告状态[0-已禁用 1-开启中]")
    private Integer status;

    @ApiModelProperty("App专用，代表该公告是否已读 1 已读 0 未读")
    private Integer isRead;

    private String createdBy;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    private String updatedBy;

    @ApiModelProperty("更新时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;

    @ApiModelProperty("列表位置排序，从0开始")
    private Integer index;
}
