 package com.dx.facade.es.resp;

 import io.swagger.annotations.ApiModelProperty;
 import lombok.Data;

 import java.math.BigDecimal;
 import java.util.List;

 /**
  * 重结算注单详情
  * 
  */
 @Data
 public class GameRecordResettlementDetailDto {

     @ApiModelProperty("会员id")
     private Long memberId;
     @ApiModelProperty("会员id")
     private Long userId;

     @ApiModelProperty("账号类型, 使用AccountTypeEnum枚举")
     private Integer accountType;

     @ApiModelProperty("会员账号")
     private String userName;

     @ApiModelProperty("上级代理名称")
     private String parentProxyName;

     @ApiModelProperty("总代名称")
     private String topProxyName;

     @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
     private Integer loginLockStatus;

     @ApiModelProperty("充提锁定状态 0-未锁定 1-充提锁定")
     private Integer paymentLockStatus;

     @ApiModelProperty("游戏锁定状态 0-未锁定 1-游戏锁定")
     private Integer gameLockStatus;

     @ApiModelProperty("vip等级")
     private Integer vipLevel;

     @ApiModelProperty("游戏账号")
     private String playerName;

     @ApiModelProperty("该类游戏总输赢")
     private BigDecimal netAmountSum;

     @ApiModelProperty("重结算注单历史详情")
     private List<GameRecordResettlementHisDetailDto> betHisDetails;
}
