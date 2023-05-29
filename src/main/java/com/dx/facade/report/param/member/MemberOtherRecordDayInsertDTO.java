package com.dx.facade.report.param.member;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 会员其他流水统计天表
 */

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("dwm_member_other_record_day")
public class MemberOtherRecordDayInsertDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 日期，比如20210531
     */
    private Integer staticsDate;

    /**
     * 应用终端
     */
    private Integer appId;

    /**
     * 会员id
     */
    private Long memberId;

    /**
     * 上级代理id
     */
    private Long parentProxyId;

    /**
     * 上级代理账号
     */
    private String parentProxyName;

    /**
     * 商户id
     */
    private Long merchantId;

    /**
     * 返水金额=会员返水+返水人工加减额
     */
    private BigDecimal rebateAmount;

    /**
     * 优惠金额=会员优惠+会员活动人工加减额+会员VIP福利
     */
    private BigDecimal discountAmount;

    /**
     * 其他调整=人工加减额中的其他调整额
     */
    private BigDecimal artificialPatchAmount;

    /**
     * 流水纠正
     */
    private BigDecimal flowCorrection;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;
}
