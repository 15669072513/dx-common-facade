package com.dx.facade.texas.resp;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author cutoff
 * @description 保险赔付记录
 * @date 2023/10/17 17:23:14
 */
@Data
public class InsureIsOursRecordResp implements Serializable {

    private static final long serialVersionUID = -7499056290434202508L;

    /**
     * 用户id
     */
    private Long userId;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 第几手牌
     */
    private Long roundNo;
    /**
     * 手牌圈层
     */
    private Integer roundCode;
    /**
     * 投保金额
     */
    private BigDecimal insuredAmount;
    /**
     * 赔付金额
     */
    private BigDecimal insuredRewards;

    /**
     * 购保时间
     */
    private Long insureTime;

}
