package com.dx.facade.member.constant;

public class RedisKey {

    public static String TOKEN_CLIENT_KEY = "AUTH:CLIENT:TOKEN";

    public static String TOKEN_BACKEND_KEY = "AUTH:BACKEND:TOKEN";

    public static String TOKEN_PROXY_KEY = "AUTH:PROXY:TOKEN";

    public static String AUTH_CLIENT_INFOS = "AUTH:CLIENT:LOGININFOS";

    public static String KAPTCHA_CLIENT_KEY = "AUTH:CLIENT:KAPTCHA";

    private static final String PROXY_LOGIN_LOCK_KEY = "AUTH:CLIENT:PROXY:LOGIN:LOCK";

    public static String GAME_ORDER_GAME_OVER_INFO = "GAME:ORDER:GAME:OVER:INFO";

    public static String getProxyLoginLockKey(Long proxyId) {
        return PROXY_LOGIN_LOCK_KEY + ":" + proxyId;
    }

    public static String genClientTokenKey(String clientType, Long userId) {
        return TOKEN_CLIENT_KEY + ":" + clientType + "_" + userId;
    }

    public static String genBackEndTokenKey(String type, Long userId) {
        return TOKEN_BACKEND_KEY + ":" + type + "_" + userId;
    }

    public static String genProxyTokenKey(String clientType, Long proxyId) {
        return TOKEN_PROXY_KEY + ":" + clientType + "_" + proxyId;
    }
}
