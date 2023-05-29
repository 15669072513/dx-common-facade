package com.dx.facade.member.proxy.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

/**
 * @author agan
 */
@Data
public class SelectBankProxyRecordReqDTO extends SelectPagingQueryReqDTO{

    @ApiModelProperty(value = "商户id", hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value = "使用时间-开始日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String beginDate;

    @ApiModelProperty(value = "使用时间-结束日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String endDate;

    @ApiModelProperty(value = "代理账号")
    private String userName;

    @ApiModelProperty(value = "代理类型（1-正式，2-测试，3-合作）")
    private List<String> accountType;

    @ApiModelProperty(value = "银行卡号")
    private String cardNumber;

    @ApiModelProperty(value = "银行卡名称")
    private String bankName;

    @ApiModelProperty(value = "持卡人姓名")
    private String cnName;

    @ApiModelProperty("风控层级")
    private List<String> windControlId;

    @ApiModelProperty(value = "数据类型（1-银行卡 2-虚拟货币）",hidden = true)
    private Integer dataType;

    @ApiModelProperty("排序方式(1)：desc-降序 asc-升序")
    private String orderType;
}
