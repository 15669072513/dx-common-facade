package com.dx.facade.venue.resp;

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
public class RecentlyPlaying implements Serializable {

    @ApiModelProperty(value = "最近在玩数据")
    private List<RecentlyPlayingResp> recentlyPlay;

}
