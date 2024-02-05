package com.dx.facade.game.convert;

import com.dx.facade.annotation.ValueRenderer;
import java.util.Objects;

public class TableFeeSwitchRender implements ValueRenderer {

  @Override
  public Object render(Object value) {
    if (Objects.equals(value,1)) {
      return "关闭";
    }if (Objects.equals(value,2)) {
      return "开启";
    } else {
      return "配置没开启";
    }
  }
}
