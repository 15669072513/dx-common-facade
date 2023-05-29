package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SyncWithdrawConfigReq implements BaseParmDTO {

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("币种类型")
    private String currency;

    private List<WithdrawConfigReq> withdrawConfigReqList;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(currency, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("currency"));
        Assert.isTrue(!CollectionUtils.isEmpty(withdrawConfigReqList), ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("withdrawConfigReqList"));
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class WithdrawConfigReq implements BaseParmDTO {

        @ApiModelProperty("vip等级")
        private Integer vipLevel;

        @ApiModelProperty("每日提款次数")
        private Integer dailyCount;

        @ApiModelProperty("每日累计提款金额")
        private BigDecimal dailyAmount;

        @Override
        public void check() {
            Assert.notNull(vipLevel, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("vipLevel"));
            Assert.notNull(dailyCount, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("dailyCount"));
            Assert.notNull(dailyAmount, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("dailyAmount"));
        }
    }

}
