package com.dx.facade.other.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @author ahead
 * @description 发送国内短信接口
 */
@Data
public class WeiwebsReq implements Serializable {

    private String mobile;
    private String msg;


}
