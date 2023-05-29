package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import com.dx.facade.account.req.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author grayson
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransferToGameParamDTO implements BaseParmDTO {

        @ApiModelProperty("商户ID")
        private Long merchantId;

        @ApiModelProperty("商户名称")
        private String merchantName;

        @ApiModelProperty("会员ID")
        private Long userId;

        @ApiModelProperty("金额，精确到2位小数点，大于0")
        private BigDecimal amount;

        @ApiModelProperty("场馆代码")
        private String gameCode;

        @ApiModelProperty(value = "申请设备号")
        private String deviceNo;

        @ApiModelProperty("终端[0:IOS_H5,1:IOS_APP,2:PC,3:Android_H5,5:Android_APP]")
        private Integer clientType;

        @Override
        public void check() {
            Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
            Assert.hasLength(merchantName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantName"));
            Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
            Assert.notNull(gameCode, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("gameCode"));
            Assert.notNull(amount, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("amount"));
        }
}
