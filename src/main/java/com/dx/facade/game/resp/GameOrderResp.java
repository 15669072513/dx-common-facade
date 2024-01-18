package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 游戏订单结果对象
 */
@Data
public class GameOrderResp  implements Serializable {
  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "订单主键ID(雪花生成)")
  private Long id;

  @ApiModelProperty(value = "三方订单ID,O前缀开头")
  private String orderNo;

  @ApiModelProperty(value = "手牌类型 2001德州扑克 2002短牌")
  private Long gameType;

  @ApiModelProperty(value = "手牌类型 2001德州扑克 2002短牌")
  private String gameTypeDesc;


  @ApiModelProperty(value = "牌桌id")
  private Long tableId;

  @ApiModelProperty(value = "牌桌code")
  private String tableCode;

  @ApiModelProperty(value = "牌桌名称")
  private String tableName;

  @ApiModelProperty(value = "俱乐部id")
  private Long clubId;

  @ApiModelProperty(value = "俱乐部名称")
  private String clubName;

  @ApiModelProperty(value = "玩家id")
  private Long userId;

  @ApiModelProperty(value = "会员账号")
  private String userName;

  @ApiModelProperty(value = "会员昵称")
  private String nickName;

  @ApiModelProperty(value = "商户id")
  private Long merchantId;

  @ApiModelProperty(value = "商户名称")
  private String merchantName;

  @ApiModelProperty(value = "上级代理id")
  private Long parentProxyId;

  @ApiModelProperty(value = "上级代理账号")
  private String parentProxyName;

  @ApiModelProperty(value = "上级代理路径")
  private String parentProxyPath;

  @ApiModelProperty("终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP）")
  private Integer obDeviceType;

  @ApiModelProperty(value = "下单ip")
  private String orderIp;

  @ApiModelProperty(value = "订单类型一级类型 对应枚举GameRecordTypeEnum")
  private Integer parentOrderType;

  @ApiModelProperty(value = "订单类型子类 对应枚举GameRecordTypeEnum")
  private Integer orderType;

  @ApiModelProperty(value = "订单类型一级类型 对应枚举GameRecordTypeEnum")
  private String parentOrderTypeDesc;

  @ApiModelProperty(value = "订单类型子类 对应枚举GameRecordTypeEnum")
  private String orderTypeDesc;

  @ApiModelProperty(value = "订单金额")
  private BigDecimal orderAmount=BigDecimal.ZERO;

  @ApiModelProperty(value = "订单状态 0 未结算 1已结算")
  private Integer orderStatus=0;

  @ApiModelProperty(value = "优惠金额")
  private BigDecimal preferentialAmount=BigDecimal.ZERO;

  @ApiModelProperty(value = "实付金额")
  private BigDecimal payAmount=BigDecimal.ZERO;

  @ApiModelProperty(value = "服务费贡献")
  private BigDecimal serviceContribution=BigDecimal.ZERO;

  @ApiModelProperty(value = "结算时间")
  private Long netTime;

  @ApiModelProperty(value = "下单时间")
  private Long orderTime;

  @ApiModelProperty(value = "创建时间")
  private LocalDateTime createdAt;

  @ApiModelProperty(value = "修改时间")
  private LocalDateTime updatedAt;

  @ApiModelProperty(value = "订单流水号")
  private String serialNo;
}
