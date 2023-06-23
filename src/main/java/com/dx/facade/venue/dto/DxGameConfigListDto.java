package com.dx.facade.venue.dto;

import com.dx.facade.venue.resp.DxGameConfigListResp;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author broadway
 * @since 2023-06-05
 */
@Data
public class DxGameConfigListDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("游戏集合")
    private List<DxGameConfigListResp> gameConfigList;
}
