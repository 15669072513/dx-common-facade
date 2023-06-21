package com.dx.facade.common.utils;

import lombok.Builder;
import lombok.Data;

/**
 * @author joy
 * @date 2020/1/10 19:02
 */
@Data
@Builder
public class ResultJson {

    private String code;
    private String msg;
    private Object data;
}