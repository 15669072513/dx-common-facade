package com.dx.facade.game.convert;

import com.dx.facade.annotation.ValueRenderer;
import java.util.Objects;

public class UniversalCloseOpenRender implements ValueRenderer {

  @Override
  public Object render(Object value) {
    if (Objects.equals(value,0)) {
      return "关闭";
    } else {
      return "开启";
    }
  }
}
