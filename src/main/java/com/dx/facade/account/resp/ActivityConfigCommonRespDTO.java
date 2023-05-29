package com.dx.facade.account.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author agan
 */
@Data
public class ActivityConfigCommonRespDTO {

    @ApiModelProperty(value = "主键")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "场馆code")
    private String gameCode;

    @ApiModelProperty(value = "场馆类型")
    private String gameType;

    @ApiModelProperty(value = "场馆名称")
    private String gameName;

    @ApiModelProperty(value = "无效赔率 [{handicap:欧洲盘,minOdds:1.01},{handicap:香港盘,minOdds:0.01}]")
    private List<HandicapOdds> handicapOdds;

    @ApiModelProperty(value = "状态/开关，0=否/停用，1=是/启用")
    private Integer status;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "创建时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "更新时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;

}
