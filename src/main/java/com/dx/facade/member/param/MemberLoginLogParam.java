package com.dx.facade.member.param;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberLoginLogParam extends PageRequest {
    @ApiModelProperty(value = "日志ID")
    private Long logId;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "商户id", hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<Long> merchantIds;
    
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "会员账号")
    private String userName;

    @ApiModelProperty(value = "登录开始时间(20)",required = true)
    //@Pattern(regexp = MerchantConstant.REG_YYYY_MM_DD_HH_MM_SS, message = "时间格式不正确 示例：2021-05-05 00:00:00")
    private String loginStartTime;

    @ApiModelProperty(value = "登录结束时间(20)",required = true)
    //@Pattern(regexp = MerchantConstant.REG_YYYY_MM_DD_HH_MM_SS, message = "时间格式不正确 示例：2021-05-05 00:00:00")
    private String loginEndTime;
//
//    @ApiModelProperty("会员ID")
//    private String userId;
//
//    @ApiModelProperty("会员名称")
//    @Size(max =11,message = "输入大于11个字符")
//    private String userName;

    @ApiModelProperty("0会员1代理")
    private Integer dataType;

    @ApiModelProperty("账号类型 （1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private String accountType;

    @ApiModelProperty("登录状态（0-失败 1-成功）")
    private Integer loginStatus;

    @ApiModelProperty("登录IP")
    private String loginIp;

    @ApiModelProperty("IP归属地")
    private String ipAttribution;

    @ApiModelProperty("登录终端类型(1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP)")
    private List<Integer> deviceType;

    @ApiModelProperty("登录设备号")
    private String deviceNo;
    
    @ApiModelProperty("是否来自中控后台统计查询")
    private Boolean isQueryCount;
//
//    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
//    private Integer appId;
//
//    @ApiModelProperty(value = "登录站点:1：OB旗舰 2：美播真人")
//    private Integer loginAppId;
//
//    @ApiModelProperty("排序方式(1)：desc-降序 asc-升序")
//    private String orderType;
//
}
