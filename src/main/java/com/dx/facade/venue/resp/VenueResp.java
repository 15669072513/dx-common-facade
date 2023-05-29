package com.dx.facade.venue.resp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 场馆对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenueResp {
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

    @ApiModelProperty("场馆类型英文名称(见BwVenueTypeEnum)")
    private String venueTypeEnName;

    @ApiModelProperty("场馆类型泰国名(见BwVenueTypeEnum)")
    private String venueTypeThName;

    @ApiModelProperty("场馆类型越南名(见BwVenueTypeEnum)")
    private String venueTypeVnName;

    @ApiModelProperty("包含中越泰三种语言,json格式->会被转为一个钱包,前端直接用此字段即可")
    private String walletNames;

    @ApiModelProperty("是否是ob系的(1是,0否)")
    private Integer isOb;

    @ApiModelProperty("状态(0已禁用,1开启中,2维护中)")
    private Integer status;

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

}
