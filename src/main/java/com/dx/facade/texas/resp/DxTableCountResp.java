package com.dx.facade.texas.resp;

import lombok.Data;

@Data
public class DxTableCountResp {

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