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
       * 用户类型 0 正式账号 1测试账号
       */
      @ApiModelProperty("会员账号类型 0 正式账号 1测试账号")
      private Integer accountType;
      /**
       * 会员账号
       */
      @ApiModelProperty("会员账号")
      private String userName;
      /**
       * 上级代理账号
       */
      @ApiModelProperty("上级代理账号")
      private String proxyName;
      /**
       * 总代账号
       */
      @ApiModelProperty("总代账号")
      private String topProxyName;

}
