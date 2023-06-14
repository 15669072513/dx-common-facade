package com.dx.facade.report.param.report.business;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
//@ApiModel(value = "com-ob-resp-report-ProxyDayReportDTO", description = "代理报表对象")
public class ProxyReportDTO implements Serializable {

    // username ,member
    // proxy_name parent_proxy_name
    // starttime , startday
    @ApiModelProperty(value = "代理账号", hidden = true)
    // proxy.user_name
    private String proxyName;

    @ApiModelProperty(value = "代理id")
    // proxy.id
    private Long proxyId;
    @ApiModelProperty(value = "代理id")
    // proxy.id 账号类型（1-正式，2-商务，3-置换）详见AccountTypeEnum
    private Long accountType;
    // `parent_proxy_name` varchar(50) DEFAULT NULL COMMENT '上级代理名称',
    private String parentProxyName;

    //   `top_proxy_name` varchar(50) NOT NULL COMMENT '总代名称',
    private String topProxyName;


    //      `merchant_name` varchar(20) NOT NULL COMMENT '商户名称',
    private String merchantName;
    //            `top_merchant_name` varchar(20) DEFAULT NULL COMMENT '主商户名称',
    private String topMerchantName;
    //

    //    `login_lock_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '登陆锁定状态 0-未锁定 1-登陆锁定',
    private Integer login_lock_status;
    //            `payment_lock_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '充提锁定状态 0-未锁定 1-充提锁定',
    private Integer paymentLockStatus;
    // 注册时间
    private Date created_at;


    //   `accumulated_commission` decimal(16,4) NOT NULL DEFAULT '0.0000' COMMENT '累计返佣',
    private BigDecimal accumulated_commission;
    // `accumulated_rebate` decimal(16,4) NOT NULL DEFAULT '0.0000' COMMENT '累计返点',
    private BigDecimal accumulated_rebate;
//  `debt_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '欠款标志 0-无欠款 1-有欠款',
    private Integer debt_status;

    // 佣金转回次数
    // 转账下级 次数
    // 上级转账次数
    // 代理调整
    //代理调整
    // `commission_balance` decimal(16,4) NOT NULL DEFAULT '0.0000' COMMENT '佣金钱包余额',
    //  `quota_balance` decimal(16,4) NOT NULL DEFAULT '0.0000' COMMENT '额度钱包余额',
    //    `under_member_num` int(11) NOT NULL DEFAULT '0' COMMENT '下级会员人数',
    //            `directly_under_member_num` int(11) NOT NULL DEFAULT '0' COMMENT '直属下级会员人数',
    // `transfer_out_num` int(11) NOT NULL DEFAULT '0' COMMENT '转出会员人数',
    //  `transfer_in_num` int(11) NOT NULL DEFAULT '0' COMMENT '转入会员人数',


}
