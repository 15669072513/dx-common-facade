package com.dx.facade.merchant.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@ApiModel(value="com-ob-member-resp-ProxyWithdrawSettingResp")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "ob_merchant.ob_withdraw_setting_proxy")
public class ProxyWithdrawSettingResp implements Serializable {

    /**
     * id
     */
    @TableId(value = "id")
    @ApiModelProperty(value = "id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 商户id
     */
    @ApiModelProperty(value = "商户id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long merchantId;

    /**
     * 代理id
     */
    @ApiModelProperty(value = "代理id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long proxyId;

    /**
     * 状态(0=有效 1=无效)
     */
    @ApiModelProperty(value = "状态(0=有效 1=无效)")
    private Integer withdrawStatus;

    /**
     * 代理账号.通用设置标识为：0
     */
    @ApiModelProperty(value = "代理账号.通用设置标识为：0")
    private String proxyAccount;

    /**
     * 代理姓名.通用设置标识为：0
     */
    @ApiModelProperty(value = "代理姓名.通用设置标识为：0")
    private String proxyName;

    /**
     * 代理类型（1-正式，2-测试，3-合作）
     */
    @ApiModelProperty(value = "代理类型（1-正式，2-测试，3-合作）")
    @TableField(exist = false)
    private Integer proxyAccountType;

    /**
     * 代理状态（1正常，2登录锁定，3充提锁定）
     */
    @ApiModelProperty(value = "代理状态（1正常，2登录锁定，3充提锁定）")
    @TableField(exist = false)
    private Integer proxyAccountStatus;

    /**
     * 风控层级名称
     */
    @ApiModelProperty(value = "风控层级名称")
    @TableField(exist = false)
    private String windControlName;

    /** 新增字段 **/
    /**
     * 银行卡单次提款最低限额
     */
    @ApiModelProperty(value = "银行卡单次提款最低限额", required = true)
    
    private BigDecimal bankCardMinAmount;

    /**
     * 银行卡单次提款最高限额
     */
    @ApiModelProperty(value = "银行卡单次提款最高限额", required = true)
    
    private BigDecimal bankCardMaxAmount;

    /**
     * 虚拟币单次提款最低限额
     */
    @ApiModelProperty(value = "虚拟币单次提款最低限额", required = true)
    
    private BigDecimal virtualCardMinAmount;

    /**
     * 虚拟币单次提款最高限额
     */
    @ApiModelProperty(value = "虚拟币单次提款最高限额", required = true)
    
    private BigDecimal virtualCardMaxAmount;

    /** 新增字段 **/

    /**
     * 单日提款总次数
     */
    @ApiModelProperty(value = "单日提款总次数")
    private Integer dateTotalNum;

    /**
     * 单日提款总额度
     */
    @ApiModelProperty(value = "单日提款总额度")
    
    private BigDecimal dateMaxAmount;

    /**
     * 大额提款标记金额
     */
    @ApiModelProperty(value = "大额提款标记金额")
    
    private BigDecimal bigAmount;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedTime;

    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人")
    private String updatedOperator;

    @ApiModelProperty(value = "私庄模式,1:吃单模式 2:坐庄模式")
    private Integer bankerMode;

}
