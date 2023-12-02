package com.dx.facade.constant;

import com.dx.exception.BizException;
import com.dx.facade.enums.ActivityEnums;

import java.util.Arrays;

/**
 * <p>
 * 轮播图区域 1-11区
 * </p>
 *
 * @author neko
 */
public class AppConfigCommonEnum {

  public AppConfigCommonEnum() {
  }

  /**
   * 配置类型[0:场馆图配置,1:闪屏页配置]
   */
  public enum ConfigType {
    VENUE(0, "场馆图配置"),
    LOADING(1, "闪屏页配置");

    public Integer value;
    public String desc;

    public String getDesc() {
      return desc;
    }

    public void setDesc(String desc) {
      this.desc = desc;
    }

    private ConfigType(Integer code, String desc) {
      this.value = code;
      this.desc = desc;
    }
  }

  public enum BwVenueTypeIdEnum {
    BY(1, "体育"),
    CP(2, "真人"),
    DJ(3, "电竞"),
    DY(4, "棋牌"),
    QP(5, "彩票"),
    TY(6, "捕鱼"),
    ZR(7, "电游"),
    QKL(8, "区块链");

    private Integer code;
    private String name;

    public Integer getCode() {
      return code;
    }

    public void setCode(Integer code) {
      this.code = code;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public static BwVenueTypeIdEnum getByCode(Integer code) {
      return Arrays.stream(values()).filter(item -> item.code.equals(code)).findAny().orElse(null);
    }


    private BwVenueTypeIdEnum(Integer code, String name) {
      this.code = code;
      this.name = name;
    }
  }


  /**
   * 显示终端[0:APP端,1:H5端,2:PC端]
   */
  public enum StartPageClientType {
    APP(0, "APP端"),
    H5(1, "H5端"),
    PC(2, "PC端");

    public Integer value;
    public String desc;

    public String getDesc() {
      return desc;
    }

    public void setDesc(String desc) {
      this.desc = desc;
    }

    private StartPageClientType(Integer code, String desc) {
      this.value = code;
      this.desc = desc;
    }
  }

  /**
   * 登录状态（0-失败 1-成功）
   */
  public enum LoginStatusType {
    FAIL(0, "失败"),
    SUCCESS(1, "成功");

    public Integer code;
    public String desc;

    public Integer code() {
      return this.code;
    }

    public String desc() {
      return this.desc;
    }

    private LoginStatusType(Integer code, String desc) {
      this.code = code;
      this.desc = desc;
    }
    public static AppConfigCommonEnum.LoginStatusType getType(Integer code) throws BizException {
      AppConfigCommonEnum.LoginStatusType[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
        AppConfigCommonEnum.LoginStatusType enums = var1[var3];
        if (enums.code.equals(code)) {
          return enums;
        }
      }

      throw new BizException("LoginStatusType not found");
    }
  }

  /**
   * 状态[0:已禁用,1:开启中]
   */
  public enum BannerStatusType {
    DISABLE(0, "已禁用"),
    ABLE(1, "开启");

    public Integer code;
    public String desc;

    public Integer code() {
      return this.code;
    }

    public String desc() {
      return this.desc;
    }

    private BannerStatusType(Integer code, String desc) {
      this.code = code;
      this.desc = desc;
    }
    public static AppConfigCommonEnum.BannerStatusType getType(Integer code) throws BizException {
      AppConfigCommonEnum.BannerStatusType[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
        AppConfigCommonEnum.BannerStatusType enums = var1[var3];
        if (enums.code.equals(code)) {
          return enums;
        }
      }

      throw new BizException("LoginStatusType not found");
    }
  }

  public enum BwVenueTypeShort {
    BY(1, "ty"),
    CP(2, "zr"),
    DJ(3, "dj"),
    DY(4, "qp"),
    QP(5, "cp"),
    TY(6, "by"),
    ZR(7,"dy"),
    QKL(8, "qkl");

    private Integer code;
    private String shortName;

    public Integer code() {
      return this.code;
    }
    public String shortName() {
      return this.shortName;
    }


    private BwVenueTypeShort(Integer code, String shortName) {
      this.code = code;
      this.shortName = shortName;
    }
    public static AppConfigCommonEnum.BwVenueTypeShort getType(Integer code) throws BizException {
      AppConfigCommonEnum.BwVenueTypeShort[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
        AppConfigCommonEnum.BwVenueTypeShort enums = var1[var3];
        if (enums.code.equals(code)) {
          return enums;
        }
      }

      throw new BizException("BwVenueTypeShort not found");
    }
  }

  public enum BwVenueCodeAndName {
    BY("ty","体育"),
    CP("zr","真人"),
    DJ("dj","电竞"),
    DY("qp","棋牌"),
    QP("cp","彩票"),
    DZ("dz","德州"),
    TY("by","捕鱼"),
    ZR("dy","电子"),
    QKL("qkl","区块链");

    private String code;
    private String codeName;

    public String code() {
      return this.code;
    }
    public String codeName() {
      return this.codeName;
    }


    private BwVenueCodeAndName(String code, String codeName) {
      this.code = code;
      this.codeName = codeName;
    }
    public static AppConfigCommonEnum.BwVenueCodeAndName getType(String code) throws BizException {
      AppConfigCommonEnum.BwVenueCodeAndName[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
        AppConfigCommonEnum.BwVenueCodeAndName enums = var1[var3];
        if (enums.code.equals(code)) {
          return enums;
        }
      }

      throw new BizException("BwVenueTypeShort not found");
    }
  }




}
