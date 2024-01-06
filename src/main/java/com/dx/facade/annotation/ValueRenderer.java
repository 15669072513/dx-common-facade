package com.dx.facade.annotation;

/**
 * 枚举转换类
 */
public interface ValueRenderer {
  Object render(Object value, Object data);
}
