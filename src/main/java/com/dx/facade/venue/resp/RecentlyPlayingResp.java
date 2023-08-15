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

    @ApiModelProperty("状态(0已禁用,1开启中,2维护中)")
    private Integer venueStatus;
    @ApiModelProperty(value = "场馆类型zr:真人,ty:体育,cp:彩票,qp:棋牌,dj:电竞")
    private String venueTypeCode;

}
