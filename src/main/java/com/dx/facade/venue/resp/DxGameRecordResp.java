package com.dx.facade.venue.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author broadway
 * @since 2023-06-06
 * 游戏注单
 */
@Data
public class DxGameRecordResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌局主键，自增")
    private Long handId;

    @ApiModelProperty("牌局code，业务生成")
    private String handCode;

    @ApiModelProperty("牌桌主键")
    private Long tableId;

    @ApiModelProperty("牌桌code")
    private String tableCode;

    @ApiModelProperty("牌桌名称")
    private String tableName;

    @ApiModelProperty("牌局时长")
    private Integer timeCount;

    @ApiModelProperty("场馆id")
    private Long venueId;

    @ApiModelProperty("场馆名称")
    private String venueName;

    @ApiModelProperty("场馆code")
    private String venueCode;

    @ApiModelProperty("场馆类型")
    private String venueType;

    @ApiModelProperty("手牌开始时间")
    private LocalDateTime handBeginTime;

    @ApiModelProperty("手牌结束时间")
    private LocalDateTime handEndTime;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

}
