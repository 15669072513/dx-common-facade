package com.dx.facade.game.convert;

import com.dx.facade.annotation.ValueRenderer;
import com.dx.facade.enums.TexasGameTypeEnum;

import java.util.Objects;

public class GameTypeCodeRender implements ValueRenderer {

  @Override
  public Object render(Object value) {
    if (Objects.equals(value, TexasGameTypeEnum.TEXAS.code())) {
      return "德州扑克";
    }
    else if (Objects.equals(value,TexasGameTypeEnum.SHORT_CARD.code())) {
      return "短牌";
    }
    return value;
  }
}
