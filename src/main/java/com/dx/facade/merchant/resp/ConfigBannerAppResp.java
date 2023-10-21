package com.dx.facade.merchant.resp;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 首页banner配置返回
 * </p>
 *
 * @author neko
 * @since 2021-06-08
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="ObConfigBanner对象APP", description="ObConfigBanner对象APP")
public class ConfigBannerAppResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "客户端类型[0:APP端,1:H5端,2:PC端]")
    private Integer clientType;

    @ApiModelProperty(value = "轮播图区域(1-注册送礼 2-首存优惠 3-VIP豪礼 4-天生赢家 5-下载APP 6-体育首存 7-棋牌首存 8-真人首存)")
    private Integer areaType;

    @ApiModelProperty(value = "轮播图名称")
    private String bannerName;

    @ApiModelProperty(value = "轮播图间隔")
    private String bannerIntervalTime;

    @ApiModelProperty(value = "轮播图时效[0:限时,1:永久]")
    private Integer bannerValidity;

    @ApiModelProperty(value = "上架时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime upTime;

    @ApiModelProperty(value = "下架时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime downTime;

    @ApiModelProperty(value = "是否跳转[0:否,1:是]")
    private Integer isLink;

    @ApiModelProperty(value = "跳转目标[0:B端,1:现金网内部,2:外部地址]")
    private Integer linkTarget;

    @ApiModelProperty(value = "跳转目标地址")
    private String targetUrl;

    @ApiModelProperty(value = "状态[0:已禁用,1:开启中]")
    private Integer bannerStatus;

    @ApiModelProperty("图片链接地址(中文)")
    private String pictureUrl;

    @ApiModelProperty("图片链接地址(英文)")
    private String pictureUrlEn;

    @ApiModelProperty("图片链接地址(泰语)")
    private String pictureUrlVn;

    @ApiModelProperty("图片链接地址(越南)")
    private String pictureUrlTh;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "创建时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "创建人")
    private String createdBy;

    @ApiModelProperty(value = "修改时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "修改人")
    private String updatedBy;

//    @ApiModelProperty(value = "商户编码Id")
//    private String merchantClientCode;
//
//    @ApiModelProperty(value = "商户名称")
//    private String merchantClientName;

    @ApiModelProperty("游戏id")
    private Long gameId;

    @ApiModelProperty("游戏名称")
    private String gameName;

    @ApiModelProperty("游戏code")
    private String gameCode;

    @ApiModelProperty("场馆类型()")
    private String venueType;

    @ApiModelProperty("baner类型(1:首页Banner(中控后台配置为app banner首页时使用),2:首页弹,3:游戏内工具栏,4:个人中心工具栏,5:首页Banner(pc使用),6:登录弹窗广告)")
    private Integer bannerType;

    @ApiModelProperty("baner类型名称")
    private String bannerTypeValue;

}
