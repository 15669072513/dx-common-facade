package com.dx.facade.merchant.enums;

import com.dx.exception.BizException;

/**
 @title
 @desc
 @path
 @author timas
 @version 1.0.0
 @since 2022-10-04 16:14:56
*/
public class ConfigAnnouncementEnum {

    /**
     * 账号类型
     */
    public static enum AnnouncementAging {
        ALL(0, "全部"),
        SHORT_TIME(1, "限时"),
        LONG_TIME(2, "永久");

        public Integer code;
        public String desc;

        private AnnouncementAging(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static ConfigAnnouncementEnum.AnnouncementAging getType(Integer code) throws BizException {
            for (ConfigAnnouncementEnum.AnnouncementAging announcementAging : values()) {
                if (announcementAging.code.equals(code)) {
                    return announcementAging;
                }
            }
            throw new BizException("公告时效没有这个类型");
        }
    }
}
