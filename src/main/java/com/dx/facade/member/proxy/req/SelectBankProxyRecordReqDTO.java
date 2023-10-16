package com.dx.facade.member.proxy.req;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author agan
 */
@Data
public class SelectBankProxyRecordReqDTO extends PageRequest {

    @ApiModelProperty(value = "商户id", hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "提款时间-开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime beginDate;

    @ApiModelProperty(value = "提款时间-结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime endDate;

    @ApiModelProperty(value = "代理账号")
    private String userName;

    @ApiModelProperty(value = "账号类型：1-正式")
    private Integer accountType;

    @ApiModelProperty(value = "银行卡号")
    private String cardNumber;

    @ApiModelProperty(value = "银行卡名称")
    private String bankName;

    @ApiModelProperty(value = "持卡人姓名")
    private String cnName;

    @ApiModelProperty("风控层级名称")
    private String accountWindControl;

    @ApiModelProperty(value = "数据类型（1-银行卡 2-虚拟货币）",hidden = true)
    private Integer dataType;
}
