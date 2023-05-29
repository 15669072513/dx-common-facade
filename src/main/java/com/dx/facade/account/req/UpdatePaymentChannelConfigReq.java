package com.dx.facade.account.req;

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

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdatePaymentChannelConfigReq implements BaseParmDTO {

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("信用等级")
    private String creditLevel;

    @ApiModelProperty("使用状态/开关，0=否/停用，1=是/启用")
    private Integer status;

    @ApiModelProperty("权重")
    private Integer scale;

    @ApiModelProperty("修改人")
    private String operator;;

    @Override
    public void check() {
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
        Assert.hasText(operator, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("operator"));
        Assert.isTrue(Objects.nonNull(sort) || StringUtils.hasText(creditLevel) || Objects.nonNull(status) || Objects.nonNull(scale),
                "请至少修改一项");
    }
}
