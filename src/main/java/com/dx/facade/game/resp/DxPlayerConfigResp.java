package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *  游戏个人配置表响应
 * </p>
 *
 * @author streak
 * @since 2023-12-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DxPlayerConfigResp implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty("会员Id")
  private Long userId;


  @ApiModelProperty("倍数加注List")
  private List<String> multipleRaiseList;

  @ApiModelProperty("底池加注List")
  private List<String> potRaiseList;

}
