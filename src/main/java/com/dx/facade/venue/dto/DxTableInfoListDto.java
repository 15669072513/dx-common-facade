package com.dx.facade.venue.dto;

import com.dx.facade.venue.resp.DxTableInfoListResp;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author dereck
 * @since 2022-10-13
 */
@Data
public class DxTableInfoListDto implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty("总牌桌抽水")
    private BigDecimal pumpAmountSum;

    @ApiModelProperty("总牌桌费用")
    private BigDecimal costSum;

    @ApiModelProperty("牌桌集合")
    private List<DxTableInfoListResp> tableInfoListRespList;

}
