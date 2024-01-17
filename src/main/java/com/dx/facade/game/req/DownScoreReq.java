package com.dx.facade.game.req;

import com.dx.facade.enums.RpcVersionEnums;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class DownScoreReq {
    private Long tableId;
    private Long userId;
    private BigDecimal amount;
    private String eventId;
    private Long eventTime;
    private BigDecimal freezeAmount;
    private Integer downScoreType;//下分类型
    //V1.5.X 局抽相关
    private Integer freezeType;
    private Integer rpcVersion = RpcVersionEnums.V1.code();//默认为1
}
