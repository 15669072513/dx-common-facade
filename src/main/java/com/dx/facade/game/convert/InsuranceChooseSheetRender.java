package com.dx.facade.game.convert;

import com.dx.facade.annotation.ValueRenderer;
import java.util.Objects;

public class InsuranceChooseSheetRender implements ValueRenderer {

  @Override
  public Object render(Object value) {
    if (Objects.equals(value,false)) {
      return "不选张";
    } else {
      return "选张";
    }
  }
}
