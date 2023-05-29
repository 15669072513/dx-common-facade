package com.dx.facade.account.change.param;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "name")
@JsonSubTypes({
        @JsonSubTypes.Type(value = MemberWalletChangeParmDTO.class, name = Constant.MEMBER),
        @JsonSubTypes.Type(value = MemberBillWalletChangeParmDTO.class, name = Constant.MEMBERBILL),
        @JsonSubTypes.Type(value = ProxyWalletChangeParmDTO.class, name = Constant.PROXY),
        @JsonSubTypes.Type(value = ProxyBillWalletChangeParmDTO.class, name = Constant.PROXYBILL)
})
public interface IBWWalletChangeParm extends IWalletChangeParm {

    String getName();
}
