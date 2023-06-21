package com.dx.facade.enums;

import java.util.HashSet;
import java.util.Set;

public enum SeatTypeEnum {

    ORDINARY(0, "普通座位"),
    VILLAGE(1,"庄家"),
    BIGBLIND(2,"大盲座位"),
    SMALLBLIND(3,"小盲座位");

    private Integer id;
    private String description;

    SeatTypeEnum(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public static SeatTypeEnum getById(Integer id) {
        for (SeatTypeEnum gameTypeEnum : SeatTypeEnum.values()) {
            if (gameTypeEnum.id.equals(id)) {
                return gameTypeEnum;
            }
        }
        return null;
    }

    public static Set<Integer> getSeatTypeEnumSet() {
        Set<Integer> set = new HashSet<>();
        for (SeatTypeEnum gameTypeEnum : values()) {
            set.add(gameTypeEnum.getId().intValue());
        }
        return set;
    }
}
