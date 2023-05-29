package com.dx.facade.merchant.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * <p>
 * 查询banner列表入参
 * </p>
 *
 * @author neko
 * @since 2021-06-08
 */
@Data
@ApiModel(value="查询banner列表入参APP", description="查询banner列表入参APP")
public class BannerPageAppParam {

    @ApiModelProperty(value = "客户端类型[0:APP端,1:H5端,2:PC端]")
    //@NotNull(message = "客户端类型不能为空")
    @Max(value = 2,message = "客户端类型不能大于2")
    @Min(value = 0,message = "客户端类型不能小于0")
    private Integer clientType;

    @ApiModelProperty(value = "商户编码Id")
    //@NotNull(message = "商户编码Id不能为空")
    private Long merchantClientId;

//    @ApiModelProperty(value = "商户id", hidden = true)
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private List<Long> merchantIds;

    @Max(value = 8,message = "轮播图区域不能大于10")
    @Min(value = 1,message = "轮播图区域不能小于0")
    @ApiModelProperty(value = "轮播图区域(1-注册送礼 2-首存优惠 3-VIP豪礼 4-天生赢家 5-下载APP 6-体育首存 7-棋牌首存 8-真人首存)")
    private Integer areaType;

    @Size(min = 0,max = 20,message = "轮播图名称长度不能大于20")
    @ApiModelProperty(value = "轮播图名称")
    private String bannerName;

//    @Max(value = 1,message = "轮播图时效不能大于1")
//    @Min(value = 0,message = "轮播图时效不能小于0")
//    @ApiModelProperty(value = "轮播图时效[0:限时,1:永久]")
//    private Integer bannerValidity;

//    @Max(value = 1,message = "是否跳转不能大于1")
//    @Min(value = 0,message = "是否跳转不能小于0")
//    @ApiModelProperty(value = "是否跳转[0:否,1:是]")
//    private Integer isLink;

//    @Max(value = 3,message = "跳转目标不能大于3")
//    @Min(value = 0,message = "跳转目标不能小于0")
//    @ApiModelProperty(value = "跳转目标[跳转目标[0:游戏,1:内部,2:外部地址,3:-]]")
//    private Integer linkTarget;

    @Max(value = 1,message = "状态不能大于1")
    @Min(value = 0,message = "状态不能小于0")
    @ApiModelProperty(value = "状态[0:已禁用,1:开启中]")
    private Integer bannerStatus;

//    @ApiModelProperty(value = "操作人类型(1--创建人 2--最后操作人)")
//    private Integer operateType;
//
//    @Size(min = 0,max = 20,message = "操作人长度不能大于20")
//    @ApiModelProperty(value = "操作人名称")
//    private String operateTypeName;

    @ApiModelProperty(value = "场馆类型1-ty体育 2-zr真人 3-cp彩票 4-qp棋牌 5-dj电竞 6-dy电游 7-by捕鱼 8-区块链")
    private Integer venueId;

//    @Size(min = 0,max = 20,message = "创建人长度不能大于15")
//    @ApiModelProperty(value = "创建人")
//    private String createdBy;
//
//    @Size(min = 0,max = 15,message = "修改人长度不能大于15")
//    @ApiModelProperty(value = "修改人")
//    private String updatedBy;
//
//    @ApiModelProperty(value = "状态[0:默认,1:商户]")
//    private Integer type;

//    @ApiModelProperty(value = "商户编码Id")
//    private String merchantClientCode;
//
//    @ApiModelProperty(value = "商户名称")
//    private String merchantClientName;

    /**
     * created_at,updated_at,up_time,down_time
     */
//    @ApiModelProperty(value = "排序列:0-轮播图上架时间 1-轮播图下架时间 2-创建时间 3-最近操作时间")
//    private Integer orderKey;
//
//    @ApiModelProperty(value = "排序方式:desc-降序 asc-升序")
//    private String orderType;
}
