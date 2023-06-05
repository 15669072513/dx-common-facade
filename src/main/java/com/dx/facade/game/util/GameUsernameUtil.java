package com.dx.facade.game.util;

import java.util.Objects;

import com.dx.facade.enums.BwEnvEnum;

public class GameUsernameUtil {

    /**
     * 获取会员在场馆注册的游戏名
     * @param envEnum 环境信息 dev test prerelease prod
     * @param merchantId 商户ID
     * @param memberName 用户注册的名会员名
     * @return 环境信息开头1位 + 商户号尾号4位 + 会员名  如 d4843Abc123456
     */
    public static String getPlayerName(BwEnvEnum envEnum, Long merchantId, String memberName) {
        if (Objects.isNull(envEnum) || Objects.isNull(merchantId)) {
            return memberName;
        }

        // if (BwEnvEnum.PROD.getId().equals(envEnum.getId())) {
        // return memberName;
        // } else {
        return envEnum.getName().substring(0, 1) + merchantId % 10000 + memberName;
            // }
    }

    public static Boolean verifyPlayerName(BwEnvEnum envEnum, Long merchantId, String playName) {
        if (Objects.isNull(envEnum) || Objects.isNull(merchantId)) {
            return false;
        }
//        if (BwEnvEnum.PROD.getId().equals(envEnum.getId())) {
//            return true;
//        } else {
            String prefix = envEnum.getName().substring(0, 1) + merchantId % 10000;
            return playName.indexOf(prefix) >= 0;
            // }
    }

}