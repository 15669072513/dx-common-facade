package com.dx.facade.member.param;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

/**
 * @Description: 更新代理登录、开局、俱乐部管理权限开关
 * @Author: fitz
 * @Date 2023/6/22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "更新代银行卡渠道权限开关", description = "更新代银行卡渠道权限开")
public class UpdateProxyBankChannelStatusParamDTO implements BaseParmDTO {

  @ApiModelProperty(value = "商户id (20)")
  private Long merchantId;

  @ApiModelProperty(value = "代理id (20)")
  private Long proxyId;

  @ApiModelProperty(value = "银行卡渠道权限：0-关闭 1-开启")
  private Integer bankChannelStatus;

  @ApiModelProperty(value = "操作人")
  private String operateBy;

  @Override
  public void check() {
    Assert.notNull(proxyId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("proxyId"));
  }

}
