package com.dx.facade.texas.resp;

import com.dx.facade.common.utils.DateToLongSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author broadway
 * @since 2023-06-05
 */
@Data
public class DxHandDetailListResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键自增")
    private Long id;

    @ApiModelProperty("牌局id,牌局表主键")
    private String roundId;

    @ApiModelProperty("俱乐部主键")
    private Long clubId;

    @ApiModelProperty("牌局用户")
    private Long userId;

    @ApiModelProperty("牌局用户名称")
    private String userName;

    @ApiModelProperty("手牌信息")
    private String handInfo;

    @ApiModelProperty("总输赢")
    private BigDecimal totalWinLoss;

    @ApiModelProperty("创建时间")
    private Long createdAt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改时间")
    private Long updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("是否删除（0 未删除 1已删除）")
    private Integer deleteFlag;
}
