package com.dx.facade.game.convert;

import com.dx.facade.annotation.ValueRenderer;
import java.util.Objects;

public class GameStatusRender implements ValueRenderer {

  @Override
  public Object render(Object value) {
    if (Objects.equals(value,0)) {
      return "已禁用";
    }
    else if (Objects.equals(value,1)) {
      return "开启中";
    }
    else if (Objects.equals(value,2)) {
      return "维护中";
    }
    return "";
  }
}
