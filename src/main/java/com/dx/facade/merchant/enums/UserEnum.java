package com.dx.facade.merchant.enums;

import com.dx.exception.BizException;

/**
 @title
 @desc
 @path
 @author Gollum
 @version 1.0.0
 @since 2022-10-04 16:14:56
*/
public class UserEnum {

    /**
     * 账号类型
     */
    public static enum UserType {
        SUPERADMIN(0, "超级管理员","superadmin","ผู้ดูแลระบบระดับสูง","quản trị viên cấp cao"),
        MERCHANTADMIN(1, "商户管理员","Merchant Administrator","ผู้ดูแลร้านค้า","Quản trị viên người bán"),
        ADMIN(2, "管理员","Administrator","ผู้ดูแลระบบ","Quản trị viên"),
        STAFF(3, "职员","Staff","เจ้าหน้าที่","Nhân viên");

        public Integer code;
        public String desc;
        public String descEn;
        public String descTh;
        public String descVi;

        private UserType(Integer code, String desc, String descEn, String descTh, String descVi) {
            this.code = code;
            this.desc = desc;
            this.descEn = descEn;
            this.descTh = descTh;
            this.descVi = descVi;
        }

        public Integer code() {
            return code;
        }
	    public String desc() {
		    return desc;
	    }
        public String desc(String lang) {
        	String desc = desc();
        	switch (lang){
		        case "en_US":
			        desc = descEn;
			        break;
		        case "th_TH":
			        desc = descTh;
			        break;
		        case "vi_VN":
			        desc = descVi;
			        break;
		        default:
			        break;
	        }
	        return desc;
        }

        public static UserEnum.UserType getType(Integer code) throws BizException {
            for (UserEnum.UserType userType : values()) {
                if (userType.code.equals(code)) {
                    return userType;
                }
            }
            throw new BizException("账号类型没有这个类型");
        }
    }

    /**
     * 在职
     */
    public static enum Active {
        DISABLE(0, "已离职"),
        ENABLE(1, "在职");

        public Integer code;
        public String desc;

        private Active(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static UserEnum.Active getType(Integer code) throws BizException {
            for (UserEnum.Active active : values()) {
                if (active.code.equals(code)) {
                    return active;
                }
            }
            throw new BizException("在职状态没有这个类型");
        }
    }
}
