package com.dx.facade.texas.dto;

import com.dx.facade.texas.resp.DxGameConfigListResp;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
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
