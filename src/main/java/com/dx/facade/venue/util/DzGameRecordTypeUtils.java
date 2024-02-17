package com.dx.facade.venue.util;

import com.dx.facade.enums.GameRecordTypeEnum;
import com.dx.facade.venue.dto.DzGameRecordType;
import com.dx.util.GsonUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rock
 * @description
 * @date 2024/1/23 11:54:06
 */
public class DzGameRecordTypeUtils {

    public static List<DzGameRecordType> parentOrderTypes() {
        List<DzGameRecordType> recordTypes = new ArrayList<>();
        Arrays.stream(GameRecordTypeEnum.values())
                .filter(gameRecordTypeEnum ->
                        (gameRecordTypeEnum.getCategory() == 2 || gameRecordTypeEnum.getCategory() == 3)
                        && gameRecordTypeEnum.isEnable())
                .forEach(orderType -> {
                    recordTypes.add(DzGameRecordType.builder()
                            .type(orderType.getType())
                            .parentType(orderType.getParentType())
                            .category(orderType.getCategory())
                            .desc(orderType.getDesc())
                            .enable(orderType.isEnable())
                            .sortValue(orderType.getSortValue())
                            .build());
                });
        return recordTypes;
    }


    public static void main(String[] args) {
        List<DzGameRecordType> types = DzGameRecordTypeUtils.parentOrderTypes();
        System.out.println(GsonUtil.getInstance().toJson(types));
    }

}
