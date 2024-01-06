package com.dx.facade.game.convert;

import com.dx.facade.annotation.ValueRenderer;
import java.util.Objects;

public class GameTypeIdRender implements ValueRenderer {

  @Override
  public Object render(Object value, Object data) {
    if (value instanceof Long) {
      Long gameTypeId = (Long) value;
      if (Objects.equals(gameTypeId,1)) {
        return "德州扑克";
      }
      else if (Objects.equals(gameTypeId,2)) {
        return "短牌";
      }
      return "";
    }
    return value;
  }
}
