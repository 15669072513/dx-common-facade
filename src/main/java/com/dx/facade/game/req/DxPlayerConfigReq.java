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

  @ApiModelProperty("加注拉杆确认 0-关闭 1-开启")
  private Integer betPullSwitch;

  @ApiModelProperty("自动补码 0-关闭 1-开启")
  private Integer autoComplement;

  @ApiModelProperty("屏蔽互动道具 0-关闭 1-开启")
  private Integer interactiveItemsSwitch=0;

  @ApiModelProperty("不买保险 0-关闭 1-开启")
  private Integer notBuyInsuranceSwitch=0;

  @ApiModelProperty("不看保险 0-关闭 1-开启")
  private Integer notLookInsuranceSwitch=0;
}
