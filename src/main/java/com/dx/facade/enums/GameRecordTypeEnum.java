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
  DX_CLUB_ORDER(10,0,"俱乐部服务费",1),
  DX_INSURE_ORDER(20,0,"保险",2),
  DX_INCREMENT_ORDER(30,0,"增值",3),
  DX_SERVICE_CHARGE(1,10,"手牌服务费",1),
  DX_SERVICE_JUCHOU(2,10,"局服务费",2),
  DX_BRING_IN(3,10,"带入费",3),
  DX_JINDIAN_INSURE(4,20,"经典保险",1),
  DX_SEND_BARRAGE(5,30,"发弹幕",1),
  DX_SEND_EMOTE(6,30,"发表情",2),
  DX_SEND_PURASE(7,30,"发短语",3),
  DX_SEND_VOICE(8,30,"发语音",4),
  DX_LOOK_PUBLIC_CARD(9,30,"看公牌",5),
  DX_ACTION_DELAY(10,30,"行动延时",6),
  ;

  private int type;

  private int parentType;

  private  String desc;

  private int sortValue;

  //获取注单一级类型列表
  private  static Map<Integer,GameRecordTypeEnum> parentGameRecordTypeMap=new HashMap<>();


  //获取注单一级父类分组Map
  private  static Map<Integer, List<GameRecordTypeEnum>> gameRecordTypeGroupMap=new HashMap<>();

  static {
    //初始化所有的注单一级类型
    Arrays.stream(GameRecordTypeEnum.values())
        .filter(gameRecordTypeEnum -> gameRecordTypeEnum.parentType == 0)
        .forEach(parentGameRecordType -> {
          parentGameRecordTypeMap.put(parentGameRecordType.getType(), parentGameRecordType);
        });

    //初始化获取注单子分组Map
    gameRecordTypeGroupMap=  Arrays.stream(GameRecordTypeEnum.values())
        .sorted(Comparator.comparingInt(GameRecordTypeEnum::getSortValue))
        .collect(Collectors.groupingBy(GameRecordTypeEnum::getParentType, LinkedHashMap::new, Collectors.toList()));

  }

  GameRecordTypeEnum(int type, int parentType,String desc,int sortValue) {
    this.type = type;
    this.parentType = parentType;
    this.desc = desc;
    this.sortValue = sortValue;
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
}
