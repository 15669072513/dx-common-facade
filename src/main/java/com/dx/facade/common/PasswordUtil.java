package com.dx.facade.common;

import com.dx.util.Md5Util;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

@Slf4j
public class PasswordUtil {

    /**
     * 随机生成6位整数，短信验证码用
     * @return
     */
    public static final Integer MathSix(){
        return (int)((Math.random()*9+1)*100000);
    }

    public static String genePassword(String salt, String inputPwd) {
        if (StringUtils.isBlank(salt) || StringUtils.isBlank(inputPwd)) {
            log.error("生成密码参数salt:[{}]或inputPwd:[{}]为空.", StringUtils.isBlank(salt), StringUtils.isBlank(inputPwd));
            return null;
        }
        return Md5Util.getMD5(salt + inputPwd);
    }

    public static String geneSalt(Long agentId, String loginName) {
        if (Objects.isNull(agentId) || StringUtils.isBlank(loginName)) {
            log.error("生成盐值参数agentId:[{}]或loginName:[{}]为空.", Objects.isNull(agentId), StringUtils.isBlank(loginName));
            return null;
        }
        return Md5Util.getMD5(agentId + loginName).substring(0, 16);
    }

    public static boolean checkPassword(String inputPwd, String storedPwd, String salt) {

        if (StringUtils.isBlank(inputPwd) || StringUtils.isBlank(storedPwd) || StringUtils.isBlank(salt)) {
            log.error("校验密码参数 inputPwd:[{}], storedPwd:[{}], salt:[{}]", StringUtils.isBlank(inputPwd), StringUtils.isBlank(storedPwd), StringUtils.isBlank(salt));
            return false;
        }
        String newPassword = PasswordUtil.genePassword(salt, inputPwd);
        return storedPwd.equals(newPassword);
    }

    public static void main(String[] args) {
        String salt = geneSalt(861575567138054197L,"dxtest");
        System.out.println("salt:"+salt);
        String newpassword = genePassword(salt, "123456");
        System.out.println("password:"+newpassword);
        String storedPwd = "989797D3E9D7ACA30E8561B5F18D8AA9";
        System.out.println(newpassword.equals(storedPwd));

    }
}
