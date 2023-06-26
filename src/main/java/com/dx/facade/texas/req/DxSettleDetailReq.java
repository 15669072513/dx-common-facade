package com.dx.facade.texas.req;

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
 * @since 2023-06-06
 */
@Data
public class DxSettleDetailReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌桌主键")
    private Long tableId;

    @ApiModelProperty("手牌ID")
    private Long handId;

    @ApiModelProperty("手牌code")
    private String handCode;

    @ApiModelProperty("会员账号")
    private Long userId;

    @ApiModelProperty("会员账号集合")
    private List<Long> userIds;

    @ApiModelProperty("会员名称")
    private String userName;

}
