package com.dx.facade.auth.param;


import lombok.Data;

/**
 * @author sign
 */
@Data
public class BasePage {

    /**
     * 当前页
     */
    private long current = 1;

    /**
     * 每页显示条数，默认 10
     */
    private long size = 10;

}
