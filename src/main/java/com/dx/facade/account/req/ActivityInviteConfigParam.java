package com.dx.facade.account.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 好友邀请活动配置入参
 */
@Data
@ApiModel(value="ActivityInviteConfigParam对象", description="好友邀请活动配置入参")
public class ActivityInviteConfigParam implements Serializable {

    private static final long serialVersionUID = 24298618782027874L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("商户ID")
    @NotNull(message = "商户id不能为空")
    private Long merchantId;

    @ApiModelProperty("活动名称（中文）")
    private String nameZh;

    @ApiModelProperty("活动名称（英文）")
    private String nameEn;

    @ApiModelProperty("活动名称（越南文）")
    private String nameVi;

    @ApiModelProperty("活动名称（泰文）")
    private String nameTh;

    @ApiModelProperty("活动主标题（中文）")
    private String titleZh;

    @ApiModelProperty("活动主标题（英文）")
    private String titleEn;

    @ApiModelProperty("活动主标题（越南文）")
    private String titleVi;

    @ApiModelProperty("活动主标题（泰文）")
    private String titleTh;

    @ApiModelProperty("活动页路由地址")
    @NotBlank(message = "活动页路由地址不能为空")
    private String pageRouteAddr;

    @ApiModelProperty("展示设备 ConstantEnums.EnumClientDeviceType枚举（1-PC 2-IOS_APP 3-IOS_H5 4-Android_H5 5-Android_APP）")
    @NotBlank(message = "展示设备不能为空")
    private String deviceType;

    @ApiModelProperty("参与活动对象 ActivityEnums.ActivityConfigInTypeUser枚举（1-所有用户 2-名单内用户 3-指定代理条线用户）")
    @NotNull(message = "参与活动对象不能为空")
    private Integer inTypeUser;

    @ApiModelProperty("时间类型 1-指定时间 2-永久")
    @NotNull(message = "时间类型不能为空")
    private Integer cycle;

