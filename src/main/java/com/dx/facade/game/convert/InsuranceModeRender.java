package com.dx.facade.game.convert;

import com.dx.facade.annotation.ValueRenderer;
import java.util.Objects;

public class InsuranceModeRender implements ValueRenderer {

  @Override
  public Object render(Object value) {
    if (Objects.equals(value,0)) {
      return "不开保险";
    }
    else if (Objects.equals(value,1)) {
      return "经典保险";
    }
    return value;
  }
}
