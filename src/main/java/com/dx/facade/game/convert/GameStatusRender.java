package com.dx.facade.game.convert;

import com.dx.facade.annotation.ValueRenderer;
import java.util.Objects;

public class GameStatusRender implements ValueRenderer {

  @Override
  public Object render(Object value, Object data) {
    if (value instanceof String) {
      Integer status = (Integer) value;
      if (Objects.equals(status,0)) {
        return "已禁用";
      }
      else if (Objects.equals(status,1)) {
        return "开启中";
      }
      else if (Objects.equals(status,2)) {
        return "维护中";
      }
      return "";
    }
    return value;
  }
}
