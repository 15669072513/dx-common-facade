package com.dx.facade.account.change.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="转账行为导致的账变对象(包含主动方和被动方)", description="转账行为导致的账变对象(包含主动方和被动方)")
public class TransferWalletChangeParmDTO<T extends IBWWalletChangeParm, V extends IBWWalletChangeParm> implements BaseParmDTO {

    @ApiModelProperty(value="账变对象, 主动发起方")
    private T source;

    @ApiModelProperty(value="账变对象,被动接受方")
    private List<V> targetList;

    @Override
    public void check() {
        Assert.notNull(source, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("source"));
        Assert.notEmpty(targetList, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("targetList"));
        Assert.noNullElements(targetList, ErrorCode.PARAM_EXCEPTION.messageAfter("targetList 不应含有 null"));
        source.check();
        BigDecimal total = BigDecimal.ZERO;
        String eventId = null;
        for(V target : targetList){
            target.check();
            if(!StringUtils.hasText(eventId)){
                eventId = target.getEventId();
            }else{
                Assert.isTrue(Objects.equals(eventId, target.getEventId()), ErrorCode.PARAM_EXCEPTION.messageAfter("多条账变的 eventId 应一致"));
            }
            total.add(target.getAmount());
        }
        Assert.isTrue(source.getAmount().compareTo(total) != 0, ErrorCode.PARAM_EXCEPTION.messageAfter("发起方账变总额应等于接受方的账变总额"));
    }
}
