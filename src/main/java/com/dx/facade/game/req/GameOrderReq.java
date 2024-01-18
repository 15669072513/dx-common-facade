package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@ApiModel("游戏对象查询对象")
@Data
public class GameOrderReq  extends BaseRequest {

  @ApiModelProperty(value = "时间类型 0默认查今日 1近7天 2近30天")
  private Integer dateType=0;

  @ApiModelProperty(value = "订单ID")
  private Long id;

  @ApiModelProperty(value = "三方订单ID,O前缀开头")
  private String orderNo;

  @ApiModelProperty(value = "手牌类型 2001德州扑克 2002短牌")
  private Long gameType;

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

  @ApiModelProperty(value = "设备类型 1 电脑网页 2 手机网页 3苹果4安卓5其他")
  private Long obDeviceType;

  @ApiModelProperty(value = "下单ip")
  private String orderIp;

  @ApiModelProperty(value = "订单类型 对应枚举GameRecordTypeEnum,全部传空")
  private Integer parentOrderType;


  @ApiModelProperty(value = "订单类型 对应枚举GameRecordTypeEnum")
  private List<Integer> subOrderTypeList;

  @ApiModelProperty(value = "0 未结算 1已结算")
  private Integer orderStatus;

  @ApiModelProperty(value = "结算时间开始")
  private Long netTimeFrom;

  @ApiModelProperty(value = "结算时间结束")
  private Long netTimeTo;

  @ApiModelProperty(value = "下单时间开始")
  private Long orderTimeFrom;

  @ApiModelProperty(value = "下单时间结束")
  private Long orderTimeTo;

  @ApiModelProperty(value = "创建时间")
  private LocalDateTime createdAt;

  @ApiModelProperty(value = "订单流水号")
  private String serialNo;

  @ApiModelProperty("查询类型 1 列表查询，导出查询")
  private Integer queryType;

  @ApiModelProperty("查询来源 1 中控后台，2 代理后台")
  private Integer querySource;

  @ApiModelProperty("代理id")
  private Long proxyId;

  @ApiModelProperty("下级代理id")
  private List<Long> subProxyIds;
}