    @ApiModelProperty(value = "展示开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime showStartTime;

    @ApiModelProperty(value = "展示终止时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime showEndTime;

    @ApiModelProperty(value = "活动开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    @NotNull(message = "活动开始时间不能为空")
    private LocalDateTime activityStartTime;

    @ApiModelProperty(value = "活动终止时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime activityEndTime;

    @ApiModelProperty("邀请任务名称(中文)")
    private String inviteTitleZh;

    @ApiModelProperty("邀请任务名称(英文)")
    private String inviteTitleEn;

    @ApiModelProperty("邀请任务名称(越南文)")
    private String inviteTitleVi;

    @ApiModelProperty("邀请任务名称(泰文)")
    private String inviteTitleTh;

    @ApiModelProperty("邀请任务奖励形式: 1-按存款金额派彩 2-按邀请人数派彩")
    @NotNull(message = "邀请任务奖励形式不能为空")
    private Integer inviteRewardType;

    @ApiModelProperty("红利计算方式: 1-固定金额 2-比例金额")
    @NotNull(message = "红利计算方式不能为空")
    private Integer inviteRewardCountType;

    @ApiModelProperty("红利发送位置: 1-中心钱包 2-红利中心")
    @NotNull(message = "红利发送位置不能为空")
    private Integer inviteRewardSendPosition;

    @ApiModelProperty("被推荐人奖励标志：0-无奖励 1-有奖励")
    @NotNull(message = "被推荐人奖励标志不能为空")
    private Integer inviteRewardInviteesFlag;

    @ApiModelProperty(value = "邀请任务规则列表")
    @Valid
    private List<ActivityInviteTaskRuleParam> inviteTaskRuleList;

    @ApiModelProperty("入口图片（中文）")
    @TableField("enter_picture_zh")
    private String enterPictureZh;

    @ApiModelProperty("入口图片（英文）")
    @TableField("enter_picture_en")
    private String enterPictureEn;

    @ApiModelProperty("入口图片（越南文）")
    @TableField("enter_picture_vi")
    private String enterPictureVi;

    @ApiModelProperty("入口图片（泰文）")
    @TableField("enter_picture_th")
    private String enterPictureTh;

    @ApiModelProperty("活动主图片（中文）")
    @TableField("master_picture_zh")
    private String masterPictureZh;

    @ApiModelProperty("活动分享图片（中文）")
    @TableField("share_picture_zh")
    private String sharePictureZh;

    @ApiModelProperty("活动主图片（英文）")
    @TableField("master_picture_en")
    private String masterPictureEn;

    @ApiModelProperty("活动分享图片（英文）")
    @TableField("share_picture_en")
    private String sharePictureEn;

    @ApiModelProperty("活动主图片（越南文）")
    @TableField("master_picture_vi")
    private String masterPictureVi;

    @ApiModelProperty("活动分享图片（越南文）")
    @TableField("share_picture_vi")
    private String sharePictureVi;

    @ApiModelProperty("活动主图片（泰文）")
    @TableField("master_picture_th")
    private String masterPictureTh;

    @ApiModelProperty("活动分享图片（泰文）")
    @TableField("share_picture_th")
    private String sharePictureTh;

    @ApiModelProperty("PC入口图片（中文）")
    @TableField("pc_enter_picture_zh")
    private String pcEnterPictureZh;

    @ApiModelProperty("PC入口图片（英文）")
    @TableField("pc_enter_picture_en")
    private String pcEnterPictureEn;

    @ApiModelProperty("PC入口图片（越南文）")
    @TableField("pc_enter_picture_vi")
    private String pcEnterPictureVi;

    @ApiModelProperty("PC入口图片（泰文）")
    @TableField("pc_enter_picture_th")
    private String pcEnterPictureTh;

    @ApiModelProperty("PC活动主图片（中文）")
    @TableField("pc_master_picture_zh")
    private String pcMasterPictureZh;

    @ApiModelProperty("PC活动分享图片（中文）")
    @TableField("pc_share_picture_zh")
    private String pcSharePictureZh;

    @ApiModelProperty("PC活动主图片（英文）")
    @TableField("pc_master_picture_en")
    private String pcMasterPictureEn;

    @ApiModelProperty("PC活动分享图片（英文）")
    @TableField("pc_share_picture_en")
    private String pcSharePictureEn;

    @ApiModelProperty("PC活动主图片（越南文）")
    @TableField("pc_master_picture_vi")
    private String pcMasterPictureVi;

    @ApiModelProperty("PC活动分享图片（越南文）")
    @TableField("pc_share_picture_vi")
    private String pcSharePictureVi;

    @ApiModelProperty("PC活动主图片（泰文）")
    @TableField("pc_master_picture_th")
    private String pcMasterPictureTh;

    @ApiModelProperty("PC活动分享图片（泰文）")
    @TableField("pc_share_picture_th")
    private String pcSharePictureTh;

    @ApiModelProperty("APP邀请任务说明（中文）")
    private String inviteTaskInfoZh;

    @ApiModelProperty("APP邀请任务规则详情（中文）")
    private String inviteTaskRuleZh;

    @ApiModelProperty("APP邀请任务说明（英文）")
    private String inviteTaskInfoEn;

    @ApiModelProperty("APP邀请任务规则详情（英文）")
    private String inviteTaskRuleEn;

    @ApiModelProperty("APP邀请任务说明（越南文）")
    private String inviteTaskInfoVi;

    @ApiModelProperty("APP邀请任务规则详情（越南文）")
    private String inviteTaskRuleVi;

    @ApiModelProperty("APP邀请任务说明（泰文）")
    private String inviteTaskInfoTh;

    @ApiModelProperty("APP邀请任务规则详情（泰文）")
    private String inviteTaskRuleTh;

    @ApiModelProperty("操作人")
    @NotBlank(message = "操作人不能为空")
    private String operator;
}
