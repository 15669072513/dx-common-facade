package com.dx.facade.account.singleWallet;

import java.math.BigDecimal;
import java.util.List;

public class TotalSingleWalletRespDTO {

    private BigDecimal balance;

    private List<SingleWalletRespDTO> singleWalletRespDTOList;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<SingleWalletRespDTO> getSingleWalletRespDTOList() {
        return singleWalletRespDTOList;
    }

    public void setSingleWalletRespDTOList(List<SingleWalletRespDTO> singleWalletRespDTOList) {
        this.singleWalletRespDTOList = singleWalletRespDTOList;
    }
}
