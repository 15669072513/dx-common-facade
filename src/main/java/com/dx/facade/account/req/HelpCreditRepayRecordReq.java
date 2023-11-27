package com.dx.facade.account.req;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("help_credit_repay_record")
@ApiModel(value = "HelpCreditRepayRecordPO对象", description = "帮还款记录表")
public class HelpCreditRepayRecordReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("'商户ID'")
    @NotNull(message = "商户ID-不能为空")
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

    @ApiModelProperty("'调整时间-开始'")
    @NotNull(message = "调整时间(开始)-不能为空")
    private Long createdAtBegin;

    @ApiModelProperty("'调整时间-结束'")
    @NotNull(message = "调整时间(结束)-不能为空")
    private LocalDateTime createdAtEnd;

    @ApiModelProperty("'更新时间'")
    private LocalDateTime updatedAt;

    @ApiModelProperty("'操作ip地址'")
    private String ipAddr;

    @ApiModelProperty("'最近操作人'")
    private String updatedBy;


}
