package com.dx.facade.texas.resp;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;


/**
 * <p>
 * 游戏个人信息备注
 * </p>
 * @author broadway
 * @since 2024-01-27
 */
@Data
public class DxGamePersonalRemarksResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键id")
    private Long id;

    @ApiModelProperty("个人用户id")
    private Long userId;

    @ApiModelProperty("设置备注的用户id")
    private Long remarkUserId;

    @ApiModelProperty("备注名")
    private String userNameRemark;

    @ApiModelProperty("备注信息")
    private String userRemark;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;
}
