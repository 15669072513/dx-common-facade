package com.dx.facade.venue.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import com.dx.facade.venue.dto.ConfigGamePO;

@Data
public class GameListResp extends ConfigGamePO {
    //新增的内容
    @ApiModelProperty("支持终端(1.PC,2.IOS_APP,3.IOS_H5,4.Android_H5,5.Android_APP)")
    private List<String> supportTerminalList = new ArrayList<>();
}
