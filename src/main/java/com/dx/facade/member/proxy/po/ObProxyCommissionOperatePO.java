package com.dx.facade.member.proxy.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 @title
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年10月22日 22:11:12
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ob_player.ob_proxy_commission_operate")
public class ObProxyCommissionOperatePO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 佣金月份
     */
    private Date commissionDate;

    /**
     * 付款-用户ID
     */
    private Long outUserId;

    /**
     * 付款-用户账号
     */
    private String outUserName;

    /**
     * 收款-用户ID
     */
    private Long inUserId;

    /**
     * 收款-用户账号
     */
    private String inUserName;

    /**
     * 收到佣金
     */
    private BigDecimal receiveCommission;

    /**
     * 佣金管理操作记录类型(1=代发佣金,2=取消佣金)
     */
    private Integer operateType;

    /**
     * 操作人ID
     */
    private Long operateId;

    /**
     * 操作人账号
     */
    private String operateName;

    /**
     * 创建时间
     */
    private Date createdAt;
}
