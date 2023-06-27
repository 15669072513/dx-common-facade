package com.dx.facade.texas.resp;

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
 */
@Data
public class DxSettleDetailResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键，自增")
    private Long id;

    @ApiModelProperty("牌桌主键")
    private Long tableId;

    @ApiModelProperty("手牌ID")
    private Long handId;

    @ApiModelProperty("手牌code")
    private String handCode;

    @ApiModelProperty("会员账号")
    private Long userId;

    @ApiModelProperty("会员名称")
    private String userName;

    @ApiModelProperty("开始时间")
    @TableField("begin_time")
    private Long beginTime;

    @ApiModelProperty("结束时间")
    private Long endTime;

    @ApiModelProperty("总输赢")
    private BigDecimal totalWinLoss;

    @ApiModelProperty("总带入")
    private Long totalBring;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("是否删除（0 未删除 1已删除）")
    private Integer deleteFlag;
}
