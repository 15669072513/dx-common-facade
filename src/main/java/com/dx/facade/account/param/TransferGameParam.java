package com.dx.facade.account.param;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import java.math.BigDecimal;

/**
 *
 * @author: cowboy
 * @description 场馆上下分账变资金明细记录
 * @date 2023-08-08
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransferGameParam implements BaseParmDTO {

    @ApiModelProperty("转账单号")
    private String eventId;

    @ApiModelProperty("场馆code,zr:真人,ty:体育,cp:彩票,qp:棋牌,dj:电竞")
    private String venueCode;

    @ApiModelProperty("账变前余额")
    private BigDecimal changeBefore;

    @ApiModelProperty("账变后余额")
    private BigDecimal changeAfter;

    @ApiModelProperty("账变金额")
    private BigDecimal amount;

    @Override
    public void check() {
        Assert.notNull(eventId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventId"));
        Assert.notNull(venueCode, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("venueCode"));
        Assert.notNull(changeBefore, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("changeBefore"));
        Assert.notNull(changeAfter, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("changeAfter"));
        Assert.notNull(amount, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("amount"));
    }
}
