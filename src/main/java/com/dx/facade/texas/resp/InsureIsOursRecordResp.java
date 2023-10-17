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
     * 昵称
     */
    private String nickName;
    /**
     * 手
     */
    private Integer handCounts;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 圈
     */
    private Integer betRound;
    /**
     * 投保金额
     */
    private BigDecimal insureScore;
    /**
     * 赔付金额
     */
    private BigDecimal compensationScore;

}
