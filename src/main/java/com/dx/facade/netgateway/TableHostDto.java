package com.dx.facade.netgateway;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TableHostDto {
    /**
     * 牌桌节点
     */
    private String tableHost;
    /**
     * "牌桌状态：0 未开始，1 进行中 2已结束"
     */
    private Integer status;
}
