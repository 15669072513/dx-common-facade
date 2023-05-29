package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 好友邀请-活动配置表
 * </p>
 */
@Data
public class ActivityInviteConfigRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("活动名称（中文）")
    private String nameZh;

    @ApiModelProperty("活动名称（英文）")
    private String nameEn;

    @ApiModelProperty("活动名称（越南文）")
    private String nameVi;

    @ApiModelProperty("活动名称（泰文）")
    private String nameTh;

    @ApiModelProperty("主活动状态: 0-关闭 1-开启")
    private Integer status;

    @ApiModelProperty("活动主标题（中文）")
    private String titleZh;

    @ApiModelProperty("活动主标题（英文）")
    private String titleEn;

    @ApiModelProperty("活动主标题（越南文）")
    private String titleVi;

    @ApiModelProperty("活动主标题（泰文）")
    private String titleTh;

    @ApiModelProperty("活动页路由地址")
    private String pageRouteAddr;

    @ApiModelProperty("展示设备 ConstantEnums.EnumClientDeviceType枚举（1-PC 2-IOS_APP 3-IOS_H5 4-Android_H5 5-Android_APP）")
    private String deviceType;

    @ApiModelProperty("参与活动对象 ActivityEnums.ActivityConfigInTypeUser枚举（1-所有用户 2-名单内用户 3-指定代理条线用户）")
    private Integer inTypeUser;

    @ApiModelProperty("时间类型 1-指定时间 2-永久")
    private Integer cycle;

    @ApiModelProperty("展示开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime showStartTime;

    @ApiModelProperty("展示终止时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime showEndTime;

    @ApiModelProperty("活动开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime activityStartTime;

    @ApiModelProperty("活动终止时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
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
    private Integer inviteRewardType;

    @ApiModelProperty("红利计算方式: 1-固定金额 2-比例金额")
    private Integer inviteRewardCountType;

    @ApiModelProperty("红利发送位置: 1-中心钱包 2-红利中心")
    private Integer inviteRewardSendPosition;

    @ApiModelProperty("被推荐人奖励标志：0-无奖励 1-有奖励")
    private Integer inviteRewardInviteesFlag;

    @ApiModelProperty("入口图片（中文）")
    private String enterPictureZh;

    @ApiModelProperty("入口图片（英文）")
    private String enterPictureEn;

    @ApiModelProperty("入口图片（越南文）")
    private String enterPictureVi;

    @ApiModelProperty("入口图片（泰文）")
    private String enterPictureTh;

    @ApiModelProperty("活动主图片（中文）")
    private String masterPictureZh;

    @ApiModelProperty("活动分享图片（中文）")
    private String sharePictureZh;

    @ApiModelProperty("活动主图片（英文）")
    private String masterPictureEn;

    @ApiModelProperty("活动分享图片（英文）")
    private String sharePictureEn;

    @ApiModelProperty("活动主图片（越南文）")
    private String masterPictureVi;

    @ApiModelProperty("活动分享图片（越南文）")
    private String sharePictureVi;

    @ApiModelProperty("活动主图片（泰文）")
    private String masterPictureTh;

    @ApiModelProperty("活动分享图片（泰文）")
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
    private String operator;

    @ApiModelProperty("创建时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "批量导入用户")
    private List<String> excelList;

    @ApiModelProperty(value = "邀请任务规则列表")
    private List<ActivityInviteTaskRuleRespDTO> inviteTaskRuleList;

}
