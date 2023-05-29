package com.dx.facade.account.change;

import com.dx.facade.account.change.param.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "name")
@JsonSubTypes({
        @JsonSubTypes.Type(value = MemberWalletChange.class, name = Constant.MEMBER),
        @JsonSubTypes.Type(value = ProxyWalletChange.class, name = Constant.PROXY)
})
public interface IWalletChange {

    IWalletType walletType();

    IBizType bizType();

    IChangeType changeType();

    IAppType appType();

    TransType transType();

    String getName();
}
