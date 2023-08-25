package com.dx.facade.texas.req;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
/**
 * <p>
 *  牌局回顾请求
 * </p>
 */
@Data
public class DxGameReviewListReq extends PageRequest implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 牌桌id
     */
    @ApiModelProperty("牌桌id")
    @NotNull(message = "牌桌id不能为空")
    private Long tableId;

    /** 手牌code */
    @ApiModelProperty("手牌code")
    private String handCode;
    /**
     * 局次（牌桌第多少局）
     */
    @ApiModelProperty("局次->进入默认第一局")
    private Integer roundNo;

}
