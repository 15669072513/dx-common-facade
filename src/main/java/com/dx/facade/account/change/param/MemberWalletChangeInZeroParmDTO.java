package com.dx.facade.account.change.param;

import com.dx.facade.member.exception.ErrorCode;
import com.dx.facade.member.resp.MemberInfoRespDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import java.math.BigDecimal;

@Slf4j
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="会员账变对象(退还筹码为0)", description="会员账变对象(退还筹码为0)")
public class MemberWalletChangeInZeroParmDTO extends WalletChangeParm implements IBWWalletChangeParm {

    @ApiModelProperty(value="会员对象")
    private MemberInfoRespDTO memberBO;

    @ApiModelProperty(value="类名")
    @Builder.Default
    private String name = Constant.MEMBER;

    @ApiModelProperty(value="操作人id")
    private long operatorId;

    @ApiModelProperty(value="操作用户姓名")
    private String operatorUser;

    @ApiModelProperty("牌桌ID")
    private Long tableId;

    @ApiModelProperty("牌桌名称")
    private String tableName;

    @Override
    public void check(){
        Assert.notNull(memberBO, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("memberBO"));
    }

    @JsonIgnore
    @Override
    public Long getId() {
        return memberBO.getId();
        //Assert.notNull(accountChange, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("accountChange"));
    }
}
