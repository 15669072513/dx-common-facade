package com.dx.facade.member.constant;

public class RedisKey {

    public static String TOKEN_CLIENT_KEY = "AUTH:CLIENT:TOKEN";

    public static String TOKEN_BACKEND_KEY = "AUTH:BACKEND:TOKEN";

    public static String TOKEN_PROXY_KEY = "AUTH:PROXY:TOKEN";

    public static String AUTH_CLIENT_INFOS = "AUTH:CLIENT:LOGININFOS";

    public static String KAPTCHA_CLIENT_KEY = "AUTH:CLIENT:KAPTCHA";

    private static final String PROXY_LOGIN_LOCK_KEY = "AUTH:CLIENT:PROXY:LOGIN:LOCK";

    public static String GAME_ORDER_RECORD = "GAME:ORDER:RECORD:";

    public static String GAME_RECORD_DETAIL_LIST = "GAME:ORDER:RECORD:DETAIL:LIST:";
    public static String GAME_RECORD_DETAIL_SUMMARY = "GAME:ORDER:RECORD:DETAIL:SUMMARY:";

    public static String getGameRecordDetailSummaryKey(Long tableId) {
        return GAME_RECORD_DETAIL_SUMMARY.concat(String.valueOf(tableId));
    }

    public static String getGameRecordDetailListKey(Long tableId) {
        return GAME_RECORD_DETAIL_LIST.concat(String.valueOf(tableId));
    }

    public static String getMaxRoundNoKey(Long tableId) {
        return GAME_ORDER_RECORD.concat(String.valueOf(tableId));
    }

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
