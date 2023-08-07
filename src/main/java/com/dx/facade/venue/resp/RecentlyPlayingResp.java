package com.dx.facade.venue.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author Rock
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecentlyPlayingResp implements Serializable {

    @ApiModelProperty(value = "场馆名称")
    private String venueName;

    @ApiModelProperty(value = "场馆类型")
    private String venueCode;

}
