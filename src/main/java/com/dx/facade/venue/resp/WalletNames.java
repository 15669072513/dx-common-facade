package com.dx.facade.venue.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class WalletNames {
    @ApiModelProperty("钱包名称(汉语)")
    private String zhName;

    @ApiModelProperty("钱包名称(越南语)")
    private String thName;

    @ApiModelProperty("钱包名称(泰语)")
    private String vnName;

    @ApiModelProperty("钱包名称(英语)")
    private String enName;
}
