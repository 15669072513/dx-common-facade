package com.dx.facade.venue.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.function.Supplier;

/**
 * @author Rock
 * @description 德州订单下拉框类型
 * @date 2024/1/23 11:51:23
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DzGameRecordType implements Serializable {

    private int type;

    private int parentType;

    /**
     * 1注单 2订单 3全部(都存在)
     */
    private int category;

    private String desc;

    private int sortValue;

    private boolean enable;
}
