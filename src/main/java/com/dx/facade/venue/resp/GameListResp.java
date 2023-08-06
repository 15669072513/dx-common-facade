package com.dx.facade.venue.resp;

import com.dx.facade.venue.dto.ConfigVenueDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GameListResp extends ConfigVenueDTO {
    //新增的内容
    @ApiModelProperty("支持终端(1.PC,2.IOS_APP,3.IOS_H5,4.Android_H5,5.Android_APP)")
    private List<String> supportTerminalList = new ArrayList<>();
}
