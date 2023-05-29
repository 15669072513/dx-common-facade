package com.dx.facade.venue.req;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class VenueEditReq {
    @ApiModelProperty("场馆id")
    @NotNull
    private Long venueId;

    @ApiModelProperty("钱包名称(汉语)")
    @NotBlank
    private String zhName;

    @ApiModelProperty("钱包名称(越南语)")
    private String thName;

    @ApiModelProperty("钱包名称(泰语)")
    private String vnName;

    @ApiModelProperty("钱包名称(英语)")
    private String enName;

    @ApiModelProperty("场馆图标(app,h5)")
    @NotBlank
    private String venueIconUrlApp;

    @ApiModelProperty("场馆图标(pc)")
    @NotBlank
    private String venueIconUrlPc;

    @ApiModelProperty("场馆切换图标(app,h5)")
    @NotBlank
    private String venueTransferIconUrlApp;

    @ApiModelProperty("场馆切换图标(pc)")
    @NotBlank
    private String venueTransferIconUrlPc;

    @ApiModelProperty("场馆钱包图标")
//    @NotBlank
    private String venueWalletIconUrl;

    @ApiModelProperty(value = "当前登录用户", hidden = true)
    private String currentUser;
}
