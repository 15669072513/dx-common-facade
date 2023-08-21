package com.dx.facade.account.change.param;

import io.swagger.annotations.ApiModel;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dealer
 * @description:
 * @date 2023/08/21
 * @copyright
 */
@Slf4j
@ApiModel(value="通用mq账变对象", description="通用mq账变对象")
public enum CmnAccountChangeMQParamType {

    MemberBillWalletChangeParmDTO(0, "OBQJ会员账变且计算流水"),
    MemberWalletChangeInZeroParmDTO(1, "会员账变对象(退还筹码为0)"),
    MemberWalletChangeParmDTO(2, "会员账变对象"),
    MultipleWalletChangeParmDTO(3, "同一事务下同一用户多次账变"),
    ProxyWalletChangeParmDTO(4, "代理账变对象"),
    ProxyBillWalletChangeParmDTO(5, "代理账变且计算流水(代理目前只有私庄业务才计流水)"),
    TransferWalletChangeParmDTO(6, "转账行为导致的账变对象(包含主动方和被动方)");

    public Integer code;
    public String desc;

    CmnAccountChangeMQParamType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code(){
        return this.code;
    }

    public String desc(){
        return this.desc;
    }

    static Map<Integer, CmnAccountChangeMQParamType> code2Enum = new HashMap<>();
    static {
        for (CmnAccountChangeMQParamType value : CmnAccountChangeMQParamType.values()) {
            code2Enum.put(value.code, value);
        }
    }

    static CmnAccountChangeMQParamType getByCode(Integer code){
        return code2Enum.get(code);
    }
}