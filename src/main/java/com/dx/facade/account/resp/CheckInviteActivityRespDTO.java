package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author agan
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CheckInviteActivityRespDTO {

    @ApiModelProperty(value = "状态")
    private Integer inviteTaskStatus;

    @ApiModelProperty("展示设备 ConstantEnums.EnumClientDeviceType枚举（1-PC 2-IOS_APP 3-IOS_H5 4-Android_H5 5-Android_APP）")
    private String deviceType;

    @ApiModelProperty("入口图片（中文）")
    private String enterPictureZh;

    @ApiModelProperty("入口图片（英文）")
    private String enterPictureEn;

    @ApiModelProperty("入口图片（越南文）")
    private String enterPictureVi;

    @ApiModelProperty("入口图片（泰文）")
    private String enterPictureTh;

    @ApiModelProperty("PC入口图片（中文）")
    private String pcEnterPictureZh;

    @ApiModelProperty("PC入口图片（英文）")
    private String pcEnterPictureEn;

    @ApiModelProperty("PC入口图片（越南文）")
    private String pcEnterPictureVi;

    @ApiModelProperty("PC入口图片（泰文）")
    private String pcEnterPictureTh;
}
