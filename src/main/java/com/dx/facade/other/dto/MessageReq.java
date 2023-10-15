package com.dx.facade.other.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @author ahead
 * @description 发送级测短信接口
 */
@Data
public class MessageReq implements Serializable {

    private String template_id;
    private Map<String,String> template_param;
    private String phone_numbers;


}
