package com.dx.facade.venue.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author Rock
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ConfigVenueDTO对象", description = "场馆表(如AG真人,OB体育)")
public class ConfigVenueDTO implements Serializable {


    @ApiModelProperty("主键")
    private Long venueId;

    @ApiModelProperty("场馆code(如by,ty,imsb,cq9)(见BwVenueEnum)")
    private String venueCode;

    @ApiModelProperty("场馆名(如ag真人,ob体育)")
    private String venueName;

    @ApiModelProperty("场馆英文名")
    private String venueEnName;

    @ApiModelProperty("场馆泰文名")
    private String venueThName;

    @ApiModelProperty("场馆越南名")
    private String venueVnName;

    @ApiModelProperty("场馆类型(如ty,zr,qkl)(见BwVenueTypeEnum)")
    private String venueType;

    @ApiModelProperty("场馆类型名称(如体育,真人,区块链)(见BwVenueTypeEnum)")
    private String venueTypeName;

    @ApiModelProperty("包含中越泰三种语言,json格式")
    private String walletNames;

    @ApiModelProperty("是否是ob系的(1是,0否)")
    private Integer isOb;

    @ApiModelProperty("状态(0已禁用,1开启中,2维护中)")
    private Integer status;

    @ApiModelProperty("备注(用于场馆接入配置页面)")
    private String remark;

    @ApiModelProperty("备注(用于场馆管理页面,当修改状态时,可能会输入)")
    private String changeStatusRemark;

    @ApiModelProperty("币种,逗号隔开(如CNY,THB)(见BwCurrencyEnum)")
    private String currencyTypes;

    @ApiModelProperty("支持语言,逗号隔开(如zh_CN,en_US,th_TH)(见BwCurrencyEnum)")
    private String languageTypes;

    @ApiModelProperty("场馆图标(app,h5)")
    private String venueIconUrlApp;

    @ApiModelProperty("场馆图标(pc)")
    private String venueIconUrlPc;

    @ApiModelProperty("场馆切换图标(app,h5)")
    private String venueTransferIconUrlApp;

    @ApiModelProperty("场馆切换图标(pc)")
    private String venueTransferIconUrlPc;

    @ApiModelProperty("场馆钱包图标")
    private String venueWalletIconUrl;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;

    @ApiModelProperty("修改人(用于场馆管理页面)")
    private String statusUpdatedBy;

    @ApiModelProperty("修改时间(用于场馆管理页面)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime statusUpdatedAt;
}
