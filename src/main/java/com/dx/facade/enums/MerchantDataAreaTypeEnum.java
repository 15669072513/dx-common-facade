package com.dx.facade.enums;


import lombok.Getter;

/**
 * <p>
 * 轮播图区域 1-11区
 * </p>
 *
 * @author neko
 */
@Getter
public enum MerchantDataAreaTypeEnum {
   FULL(1, "全部，包含自身及子孙节点"),
   SELF(0, "只有自身,不包含子孙节点");

  private final int code;
  private final String desc;

  MerchantDataAreaTypeEnum(final int value, final String desc) {
    this.code = value;
    this.desc = desc;
  }
}
