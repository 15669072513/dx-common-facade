package com.dx.facade.other.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author ahead
 * @description 发送短信接口
 */

@Data
public class SMSReq implements Serializable {

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 区号
     */
    private String areaCode;


    /**
     * 模版类型
     * 1.短信验证码
     */
    private Integer templateType;


    /**
     * 类型为1
     * 消息内容
     */
    private String msgContent;

    /**
     * 变量值
     */
    private String variable;
}
