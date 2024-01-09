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
 * 通知、活动消息配置明细表
 * </p>
 *
 * @author dereck
 * @since 2022-10-05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "BwMessageNoticeDetailPO对象", description = "通知、活动消息配置明细表")
public class MessageNoticeDetailDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("用户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("类型:1通知,2活动")
    private Integer noticeType;

    private String title;

    @ApiModelProperty("英文")
    private String titleEn;

    @ApiModelProperty("越南")
    private String titleVi;

    @ApiModelProperty("泰文")
    private String titleTh;


    @ApiModelProperty("通知内容")
    private String content;

    @ApiModelProperty("公告内容 英文")
    private String contentEn;

    @ApiModelProperty("公告内容 越南")
    private String contentVi;

    @ApiModelProperty("公告内容 泰文")
    private String contentTh;

    @ApiModelProperty("通知表的id(如果这条消息是运营手动发送的,则在'通知表'中有一条对应的消息,它就是那个原始消息的id)")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long messageId;

    private String deviceType;

    @ApiModelProperty("是否是全员消息(包含全员消息和指定设备类型的消息)(0否,1是)")
    private Integer isAllUser;

    @ApiModelProperty("是否撤回 (1-撤回 2-正常)")
    private Integer retract;

    @ApiModelProperty("是否已读(0否,1是)")
    private Integer isRead;

    @ApiModelProperty("是否删除(0否,1是)")
    private Integer isDeleted;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty("消息类别:0会员消息,1代理消息")
    private Integer noticeCategory;

    @ApiModelProperty("附加数据,如账单消息跳转详情的id")
    private MessageNoticeExtraDTO extraData;
}
