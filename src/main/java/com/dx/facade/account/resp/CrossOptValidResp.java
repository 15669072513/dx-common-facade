package com.dx.facade.account.resp;

import com.dx.facade.member.resp.MemberInfoRespDTO;
import com.dx.facade.member.resp.ProxyInfoRespDTO;
import com.dx.util.JacksonUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CrossOptValidResp {

    /**
     * 操作人代理信息
     */
    private ProxyInfoRespDTO operatorProxy;

    /**
     * 被操作人代理信息
     */
    private ProxyInfoRespDTO targetProxy;

    /**
     * 被操作人会员信息
     */
    private MemberInfoRespDTO targetMember;

    /**
     * 被操作人的总代信息
     */
    private ProxyInfoRespDTO topProxy;

    /**
     * 目标操作用户是否是代理。
     */
    private Boolean agentBeOperated;

    public Integer userMode() {
        return agentBeOperated ? targetProxy.getBusinessModel() : targetMember.getBusinessModel();
    }

    public String userType() {
        return agentBeOperated ? "代理" : "会员";
    }

    public String userName() {
        return agentBeOperated ? targetProxy.getUserName() : targetMember.getUserName();
    }

    public String userBizStr() {
        return agentBeOperated ? JacksonUtil.writeValue(targetProxy) : JacksonUtil.writeValue(targetMember);
    }
}
