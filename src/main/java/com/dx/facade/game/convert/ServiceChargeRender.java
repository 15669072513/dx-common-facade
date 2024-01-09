package com.dx.facade.game.convert;

import com.dx.facade.annotation.ValueRenderer;
import java.util.Objects;

public class ServiceChargeRender implements ValueRenderer {

  @Override
  public Object render(Object value) {
    if (Objects.equals(value,0)) {
      return "关闭";
    } else if (Objects.equals(value,1)) {
      return "按底池比例";
    } else if (Objects.equals(value,2)) {
      return "按盈利比例";
    } else if (Objects.equals(value,3)) {
      return "都选择";
    }
    return value;
  }
}
