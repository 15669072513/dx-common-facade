package com.dx.facade.game.convert;

import com.dx.facade.annotation.ValueRenderer;
import java.util.Objects;

public class GameTypeIdRender implements ValueRenderer {

  @Override
  public Object render(Object value) {
    if (Objects.equals(value,1)) {
      return "德州扑克";
    }
    else if (Objects.equals(value,2)) {
      return "短牌";
    }
    return value;
  }
}
