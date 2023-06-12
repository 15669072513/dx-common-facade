package com.dx.facade.member.enums;

import com.dx.exception.BizException;

/**
 * @author grayson
 */
public class UpdateClubAuditEnum {

    /**
     * 审核状态枚举
     * 0-待处理 1-处理中，2-审核通过，3-审核拒绝
     */
    public enum AuditStatus {
        待处理(0, "待处理", 1),
        处理中(1, "处理中", 1),
        审核拒绝(2, "审核拒绝", 0),
        审核通过(3, "审核通过", 0)
        ;
        private Integer code;
        private String desc;
        private Integer stepCode;

        AuditStatus(Integer code, String desc, Integer stepCode) {
            this.code = code;
            this.desc = desc;
            this.stepCode = stepCode;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public Integer stepCode() {
            return stepCode;
        }

        public static UpdateClubAuditEnum.AuditStatus getType(Integer code) throws BizException {
            for (UpdateClubAuditEnum.AuditStatus enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个AuditStatus");
        }
    }
}
