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
  DX_CLUB_ORDER(101, 0, 3, "俱乐部服务费", 1, true),
  DX_INSURE_ORDER(102, 0, 1, "保险", 2, true),
  DX_INCREMENT_ORDER(103, 0, 3, "增值", 3, false),
  DX_SERVICE_CHARGE(1, 101, 1, "手牌服务费", 1, true),
  DX_JINDIAN_INSURE(2, 102, 1, "经典保险", 1, true),
  DX_SERVICE_JUCHOU(3, 101, 2, "局服务费", 2, true),
  DX_BRING_IN(4, 101, 2, "带入费", 3, false),
  DX_SEND_BARRAGE(5, 103, 2, "发弹幕", 1, false),
  DX_SEND_EMOTE(6, 103, 2, "发表情", 2, false),
  DX_SEND_PURASE(7, 103, 2, "发短语", 3, false),
  DX_SEND_VOICE(8, 103, 2, "发语音", 4, false),
  DX_LOOK_PUBLIC_CARD(9, 103, 2, "看公牌", 5, false),
  DX_ACTION_DELAY(10, 103, 2, "行动延时", 6, false),
  ;

    private int type;

    private int parentType;

    /**
     * 1注单 2订单 3全部(都存在)
     */
    private int category;

    private String desc;

    private int sortValue;

    private boolean enable;

    //获取注单一级类型列表
    public static Map<Integer, GameRecordTypeEnum> parentGameRecordTypeMap = new HashMap<>();


    //获取注单一级父类分组Map
    public static Map<Integer, List<GameRecordTypeEnum>> gameRecordTypeGroupMap;


    //获取订单一级类型列表
    public static Map<Integer, GameRecordTypeEnum> parentOrderTypeMap = new HashMap<>();


    //获取订单一级父类分组Map
    public static Map<Integer, List<GameRecordTypeEnum>> orderTypeGroupMap;

    static {
        //初始化所有的注单一级类型
        Arrays.stream(GameRecordTypeEnum.values())
                .filter(gameRecordTypeEnum -> gameRecordTypeEnum.parentType == 0
                        && (gameRecordTypeEnum.getCategory() == 1 || gameRecordTypeEnum.getCategory() == 3)
                        && gameRecordTypeEnum.isEnable())
                .forEach(parentGameRecordType -> {
                    parentGameRecordTypeMap.put(parentGameRecordType.getType(), parentGameRecordType);
                });

        //初始化所有的订单一级类型
        Arrays.stream(GameRecordTypeEnum.values())
                .filter(gameRecordTypeEnum -> gameRecordTypeEnum.parentType == 0
                        && (gameRecordTypeEnum.getCategory() == 2 || gameRecordTypeEnum.getCategory() == 3)
                        && gameRecordTypeEnum.isEnable())
                .forEach(parentOrderType -> {
                    parentOrderTypeMap.put(parentOrderType.getType(), parentOrderType);
                });

        //初始化获取注单子分组Map
        gameRecordTypeGroupMap = Arrays.stream(GameRecordTypeEnum.values())
                .filter(gameRecordTypeEnum -> gameRecordTypeEnum.isEnable()
                        && (gameRecordTypeEnum.getCategory() == 1 || gameRecordTypeEnum.getCategory() == 3))
                .sorted(Comparator.comparingInt(GameRecordTypeEnum::getSortValue))
                .collect(Collectors.groupingBy(GameRecordTypeEnum::getParentType, LinkedHashMap::new,
                        Collectors.toList()));

        //初始化获取订单子分组Map
        orderTypeGroupMap = Arrays.stream(GameRecordTypeEnum.values())
                .filter(gameRecordTypeEnum -> gameRecordTypeEnum.isEnable()
                        && (gameRecordTypeEnum.getCategory() == 2 || gameRecordTypeEnum.getCategory() == 3))
                .sorted(Comparator.comparingInt(GameRecordTypeEnum::getSortValue))
                .collect(Collectors.groupingBy(GameRecordTypeEnum::getParentType, LinkedHashMap::new,
                        Collectors.toList()));

    }

    GameRecordTypeEnum(int type, int parentType, int category, String desc, int sortValue,
                       boolean enable) {
        this.type = type;
        this.parentType = parentType;
        this.category = category;
        this.desc = desc;
        this.sortValue = sortValue;
        this.enable = enable;
    }

    /**
     * @param parentType 注单子类型列表
     * @return
     */
    public static List<GameRecordTypeEnum> getSubGameRecordTypeList(int parentType) {
        return gameRecordTypeGroupMap.get(parentType);
    }


    /**
     * @param parentType 订单子类型列表
     * @return
     */
    public static List<GameRecordTypeEnum> getSubOrderTypeList(int parentType) {
        return orderTypeGroupMap.get(parentType);
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

    public int getSortValue() {
        return sortValue;
    }

    public boolean isEnable() {
        return enable;
    }

    public int getCategory() {
        return category;
    }

    public static void main(String[] args) {
        System.out.println("注单一级类型列表:" + parentGameRecordTypeMap);

        System.out.println("注单一级父类分组Map:" + gameRecordTypeGroupMap);

        System.out.println("订单一级类型列表:" + parentOrderTypeMap);

    System.out.println("订单一级父类分组Map:" + orderTypeGroupMap);
  }
}
