<<<<<<< HEAD
package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@ApiModel("资金明细实体信息")
@Data
public class WalletDetailDto {
  @ApiModelProperty("id主键")
  private Long id;
  @ApiModelProperty("币种")
  private String currency;
  @ApiModelProperty("用户ID")
  private Long userId;
  @ApiModelProperty("账变钱金额")
  private BigDecimal changeBefore;
  @ApiModelProperty("账变额")
  private BigDecimal amount;
  @ApiModelProperty("账变后额")
  private BigDecimal changeAfter;
  @ApiModelProperty("账变时间")
  private LocalDateTime createdAt;
  @ApiModelProperty("牌桌ID")
  private Long tableId;
  @ApiModelProperty("牌桌名称")
  private String tableName;
  @ApiModelProperty("账变类型 1-带入 2-带出")
  private Integer eventType;
}
=======
package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@ApiModel("资金明细实体信息")
@Data
public class WalletDetailDto {
  @ApiModelProperty("id主键")
  private Long id;
  @ApiModelProperty("币种")
  private String currency;
  @ApiModelProperty("用户ID")
  private Long userId;
  @ApiModelProperty("账变钱金额")
  private BigDecimal changeBefore;
  @ApiModelProperty("账变额")
  private BigDecimal amount;
  @ApiModelProperty("账变后额")
  private BigDecimal changeAfter;
  @ApiModelProperty("账变时间")
  private LocalDateTime createdAt;
  @ApiModelProperty("牌桌ID")
  private Long tableId;
  @ApiModelProperty("牌桌名称")
  private String tableName;
  @ApiModelProperty("账变类型 1-带入 2-带出")
  private Integer eventType;
}
>>>>>>> origin/feature/develop_v2
