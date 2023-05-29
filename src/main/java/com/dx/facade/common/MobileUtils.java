package com.dx.facade.common;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MobileUtils {

    /**
     * 单手机号码验证，内部拆分
     * @param phoneNumber
     * @return
     */
    public static Boolean checkCellPhoneNumber(String phoneNumber) {

        final String separater = "-";

        // 判断手机号码是否为空
        if(StringUtils.isBlank(phoneNumber)) {
            return false;
        }

        // 前置+号处理
        if(phoneNumber.startsWith("+")) {
            phoneNumber = phoneNumber.substring(1);
        }

        int separaterLocation = phoneNumber.indexOf(separater);

        // 不含分隔符或首位为分隔符都返回false
        if( separaterLocation<=0) {
            return false;
        }

        String zoneCode = phoneNumber.substring(0, separaterLocation);
        String mobile = phoneNumber.substring(separaterLocation+1);

        return MobileUtils.checkCellPhoneNumber(zoneCode, mobile);
    }

    /**
     * 检验手机号码
     * 中国大陆：当区号是 +86时，做基本的短信减耗检查，如果不是 1 开头的数字，且长度不是11位，报错提示为：请输入有效号码
     * 中国台湾 ：当区号是 +886时，做基本的短信减耗检查，如果不是 9 开头的数字，且长度不是9位，报错提示为：请输入有效号码
     * 香港特别行政区：当区号是 +852时，做基本的短信减耗检查，如果不是 4、5、6、7、8、9 开头的数字，且长度不是8位，报错提示为：请输入有效号码
     * 澳门特别行政区：当区号是 +853时，做基本的短信减耗检查，如果不是 6 开头的数字，且长度不是8位，报错提示为：请输入有效号码
     * 菲律宾：当区号是 +63时，做基本的短信减耗检查，如果不是 8、9 开头的数字，且长度不是10位，报错提示为：请输入有效号码
     * 泰国：当区号是 +66时，做基本的短信减耗检查，如果不是 0、6、8、9 开头的数字，且长度不是9或10位，报错提示为：请输入有效号码
     * 柬埔寨：当区号是 +855时，做基本的短信减耗检查，如果不是 1、3、6、7、8、9 开头的数字，且长度不是8 或9位，报错提示为：请输入有效号码
     * 阿拉伯联合酋长国：当区号是 +971时，做基本的短信减耗检查，如果不是 5 开头的数字，且长度不是10位，报错提示为：请输入有效号码
     * 马来西亚：当区号是 +60时，做基本的短信减耗检查，如果不是 1 开头的数字，且长度不是7至9位，报错提示为：请输入有效号码
     * 越南：当区号 +84时，做基本的短信减耗检查，如果不是3、5、7、8、9开头的数字，且长度不是长度9位，报错提示为：请输入有效号码
     * @param zoneCode 区域码
     * @param phoneNumber 手机号码
     * @return
     */
    public static Boolean checkCellPhoneNumber(final String zoneCode, final String phoneNumber) {

        /**
         * 区域码与手机号码不得为空
         */
        if(StringUtils.isAnyBlank(zoneCode, phoneNumber)) {
            return false;
        }

        Map<String, String> zoneMap = new HashMap<>();

        // 中国大陆：当区号是 +86时，做基本的短信减耗检查，如果不是 1 开头的数字，且长度不是11位，报错提示为：请输入有效号码
        zoneMap.put("86", "1\\d{10}");

//        // 中国台湾：当区号是 +886时，做基本的短信减耗检查，如果不是 9 开头的数字，且长度不是9位，报错提示为：请输入有效号码
//        zoneMap.put("886", "9\\d{8}");
//
//        // 香港特别行政区：当区号是 +852时，做基本的短信减耗检查，如果不是 4、5、6、7、8、9 开头的数字，且长度不是8位，报错提示为：请输入有效号码
//        zoneMap.put("852", "[4-9]\\d{7}");
//
//        // 澳门特别行政区：当区号是 +853时，做基本的短信减耗检查，如果不是 6 开头的数字，且长度不是8位，报错提示为：请输入有效号码
//        zoneMap.put("853", "[6]\\d{7}");
//
        // 菲律宾：当区号是 +63时，做基本的短信减耗检查，如果不是 8、9 开头的数字，且长度不是10位，报错提示为：请输入有效号码
        zoneMap.put("63", "[8|9]\\d{9}");

        // 泰国：当区号是 +66时，做基本的短信减耗检查，如果不是 0、6、8、9 开头的数字，且长度不是9位，报错提示为：请输入有效号码
        zoneMap.put("66", "[0|6|8|9]\\d{8}");

//        // 柬埔寨：当区号是 +855时，做基本的短信减耗检查，如果不是 1、3、6、7、8、9 开头的数字，且长度不是8 或9位，报错提示为：请输入有效号码
//        zoneMap.put("855", "[1|3|[6-9]]\\d{7,8}");
//
//        // 阿拉伯联合酋长国：当区号是 +971时，做基本的短信减耗检查，如果不是 5 开头的数字，且长度不是10位，报错提示为：请输入有效号码
//        zoneMap.put("971", "[5]\\d{9}");
//
//        // 马来西亚：当区号是 +60时，做基本的短信减耗检查，如果不是 1 开头的数字，且长度不是7至9位，报错提示为：请输入有效号码
//        zoneMap.put("60", "[1]\\d{6,8}");

        // 越南：当区号 +84时，做基本的短信减耗检查，如果不是3、5、7、8、9开头的数字，且长度不是长度9位，报错提示为：请输入有效号码
        zoneMap.put("84", "[3|5|7-9]\\d{8}");

        final String regx = zoneMap.get(zoneCode);

        // 判断Map中是否存在该区域号码，并判断是否匹配
        if(Objects.isNull(regx) || !phoneNumber.matches(regx) ) {
            return false;
        }
        //验证大陆号码(包网)正则
        if(zoneCode.equals(86)){
            String chinaRegx = "^(13[0-9]|14[579]|15[0-35-9]|16[6]|17[3568]|18[0-9]|19[1389])\\d{8}$";
            if(!phoneNumber.matches(chinaRegx)){
                return false;
            }
            //1340xxxxxx-1348xxxxxx
            if(phoneNumber.indexOf("134") == 0){
                String chinaRegx4 = "^(134[0-8])\\d{7}$";
                if(!phoneNumber.matches(chinaRegx4)){
                    return false;
                }
            }
        }
        //泰国手机号码
        if(zoneCode.equals(66)){
            String taiRegx = "^(6[1235]\\d{7}|80[0123456]\\d{6}|81[0-9]\\d{6}|8[2-9]\\d{7}|99[1-9]\\d{6})$";
            if(!phoneNumber.matches(taiRegx)){
                return false;
            }
        }
        //越南
        if(zoneCode.equals(84)){
            String yueRegx = "^(3[0-9]\\d{7}|5[0-9]\\d{7}|7[0-9]\\d{7}|8[1-8]\\d{7}|9[0-9]\\d{7})$";
            if(!phoneNumber.matches(yueRegx)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        checkCellPhoneNumber("+66-1234567890");

//        // 正确的手机号码
//        ArrayList<String> trueList = new ArrayList<>();
//
//        // 中国大陆
//        trueList.add("+86-13012345678");
//        // 中国台湾
//        trueList.add("+886-912345678");
//        // 香港特别行政区
//        trueList.add("+852-41234567");
//        trueList.add("+852-51234567");
//        trueList.add("+852-61234567");
//        trueList.add("+852-71234567");
//        trueList.add("+852-81234567");
//        trueList.add("+852-91234567");
//        // 澳门特别行政区
//        trueList.add("+853-61234567");
//        // 菲律宾
//        trueList.add("+63-8123456789");
//        trueList.add("+63-9123456789");
//        // 泰国
//        trueList.add("+66-012345678");
//        trueList.add("+66-612345678");
//        trueList.add("+66-812345678");
//        trueList.add("+66-912345678");
//        trueList.add("+66-0123456789");
//        trueList.add("+66-6123456789");
//        trueList.add("+66-8123456789");
//        trueList.add("+66-9123456789");
//        // 柬埔寨
//        trueList.add("+855-11234567");
//        trueList.add("+855-31234567");
//        trueList.add("+855-61234567");
//        trueList.add("+855-71234567");
//        trueList.add("+855-81234567");
//        trueList.add("+855-91234567");
//        trueList.add("+855-112345678");
//        trueList.add("+855-312345678");
//        trueList.add("+855-612345678");
//        trueList.add("+855-712345678");
//        trueList.add("+855-812345678");
//        trueList.add("+855-912345678");
//        // 阿拉伯联合酋长国
//        trueList.add("+971-5123456789");
//        // 马来西亚
//        trueList.add("+60-1123456");
//        trueList.add("+60-11234567");
//        trueList.add("+60-112345678");
//        // 越南
//        trueList.add("+84-312345678");
//        trueList.add("+84-512345678");
//        trueList.add("+84-712345678");
//        trueList.add("+84-812345678");
//        trueList.add("+84-912345678");
//
//        trueList.forEach(mobile->{
//            Assert.isTrue(MobileUtils.checkCellPhoneNumber(mobile), mobile +"不对呢！");
//        });
//
//        System.out.println("正确的通关~");
//
//        // 正确的手机号码
//        ArrayList<String> falseList = new ArrayList<>();
//
//        // 中国大陆
//        falseList.add("+86-23012345678");
//        falseList.add("+86-1301234567");
//        falseList.add("+86-130123456789");
//        // 中国台湾
//        falseList.add("+886-812345678");
//        falseList.add("+886-91234567");
//        falseList.add("+886-9123456789");
//        // 香港特别行政区
//        falseList.add("+852-31234567");
//        falseList.add("+852-01234567");
//        falseList.add("+852-6123456");
//        falseList.add("+852-712345678");
//        // 澳门特别行政区
//        falseList.add("+853-51234567");
//        falseList.add("+853-612345678");
//        falseList.add("+853-6123456");
//        // 菲律宾
//        falseList.add("+63-7123456789");
//        falseList.add("+63-0123456789");
//        falseList.add("+63-81234567890");
//        falseList.add("+63-812345678");
//        falseList.add("+63-91234567890");
//        falseList.add("+63-912345678");
//        // 泰国
//        falseList.add("+66-112345678");
//        falseList.add("+66-01234567");
//        falseList.add("+66-01234567890");
//        falseList.add("+66-61234567");
//        falseList.add("+66-61234567890");
//        falseList.add("+66-81234567");
//        falseList.add("+66-81234567890");
//        falseList.add("+66-91234567");
//        falseList.add("+66-91234567890");
//        // 柬埔寨
//        falseList.add("+855-01234567");
//        falseList.add("+855-21234567");
//        falseList.add("+855-4234567");
//        falseList.add("+855-51234567");
//        falseList.add("+855-8123456");
//        falseList.add("+855-9123456789");
//        // 阿拉伯联合酋长国
//        falseList.add("+971-4123456789");
//        falseList.add("+971-512345678");
//        falseList.add("+971-51234567890");
//        // 马来西亚
//        falseList.add("+60-2123456");
//        falseList.add("+60-112345");
//        falseList.add("+60-1123456789");
//        // 越南
//        falseList.add("+84-112345678");
//        falseList.add("+84-412345678");
//        falseList.add("+84-612345678");
//        falseList.add("+84-81234567");
//        falseList.add("+84-9123456789");
//
//        falseList.forEach(mobile->{
//            Assert.isFalse(MobileUtils.checkCellPhoneNumber(mobile), mobile +"不对呢！");
//        });
//
//        System.out.println("错误的通关~");
    }
}