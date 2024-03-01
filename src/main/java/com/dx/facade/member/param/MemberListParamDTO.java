package com.dx.facade.member.param;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class MemberListParamDTO {

    @ApiModelProperty("商户ID列表")
    private List<Long> merchantIdLs;

    @ApiModelProperty(value="时间类型，0-注册时间, 1-首存时间时间，2-最后登陆时间")
    private Integer timeType;

    @ApiModelProperty(value="开始时间")
    private String timeStart;

    @ApiModelProperty(value="结束时间")
    private String timeEnd;

    @ApiModelProperty(value="账号类型，0-会员账号, 1-会员姓名,2-上级代理, 3-总代账号,4-会员昵称")
    private Integer userNameType;

    @ApiModelProperty("账号")
    private String userName;

    @ApiModelProperty("账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty("充提锁定状态 0-未锁定 1-充提锁定")
    private Integer paymentLockStatus;

    @ApiModelProperty("游戏锁定状态 0-未锁定 1-游戏锁定")
    private Integer gameLockStatus;
    
    @ApiModelProperty("入局锁定状态 0-未锁定 1-入局锁定")
    private Integer joinGameLockStatus;

    @ApiModelProperty("vip等级")
    private Integer vipLevel;

    @ApiModelProperty("风控层级id")
    private Long windControlId;

    @ApiModelProperty("注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP 6-后台）")
    private Integer registerDeviceType;

    @ApiModelProperty("首存金额-最小值")
    private BigDecimal firstDepositMin;

    @ApiModelProperty("首存金额-最大值")
    private BigDecimal firstDepositMax;

    @ApiModelProperty("会员币种")
    private String currency;

    @ApiModelProperty(value="IP类型，0-注册IP, 1-最后登录IP")
    private Integer ipType;

    @ApiModelProperty(value = "注册IP")
    private String ip;
    
    /** 俱乐部id */
    @ApiModelProperty(value = "俱乐部Id")
    private String clubId;

    @ApiModelProperty("排序列 1：注册时间 默认注册时间")
    private Integer orderKey;

    @ApiModelProperty("排序方式(1)：desc-降序 asc-升序")
    private String orderType;

    @ApiModelProperty("上级代理名称")
    private String parentProxyName;


    @ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
    private Integer businessModel;

    @ApiModelProperty(value = "设备标识")
    private String deviceNo;
    @ApiModelProperty(value = "会员ID集合")
    private List<Long> memberIds;
}
