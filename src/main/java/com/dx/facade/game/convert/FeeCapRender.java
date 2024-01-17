package com.dx.facade.game.convert;

import com.dx.facade.annotation.ValueRenderer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

public class FeeCapRender implements ValueRenderer {

  @Override
  public Object render(Object value) {
    if(value == null) {
      return null;
    }
    String valStr = "";
    valStr = String.valueOf(value);
    String[] splitVal = valStr.split(",");
    List returnList = new ArrayList<String>();
    for (String s : splitVal) {
      if (Objects.equals(s, "-1")) {
        returnList.add("无上限");
      } else {
        returnList.add(s);
      }
    }
    return StringUtils.join(returnList.toArray(), ",");
  }
}
