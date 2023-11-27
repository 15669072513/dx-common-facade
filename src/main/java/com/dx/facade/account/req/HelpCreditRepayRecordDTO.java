package com.dx.facade.account.req;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "HelpCreditRepayRecordPO对象", description = "帮还款记录表")
public class HelpCreditRepayRecordDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("'商户ID'")
    private Long merchantId;

    @ApiModelProperty("'商户名称'")
    private String merchantName;

    @ApiModelProperty("'被操作人ID'")
    private Long userId;

    @ApiModelProperty("'被操作人用户账号，会员或代理账号'")
    private String userName;

    @ApiModelProperty("'被操作人用户类型：0会员,1代理'")
    private Integer userType;

    @ApiModelProperty("'还款金额'")
    private BigDecimal amount;

    @ApiModelProperty("'币种'")
    private String currency;

    @ApiModelProperty("'操作人账号'")
    private String operator;

    @ApiModelProperty("'操作人ID'")
    private Long operatorId;

    @ApiModelProperty("'帮还款钱包类型'")
    private Integer walletType;

    @ApiModelProperty("'创建时间'")
    private LocalDateTime createdAt;

    @ApiModelProperty("'更新时间'")
    private LocalDateTime updatedAt;

    @ApiModelProperty("'操作ip地址'")
    private String ipAddr;

    @ApiModelProperty("'最近操作人'")
    private String updatedBy;


}
