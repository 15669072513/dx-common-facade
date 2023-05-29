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
 * 通知、活动消息配置表
 * </p>
 *
 * @author dereck
 * @since 2022-10-05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "BwMessageNoticePO对象", description = "通知、活动消息配置表")
public class MessageNoticeDTO implements Serializable {

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

    @ApiModelProperty("印尼")
    private String titleId;

    @ApiModelProperty("通知内容")
    private String content;

    @ApiModelProperty("公告内容 英文")
    private String contentEn;

    @ApiModelProperty("公告内容 越南")
    private String contentVi;

    @ApiModelProperty("公告内容 泰文")
    private String contentTh;

    @ApiModelProperty("公告内容 印尼")
    private String contentId;

    @ApiModelProperty("发送对象[0-全部 1-会员 2-终端]")
    private Integer sendObj;

    private String deviceType;

    @ApiModelProperty("用户类型 0,全部 1,特定会员")
    private Integer userType;

    private String objDetail;

    @ApiModelProperty("类型：1、通知 2、活动消息")
    private Integer noticeType;

    @ApiModelProperty("撤回 [1-撤回 2-正常]")
    private Integer retract;

    @ApiModelProperty("状态[1-未读，2-已读]")
    private Integer status;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    private String createdBy;

    @ApiModelProperty("修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;

    private String updatedBy;


}
