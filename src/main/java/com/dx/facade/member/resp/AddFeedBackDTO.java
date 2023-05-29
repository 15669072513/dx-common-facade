package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * 意见反馈控请求参数
 *
 * @author sid
 * @version 1.0.0
 * @date 2021/5/21
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddFeedBackDTO {
    @ApiModelProperty(value = "商户ID", example = "588326785867908888")
    @NotNull(message = "商户ID不能为空")
    private Long merchantId;

    @ApiModelProperty(value = "问题类型(0:存款问题,1-取款问题,2-游戏问题,3-优惠问题,4-网站/app登录,5-修改资料,6-流水问题,7-其他)", example = "0")
    private Integer problemType;

    @ApiModelProperty(value = "问题描述", example = "zhang")
    private String problemDescribe;

    @ApiModelProperty(value = "用户ID", example = "588326785867908888")
    @NotNull(message = "用户ID不能为空")
    private Long userId;

    @ApiModelProperty(value = "会员账号", example = "zhang")
    @NotNull(message = "会员账号不能为空")
    private String userName;

    @ApiModelProperty(value = "会员类型（1-试玩，2-商务，3-正式，4-测试，5-置换）", example = "0")
    private Integer accountType;

    @ApiModelProperty(value = "终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP）", example = "0")
    private Integer deviceType;

    @ApiModelProperty(value = "终端设备号", example = "APP")
    private String deviceNo;

    @ApiModelProperty(value = "终端类型信息", example = "A01")
    private String deviceTypeInfo;

    @ApiModelProperty(value = "上传地址", example = "http://aliyun/01")
    private String url;
}
