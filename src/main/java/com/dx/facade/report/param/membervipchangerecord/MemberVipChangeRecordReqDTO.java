package com.dx.facade.report.param.membervipchangerecord;

import lombok.Data;

import java.util.List;

import com.dx.facade.report.param.base.MultiplyMerchantLocalDateReq;

/**
 * @Description:
 * @Author: focus
 * @Date 2022/02/09
 */
@Data
public class MemberVipChangeRecordReqDTO extends MultiplyMerchantLocalDateReq {

    
    /**
     * 变更开始时间
     */
    private String startCreatedAt;
    
    /**
     * 变更结束时间
     */
    private String engCreatedAt;
    
    /**
     * 操作人
     */
    private String createdBy;
    
    /**
     * 变更类型 0-升级，1-降级
     */
    private List<Integer> changeType;
    
    /**
     * 会员账号
     */
    private String userName;
    
    /**
     * 排序方式(asc-顺序,desc-倒序)
     */
    private String orderType;
    
}
