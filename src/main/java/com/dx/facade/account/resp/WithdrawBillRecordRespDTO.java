package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author orbit
 * @datetime 2023-10-19 19:12
 * @desc 提现账单记录DTO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WithdrawBillRecordRespDTO implements Serializable {
    @ApiModelProperty("主键ID")
    private Long id;

    @ApiModelProperty("订单ID")
    private String eventId;

    @ApiModelProperty("快照时间")
    private LocalDateTime snapshotTime;

    @ApiModelProperty("团队净资产")
    private BigDecimal teamNetAsset;

    @ApiModelProperty("团队应还账款")
    private BigDecimal teamShouldRepay;

    @ApiModelProperty("团队可提现额")
    private BigDecimal teamWithdrawAmount;

    @ApiModelProperty("账单净资产")
    private BigDecimal netAsset;

    @ApiModelProperty("现金余额")
    private BigDecimal cash;

    @ApiModelProperty("可用额度")
    private BigDecimal creditAvailable;

    @ApiModelProperty("信用额度")
    private BigDecimal creditTotal;
}
