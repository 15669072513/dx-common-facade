package com.dx.facade.common;

import com.dx.util.Md5Util;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
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
        String salt = geneSalt(878597836592201781L,"zfour001");
        System.out.println("salt:"+salt);
        System.out.println("password:"+Md5Util.getMD5("abc123456"));
        //String newpassword = genePassword(salt, Md5Util.getMD5("abc1234567"));
        String newpassword = genePassword(salt, Md5Util.getMD5("abc123456"));
        System.out.println("password:"+newpassword);
        String storedPwd = "1A903170802F77DDEB394FD614DF94FA";
        System.out.println(newpassword.equals(storedPwd));
        
    }
}
