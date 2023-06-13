package com.dx.facade.venue.resp;

import lombok.Data;

@Data
public class TableCountResp {

    /***
     * 全部
     */
    private Integer allCount;

    /***
     * 德州
     */
    private Integer dzCount;

    /***
     * 短牌
     */
    private Integer dpCount;

}
