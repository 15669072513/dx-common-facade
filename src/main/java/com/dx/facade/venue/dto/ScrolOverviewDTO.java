package com.dx.facade.venue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 滚动数据（场馆在线人数，桌台数量，赢钱滚动公告）
 * @author royal
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScrolOverviewDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("在线人数")
    private Integer onlineNumber;

    @ApiModelProperty("台桌数量")
    private Integer tableAmount;

    @ApiModelProperty("赢钱滚动公告")
    private List<String> winBulletin;

}
