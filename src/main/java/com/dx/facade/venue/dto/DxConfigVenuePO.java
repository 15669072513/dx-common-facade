package com.dx.facade.venue.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
 * 场馆表(如AG真人,OB体育)
 * @author rudolf
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("dx_config_venue")
@ApiModel(value = "ConfigVenuePO对象", description = "场馆表(如AG真人,OB体育)")
public class DxConfigVenuePO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "venue_id", type = IdType.INPUT)
    private Long venueId;

    @ApiModelProperty("场馆code(如by,ty,imsb,cq9)(见BwVenueEnum)")
    @TableField("venue_code")
    private String venueCode;

    @ApiModelProperty("场馆名(如ag真人,ob体育)")
    @TableField("venue_name")
    private String venueName;

    @ApiModelProperty("场馆英文名")
    @TableField("venue_en_name")
    private String venueEnName;

    @ApiModelProperty("场馆泰文名")
    @TableField("venue_th_name")
    private String venueThName;

    @ApiModelProperty("场馆越南名")
    @TableField("venue_vn_name")
    private String venueVnName;

    @ApiModelProperty("场馆类型(如ty,zr,qkl)(见BwVenueTypeEnum)")
    @TableField("venue_type")
    private String venueType;

    @ApiModelProperty("场馆类型名称(如体育,真人,区块链)(见BwVenueTypeEnum)")
    @TableField("venue_type_name")
    private String venueTypeName;

    @ApiModelProperty("包含中越泰三种语言,json格式")
    @TableField("wallet_names")
    private String walletNames;

    @ApiModelProperty("是否是ob系的(1是,0否)")
    @TableField("is_ob")
    private Integer isOb;

    @ApiModelProperty("状态(0已禁用,1开启中,2维护中)")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("备注(用于场馆接入配置页面)")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("备注(用于场馆管理页面,当修改状态时,可能会输入)")
    @TableField("change_status_remark")
    private String changeStatusRemark;

    @ApiModelProperty("币种,逗号隔开(如CNY,THB)(见BwCurrencyEnum)")
    @TableField("currency_types")
    private String currencyTypes;

    @ApiModelProperty("支持语言,逗号隔开(如zh_CN,en_US,th_TH)(见BwCurrencyEnum)")
    @TableField("language_types")
    private String languageTypes;

    @ApiModelProperty("场馆图标(app,h5)")
    @TableField("venue_icon_url_app")
    private String venueIconUrlApp;

    @ApiModelProperty("场馆图标(pc)")
    @TableField("venue_icon_url_pc")
    private String venueIconUrlPc;

    @ApiModelProperty("场馆切换图标(app,h5)")
    @TableField("venue_transfer_icon_url_app")
    private String venueTransferIconUrlApp;

    @ApiModelProperty("场馆切换图标(pc)")
    @TableField("venue_transfer_icon_url_pc")
    private String venueTransferIconUrlPc;

    @ApiModelProperty("场馆钱包图标")
    @TableField("venue_wallet_icon_url")
    private String venueWalletIconUrl;

    @ApiModelProperty("创建人")
    @TableField("created_by")
    private String createdBy;

    @ApiModelProperty("创建时间")
    @TableField("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @ApiModelProperty("修改人")
    @TableField("updated_by")
    private String updatedBy;

    @ApiModelProperty("修改时间")
    @TableField("updated_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;

    @ApiModelProperty("修改人(用于场馆管理页面)")
    @TableField("status_updated_by")
    private String statusUpdatedBy;

    @ApiModelProperty("修改时间(用于场馆管理页面)")
    @TableField("status_updated_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime statusUpdatedAt;
}
