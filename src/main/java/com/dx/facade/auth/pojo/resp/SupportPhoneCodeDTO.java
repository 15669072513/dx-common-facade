package com.dx.facade.auth.pojo.resp;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 @title
 @desc
 @path
 @author Gollum
 @version 1.0.0
 @since 2022-10-15 14:04:41
*/
@Data
public class SupportPhoneCodeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String country;

    private String code;

    private String status;

    private List<Integer> len;

    private String currency;
}
