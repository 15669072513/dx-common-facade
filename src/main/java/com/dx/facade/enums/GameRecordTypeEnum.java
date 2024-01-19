package com.dx.facade.enums;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 * 游戏注单类型枚举
 * </p>
 *
 * @author streak
 * @since 2024-01-16
 */
public enum GameRecordTypeEnum {
  DX_CLUB_ORDER(101,0,"俱乐部服务费",1,true),
  DX_INSURE_ORDER(102,0,"保险",2,true),
  DX_INCREMENT_ORDER(103,0,"增值",3,false),
  DX_SERVICE_CHARGE(1,101,"手牌服务费",1,true),
  DX_JINDIAN_INSURE(2,102,"经典保险",1,true),
  DX_SERVICE_JUCHOU(3,101,"局服务费",2,true),
  DX_BRING_IN(4,101,"带入费",3,false),
  DX_SEND_BARRAGE(5,103,"发弹幕",1,false),
  DX_SEND_EMOTE(6,103,"发表情",2,false),
  DX_SEND_PURASE(7,103,"发短语",3,false),
  DX_SEND_VOICE(8,103,"发语音",4,false),
  DX_LOOK_PUBLIC_CARD(9,103,"看公牌",5,false),
  DX_ACTION_DELAY(10,103,"行动延时",6,false),
  ;

  private int type;

  private int parentType;

  private  String desc;

  private int sortValue;

  private boolean enable;

  //获取注单一级类型列表
  public  static Map<Integer,GameRecordTypeEnum> parentGameRecordTypeMap=new HashMap<>();


  //获取注单一级父类分组Map
  public  static Map<Integer, List<GameRecordTypeEnum>> gameRecordTypeGroupMap=new HashMap<>();

  static {
    //初始化所有的注单一级类型
    Arrays.stream(GameRecordTypeEnum.values())
        .filter(gameRecordTypeEnum -> gameRecordTypeEnum.parentType == 0 && gameRecordTypeEnum.isEnable())
        .forEach(parentGameRecordType -> {
          parentGameRecordTypeMap.put(parentGameRecordType.getType(), parentGameRecordType);
        });

    //初始化获取注单子分组Map
    gameRecordTypeGroupMap=  Arrays.stream(GameRecordTypeEnum.values())
        .filter(gameRecordTypeEnum -> gameRecordTypeEnum.isEnable())
        .sorted(Comparator.comparingInt(GameRecordTypeEnum::getSortValue))
        .collect(Collectors.groupingBy(GameRecordTypeEnum::getParentType, LinkedHashMap::new, Collectors.toList()));

  }

  GameRecordTypeEnum(int type, int parentType,String desc,int sortValue,boolean enable) {
    this.type = type;
    this.parentType = parentType;
    this.desc = desc;
    this.sortValue = sortValue;
    this.enable = enable;
  }

  /**
   * @param parentType 注单子类型列表
   * @return
   */
  public static List<GameRecordTypeEnum> getSubGameRecordTypeList(int parentType) {
    return  gameRecordTypeGroupMap.get(parentType);
  }



  /**
   * @param type 注单类型
   * @return
   */
  public static GameRecordTypeEnum getByType(int type) {
    return Arrays.stream(GameRecordTypeEnum.values()).filter(s -> s.getType() == type).findAny()
        .orElse(null);
  }

  public int getType() {
    return type;
  }

  public int getParentType() {
    return parentType;
  }

  public String getDesc() {
    return desc;
  }

  public int getSortValue() {return sortValue;}

  public boolean isEnable() { return enable;}

  public static void main(String[] args) {
    System.out.println("注单一级类型列表:"+parentGameRecordTypeMap);

    System.out.println("注单一级父类分组Map:"+gameRecordTypeGroupMap);
  }
}
