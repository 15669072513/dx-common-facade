package com.dx.facade.enums;

public class EnumUtil {
    public static <T extends ICodeEnum> String getByCode(Integer code, Class<T> t) {
        for (T item : t.getEnumConstants()) {
            if (item.getCode().equals(code)) {
                return item.getMsg();
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.printf(getByCode(1,ObBetStatusEnum.class));
    }
}
