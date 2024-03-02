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
    @Deprecated
    private BigDecimal freezeAmount;
    private Integer downScoreType;//下分类型
    //V1.5.X 局抽相关
    private Integer feeType;//手续费类型，目前只有局服务费
    private BigDecimal fee;//手续费
    private Integer rpcVersion = RpcVersionEnums.V1.getCode();//默认为1
    private Integer obDeviceType;
    private String ip;
}
