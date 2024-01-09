package com.dx.facade.game.convert;

import com.dx.facade.annotation.ValueRenderer;
import java.util.Objects;

public class GameTableStatusRender implements ValueRenderer {

  @Override
  public Object render(Object value) {
    if (Objects.equals(value,0)) {
      return "未开始";
    }
    else if (Objects.equals(value,1)) {
      return "进行中";
    }
    else if (Objects.equals(value,2)) {
      return "已结束";
    }
    return value;
  }
}
