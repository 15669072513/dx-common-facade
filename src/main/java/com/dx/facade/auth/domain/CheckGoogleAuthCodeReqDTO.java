package com.dx.facade.auth.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * <p>
 * 验证谷歌验证码请求DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-08-03
 */
@Data
public class CheckGoogleAuthCodeReqDTO implements Serializable {


	private static final long serialVersionUID = 1095128167158781403L;

	/** 商户id */
    private Long merchantId;


    /** 用户名 */
    private String userName;


    /** google验证码 */
    private String googleAuthCode;

}
