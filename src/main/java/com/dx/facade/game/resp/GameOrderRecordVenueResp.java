package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 注单查询结果对象
 */
@Data
public class GameOrderRecordVenueResp implements Serializable {
        /**
        * 主键id
        */
        @ApiModelProperty("主键id")
        private Long id;
        /**
        * 流水订单号
        */
        @ApiModelProperty("流水订单号")
        private String orderNo;
        /**
        * 场馆类型code
        */
        @ApiModelProperty("场馆类型")
        private String venueTypeCode;
        /**
        * 场馆类型名称
        */
        @ApiModelProperty("场馆名称")
        private String venueTypeName;
        /**
        * 会员账号
        */
        @ApiModelProperty("会员账号")
        private String userName;
        /**
        * 游戏账号
        */
        @ApiModelProperty("游戏账号")
        private String playerName;
        /**
        * 用户类型 0 正式账号 1测试账号
        */
        @ApiModelProperty("会员账号类型 0 正式账号 1测试账号")
        private Integer accountType;
        /**
        * 商户名称
        */
        @ApiModelProperty("所属商户")
        private String merchantName;
        /**
        * 上级代理账号
        */
        @ApiModelProperty("上级代理账号")
        private String parentProxyName;
        /**
        * 总代账号
        */
        @ApiModelProperty("总代账号")
        private String topProxyName;
        /**
        * 投注金额
        */
        @ApiModelProperty("投注金额")
        private BigDecimal betAmount;
        /**
        * 有效投注
        */
        @ApiModelProperty("有效投注")
        private BigDecimal validBetAmount;
        /**
        * 会员输赢
        */
        @ApiModelProperty("会员输赢")
        private BigDecimal netAmount;
        /**
        * 注单状态
        */
        @ApiModelProperty("注单状态 0-未结算 1已结算 2-不结算")
        private Integer obBetStatus;
        /**
        * 牌局开始时间
        */
        @ApiModelProperty("投注时间")
        private Long handBeginDate;
        /**
        * 牌局结束时间
        */
        @ApiModelProperty("结算时间")
        private Long handEndDate;
        /**
        * 牌桌编码
        */
        @ApiModelProperty("牌桌编码")
        private Long tableCode;
        /**
        * 玩家ip
        */
        @ApiModelProperty("玩家ip")
        private String loginIp;
        /**
        *  终端类型
        */
        @ApiModelProperty("终端类型")
        private Integer obDeviceType;

}
