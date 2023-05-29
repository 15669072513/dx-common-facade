package com.dx.facade.account.change.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import java.util.List;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="同一事务下同一用户多次账变", description="同一事务下同一用户多次账变")
public class MultipleWalletChangeParmDTO<T extends IBWWalletChangeParm> implements BaseParmDTO {

    @ApiModelProperty(value="账变对象集合")
    private List<T> targetList;

    @Override
    public void check() {
        Assert.notEmpty(targetList, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("targetList"));
        Assert.noNullElements(targetList, ErrorCode.PARAM_EXCEPTION.messageAfter("targetList 不应含有 null"));
        for(T target : targetList){
            target.check();
        }
    }
}
