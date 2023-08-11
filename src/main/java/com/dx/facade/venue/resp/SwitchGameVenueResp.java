package com.dx.facade.venue.resp;

import com.dx.facade.venue.dto.GameVenueDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Rock
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SwitchGameVenueResp implements Serializable {

    @ApiModelProperty(value = "切换游戏数据列表")
    private List<GameVenueDTO> switchGameVenues;

}
