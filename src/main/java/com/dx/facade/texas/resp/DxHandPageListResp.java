package com.dx.facade.texas.resp;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;

/**
 * <p>
 * 牌局回顾手牌id分页列表List
 * </p>
 *
 * @author streak
 * @since 2024-01-13
 */
@Data
public class DxHandPageListResp implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty("手牌code")
  private String handCode;

  @ApiModelProperty("牌桌Id")
  private Long tableId;

  @ApiModelProperty("手牌号")
  private Integer handNum;

  @ApiModelProperty("1 进行中 2异常局 3已结束")
  private Integer handStatus;

}
