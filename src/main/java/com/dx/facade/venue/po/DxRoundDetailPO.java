package com.dx.facade.venue.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author broadway
 * @since 2023-06-05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("dx_round_detail")
@ApiModel(value = "DxRoundDetailPO对象", description = "")
public class DxRoundDetailPO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键自增")
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @ApiModelProperty("牌局id,牌局表主键")
    @TableField("round_id")
    private String roundId;

    @ApiModelProperty("俱乐部主键")
    @TableField("club_id")
    private Long clubId;

    @ApiModelProperty("牌局用户")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("牌局用户名称")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty("手牌信息")
    @TableField("hand_info")
    private String handInfo;

    @ApiModelProperty("结算信息")
    @TableField("settle_info")
    private BigDecimal settleInfo;

    @ApiModelProperty("创建时间")
    @TableField("create_at")
    private LocalDateTime createdAt;

    @ApiModelProperty("创建人")
    @TableField("create_by")
    private String createdBy;

    @ApiModelProperty("修改时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;

    @ApiModelProperty("修改人")
    @TableField("updated_by")
    private String updatedBy;

    @ApiModelProperty("是否删除（0 未删除 1已删除）")
    @TableField("delete_flag")
    private Integer deleteFlag;
}
