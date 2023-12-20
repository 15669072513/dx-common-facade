package com.dx.facade.game.req;

import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *  游戏个人配置表请求Req
 * </p>
 *
 * @author streak
 * @since 2023-12-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DxPlayerConfigReq {

  @ApiModelProperty("会员Id")
  private Long userId;


  @ApiModelProperty("倍数加注选项列表")
  private List<String> multipleRaiseList;


  @ApiModelProperty("底池加注选项列表")
  private List<String> potRaiseList;
}
