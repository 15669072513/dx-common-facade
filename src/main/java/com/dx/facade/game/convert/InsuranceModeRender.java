package com.dx.facade.game.convert;

import com.dx.facade.annotation.ValueRenderer;

public class InsuranceModeRender implements ValueRenderer {

  @Override
  public Object render(Object value, Object data) {
    if (value instanceof String) {
      String flag = (String) value;
      if ("0".equals(flag)) {
        return "不开保险";
      }
      else if ("1".equals(flag)) {
        return "经典保险";
      }
      return "";
    }
    return value;
  }
}
