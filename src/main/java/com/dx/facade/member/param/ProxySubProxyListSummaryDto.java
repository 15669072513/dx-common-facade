package com.dx.facade.member.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 信息面板-充提记录 取款记录返回前端参数VO
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/14
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxySubProxyListSummaryDto {


  @ApiModelProperty(value = "现金余额")
  private BigDecimal centerWalletBalance;

  @ApiModelProperty(value = "信用钱包余额")
  private BigDecimal creditWalletBalance;

  @ApiModelProperty(value = "信用额度")
  private BigDecimal creditQuota;

  @ApiModelProperty(value = "应还借款")
  private BigDecimal borrowAmount;

}