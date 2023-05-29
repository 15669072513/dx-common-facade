package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProxyLevelReq implements BaseParmDTO {

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("代理层级名称")
    private String proxyLevelName;

    @ApiModelProperty("最后操作人")
    private String updatedBy;

    @Override
    public void check() {
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
        Assert.hasText(proxyLevelName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("proxyLevelName"));
        Assert.hasText(updatedBy, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("updatedBy"));
    }
}
