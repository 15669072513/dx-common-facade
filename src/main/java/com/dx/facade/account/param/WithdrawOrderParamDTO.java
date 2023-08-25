package com.dx.facade.account.param;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "会员/代理提款记录入参", description = "会员/代理提款记录入参")
@ToString
public class WithdrawOrderParamDTO implements Serializable {

    @ApiModelProperty("客户端调用方:1会员pc/app端，2代理后台会员提现列表，3中控后台会员提现审核记录列表，4中控后台")
    private Integer rpcClientType;

    @ApiModelProperty("所属商户，支持多个")
    private List<Long> merchantIds;

    @ApiModelProperty("用户类型（0=会员/1=代理）")
    private Integer userType;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("多个用户ID")
    private List<Long> userIds;

    @ApiModelProperty("申请时间开始")
    private LocalDateTime eventTimeStart;

    @ApiModelProperty("申请时间结束")
    private LocalDateTime eventTimeEnd;

    @ApiModelProperty("到账时间开始")
    private LocalDateTime payTimeStart;

    @ApiModelProperty("到账时间结束")
    private LocalDateTime payTimeEnd;

    @ApiModelProperty("订单来源")
    private Integer appType;

    @ApiModelProperty("订单状态,WithdrawOrderStatus")
    private List<Integer> orderStatusList;

    @ApiModelProperty("客户端状态,WithdrawClientStatus")
    private Integer clientStatus;

    @ApiModelProperty("提款类型，1.银行卡，2.虚拟币")
    private Integer withdrawType;

    @ApiModelProperty("通道名称")
    private String channelName;

    @ApiModelProperty("是否首提,0:不是，1:是")
    private Integer firstWithdrawStatus;

    @ApiModelProperty("vip最小等级")
    private Integer vipLevelMin;

    @ApiModelProperty("vip最大等级")
    private Integer vipLevelMax;

    @ApiModelProperty("存款ip")
    private String ip;

    @ApiModelProperty("订单号")
    private String eventId;

    @ApiModelProperty("会员账号")
    private String userName;

    @ApiModelProperty("提交取款的操作者真实姓名")
    private String currentUserRealName;

    @ApiModelProperty("银行卡真实姓名")
    private String realName;

    @ApiModelProperty("设备号")
    private String deviceNo;

    @ApiModelProperty("是否大额,0:不是，1:是")
    private Integer bigWithdraw;

    @ApiModelProperty(
            value = "排序列名，eventTime或者payTime",
            example = "eventTime"
    )
    private String orderKey;
    @ApiModelProperty(
            value = "排序方式(1)：desc-降序 asc-升序",
            example = "asc"
    )
    private String sortType;

    @ApiModelProperty("三方消息状态，WithdrawThirdMessageStatus, 1:获取中，2：已过期")
    private Integer thirdMessageStatus;


    @ApiModelProperty("锁单状态")
    private Integer lockStatus;

    @ApiModelProperty(value = "支付厂商")
    private String payMerchantName;

    @ApiModelProperty("锁单状态是否要排序，默认：否")
    private Boolean isOrderByLockStatus = false;
    @ApiModelProperty("锁单状态是否是升序排列，默认:否;注意:该字段生效前，必须让锁单状态参与排序")
    private Boolean isOrderByLockStatusAsc = false;

    @ApiModelProperty("是否按订单状态排序，默认：否")
    private Boolean isOrderByOrderStatus = false;
    @ApiModelProperty("是否按订单状态升序排列，默认：否")
    private Boolean isOrderByOrderStatusAsc = false;
    @ApiModelProperty("申请时间是否参与排序，默认:否")
    private Boolean isOrderByEventTime = false;
    @ApiModelProperty("申请时间排序规则，默认:升序;注意:该字段升降序生效前，必须让申请时间字段参与排序")
    private Boolean isOrderByEventTimeAsc = false;
    @ApiModelProperty("锁单时间是否要排序，默认：否")
    private Boolean isOrderByLockTime = false;
    @ApiModelProperty("锁单时间是否是升序排列，默认:否;注意:该字段生效前，必须让锁单状态参与排序")
    private Boolean isOrderByLockTimeAsc = false;


}
