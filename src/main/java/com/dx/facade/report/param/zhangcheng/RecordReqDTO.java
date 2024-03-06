package com.dx.facade.report.param.zhangcheng;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Adu
 * @create 2024/2/23
 */
@Data
public class RecordReqDTO implements Serializable {

    /**
     * 开始日期
     */
    private Integer startDate;

    /**
     * 结束日期
     */
    private Integer endDate;

    /**
     * 收益类型（1我的收益，2全部下级收益，3直属下级收益 0特定下级代理)
     */
    private Integer incomeType = 1;

    /**
     * 特定下级代理id
     */
    private Long subProxyId;

    /**
     * TODO 对应对应payout的状态是什么？
     * 状态 1待发放，2已发放，3无收益，4已取消 不传全部
     */
    private Integer status = null;

    /**
     * 当前页,默认第1页
     */
    private Integer pageNum = 1;

    /**
     * 每页条数,默认20条
     */
    private Integer pageSize = 20;
}
