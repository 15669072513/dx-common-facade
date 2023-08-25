package com.dx.facade.report.resp.rebate;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class ProxyRateDDetaiListPageParam extends PageRequest implements Serializable {

    /**
     * 会员id
     */
    @ApiModelProperty(value = "会员id")
    private Long memberId;

    /**
     * 代理id
     */
    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    /**
     * 周期开始时间
     */
    @ApiModelProperty(value = "周期开始时间(yyyyMMdd)")
    @NotBlank(message = "周期开始时间不能为空")
    //@Pattern(regexp = BWManagerConstant.REG_YYYYMMDD, message = "周期开始时间格式不正确 示例：20210614")
    private String reportStartDate;

    /**
     * 周期结束时间
     */
    @ApiModelProperty(value = "周期结束时间(yyyyMMdd)")
    @NotBlank(message = "周期结束时间不能为空")
    //@Pattern(regexp = BWManagerConstant.REG_YYYYMMDD, message = "周期结束时间格式不正确 示例：20210614")
    private String reportEndDate;
}
