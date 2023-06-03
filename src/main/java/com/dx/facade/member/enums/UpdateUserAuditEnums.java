package com.dx.facade.member.enums;

import com.dx.exception.BizException;

/**
 * @author grayson
 */
public class UpdateUserAuditEnums {

    /**
     * 会员账户修改审核申请类型枚举
     */
    public enum MemberApplyType {
        姓名(1, "姓名", "name", "tên", "ชื่อ"),
        性别(2, "性别", "gender", "giới tính", "เพศ"),
        出生日期(3, "出生日期", "date of birth", "ngày sinh", "วันเกิด"),
        手机号码(4, "手机号码", "phone number", "Số điện thoại", "หมายเลขโทรศัพท์มือถือ"),
        邮箱(5, "邮箱", "email", "email", "อีเมล"),
        会员标签(6, "会员标签", "会员标签", "会员标签", "会员标签"),
        登录密码(7, "登录密码", "login password", "mật khẩu đăng nhập", "รหัสผ่านเข้าสู่ระบบ"),
        昵称(8, "昵称", "nickname", "tên", "ชื่อ"),
        ;
        public Integer code;
        public String desc;
        public String descEN;
        public String descVN;
        public String descTH;

        MemberApplyType(Integer code, String desc, String descEN, String descVN, String descTH) {
            this.code = code;
            this.desc = desc;
            this.descEN = descEN;
            this.descVN = descVN;
            this.descTH = descTH;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public String descEN() {
            return descEN;
        }

        public String descVN() {
            return descVN;
        }

        public String descTH() {
            return descTH;
        }

        public static UpdateUserAuditEnums.MemberApplyType getType(Integer code) throws BizException {
            for (UpdateUserAuditEnums.MemberApplyType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个MemberApplyType");
        }
    }

    /**
     * 代理账户修改审核申请类型枚举
     */
    public enum ProxyApplyType {
        重置支付密码(1, "重置支付密码"),
        重置登录密码(2, "重置登录密码"),
        ;
        private Integer code;
        private String desc;

        ProxyApplyType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static UpdateUserAuditEnums.ProxyApplyType getType(Integer code) throws BizException {
            for (UpdateUserAuditEnums.ProxyApplyType enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个ProxyApplyType");
        }
    }

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

        public static UpdateUserAuditEnums.AuditStatus getType(Integer code) throws BizException {
            for (UpdateUserAuditEnums.AuditStatus enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            throw new BizException("没有这个AuditStatus");
        }
    }
}
