package com.dx.facade.proxy.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MaterialImageRecordRespDTO {
    /**
     * ID
     * */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商户id
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    /**
     * 图片类型（ 1-综合推广图 2-体育推广图 3-真人推广图 4-电竞推广图 5-彩票推广图 6-棋牌推广图 7-活动推广图）
     */
    @ApiModelProperty(value = "图片类型（ 1-综合推广图 2-体育推广图 3-真人推广图 4-电竞推广图 5-彩票推广图 6-棋牌推广图 7-活动推广图）")
    private Integer imageType;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    private Integer displayOrder;

    /**
     * 图片名称
     */
    @ApiModelProperty(value = "图片名称")
    private String imageName;

    /**
     * 图片尺寸
     */
    @ApiModelProperty(value = "图片尺寸")
    private String imageSize;

    /**
     * 图片地址
     */
    @ApiModelProperty(value = "图片地址")
    private String imageAddress;
}
