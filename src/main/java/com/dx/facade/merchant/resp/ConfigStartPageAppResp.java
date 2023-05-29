package com.dx.facade.merchant.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 启动页/loading配置
 * </p>
 *
 * @author neko
 * @since 2021-06-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ConfigStartPage对象", description="启动页/loading配置")
public class ConfigStartPageAppResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "显示终端[0:APP端,1:H5端,2:PC端]")
    private Integer clientType;

    @ApiModelProperty(value = "启动页(场馆)名称")
    private String pageName;

    @ApiModelProperty("场馆类型id1-ty体育 2-zr真人 3-cp彩票 4-qp棋牌 5-dj电竞 6-dy电游 7-by捕鱼 8-区块链")
    private Integer venueId;

    @ApiModelProperty("场馆类型code(ty,zr,cp,qp,dj,dy,by,qkl)")
    private String venueCode;

    @ApiModelProperty("场馆类型名称(体育,真人,彩票,棋牌,电竞,电游,,捕鱼,区块链)")
    private String venueName;

    @ApiModelProperty(value = "是否预加载[0:否,1:是]")
    private Integer loadStatus;

    @ApiModelProperty(value = "状态[0:已禁用,1:开启中]")
    private Integer pageStatus;

    @ApiModelProperty(value = "图片地址")
    private String pictureUrl;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "配置类型[0:场馆图配置,1:闪屏页配置]")
    private Integer configType;

    @ApiModelProperty(value = "创建时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "创建人")
    private String createdBy;

    @ApiModelProperty(value = "修改时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "修改人")
    private String updatedBy;


}
