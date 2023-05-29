package com.dx.facade.account.param;

import com.dx.facade.account.resp.ActivityConfigScRuleRespDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 活动配置 入参
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="ActivityConfigParam对象", description="活动配置入参")
public class ActivityConfigParam implements Serializable {

    private static final long serialVersionUID = -4380148799288155261L;

    @ApiModelProperty(value = "活动ID")
    private Long id;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    @ApiModelProperty(value = "活动名称")
    @NotEmpty(message = "活动名称不能为空")
    private String name;

    @ApiModelProperty(value = "活动主标题")
    @NotEmpty(message = "活动主标题不能为空")
    private String title;

    @ApiModelProperty("中文活动主标题")
    private String cnTitle;

    @ApiModelProperty("越南语活动主标题")
    private String vieTitle;

    @ApiModelProperty("英语活动主标题")
    private String enTitle;

    @ApiModelProperty("泰语活动主标题")
    private String thTitle;

    @ApiModelProperty(value = "活动页签ID")
    @NotNull(message = "活动页签ID不能为空")
    private Long tagId;

    @ApiModelProperty(value = "活动页签名称")
    @NotEmpty(message = "活动页签名称不能为空")
    private String tagName;

    @ApiModelProperty(value = "活动模板 1-首存活动 4-纯展示页活动")
    @NotNull(message = "活动模板不能为空")
    private Integer activityType;

    @ApiModelProperty(value = "首存规则配置")
    private List<ActivityConfigScRuleRespDTO> scRuleList;

    @ApiModelProperty(value = "活动页路由地址")
    @NotEmpty(message = "活动页路由地址不能为空")
    private String pageRouteAddr;

    @ApiModelProperty(value = "展示设备 1-PC 2-IOS_APP 3-IOS_H5 4-Android_H5 5-Android_APP")
    @NotEmpty(message = "展示设备不能为空")
    private String deviceType;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换） 多种用,分隔")
    private String accountType;

    @ApiModelProperty(value = "参与活动对象 1-所有用户  2-名单内用户 3-指定代理条线用户")
    @NotNull(message = "参与活动对象不能为空")
    private Integer inTypeUser;

    @ApiModelProperty(value = "批量导入用户")
    private List<ActivityTemplateEasyExcel> excelList;

    @ApiModelProperty(value = "活动周期 1-指定时间 2-永久")
    @NotNull(message = "活动周期不能为空")
    private Integer cycle;

    @ApiModelProperty(value = "展示开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @NotNull(message = "展示开始时间不能为空")
    private LocalDateTime showStartTime;

    @ApiModelProperty(value = "展示终止时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime showEndTime;

    @ApiModelProperty(value = "活动开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @NotNull(message = "活动开始时间不能为空")
    private LocalDateTime activityStartTime;

    @ApiModelProperty(value = "活动终止时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime activityEndTime;

    @ApiModelProperty(value = "会员申请入口 0-不启用 1-启用")
    private Integer entranceEnable;

    @ApiModelProperty("中文按钮文字")
    private String entranceButton;

    @ApiModelProperty("越南文按钮文字")
    private String vieEntranceButton;

    @ApiModelProperty("英文按钮文字")
    private String enEntranceButton;

    @ApiModelProperty("泰文按钮文字")
    private String thEntranceButton;

    @ApiModelProperty("中文APP活动主图片")
    private String masterPicture;

    @ApiModelProperty("中文APP活动分享图片")
    private String sharePicture;

    @ApiModelProperty("中文App列表图片")
    private String listPicture;

    @ApiModelProperty("中文App列表图片角标")
    private String listPictureIcon;

    @ApiModelProperty("中文pc活动主图片")
    private String pcMasterPicture;

    @ApiModelProperty("中文pc列表图片")
    private String pcListPicture;

    @ApiModelProperty("中文pc分享图片")
    private String pcSharePicture;

    @ApiModelProperty("中文pc列表图片角标")
    private String pcListPictureIcon;

    @ApiModelProperty("越南文APP活动主图片")
    private String vieMasterPicture;

    @ApiModelProperty("越南文APP活动分享图片")
    private String vieSharePicture;

    @ApiModelProperty("越南文App列表图片")
    private String vieListPicture;

    @ApiModelProperty("越南文App列表图片角标")
    private String vieListPictureIcon;

    @ApiModelProperty("越南文pc活动主图片")
    private String viePcMasterPicture;

    @ApiModelProperty("越南文pc列表图片")
    private String viePcListPicture;

    @ApiModelProperty("越南文pc分享图片")
    private String viePcSharePicture;

    @ApiModelProperty("越南文pc列表图片角标")
    private String viePcListPictureIcon;

    @ApiModelProperty("英文APP活动主图片")
    private String enMasterPicture;

    @ApiModelProperty("英文APP活动分享图片")
    private String enSharePicture;

    @ApiModelProperty("英文App列表图片")
    private String enListPicture;

    @ApiModelProperty("英文App列表图片角标")
    private String enListPictureIcon;

    @ApiModelProperty("英文pc活动主图片")
    private String enPcMasterPicture;

    @ApiModelProperty("英文pc列表图片")
    private String enPcListPicture;

    @ApiModelProperty("英文pc分享图片")
    private String enPcSharePicture;

    @ApiModelProperty("英文pc列表图片角标")
    private String enPcListPictureIcon;

    @ApiModelProperty("泰文APP活动主图片")
    private String thMasterPicture;

    @ApiModelProperty("泰文APP活动分享图片")
    private String thSharePicture;

    @ApiModelProperty("泰文App列表图片")
    private String thListPicture;

    @ApiModelProperty("泰文App列表图片角标")
    private String thListPictureIcon;

    @ApiModelProperty("泰文pc活动主图片")
    private String thPcMasterPicture;

    @ApiModelProperty("泰文pc列表图片")
    private String thPcListPicture;

    @ApiModelProperty("泰文pc分享图片")
    private String thPcSharePicture;

    @ApiModelProperty("泰文pc列表图片角标")
    private String thPcListPictureIcon;

    @ApiModelProperty("中文APP端活动详情")
    private String cnActivityDoc;

    @ApiModelProperty("英文APP端活动详情")
    private String enActivityDoc;

    @ApiModelProperty("越南文APP端活动详情")
    private String viActivityDoc;

    @ApiModelProperty("泰国文APP端活动详情")
    private String thActivityDoc;

    @ApiModelProperty(value = "参与场馆列表，逗号隔开")
    private String venue;

    @ApiModelProperty(value = "申请模式 1-每场馆一次 2-每账号一次 3-每活动一次")
    private Integer applyType;

    @ApiModelProperty(value = "红利审核 0-否 1-是")
    private Integer bonusAudit;

    @ApiModelProperty(value = "vip等级id")
    private Long vipId;

    @ApiModelProperty(value = "vip等级序号")
    private String vipLevel;

    @ApiModelProperty(value = "赠送形式 1-比例金额 2-固定金额")
    private Integer giveType;

    @ApiModelProperty(value = "状态 0-停用, 1-启用")
    private Integer status;

    @ApiModelProperty(value = "操作人")
    @NotEmpty(message = "操作人不能为空")
    private String operator;

    @ApiModelProperty(value = "创建人")
    private String createdOperator;

}
